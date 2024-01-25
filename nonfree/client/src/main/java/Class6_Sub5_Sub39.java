import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class6_Sub5_Sub39 extends Class6_Sub5 {

	@OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
	private int anInt8006 = 4096;

	@OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
	private int anInt8007 = 4096;

	@OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
	private int anInt8009 = 4096;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(21) int[][] local21 = this.method6544(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static240.anInt4386; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local57 && local57 == local61) {
					local37[local47] = local53 * this.anInt8009 >> 12;
					local41[local47] = this.anInt8007 * local57 >> 12;
					local45[local47] = local61 * this.anInt8006 >> 12;
				} else {
					local37[local47] = this.anInt8009;
					local41[local47] = this.anInt8007;
					local45[local47] = this.anInt8006;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt8009 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt8007 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt8006 = arg1.method6485();
		}
	}
}
