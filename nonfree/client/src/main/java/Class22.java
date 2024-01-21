import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LLZTMQTZ")
public final class Class22 implements Runnable {

	@OriginalMember(owner = "client!LLZTMQTZ", name = "d", descriptor = "I")
	public int anInt373;

	@OriginalMember(owner = "client!LLZTMQTZ", name = "a", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!LLZTMQTZ", name = "b", descriptor = "[I")
	public int[] anIntArray110 = new int[500];

	@OriginalMember(owner = "client!LLZTMQTZ", name = "c", descriptor = "[I")
	public int[] anIntArray111 = new int[500];

	@OriginalMember(owner = "client!LLZTMQTZ", name = "e", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!LLZTMQTZ", name = "f", descriptor = "Z")
	public boolean aBoolean80 = true;

	@OriginalMember(owner = "client!LLZTMQTZ", name = "g", descriptor = "Lclient!client;")
	private client aClient2;

	@OriginalMember(owner = "client!LLZTMQTZ", name = "<init>", descriptor = "(ZLclient!client;)V")
	public Class22(@OriginalArg(0) boolean arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient2 = arg1;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("57158, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LLZTMQTZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean80) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt373 < 500) {
					this.anIntArray110[this.anInt373] = this.aClient2.anInt840;
					this.anIntArray111[this.anInt373] = this.aClient2.anInt841;
					this.anInt373++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
