import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class5_Sub3_Sub25 extends Class5_Sub3 {

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
	private int anInt8013 = 1;

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
	private int anInt8016 = 1;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8016 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt8013 = arg0.method7291();
		} else if (arg1 == 2) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(23) int local23 = this.anInt8013 + this.anInt8013 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt8016 + this.anInt8016 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt8013; local48 <= this.anInt8013 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method9205(local48 & Static652.anInt10663, 0);
				@Pc(61) int[] local61 = new int[Static7.anInt102];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt8016; local67 <= this.anInt8016; local67++) {
					local63 += local58[local67 & Static517.anInt8205];
				}
				@Pc(84) int local84 = 0;
				while (local84 < Static7.anInt102) {
					local61[local84] = local63 * local39 >> 16;
					local63 -= local58[local84 - this.anInt8016 & Static517.anInt8205];
					local84++;
					local63 += local58[Static517.anInt8205 & local84 + this.anInt8016];
				}
				local42[this.anInt8013 + local48 - arg0] = local61;
			}
			for (@Pc(153) int local153 = 0; local153 < Static7.anInt102; local153++) {
				@Pc(157) int local157 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local157 += local42[local63][local153];
				}
				local11[local153] = local157 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(33) int local33 = this.anInt8013 + this.anInt8013 + 1;
			@Pc(37) int local37 = 65536 / local33;
			@Pc(46) int local46 = this.anInt8016 + this.anInt8016 + 1;
			@Pc(50) int local50 = 65536 / local46;
			@Pc(53) int[][][] local53 = new int[local33][][];
			@Pc(79) int local79;
			@Pc(81) int local81;
			for (@Pc(59) int local59 = arg0 - this.anInt8013; local59 <= this.anInt8013 + arg0; local59++) {
				@Pc(71) int[][] local71 = this.method9207(local59 & Static652.anInt10663, 0);
				@Pc(75) int[][] local75 = new int[3][Static7.anInt102];
				@Pc(77) int local77 = 0;
				local79 = 0;
				local81 = 0;
				@Pc(85) int[] local85 = local71[0];
				@Pc(89) int[] local89 = local71[1];
				@Pc(93) int[] local93 = local71[2];
				for (@Pc(97) int local97 = -this.anInt8016; local97 <= this.anInt8016; local97++) {
					@Pc(105) int local105 = Static517.anInt8205 & local97;
					local79 += local89[local105];
					local81 += local93[local105];
					local77 += local85[local105];
				}
				@Pc(132) int[] local132 = local75[0];
				@Pc(136) int[] local136 = local75[1];
				@Pc(140) int[] local140 = local75[2];
				@Pc(144) int local144 = 0;
				while (local144 < Static7.anInt102) {
					local132[local144] = local50 * local77 >> 16;
					local136[local144] = local79 * local50 >> 16;
					local140[local144] = local81 * local50 >> 16;
					@Pc(180) int local180 = local144 - this.anInt8016 & Static517.anInt8205;
					local144++;
					local81 -= local93[local180];
					local79 -= local89[local180];
					local77 -= local85[local180];
					@Pc(206) int local206 = this.anInt8016 + local144 & Static517.anInt8205;
					local81 += local93[local206];
					local77 += local85[local206];
					local79 += local89[local206];
				}
				local53[local59 + this.anInt8013 - arg0] = local75;
			}
			@Pc(256) int[] local256 = local11[0];
			@Pc(260) int[] local260 = local11[1];
			@Pc(266) int[] local266 = local11[2];
			for (local79 = 0; local79 < Static7.anInt102; local79++) {
				local81 = 0;
				@Pc(274) int local274 = 0;
				@Pc(276) int local276 = 0;
				for (@Pc(278) int local278 = 0; local278 < local33; local278++) {
					@Pc(284) int[][] local284 = local53[local278];
					local276 += local284[2][local79];
					local81 += local284[0][local79];
					local274 += local284[1][local79];
				}
				local256[local79] = local81 * local37 >> 16;
				local260[local79] = local274 * local37 >> 16;
				local266[local79] = local276 * local37 >> 16;
			}
		}
		return local11;
	}
}
