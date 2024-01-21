import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RHIQJAPF")
public final class Class35 {

	@OriginalMember(owner = "client!RHIQJAPF", name = "a", descriptor = "I")
	private int anInt666;

	@OriginalMember(owner = "client!RHIQJAPF", name = "b", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!RHIQJAPF", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!RHIQJAPF", name = "<init>", descriptor = "(Lclient!MVHXDWGI;I)V")
	public Class35(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt666 = arg0.method294();
			@Pc(11) int local11 = 76 / arg1;
			this.anIntArray164 = new int[this.anInt666];
			this.anIntArrayArray15 = new int[this.anInt666][];
			for (@Pc(23) int local23 = 0; local23 < this.anInt666; local23++) {
				this.anIntArray164[local23] = arg0.method294();
			}
			for (@Pc(38) int local38 = 0; local38 < this.anInt666; local38++) {
				@Pc(43) int local43 = arg0.method294();
				this.anIntArrayArray15[local38] = new int[local43];
				for (@Pc(51) int local51 = 0; local51 < local43; local51++) {
					this.anIntArrayArray15[local38][local51] = arg0.method294();
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("67765, " + arg0 + ", " + arg1 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
