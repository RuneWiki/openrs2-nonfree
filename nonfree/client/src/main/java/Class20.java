import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JHNSGCOV")
public final class Class20 implements Runnable {

	@OriginalMember(owner = "client!JHNSGCOV", name = "g", descriptor = "I")
	public int anInt395;

	@OriginalMember(owner = "client!JHNSGCOV", name = "a", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!JHNSGCOV", name = "b", descriptor = "[I")
	public int[] anIntArray111 = new int[500];

	@OriginalMember(owner = "client!JHNSGCOV", name = "c", descriptor = "[I")
	public int[] anIntArray112 = new int[500];

	@OriginalMember(owner = "client!JHNSGCOV", name = "d", descriptor = "Z")
	public boolean aBoolean108 = true;

	@OriginalMember(owner = "client!JHNSGCOV", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!JHNSGCOV", name = "e", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!JHNSGCOV", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class20(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClient3 = arg0;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("37306, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHNSGCOV", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean108) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt395 < 500) {
					this.anIntArray111[this.anInt395] = this.aClient3.anInt834;
					this.anIntArray112[this.anInt395] = this.aClient3.anInt835;
					this.anInt395++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
