import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CNFMYDSL")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!CNFMYDSL", name = "a", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!CNFMYDSL", name = "c", descriptor = "Z")
	public boolean aBoolean20 = true;

	@OriginalMember(owner = "client!CNFMYDSL", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!CNFMYDSL", name = "e", descriptor = "[I")
	public int[] anIntArray16 = new int[500];

	@OriginalMember(owner = "client!CNFMYDSL", name = "f", descriptor = "[I")
	public int[] anIntArray17 = new int[500];

	@OriginalMember(owner = "client!CNFMYDSL", name = "b", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!CNFMYDSL", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient1 = arg1;
			if (arg0 <= 0) {
				throw new NullPointerException();
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("45036, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CNFMYDSL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean20) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt100 < 500) {
					this.anIntArray16[this.anInt100] = this.aClient1.anInt807;
					this.anIntArray17[this.anInt100] = this.aClient1.anInt808;
					this.anInt100++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
