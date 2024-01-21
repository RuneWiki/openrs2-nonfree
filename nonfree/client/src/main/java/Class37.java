import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OQEOESGS")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!OQEOESGS", name = "b", descriptor = "I")
	public int anInt558;

	@OriginalMember(owner = "client!OQEOESGS", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!OQEOESGS", name = "c", descriptor = "[I")
	public int[] anIntArray108 = new int[500];

	@OriginalMember(owner = "client!OQEOESGS", name = "d", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!OQEOESGS", name = "e", descriptor = "[I")
	public int[] anIntArray109 = new int[500];

	@OriginalMember(owner = "client!OQEOESGS", name = "f", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!OQEOESGS", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class37(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient5 = arg0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("27978, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OQEOESGS", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean150) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt558 < 500) {
					this.anIntArray108[this.anInt558] = this.aClient5.anInt815;
					this.anIntArray109[this.anInt558] = this.aClient5.anInt816;
					this.anInt558++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
