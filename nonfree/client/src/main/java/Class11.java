import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt537;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private int anInt536 = 11300;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	public boolean aBoolean144 = true;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public int[] anIntArray160 = new int[500];

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
	public int[] anIntArray161 = new int[500];

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!client;Z)V")
	public Class11(@OriginalArg(0) client arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aClient1 = arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("88453, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean144) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt537 < 500) {
					this.anIntArray160[this.anInt537] = this.aClient1.anInt194;
					this.anIntArray161[this.anInt537] = this.aClient1.anInt195;
					this.anInt537++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
