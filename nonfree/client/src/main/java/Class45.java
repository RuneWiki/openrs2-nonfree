import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XAXJBOWU")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!XAXJBOWU", name = "c", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!XAXJBOWU", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!XAXJBOWU", name = "b", descriptor = "[I")
	public int[] anIntArray158 = new int[500];

	@OriginalMember(owner = "client!XAXJBOWU", name = "d", descriptor = "[I")
	public int[] anIntArray159 = new int[500];

	@OriginalMember(owner = "client!XAXJBOWU", name = "f", descriptor = "Z")
	public boolean aBoolean219 = true;

	@OriginalMember(owner = "client!XAXJBOWU", name = "e", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!XAXJBOWU", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient5 = arg1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("75837, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XAXJBOWU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean219) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt726 < 500) {
					this.anIntArray159[this.anInt726] = this.aClient5.anInt823;
					this.anIntArray158[this.anInt726] = this.aClient5.anInt824;
					this.anInt726++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
