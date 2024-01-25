import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
	private int anInt124 = 4096;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
	private int anInt123 = 4096;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
	private int anInt129 = 4096;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt124 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt129 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt123 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8331(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass214_41.method5655(arg0);
		if (super.aClass214_41.aBoolean577) {
			@Pc(28) int[][] local28 = this.method8337(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static164.anInt8839; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local64 == local60 && local68 == local64) {
					local44[local54] = this.anInt124 * local60 >> 12;
					local48[local54] = this.anInt129 * local64 >> 12;
					local52[local54] = local68 * this.anInt123 >> 12;
				} else {
					local44[local54] = this.anInt124;
					local48[local54] = this.anInt129;
					local52[local54] = this.anInt123;
				}
			}
		}
		return local18;
	}
}
