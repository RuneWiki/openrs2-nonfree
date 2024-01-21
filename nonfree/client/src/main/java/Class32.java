import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OIFRHCSO")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!OIFRHCSO", name = "e", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!OIFRHCSO", name = "a", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!OIFRHCSO", name = "b", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!OIFRHCSO", name = "c", descriptor = "[I")
	public int[] anIntArray117 = new int[500];

	@OriginalMember(owner = "client!OIFRHCSO", name = "f", descriptor = "[I")
	public int[] anIntArray118 = new int[500];

	@OriginalMember(owner = "client!OIFRHCSO", name = "d", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!OIFRHCSO", name = "<init>", descriptor = "(ILclient!client;)V")
	public Class32(@OriginalArg(0) int arg0, @OriginalArg(1) client arg1) {
		try {
			@Pc(21) int local21 = 69 / arg0;
			this.aClient2 = arg1;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("7919, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OIFRHCSO", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean106) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt496 < 500) {
					this.anIntArray117[this.anInt496] = this.aClient2.anInt815;
					this.anIntArray118[this.anInt496] = this.aClient2.anInt816;
					this.anInt496++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
