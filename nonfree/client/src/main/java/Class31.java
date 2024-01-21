import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PDGRVIXR")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!PDGRVIXR", name = "b", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!PDGRVIXR", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!PDGRVIXR", name = "c", descriptor = "[I")
	public int[] anIntArray155 = new int[500];

	@OriginalMember(owner = "client!PDGRVIXR", name = "d", descriptor = "[I")
	public int[] anIntArray156 = new int[500];

	@OriginalMember(owner = "client!PDGRVIXR", name = "e", descriptor = "Z")
	public boolean aBoolean131 = true;

	@OriginalMember(owner = "client!PDGRVIXR", name = "f", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!PDGRVIXR", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class31(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClient3 = arg0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("55708, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDGRVIXR", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean131) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt517 < 500) {
					this.anIntArray155[this.anInt517] = this.aClient3.anInt830;
					this.anIntArray156[this.anInt517] = this.aClient3.anInt831;
					this.anInt517++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
