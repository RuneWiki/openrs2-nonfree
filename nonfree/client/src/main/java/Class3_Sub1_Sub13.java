import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
	private int anInt3621 = 1;

	@OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
	private int anInt3620 = 1;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(31) int local31 = this.anInt3621 + this.anInt3621 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(44) int local44 = this.anInt3620 + this.anInt3620 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][][] local51 = new int[local31][][];
			@Pc(75) int local75;
			@Pc(77) int local77;
			for (@Pc(57) int local57 = arg0 - this.anInt3621; local57 <= arg0 + this.anInt3621; local57++) {
				@Pc(67) int[][] local67 = this.method8360(0, Static483.anInt9026 & local57);
				@Pc(71) int[][] local71 = new int[3][Static131.anInt2935];
				@Pc(73) int local73 = 0;
				local75 = 0;
				local77 = 0;
				@Pc(81) int[] local81 = local67[0];
				@Pc(85) int[] local85 = local67[1];
				@Pc(89) int[] local89 = local67[2];
				for (@Pc(93) int local93 = -this.anInt3620; local93 <= this.anInt3620; local93++) {
					@Pc(99) int local99 = Static251.anInt5425 & local93;
					local73 += local81[local99];
					local77 += local89[local99];
					local75 += local85[local99];
				}
				@Pc(130) int[] local130 = local71[0];
				@Pc(134) int[] local134 = local71[1];
				@Pc(138) int[] local138 = local71[2];
				@Pc(140) int local140 = 0;
				while (local140 < Static131.anInt2935) {
					local130[local140] = local73 * local48 >> 16;
					local134[local140] = local75 * local48 >> 16;
					local138[local140] = local48 * local77 >> 16;
					@Pc(174) int local174 = local140 - this.anInt3620 & Static251.anInt5425;
					local77 -= local89[local174];
					local140++;
					local73 -= local81[local174];
					local75 -= local85[local174];
					@Pc(201) int local201 = local140 + this.anInt3620 & Static251.anInt5425;
					local73 += local81[local201];
					local75 += local85[local201];
					local77 += local89[local201];
				}
				local51[local57 + this.anInt3621 - arg0] = local71;
			}
			@Pc(248) int[] local248 = local19[0];
			@Pc(252) int[] local252 = local19[1];
			@Pc(256) int[] local256 = local19[2];
			for (local75 = 0; local75 < Static131.anInt2935; local75++) {
				local77 = 0;
				@Pc(264) int local264 = 0;
				@Pc(266) int local266 = 0;
				for (@Pc(268) int local268 = 0; local268 < local31; local268++) {
					@Pc(274) int[][] local274 = local51[local268];
					local77 += local274[0][local75];
					local266 += local274[2][local75];
					local264 += local274[1][local75];
				}
				local248[local75] = local35 * local77 >> 16;
				local252[local75] = local35 * local264 >> 16;
				local256[local75] = local35 * local266 >> 16;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3620 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt3621 = arg1.method6538();
		} else if (arg0 == 2) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(23) int local23 = this.anInt3621 + this.anInt3621 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(36) int local36 = this.anInt3620 + this.anInt3620 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][] local43 = new int[local23][];
			@Pc(64) int local64;
			for (@Pc(49) int local49 = arg0 - this.anInt3621; local49 <= this.anInt3621 + arg0; local49++) {
				@Pc(59) int[] local59 = this.method8362(Static483.anInt9026 & local49, 0);
				@Pc(62) int[] local62 = new int[Static131.anInt2935];
				local64 = 0;
				for (@Pc(68) int local68 = -this.anInt3620; local68 <= this.anInt3620; local68++) {
					local64 += local59[local68 & Static251.anInt5425];
				}
				@Pc(85) int local85 = 0;
				while (Static131.anInt2935 > local85) {
					local62[local85] = local40 * local64 >> 16;
					local64 -= local59[Static251.anInt5425 & local85 - this.anInt3620];
					local85++;
					local64 += local59[local85 + this.anInt3620 & Static251.anInt5425];
				}
				local43[this.anInt3621 + local49 - arg0] = local62;
			}
			for (@Pc(146) int local146 = 0; local146 < Static131.anInt2935; local146++) {
				@Pc(150) int local150 = 0;
				for (local64 = 0; local64 < local23; local64++) {
					local150 += local43[local64][local146];
				}
				local11[local146] = local150 * local27 >> 16;
			}
		}
		return local11;
	}
}
