import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LZVLFSBA")
public final class Class23 implements Runnable {

	@OriginalMember(owner = "client!LZVLFSBA", name = "d", descriptor = "I")
	public int anInt420;

	@OriginalMember(owner = "client!LZVLFSBA", name = "a", descriptor = "[I")
	public int[] anIntArray113 = new int[500];

	@OriginalMember(owner = "client!LZVLFSBA", name = "b", descriptor = "[I")
	public int[] anIntArray114 = new int[500];

	@OriginalMember(owner = "client!LZVLFSBA", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!LZVLFSBA", name = "f", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!LZVLFSBA", name = "e", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!LZVLFSBA", name = "<init>", descriptor = "(BLclient!client;)V")
	public Class23(@OriginalArg(0) byte arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient3 = arg1;
			@Pc(24) boolean local24 = false;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("80191, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LZVLFSBA", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean100) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt420 < 500) {
					this.anIntArray114[this.anInt420] = this.aClient3.anInt808;
					this.anIntArray113[this.anInt420] = this.aClient3.anInt809;
					this.anInt420++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
