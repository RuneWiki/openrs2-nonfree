import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YBAERVYW")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!YBAERVYW", name = "g", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!YBAERVYW", name = "b", descriptor = "Z")
	public boolean aBoolean200 = true;

	@OriginalMember(owner = "client!YBAERVYW", name = "c", descriptor = "I")
	private int anInt775 = 885;

	@OriginalMember(owner = "client!YBAERVYW", name = "d", descriptor = "[I")
	public int[] anIntArray206 = new int[500];

	@OriginalMember(owner = "client!YBAERVYW", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!YBAERVYW", name = "f", descriptor = "[I")
	public int[] anIntArray207 = new int[500];

	@OriginalMember(owner = "client!YBAERVYW", name = "a", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!YBAERVYW", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			@Pc(24) int local24 = 4 / arg0;
			this.aClient5 = arg1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("96639, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YBAERVYW", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean200) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt776 < 500) {
					this.anIntArray207[this.anInt776] = this.aClient5.anInt833;
					this.anIntArray206[this.anInt776] = this.aClient5.anInt834;
					this.anInt776++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
