import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VXFBFZWJ")
public final class Class44 implements Runnable {

	@OriginalMember(owner = "client!VXFBFZWJ", name = "c", descriptor = "I")
	public int anInt708;

	@OriginalMember(owner = "client!VXFBFZWJ", name = "a", descriptor = "Z")
	public boolean aBoolean185 = true;

	@OriginalMember(owner = "client!VXFBFZWJ", name = "d", descriptor = "[I")
	public int[] anIntArray161 = new int[500];

	@OriginalMember(owner = "client!VXFBFZWJ", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!VXFBFZWJ", name = "f", descriptor = "[I")
	public int[] anIntArray162 = new int[500];

	@OriginalMember(owner = "client!VXFBFZWJ", name = "b", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!VXFBFZWJ", name = "<init>", descriptor = "(ZLclient!client;)V")
	public Class44(@OriginalArg(0) boolean arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient5 = arg1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("36158, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VXFBFZWJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean185) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt708 < 500) {
					this.anIntArray161[this.anInt708] = this.aClient5.anInt815;
					this.anIntArray162[this.anInt708] = this.aClient5.anInt816;
					this.anInt708++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
