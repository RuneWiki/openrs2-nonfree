import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GFMKEKCW")
public final class Class9 implements Runnable {

	@OriginalMember(owner = "client!GFMKEKCW", name = "f", descriptor = "I")
	public int anInt122;

	@OriginalMember(owner = "client!GFMKEKCW", name = "a", descriptor = "Z")
	public boolean aBoolean53 = true;

	@OriginalMember(owner = "client!GFMKEKCW", name = "b", descriptor = "[I")
	public int[] anIntArray18 = new int[500];

	@OriginalMember(owner = "client!GFMKEKCW", name = "c", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!GFMKEKCW", name = "d", descriptor = "[I")
	public int[] anIntArray19 = new int[500];

	@OriginalMember(owner = "client!GFMKEKCW", name = "e", descriptor = "I")
	private int anInt121 = 240;

	@OriginalMember(owner = "client!GFMKEKCW", name = "g", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!GFMKEKCW", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient2 = arg1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("64302, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GFMKEKCW", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean53) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt122 < 500) {
					this.anIntArray19[this.anInt122] = this.aClient2.anInt819;
					this.anIntArray18[this.anInt122] = this.aClient2.anInt820;
					this.anInt122++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
