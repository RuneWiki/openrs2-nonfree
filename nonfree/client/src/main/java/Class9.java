import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EKUSXTUB")
public final class Class9 implements Runnable {

	@OriginalMember(owner = "client!EKUSXTUB", name = "a", descriptor = "I")
	public int anInt99;

	@OriginalMember(owner = "client!EKUSXTUB", name = "b", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!EKUSXTUB", name = "c", descriptor = "[I")
	public int[] anIntArray34 = new int[500];

	@OriginalMember(owner = "client!EKUSXTUB", name = "e", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!EKUSXTUB", name = "f", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!EKUSXTUB", name = "g", descriptor = "[I")
	public int[] anIntArray35 = new int[500];

	@OriginalMember(owner = "client!EKUSXTUB", name = "d", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!EKUSXTUB", name = "<init>", descriptor = "(Lclient!client;Z)V")
	public Class9(@OriginalArg(0) client arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aClient1 = arg0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("1344, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EKUSXTUB", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean32) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt99 < 500) {
					this.anIntArray34[this.anInt99] = this.aClient1.anInt852;
					this.anIntArray35[this.anInt99] = this.aClient1.anInt853;
					this.anInt99++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
