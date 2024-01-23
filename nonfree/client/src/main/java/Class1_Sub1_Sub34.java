import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
	private int anInt5030 = 1;

	@OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
	private int anInt5031 = 1;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(24) int local24 = this.anInt5031 + this.anInt5031 + 1;
			@Pc(32) int local32 = this.anInt5030 + this.anInt5030 + 1;
			@Pc(36) int local36 = 65536 / local24;
			@Pc(40) int local40 = 65536 / local32;
			@Pc(43) int[][] local43 = new int[local24][];
			@Pc(48) int local48;
			for (local48 = arg0 - this.anInt5031; local48 <= this.anInt5031 + arg0; local48++) {
				@Pc(66) int[] local66 = this.method4464(Static202.anInt3956 & local48, 0);
				@Pc(68) int local68 = 0;
				@Pc(71) int[] local71 = new int[Static6.anInt4960];
				@Pc(75) int local75;
				for (local75 = -this.anInt5030; local75 <= this.anInt5030; local75++) {
					local68 += local66[Static274.anInt5042 & local75];
				}
				local75 = 0;
				while (local75 < Static6.anInt4960) {
					local71[local75] = local40 * local68 >> 16;
					local68 -= local66[Static274.anInt5042 & local75 - this.anInt5030];
					local75++;
					local68 += local66[local75 + this.anInt5030 & Static274.anInt5042];
				}
				local43[local48 + this.anInt5031 - arg0] = local71;
			}
			for (local48 = 0; local48 < Static6.anInt4960; local48++) {
				@Pc(153) int local153 = 0;
				for (@Pc(155) int local155 = 0; local155 < local24; local155++) {
					local153 += local43[local155][local48];
				}
				local11[local48] = local153 * local36 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5030 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt5031 = arg0.method1853();
		} else if (arg1 == 2) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(20) int local20 = this.anInt5031 + this.anInt5031 + 1;
			@Pc(28) int local28 = this.anInt5030 + this.anInt5030 + 1;
			@Pc(32) int local32 = 65536 / local20;
			@Pc(36) int local36 = 65536 / local28;
			@Pc(39) int[][][] local39 = new int[local20][][];
			@Pc(64) int local64;
			@Pc(76) int local76;
			@Pc(70) int local70;
			for (@Pc(44) int local44 = arg0 - this.anInt5031; local44 <= arg0 + this.anInt5031; local44++) {
				@Pc(62) int[][] local62 = this.method4456(Static202.anInt3956 & local44, 0);
				local64 = 0;
				@Pc(68) int[][] local68 = new int[3][Static6.anInt4960];
				local70 = 0;
				@Pc(74) int[] local74 = local62[0];
				local76 = 0;
				@Pc(80) int[] local80 = local62[1];
				@Pc(84) int[] local84 = local62[2];
				for (@Pc(88) int local88 = -this.anInt5030; local88 <= this.anInt5030; local88++) {
					@Pc(96) int local96 = Static274.anInt5042 & local88;
					local64 += local74[local96];
					local70 += local84[local96];
					local76 += local80[local96];
				}
				@Pc(121) int[] local121 = local68[0];
				@Pc(125) int[] local125 = local68[1];
				@Pc(129) int[] local129 = local68[2];
				@Pc(131) int local131 = 0;
				while (Static6.anInt4960 > local131) {
					local121[local131] = local36 * local64 >> 16;
					local125[local131] = local76 * local36 >> 16;
					local129[local131] = local70 * local36 >> 16;
					@Pc(166) int local166 = Static274.anInt5042 & local131 - this.anInt5030;
					local76 -= local80[local166];
					local64 -= local74[local166];
					local131++;
					local70 -= local84[local166];
					@Pc(192) int local192 = local131 + this.anInt5030 & Static274.anInt5042;
					local64 += local74[local192];
					local76 += local80[local192];
					local70 += local84[local192];
				}
				local39[local44 + this.anInt5031 - arg0] = local68;
			}
			@Pc(230) int[] local230 = local7[0];
			@Pc(234) int[] local234 = local7[2];
			@Pc(238) int[] local238 = local7[1];
			for (local64 = 0; local64 < Static6.anInt4960; local64++) {
				local76 = 0;
				local70 = 0;
				@Pc(253) int local253 = 0;
				for (@Pc(255) int local255 = 0; local255 < local20; local255++) {
					@Pc(266) int[][] local266 = local39[local255];
					local253 += local266[2][local64];
					local76 += local266[0][local64];
					local70 += local266[1][local64];
				}
				local230[local64] = local76 * local32 >> 16;
				local238[local64] = local70 * local32 >> 16;
				local234[local64] = local32 * local253 >> 16;
			}
		}
		return local7;
	}
}
