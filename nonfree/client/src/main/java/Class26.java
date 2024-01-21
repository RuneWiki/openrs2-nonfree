import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OUOWXDXZ")
public final class Class26 implements Runnable {

	@OriginalMember(owner = "client!OUOWXDXZ", name = "d", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!OUOWXDXZ", name = "a", descriptor = "[I")
	public int[] anIntArray130 = new int[500];

	@OriginalMember(owner = "client!OUOWXDXZ", name = "b", descriptor = "Z")
	public boolean aBoolean118 = true;

	@OriginalMember(owner = "client!OUOWXDXZ", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!OUOWXDXZ", name = "f", descriptor = "[I")
	public int[] anIntArray131 = new int[500];

	@OriginalMember(owner = "client!OUOWXDXZ", name = "g", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!OUOWXDXZ", name = "c", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!OUOWXDXZ", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient2 = arg1;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("4576, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OUOWXDXZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean118) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt614 < 500) {
					this.anIntArray130[this.anInt614] = this.aClient2.anInt848;
					this.anIntArray131[this.anInt614] = this.aClient2.anInt849;
					this.anInt614++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
