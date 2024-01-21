import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IKKPZVXM")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!IKKPZVXM", name = "d", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!IKKPZVXM", name = "a", descriptor = "[I")
	public int[] anIntArray50 = new int[500];

	@OriginalMember(owner = "client!IKKPZVXM", name = "b", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!IKKPZVXM", name = "c", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!IKKPZVXM", name = "f", descriptor = "[I")
	public int[] anIntArray51 = new int[500];

	@OriginalMember(owner = "client!IKKPZVXM", name = "e", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!IKKPZVXM", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class17(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClient5 = arg0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("42344, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IKKPZVXM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean74) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt245 < 500) {
					this.anIntArray50[this.anInt245] = this.aClient5.anInt804;
					this.anIntArray51[this.anInt245] = this.aClient5.anInt805;
					this.anInt245++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
