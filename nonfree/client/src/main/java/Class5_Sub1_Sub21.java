import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class5_Sub1_Sub21 extends Class5_Sub1 {

	@OriginalMember(owner = "client!lt", name = "E", descriptor = "I")
	private int anInt5902 = 1;

	@OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
	private int anInt5905 = 1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5905 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt5902 = arg1.method4220();
		} else if (arg0 == 2) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(23) int local23 = this.anInt5902 + this.anInt5902 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt5905 + this.anInt5905 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(66) int local66;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt5902; local48 <= arg0 + this.anInt5902; local48++) {
				@Pc(58) int[][] local58 = this.method7154(0, local48 & Static160.anInt3274);
				@Pc(62) int[][] local62 = new int[3][Static147.anInt3075];
				@Pc(64) int local64 = 0;
				local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt5905; local84 <= this.anInt5905; local84++) {
					@Pc(90) int local90 = local84 & Static497.anInt9138;
					local68 += local80[local90];
					local66 += local76[local90];
					local64 += local72[local90];
				}
				@Pc(121) int[] local121 = local62[0];
				@Pc(125) int[] local125 = local62[1];
				@Pc(129) int[] local129 = local62[2];
				@Pc(131) int local131 = 0;
				while (local131 < Static147.anInt3075) {
					local121[local131] = local64 * local39 >> 16;
					local125[local131] = local66 * local39 >> 16;
					local129[local131] = local68 * local39 >> 16;
					@Pc(165) int local165 = local131 - this.anInt5905 & Static497.anInt9138;
					local66 -= local76[local165];
					local68 -= local80[local165];
					local131++;
					local64 -= local72[local165];
					@Pc(191) int local191 = local131 + this.anInt5905 & Static497.anInt9138;
					local66 += local76[local191];
					local68 += local80[local191];
					local64 += local72[local191];
				}
				local42[this.anInt5902 + local48 - arg0] = local62;
			}
			@Pc(234) int[] local234 = local11[0];
			@Pc(238) int[] local238 = local11[1];
			@Pc(242) int[] local242 = local11[2];
			for (local66 = 0; local66 < Static147.anInt3075; local66++) {
				local68 = 0;
				@Pc(250) int local250 = 0;
				@Pc(252) int local252 = 0;
				for (@Pc(254) int local254 = 0; local254 < local23; local254++) {
					@Pc(260) int[][] local260 = local42[local254];
					local250 += local260[1][local66];
					local68 += local260[0][local66];
					local252 += local260[2][local66];
				}
				local234[local66] = local68 * local27 >> 16;
				local238[local66] = local250 * local27 >> 16;
				local242[local66] = local27 * local252 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(24) int local24 = this.anInt5902 + this.anInt5902 + 1;
			@Pc(28) int local28 = 65536 / local24;
			@Pc(36) int local36 = this.anInt5905 + this.anInt5905 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][] local43 = new int[local24][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt5902; local48 <= this.anInt5902 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method7160(0, local48 & Static160.anInt3274);
				@Pc(61) int[] local61 = new int[Static147.anInt3075];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt5905; local67 <= this.anInt5905; local67++) {
					local63 += local58[Static497.anInt9138 & local67];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static147.anInt3075) {
					local61[local88] = local63 * local40 >> 16;
					local63 -= local58[local88 - this.anInt5905 & Static497.anInt9138];
					local88++;
					local63 += local58[local88 + this.anInt5905 & Static497.anInt9138];
				}
				local43[this.anInt5902 + local48 - arg0] = local61;
			}
			for (@Pc(148) int local148 = 0; local148 < Static147.anInt3075; local148++) {
				@Pc(152) int local152 = 0;
				for (local63 = 0; local63 < local24; local63++) {
					local152 += local43[local63][local148];
				}
				local11[local148] = local28 * local152 >> 16;
			}
		}
		return local11;
	}
}
