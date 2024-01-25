import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class2_Sub3_Sub32 extends Class2_Sub3 {

	@OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
	private int anInt10179 = 4096;

	@OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
	private int anInt10182 = 4096;

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
	private int anInt10187 = 4096;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(28) int[][] local28 = this.method9147(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static222.anInt4971; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local64 == local60 && local68 == local64) {
					local44[local54] = local60 * this.anInt10179 >> 12;
					local48[local54] = this.anInt10187 * local64 >> 12;
					local52[local54] = this.anInt10182 * local68 >> 12;
				} else {
					local44[local54] = this.anInt10179;
					local48[local54] = this.anInt10187;
					local52[local54] = this.anInt10182;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10179 = arg0.method8326();
		} else if (arg1 == 1) {
			this.anInt10187 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt10182 = arg0.method8326();
		}
	}
}
