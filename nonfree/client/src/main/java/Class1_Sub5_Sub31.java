import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub5_Sub31 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "Z")
	private boolean aBoolean483 = true;

	@OriginalMember(owner = "client!ta", name = "N", descriptor = "Z")
	private boolean aBoolean484 = true;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(34) int[][] local34 = this.method5807(this.aBoolean484 ? Static42.anInt1137 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean483) {
				for (local63 = 0; local63 < Static75.anInt1566; local63++) {
					local50[local63] = local38[Static239.anInt2816 - local63];
					local54[local63] = local42[Static239.anInt2816 - local63];
					local58[local63] = local46[Static239.anInt2816 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static75.anInt1566; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean483 = arg0.method5720() == 1;
		} else if (arg1 == 1) {
			this.aBoolean484 = arg0.method5720() == 1;
		} else if (arg1 == 2) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(35) int[] local35 = this.method5802(0, this.aBoolean484 ? Static42.anInt1137 - arg0 : arg0);
			if (this.aBoolean483) {
				for (@Pc(48) int local48 = 0; local48 < Static75.anInt1566; local48++) {
					local15[local48] = local35[Static239.anInt2816 - local48];
				}
			} else {
				Static361.method1854(local35, 0, local15, 0, Static75.anInt1566);
			}
		}
		return local15;
	}
}
