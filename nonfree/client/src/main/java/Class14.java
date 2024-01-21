import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JAGFVRIK")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!JAGFVRIK", name = "a", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!JAGFVRIK", name = "b", descriptor = "[I")
	public int[] anIntArray94 = new int[500];

	@OriginalMember(owner = "client!JAGFVRIK", name = "c", descriptor = "Z")
	public boolean aBoolean44 = true;

	@OriginalMember(owner = "client!JAGFVRIK", name = "d", descriptor = "[I")
	public int[] anIntArray95 = new int[500];

	@OriginalMember(owner = "client!JAGFVRIK", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!JAGFVRIK", name = "f", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!JAGFVRIK", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class14(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient3 = arg0;
			@Pc(25) boolean local25 = false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("42330, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JAGFVRIK", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean44) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt195 < 500) {
					this.anIntArray95[this.anInt195] = this.aClient3.anInt813;
					this.anIntArray94[this.anInt195] = this.aClient3.anInt814;
					this.anInt195++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
