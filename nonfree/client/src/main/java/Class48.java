import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZIJPRJEC")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!ZIJPRJEC", name = "f", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!ZIJPRJEC", name = "b", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!ZIJPRJEC", name = "c", descriptor = "[I")
	public int[] anIntArray167 = new int[500];

	@OriginalMember(owner = "client!ZIJPRJEC", name = "d", descriptor = "Z")
	public boolean aBoolean205 = true;

	@OriginalMember(owner = "client!ZIJPRJEC", name = "e", descriptor = "[I")
	public int[] anIntArray168 = new int[500];

	@OriginalMember(owner = "client!ZIJPRJEC", name = "a", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ZIJPRJEC", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class48(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 >= 0) {
				throw new NullPointerException();
			}
			this.aClient5 = arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("5657, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZIJPRJEC", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean205) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt783 < 500) {
					this.anIntArray168[this.anInt783] = this.aClient5.anInt827;
					this.anIntArray167[this.anInt783] = this.aClient5.anInt828;
					this.anInt783++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
