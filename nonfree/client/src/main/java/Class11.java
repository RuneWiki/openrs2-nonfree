import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 implements Runnable {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private int anInt562 = 9;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
	public int[] anIntArray162 = new int[500];

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
	public int[] anIntArray163 = new int[500];

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient1 = arg1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("76417, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean135) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt563 < 500) {
					this.anIntArray162[this.anInt563] = this.aClient1.anInt230;
					this.anIntArray163[this.anInt563] = this.aClient1.anInt231;
					this.anInt563++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
