import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
	public boolean aBoolean138 = true;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
	public int[] anIntArray162 = new int[500];

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public int[] anIntArray163 = new int[500];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			@Pc(21) int local21 = 31 / arg0;
			this.aClient2 = arg1;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("34650, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean138) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt529 < 500) {
					this.anIntArray162[this.anInt529] = this.aClient2.anInt186;
					this.anIntArray163[this.anInt529] = this.aClient2.anInt187;
					this.anInt529++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
