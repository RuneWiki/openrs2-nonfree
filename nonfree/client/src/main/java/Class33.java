import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QVSTBDDY")
public final class Class33 implements Runnable {

	@OriginalMember(owner = "client!QVSTBDDY", name = "g", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!QVSTBDDY", name = "a", descriptor = "[I")
	public int[] anIntArray175 = new int[500];

	@OriginalMember(owner = "client!QVSTBDDY", name = "b", descriptor = "[I")
	public int[] anIntArray176 = new int[500];

	@OriginalMember(owner = "client!QVSTBDDY", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!QVSTBDDY", name = "e", descriptor = "Z")
	public boolean aBoolean146 = true;

	@OriginalMember(owner = "client!QVSTBDDY", name = "f", descriptor = "I")
	private int anInt616 = 25912;

	@OriginalMember(owner = "client!QVSTBDDY", name = "d", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!QVSTBDDY", name = "<init>", descriptor = "(ZLclient!client;)V")
	public Class33(@OriginalArg(0) boolean arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient4 = arg1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("78299, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QVSTBDDY", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean146) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt617 < 500) {
					this.anIntArray175[this.anInt617] = this.aClient4.anInt836;
					this.anIntArray176[this.anInt617] = this.aClient4.anInt837;
					this.anInt617++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
