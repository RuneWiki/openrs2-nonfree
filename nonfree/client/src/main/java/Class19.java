import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JUGCSXVJ")
public final class Class19 implements Runnable {

	@OriginalMember(owner = "client!JUGCSXVJ", name = "f", descriptor = "I")
	public int anInt368;

	@OriginalMember(owner = "client!JUGCSXVJ", name = "a", descriptor = "[I")
	public int[] anIntArray83 = new int[500];

	@OriginalMember(owner = "client!JUGCSXVJ", name = "c", descriptor = "Z")
	public boolean aBoolean78 = true;

	@OriginalMember(owner = "client!JUGCSXVJ", name = "d", descriptor = "[I")
	public int[] anIntArray84 = new int[500];

	@OriginalMember(owner = "client!JUGCSXVJ", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!JUGCSXVJ", name = "g", descriptor = "I")
	private int anInt369 = -965;

	@OriginalMember(owner = "client!JUGCSXVJ", name = "b", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!JUGCSXVJ", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient2 = arg1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("32997, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JUGCSXVJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean78) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt368 < 500) {
					this.anIntArray83[this.anInt368] = this.aClient2.anInt851;
					this.anIntArray84[this.anInt368] = this.aClient2.anInt852;
					this.anInt368++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
