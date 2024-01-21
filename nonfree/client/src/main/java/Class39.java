import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UVFIVFPB")
public final class Class39 implements Runnable {

	@OriginalMember(owner = "client!UVFIVFPB", name = "d", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!UVFIVFPB", name = "a", descriptor = "Z")
	public boolean aBoolean158 = true;

	@OriginalMember(owner = "client!UVFIVFPB", name = "b", descriptor = "I")
	private int anInt677 = 49578;

	@OriginalMember(owner = "client!UVFIVFPB", name = "c", descriptor = "[I")
	public int[] anIntArray188 = new int[500];

	@OriginalMember(owner = "client!UVFIVFPB", name = "e", descriptor = "[I")
	public int[] anIntArray189 = new int[500];

	@OriginalMember(owner = "client!UVFIVFPB", name = "g", descriptor = "Ljava/lang/Object;")
	public Object anObject1 = new Object();

	@OriginalMember(owner = "client!UVFIVFPB", name = "f", descriptor = "Lclient!client;")
	private client aClient5;

	@OriginalMember(owner = "client!UVFIVFPB", name = "<init>", descriptor = "(Lclient!client;I)V")
	public Class39(@OriginalArg(0) client arg0, @OriginalArg(1) int arg1) {
		try {
			this.aClient5 = arg0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("24603, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UVFIVFPB", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean158) {
			@Pc(4) Object local4 = this.anObject1;
			synchronized (this.anObject1) {
				if (this.anInt678 < 500) {
					this.anIntArray189[this.anInt678] = this.aClient5.anInt814;
					this.anIntArray188[this.anInt678] = this.aClient5.anInt815;
					this.anInt678++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (@Pc(42) Exception local42) {
			}
		}
	}
}
