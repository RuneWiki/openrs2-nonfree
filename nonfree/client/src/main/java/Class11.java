import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
	public int[] anIntArray160 = new int[500];

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public int[] anIntArray161 = new int[500];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class11(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
				}
			}
			this.aClient1 = arg0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("37347, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean147) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt512 < 500) {
					this.anIntArray160[this.anInt512] = this.aClient1.anInt182;
					this.anIntArray161[this.anInt512] = this.aClient1.anInt183;
					this.anInt512++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
