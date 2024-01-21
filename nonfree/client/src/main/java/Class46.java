import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VCAZMAEX")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!VCAZMAEX", name = "g", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!VCAZMAEX", name = "a", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!VCAZMAEX", name = "b", descriptor = "[I")
	public int[] anIntArray198 = new int[500];

	@OriginalMember(owner = "client!VCAZMAEX", name = "d", descriptor = "[I")
	public int[] anIntArray199 = new int[500];

	@OriginalMember(owner = "client!VCAZMAEX", name = "e", descriptor = "Z")
	public boolean aBoolean166 = true;

	@OriginalMember(owner = "client!VCAZMAEX", name = "f", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!VCAZMAEX", name = "h", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!VCAZMAEX", name = "c", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!VCAZMAEX", name = "<init>", descriptor = "(ZLclient!client;)V")
	public Class46(@OriginalArg(0) boolean arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient4 = arg1;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("31350, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCAZMAEX", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean166) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt769 < 500) {
					this.anIntArray199[this.anInt769] = this.aClient4.anInt828;
					this.anIntArray198[this.anInt769] = this.aClient4.anInt829;
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
