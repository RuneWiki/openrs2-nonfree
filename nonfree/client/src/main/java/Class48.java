import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YNDLJDLS")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!YNDLJDLS", name = "b", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!YNDLJDLS", name = "a", descriptor = "[I")
	public int[] anIntArray204 = new int[500];

	@OriginalMember(owner = "client!YNDLJDLS", name = "c", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!YNDLJDLS", name = "e", descriptor = "[I")
	public int[] anIntArray205 = new int[500];

	@OriginalMember(owner = "client!YNDLJDLS", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!YNDLJDLS", name = "d", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!YNDLJDLS", name = "<init>", descriptor = "(Lclient!client;B)V")
	public Class48(@OriginalArg(0) client arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aClient5 = arg0;
			if (arg1 != 8) {
				for (@Pc(25) int local25 = 1; local25 > 0; local25++) {
				}
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("56179, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YNDLJDLS", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean174) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt799 < 500) {
					this.anIntArray205[this.anInt799] = this.aClient5.anInt814;
					this.anIntArray204[this.anInt799] = this.aClient5.anInt815;
					this.anInt799++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
