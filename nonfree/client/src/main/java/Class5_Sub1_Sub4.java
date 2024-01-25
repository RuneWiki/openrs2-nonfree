import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
	private int anInt1628 = 1;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
	private int anInt1630 = 1;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(30) int local30 = this.anInt1630 + this.anInt1630 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt1628 + this.anInt1628 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local30][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(54) int local54 = arg0 - this.anInt1630; local54 <= arg0 + this.anInt1630; local54++) {
				@Pc(66) int[][] local66 = this.method9203(0, Static542.anInt9254 & local54);
				@Pc(70) int[][] local70 = new int[3][Static648.anInt9588];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt1628; local92 <= this.anInt1628; local92++) {
					@Pc(100) int local100 = local92 & Static116.anInt3312;
					local72 += local80[local100];
					local76 += local88[local100];
					local74 += local84[local100];
				}
				@Pc(131) int[] local131 = local70[0];
				@Pc(135) int[] local135 = local70[1];
				@Pc(139) int[] local139 = local70[2];
				@Pc(143) int local143 = 0;
				while (Static648.anInt9588 > local143) {
					local131[local143] = local46 * local72 >> 16;
					local135[local143] = local74 * local46 >> 16;
					local139[local143] = local76 * local46 >> 16;
					@Pc(178) int local178 = Static116.anInt3312 & local143 - this.anInt1628;
					local76 -= local88[local178];
					local72 -= local80[local178];
					local74 -= local84[local178];
					local143++;
					@Pc(204) int local204 = this.anInt1628 + local143 & Static116.anInt3312;
					local76 += local88[local204];
					local72 += local80[local204];
					local74 += local84[local204];
				}
				local49[this.anInt1630 + local54 - arg0] = local70;
			}
			@Pc(250) int[] local250 = local11[0];
			@Pc(254) int[] local254 = local11[1];
			@Pc(260) int[] local260 = local11[2];
			for (local74 = 0; local74 < Static648.anInt9588; local74++) {
				local76 = 0;
				@Pc(268) int local268 = 0;
				@Pc(270) int local270 = 0;
				for (@Pc(272) int local272 = 0; local272 < local30; local272++) {
					@Pc(278) int[][] local278 = local49[local272];
					local76 += local278[0][local74];
					local270 += local278[2][local74];
					local268 += local278[1][local74];
				}
				local250[local74] = local34 * local76 >> 16;
				local254[local74] = local34 * local268 >> 16;
				local260[local74] = local270 * local34 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(23) int local23 = this.anInt1630 + this.anInt1630 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt1628 + this.anInt1628 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][] local42 = new int[local23][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt1630; local48 <= this.anInt1630 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method9210(0, local48 & Static542.anInt9254);
				@Pc(61) int[] local61 = new int[Static648.anInt9588];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt1628; local67 <= this.anInt1628; local67++) {
					local63 += local58[local67 & Static116.anInt3312];
				}
				@Pc(84) int local84 = 0;
				while (Static648.anInt9588 > local84) {
					local61[local84] = local63 * local39 >> 16;
					local63 -= local58[local84 - this.anInt1628 & Static116.anInt3312];
					local84++;
					local63 += local58[Static116.anInt3312 & local84 + this.anInt1628];
				}
				local42[this.anInt1630 + local48 - arg0] = local61;
			}
			for (@Pc(151) int local151 = 0; local151 < Static648.anInt9588; local151++) {
				@Pc(155) int local155 = 0;
				for (local63 = 0; local63 < local23; local63++) {
					local155 += local42[local63][local151];
				}
				local11[local151] = local27 * local155 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt1628 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt1630 = arg1.method8529();
		} else if (arg0 == 2) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}
}
