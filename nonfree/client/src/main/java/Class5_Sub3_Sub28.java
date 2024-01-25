import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rja")
public final class Class5_Sub3_Sub28 extends Class5_Sub3 {

	@OriginalMember(owner = "client!rja", name = "O", descriptor = "I")
	private int anInt8307 = 0;

	@OriginalMember(owner = "client!rja", name = "H", descriptor = "I")
	private int anInt8311 = 4096;

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8307 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt8311 = arg0.method7333();
		} else if (arg1 == 2) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(28) int[][] local28 = this.method9207(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static7.anInt102; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local36[local54];
				@Pc(68) int local68 = local40[local54];
				if (this.anInt8307 > local60) {
					local44[local54] = this.anInt8307;
				} else if (this.anInt8311 < local60) {
					local44[local54] = this.anInt8311;
				} else {
					local44[local54] = local60;
				}
				if (local64 < this.anInt8307) {
					local48[local54] = this.anInt8307;
				} else if (local64 <= this.anInt8311) {
					local48[local54] = local64;
				} else {
					local48[local54] = this.anInt8311;
				}
				if (this.anInt8307 > local68) {
					local52[local54] = this.anInt8307;
				} else if (local68 > this.anInt8311) {
					local52[local54] = this.anInt8311;
				} else {
					local52[local54] = local68;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(31) int[] local31 = this.method9205(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static7.anInt102; local33++) {
				@Pc(39) int local39 = local31[local33];
				if (local39 < this.anInt8307) {
					local11[local33] = this.anInt8307;
				} else if (this.anInt8311 < local39) {
					local11[local33] = this.anInt8311;
				} else {
					local11[local33] = local39;
				}
			}
		}
		return local11;
	}
}
