import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PTSFQSMJ")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!PTSFQSMJ", name = "b", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!PTSFQSMJ", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!PTSFQSMJ", name = "c", descriptor = "[I")
	public int[] anIntArray150 = new int[500];

	@OriginalMember(owner = "client!PTSFQSMJ", name = "d", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!PTSFQSMJ", name = "f", descriptor = "[I")
	public int[] anIntArray151 = new int[500];

	@OriginalMember(owner = "client!PTSFQSMJ", name = "e", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!PTSFQSMJ", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class32(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient3 = arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("25538, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTSFQSMJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean135) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt543 < 500) {
					this.anIntArray151[this.anInt543] = this.aClient3.anInt804;
					this.anIntArray150[this.anInt543] = this.aClient3.anInt805;
					this.anInt543++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
