import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "[I")
	public static final int[] anIntArray164 = new int[256];

	@OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
	private int anInt1906 = 3216;

	@OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
	private int anInt1908 = 4096;

	@OriginalMember(owner = "client!ft", name = "Q", descriptor = "[I")
	private final int[] anIntArray165 = new int[3];

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
	private int anInt1905 = 3216;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray164[local4] = local7;
		}
		new Class142("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(22) int local22 = Static319.anInt5269 * this.anInt1908 >> 12;
			@Pc(32) int[] local32 = this.method5964(arg0 - 1 & Static464.anInt6761, 0);
			@Pc(38) int[] local38 = this.method5964(arg0, 0);
			@Pc(48) int[] local48 = this.method5964(arg0 + 1 & Static464.anInt6761, 0);
			for (@Pc(50) int local50 = 0; local50 < Static218.anInt3990; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = (local38[local50 - 1 & Static147.anInt2302] - local38[local50 + 1 & Static147.anInt2302]) * local22 >> 12;
				@Pc(90) int local90 = local86 >> 4;
				@Pc(94) int local94 = local65 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				@Pc(131) int local131 = Class36.aByteArray10[(local94 * (local94 + 1) >> 1) + local90] & 0xFF;
				@Pc(137) int local137 = local131 * local86 >> 8;
				@Pc(143) int local143 = local65 * local131 >> 8;
				@Pc(149) int local149 = local131 * 4096 >> 8;
				@Pc(158) int local158 = local149 * this.anIntArray165[2] >> 12;
				@Pc(167) int local167 = this.anIntArray165[0] * local137 >> 12;
				@Pc(176) int local176 = this.anIntArray165[1] * local143 >> 12;
				local11[local50] = local176 + local167 + local158;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		this.method1561();
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
	private void method1561() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1906 / 4096.0F));
		this.anIntArray165[0] = (int) (Math.sin((double) ((float) this.anInt1905 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray165[1] = (int) (Math.cos((double) ((float) this.anInt1905 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray165[2] = (int) (Math.sin((double) ((float) this.anInt1906 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray165[0] * this.anIntArray165[0] >> 12;
		@Pc(81) int local81 = this.anIntArray165[1] * this.anIntArray165[1] >> 12;
		@Pc(97) int local97 = this.anIntArray165[2] * this.anIntArray165[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local81 + local69 + local97 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray165[2] = (this.anIntArray165[2] << 12) / local111;
			this.anIntArray165[1] = (this.anIntArray165[1] << 12) / local111;
			this.anIntArray165[0] = (this.anIntArray165[0] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1908 = arg0.method2896();
		} else if (arg1 == 1) {
			this.anInt1905 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt1906 = arg0.method2896();
		}
	}
}
