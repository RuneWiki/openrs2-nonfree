import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class3_Sub1_Sub33 extends Class3_Sub1 {

	@OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
	private int anInt3817;

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
	private int anInt3818;

	@OriginalMember(owner = "client!th", name = "kb", descriptor = "I")
	private int anInt3823;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3817 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt3823 = arg1.method1510();
		} else if (arg0 == 2) {
			this.anInt3818 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(28) int[][] local28 = this.method3124(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local18[1];
			@Pc(44) int[] local44 = local18[2];
			@Pc(48) int[] local48 = local28[2];
			@Pc(52) int[] local52 = local18[0];
			for (@Pc(54) int local54 = 0; local54 < Static129.anInt3285; local54++) {
				@Pc(60) int local60 = local48[local54];
				@Pc(64) int local64 = local32[local54];
				@Pc(68) int local68 = local36[local54];
				if (local64 == local60 && local60 == local68) {
					local52[local54] = this.anInt3817 * local64 >> 12;
					local40[local54] = local60 * this.anInt3823 >> 12;
					local44[local54] = this.anInt3818 * local68 >> 12;
				} else {
					local52[local54] = this.anInt3817;
					local40[local54] = this.anInt3823;
					local44[local54] = this.anInt3818;
				}
			}
		}
		return local18;
	}
}
