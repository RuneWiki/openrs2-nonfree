import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TLCMWCVC")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!TLCMWCVC", name = "b", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!TLCMWCVC", name = "a", descriptor = "[I")
	public int[] anIntArray170 = new int[500];

	@OriginalMember(owner = "client!TLCMWCVC", name = "c", descriptor = "Z")
	public boolean aBoolean168 = true;

	@OriginalMember(owner = "client!TLCMWCVC", name = "e", descriptor = "[I")
	public int[] anIntArray171 = new int[500];

	@OriginalMember(owner = "client!TLCMWCVC", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!TLCMWCVC", name = "d", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!TLCMWCVC", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class38(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient4 = arg1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("77760, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TLCMWCVC", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean168) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt653 < 500) {
					this.anIntArray170[this.anInt653] = this.aClient4.anInt818;
					this.anIntArray171[this.anInt653] = this.aClient4.anInt819;
					this.anInt653++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
