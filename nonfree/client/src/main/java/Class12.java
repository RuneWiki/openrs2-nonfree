import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FDKYSOCX")
public final class Class12 implements Runnable {

	@OriginalMember(owner = "client!FDKYSOCX", name = "c", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!FDKYSOCX", name = "a", descriptor = "[I")
	public int[] anIntArray81 = new int[500];

	@OriginalMember(owner = "client!FDKYSOCX", name = "d", descriptor = "Z")
	public boolean aBoolean61 = true;

	@OriginalMember(owner = "client!FDKYSOCX", name = "e", descriptor = "[I")
	public int[] anIntArray82 = new int[500];

	@OriginalMember(owner = "client!FDKYSOCX", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!FDKYSOCX", name = "b", descriptor = "Lclient!client;")
	private client aClient3;

	@OriginalMember(owner = "client!FDKYSOCX", name = "<init>", descriptor = "(BLclient!client;)V")
	public Class12(@OriginalArg(0) byte arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient3 = arg1;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("85725, " + arg0 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDKYSOCX", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean61) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt220 < 500) {
					this.anIntArray82[this.anInt220] = this.aClient3.anInt809;
					this.anIntArray81[this.anInt220] = this.aClient3.anInt810;
					this.anInt220++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
