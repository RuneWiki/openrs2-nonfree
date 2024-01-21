import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WTODRXXL")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!WTODRXXL", name = "f", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!WTODRXXL", name = "a", descriptor = "[I")
	public int[] anIntArray174 = new int[500];

	@OriginalMember(owner = "client!WTODRXXL", name = "b", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!WTODRXXL", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!WTODRXXL", name = "d", descriptor = "[I")
	public int[] anIntArray175 = new int[500];

	@OriginalMember(owner = "client!WTODRXXL", name = "e", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!WTODRXXL", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class42(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(21) int local21 = 20 / arg1;
			this.aClient4 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("64223, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTODRXXL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean174) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt769 < 500) {
					this.anIntArray174[this.anInt769] = this.aClient4.anInt839;
					this.anIntArray175[this.anInt769] = this.aClient4.anInt840;
					this.anInt769++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
