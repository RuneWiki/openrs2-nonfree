import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rg", name = "db", descriptor = "[J")
	public static final long[] aLongArray7 = new long[256];

	@OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
	private int anInt3397 = 32768;

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(18) long local18 = (long) local14;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1L) == 1L) {
					local18 = local18 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local18 >>>= 0x1;
				}
			}
			aLongArray7[local14] = local18;
		}
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(26) int[] local26 = this.method3328(1, arg0);
			@Pc(32) int[] local32 = this.method3328(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static190.anInt3865; local46++) {
				@Pc(57) int local57 = local32[local46] * this.anInt3397 >> 12;
				@Pc(67) int local67 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(75) int local75 = local57 * Static52.anIntArray58[local67] >> 12;
				@Pc(83) int local83 = local57 * Static1.anIntArray93[local67] >> 12;
				@Pc(91) int local91 = Static134.anInt2681 & local46 + (local83 >> 12);
				@Pc(99) int local99 = (local75 >> 12) + arg0 & Static170.anInt1101;
				@Pc(105) int[][] local105 = this.method3332(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3397 = arg0.method1270() << 4;
		} else if (arg1 == 1) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		Static198.method3152();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(1, arg0);
			@Pc(35) int[] local35 = this.method3328(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static190.anInt3865; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt3397 * local35[local37] >> 12;
				@Pc(64) int local64 = local56 * Static52.anIntArray58[local47] >> 12;
				@Pc(72) int local72 = Static1.anIntArray93[local47] * local56 >> 12;
				@Pc(81) int local81 = arg0 + (local64 >> 12) & Static170.anInt1101;
				@Pc(90) int local90 = Static134.anInt2681 & local37 + (local72 >> 12);
				@Pc(96) int[] local96 = this.method3328(0, local81);
				local19[local37] = local96[local90];
			}
		}
		return local19;
	}
}
