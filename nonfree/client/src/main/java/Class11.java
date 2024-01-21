import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
	public boolean aBoolean133 = true;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
	public int[] anIntArray162 = new int[500];

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public int[] anIntArray163 = new int[500];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(BLclient!client;)V")
	public Class11(@OriginalArg(0) byte arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient3 = arg1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("42686, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean133) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt540 < 500) {
					this.anIntArray162[this.anInt540] = this.aClient3.anInt197;
					this.anIntArray163[this.anInt540] = this.aClient3.anInt198;
					this.anInt540++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
