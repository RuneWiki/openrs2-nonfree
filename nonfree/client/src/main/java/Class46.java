import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YMDQNWFI")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!YMDQNWFI", name = "d", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!YMDQNWFI", name = "a", descriptor = "[I")
	public int[] anIntArray181 = new int[500];

	@OriginalMember(owner = "client!YMDQNWFI", name = "b", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!YMDQNWFI", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!YMDQNWFI", name = "f", descriptor = "[I")
	public int[] anIntArray182 = new int[500];

	@OriginalMember(owner = "client!YMDQNWFI", name = "c", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!YMDQNWFI", name = "<init>", descriptor = "(BLclient!client;)V")
	public Class46(@OriginalArg(0) byte arg0, @OriginalArg(1) client arg1) {
		try {
			this.aClient4 = arg1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("70956, " + arg0 + ", " + arg1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YMDQNWFI", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean189) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt720 < 500) {
					this.anIntArray182[this.anInt720] = this.aClient4.anInt835;
					this.anIntArray181[this.anInt720] = this.aClient4.anInt836;
					this.anInt720++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
