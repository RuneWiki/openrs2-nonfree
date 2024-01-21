import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GAUMGPFH")
public final class Class16 implements Runnable {

	@OriginalMember(owner = "client!GAUMGPFH", name = "f", descriptor = "I")
	public int anInt286;

	@OriginalMember(owner = "client!GAUMGPFH", name = "a", descriptor = "[I")
	public int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!GAUMGPFH", name = "b", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!GAUMGPFH", name = "d", descriptor = "[I")
	public int[] anIntArray36 = new int[500];

	@OriginalMember(owner = "client!GAUMGPFH", name = "e", descriptor = "Z")
	public boolean aBoolean72 = true;

	@OriginalMember(owner = "client!GAUMGPFH", name = "c", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!GAUMGPFH", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class16(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient3 = arg0;
			if (arg1 != 8) {
				throw new NullPointerException();
			}
			@Pc(25) boolean local25 = false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("81344, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GAUMGPFH", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean72) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt286 < 500) {
					this.anIntArray36[this.anInt286] = this.aClient3.anInt826;
					this.anIntArray35[this.anInt286] = this.aClient3.anInt827;
					this.anInt286++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
