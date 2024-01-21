import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RQLSQIAP")
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!RQLSQIAP", name = "f", descriptor = "I")
	public int anInt473;

	@OriginalMember(owner = "client!RQLSQIAP", name = "a", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!RQLSQIAP", name = "b", descriptor = "[I")
	public int[] anIntArray135 = new int[500];

	@OriginalMember(owner = "client!RQLSQIAP", name = "c", descriptor = "[I")
	public int[] anIntArray136 = new int[500];

	@OriginalMember(owner = "client!RQLSQIAP", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!RQLSQIAP", name = "e", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!RQLSQIAP", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class36(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient5 = arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("48874, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RQLSQIAP", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean151) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt473 < 500) {
					this.anIntArray135[this.anInt473] = this.aClient5.anInt833;
					this.anIntArray136[this.anInt473] = this.aClient5.anInt834;
					this.anInt473++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
