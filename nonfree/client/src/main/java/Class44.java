import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XSRHTFUZ")
public final class Class44 implements Runnable {

	@OriginalMember(owner = "client!XSRHTFUZ", name = "b", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!XSRHTFUZ", name = "a", descriptor = "Z")
	public boolean aBoolean177 = true;

	@OriginalMember(owner = "client!XSRHTFUZ", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!XSRHTFUZ", name = "d", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!XSRHTFUZ", name = "e", descriptor = "[I")
	public int[] anIntArray189 = new int[500];

	@OriginalMember(owner = "client!XSRHTFUZ", name = "f", descriptor = "[I")
	public int[] anIntArray190 = new int[500];

	@OriginalMember(owner = "client!XSRHTFUZ", name = "g", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!XSRHTFUZ", name = "<init>", descriptor = "(Lclient!client;Z)V")
	public Class44(@OriginalArg(0) client arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aClient4 = arg0;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("4162, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XSRHTFUZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean177) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt708 < 500) {
					this.anIntArray189[this.anInt708] = this.aClient4.anInt812;
					this.anIntArray190[this.anInt708] = this.aClient4.anInt813;
					this.anInt708++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
