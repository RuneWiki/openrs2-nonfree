import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub3_Sub13 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gm", name = "Y", descriptor = "[B")
	public static byte[] aByteArray33;

	@OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
	private int anInt2072 = 8192;

	@OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
	private int anInt2073 = 12288;

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
	private int anInt2069 = 2048;

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
	private int anInt2067 = 0;

	@OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
	private int anInt2080 = 4096;

	@OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
	private int anInt2079 = 0;

	@OriginalMember(owner = "client!gm", name = "ab", descriptor = "I")
	private int anInt2082 = 2048;

	static {
		@Pc(6) int local6 = 0;
		aByteArray33 = new byte[32896];
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			for (@Pc(18) int local18 = 0; local18 <= local11; local18++) {
				aByteArray33[local6++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local18 * local18 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)Z")
	private boolean method1619(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt2073 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static281.anIntArray463[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2073;
		@Pc(44) int local44 = (local29 << 12) / this.anInt2072;
		@Pc(51) int local51 = this.anInt2080 * local44 >> 12;
		return local51 > arg0 - arg1 && -local51 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2082 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt2079 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt2067 = arg0.method2691();
		} else if (arg1 == 3) {
			this.anInt2069 = arg0.method2691();
		} else if (arg1 == 4) {
			this.anInt2073 = arg0.method2691();
		} else if (arg1 == 5) {
			this.anInt2080 = arg0.method2691();
		} else if (arg1 == 6) {
			this.anInt2072 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		Static19.method365();
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(27) int local27 = Static132.anIntArray265[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static227.anInt4511; local29++) {
				@Pc(37) int local37 = local27 + this.anInt2079;
				@Pc(43) int local43 = Static209.anIntArray377[local29] - 2048;
				@Pc(52) int local52 = local37 >= -2048 ? local37 : local37 + 4096;
				@Pc(57) int local57 = this.anInt2067 + local43;
				@Pc(68) int local68 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(79) int local79 = local57 < -2048 ? local57 + 4096 : local57;
				@Pc(84) int local84 = this.anInt2082 + local43;
				@Pc(95) int local95 = local84 >= -2048 ? local84 : local84 + 4096;
				@Pc(100) int local100 = this.anInt2069 + local27;
				@Pc(111) int local111 = local95 <= 2048 ? local95 : local95 - 4096;
				@Pc(120) int local120 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(131) int local131 = local100 >= -2048 ? local100 : local100 + 4096;
				@Pc(142) int local142 = local131 <= 2048 ? local131 : local131 - 4096;
				local13[local29] = this.method1622(local68, local111) || this.method1619(local142, local120) ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(III)Z")
	private boolean method1622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt2073 >> 12;
		@Pc(31) int local31 = Static281.anIntArray463[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt2073;
		@Pc(45) int local45 = (local38 << 12) / this.anInt2072;
		@Pc(52) int local52 = local45 * this.anInt2080 >> 12;
		return arg1 + arg0 < local52 && -local52 < arg1 + arg0;
	}
}
