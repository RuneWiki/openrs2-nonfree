import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EIPZGSZT")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!EIPZGSZT", name = "f", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!EIPZGSZT", name = "a", descriptor = "[I")
	public int[] anIntArray37 = new int[500];

	@OriginalMember(owner = "client!EIPZGSZT", name = "b", descriptor = "[I")
	public int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!EIPZGSZT", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!EIPZGSZT", name = "e", descriptor = "Z")
	public boolean aBoolean62 = true;

	@OriginalMember(owner = "client!EIPZGSZT", name = "d", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!EIPZGSZT", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class14(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClient1 = arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("31417, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EIPZGSZT", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean62) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt235 < 500) {
					this.anIntArray38[this.anInt235] = this.aClient1.anInt852;
					this.anIntArray37[this.anInt235] = this.aClient1.anInt853;
					this.anInt235++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
