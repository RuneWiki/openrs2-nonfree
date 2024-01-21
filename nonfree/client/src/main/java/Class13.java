import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 implements Runnable {

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[I")
	public int[] anIntArray165 = new int[500];

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	public int[] anIntArray166 = new int[500];

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Lclient!client;")
	private client aClient1;

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class13(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClient1 = arg0;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("70525, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean135) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt549 < 500) {
					this.anIntArray165[this.anInt549] = this.aClient1.anInt194;
					this.anIntArray166[this.anInt549] = this.aClient1.anInt195;
					this.anInt549++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
