import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NZNLPNYM")
public final class Class26 implements Runnable {

	@OriginalMember(owner = "client!NZNLPNYM", name = "a", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!NZNLPNYM", name = "b", descriptor = "[I")
	public int[] anIntArray99 = new int[500];

	@OriginalMember(owner = "client!NZNLPNYM", name = "c", descriptor = "[I")
	public int[] anIntArray100 = new int[500];

	@OriginalMember(owner = "client!NZNLPNYM", name = "d", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!NZNLPNYM", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!NZNLPNYM", name = "f", descriptor = "B")
	private byte aByte14 = 6;

	@OriginalMember(owner = "client!NZNLPNYM", name = "g", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!NZNLPNYM", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class26(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient2 = arg0;
			if (arg1 != this.aByte14) {
				throw new NullPointerException();
			}
			@Pc(29) boolean local29 = false;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("49866, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NZNLPNYM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean111) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt447 < 500) {
					this.anIntArray100[this.anInt447] = this.aClient2.anInt811;
					this.anIntArray99[this.anInt447] = this.aClient2.anInt812;
					this.anInt447++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
