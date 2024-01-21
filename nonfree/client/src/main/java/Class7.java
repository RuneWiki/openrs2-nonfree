import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BORSVOPG")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!BORSVOPG", name = "f", descriptor = "I")
	public int anInt54;

	@OriginalMember(owner = "client!BORSVOPG", name = "a", descriptor = "Z")
	public boolean aBoolean12 = true;

	@OriginalMember(owner = "client!BORSVOPG", name = "b", descriptor = "[I")
	public int[] anIntArray11 = new int[500];

	@OriginalMember(owner = "client!BORSVOPG", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!BORSVOPG", name = "e", descriptor = "I")
	private int anInt53 = 8;

	@OriginalMember(owner = "client!BORSVOPG", name = "g", descriptor = "[I")
	public int[] anIntArray12 = new int[500];

	@OriginalMember(owner = "client!BORSVOPG", name = "d", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!BORSVOPG", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class7(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient1 = arg0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("69281, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BORSVOPG", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean12) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt54 < 500) {
					this.anIntArray12[this.anInt54] = this.aClient1.anInt816;
					this.anIntArray11[this.anInt54] = this.aClient1.anInt817;
					this.anInt54++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
