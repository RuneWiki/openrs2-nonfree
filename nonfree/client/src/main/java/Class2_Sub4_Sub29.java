import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub4_Sub29 extends Class2_Sub4 {

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	private int anInt3521 = 1;

	@OriginalMember(owner = "client!r", name = "U", descriptor = "I")
	private int anInt3519 = 1;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3521 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt3519 = arg1.method1534();
		} else if (arg0 == 2) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(24) int local24 = this.anInt3519 + this.anInt3519 + 1;
			@Pc(32) int local32 = this.anInt3521 + this.anInt3521 + 1;
			@Pc(36) int local36 = 65536 / local24;
			@Pc(40) int local40 = 65536 / local32;
			@Pc(43) int[][] local43 = new int[local24][];
			@Pc(63) int local63;
			for (@Pc(48) int local48 = arg0 - this.anInt3519; local48 <= this.anInt3519 + arg0; local48++) {
				@Pc(58) int[] local58 = this.method3129(0, Static167.anInt3559 & local48);
				@Pc(61) int[] local61 = new int[Static118.anInt2608];
				local63 = 0;
				for (@Pc(67) int local67 = -this.anInt3521; local67 <= this.anInt3521; local67++) {
					local63 += local58[Static82.anInt1734 & local67];
				}
				@Pc(88) int local88 = 0;
				while (local88 < Static118.anInt2608) {
					local61[local88] = local63 * local40 >> 16;
					local63 -= local58[local88 - this.anInt3521 & Static82.anInt1734];
					local88++;
					local63 += local58[this.anInt3521 + local88 & Static82.anInt1734];
				}
				local43[this.anInt3519 + local48 - arg0] = local61;
			}
			for (@Pc(144) int local144 = 0; local144 < Static118.anInt2608; local144++) {
				@Pc(148) int local148 = 0;
				for (local63 = 0; local63 < local24; local63++) {
					local148 += local43[local63][local144];
				}
				local11[local144] = local36 * local148 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(30) int local30 = this.anInt3519 + this.anInt3519 + 1;
			@Pc(39) int local39 = this.anInt3521 + this.anInt3521 + 1;
			@Pc(43) int local43 = 65536 / local30;
			@Pc(47) int local47 = 65536 / local39;
			@Pc(50) int[][][] local50 = new int[local30][][];
			@Pc(60) int local60;
			@Pc(88) int local88;
			for (@Pc(56) int local56 = arg0 - this.anInt3519; local56 <= arg0 + this.anInt3519; local56++) {
				local60 = 0;
				@Pc(62) int local62 = 0;
				@Pc(70) int[][] local70 = this.method3130(local56 & Static167.anInt3559, 0);
				@Pc(74) int[][] local74 = new int[3][Static118.anInt2608];
				@Pc(78) int[] local78 = local70[0];
				@Pc(82) int[] local82 = local70[2];
				@Pc(86) int[] local86 = local70[1];
				local88 = 0;
				for (@Pc(92) int local92 = -this.anInt3521; local92 <= this.anInt3521; local92++) {
					@Pc(98) int local98 = Static82.anInt1734 & local92;
					local60 += local86[local98];
					local62 += local78[local98];
					local88 += local82[local98];
				}
				@Pc(125) int[] local125 = local74[0];
				@Pc(129) int[] local129 = local74[1];
				@Pc(133) int[] local133 = local74[2];
				@Pc(135) int local135 = 0;
				while (Static118.anInt2608 > local135) {
					local125[local135] = local47 * local62 >> 16;
					local129[local135] = local47 * local60 >> 16;
					local133[local135] = local47 * local88 >> 16;
					@Pc(169) int local169 = local135 - this.anInt3521 & Static82.anInt1734;
					local88 -= local82[local169];
					local135++;
					local62 -= local78[local169];
					local60 -= local86[local169];
					@Pc(195) int local195 = Static82.anInt1734 & local135 + this.anInt3521;
					local62 += local78[local195];
					local88 += local82[local195];
					local60 += local86[local195];
				}
				local50[this.anInt3519 + local56 - arg0] = local74;
			}
			@Pc(241) int[] local241 = local17[0];
			@Pc(245) int[] local245 = local17[1];
			@Pc(249) int[] local249 = local17[2];
			for (local60 = 0; local60 < Static118.anInt2608; local60++) {
				local88 = 0;
				@Pc(257) int local257 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local30; local261++) {
					@Pc(267) int[][] local267 = local50[local261];
					local259 += local267[2][local60];
					local257 += local267[1][local60];
					local88 += local267[0][local60];
				}
				local241[local60] = local43 * local88 >> 16;
				local245[local60] = local43 * local257 >> 16;
				local249[local60] = local43 * local259 >> 16;
			}
		}
		return local17;
	}
}
