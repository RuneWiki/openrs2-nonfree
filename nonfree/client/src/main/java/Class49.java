import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZEOHBQWT")
public final class Class49 implements Runnable {

	@OriginalMember(owner = "client!ZEOHBQWT", name = "f", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!ZEOHBQWT", name = "a", descriptor = "[I")
	public int[] anIntArray203 = new int[500];

	@OriginalMember(owner = "client!ZEOHBQWT", name = "b", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!ZEOHBQWT", name = "c", descriptor = "[I")
	public int[] anIntArray204 = new int[500];

	@OriginalMember(owner = "client!ZEOHBQWT", name = "d", descriptor = "I")
	private int anInt787 = 28787;

	@OriginalMember(owner = "client!ZEOHBQWT", name = "g", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!ZEOHBQWT", name = "e", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!ZEOHBQWT", name = "<init>", descriptor = "(Lclient!client;Z)V")
	public Class49(@OriginalArg(0) client arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aClient5 = arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("72375, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZEOHBQWT", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean189) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt788 < 500) {
					this.anIntArray203[this.anInt788] = this.aClient5.anInt831;
					this.anIntArray204[this.anInt788] = this.aClient5.anInt832;
					this.anInt788++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
