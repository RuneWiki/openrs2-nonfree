import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt539;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public int[] anIntArray162 = new int[500];

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
	public int[] anIntArray163 = new int[500];

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient3 = arg1;
			if (arg0 != 0) {
				this.aBoolean138 = !this.aBoolean138;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("42949, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean139) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt539 < 500) {
					this.anIntArray162[this.anInt539] = this.aClient3.anInt192;
					this.anIntArray163[this.anInt539] = this.aClient3.anInt193;
					this.anInt539++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
