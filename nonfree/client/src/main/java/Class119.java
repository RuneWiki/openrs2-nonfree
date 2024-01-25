import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class119 {

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lclient!bq;")
	public Class3_Sub7 aClass3_Sub7_1;

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
	private int anInt2989;

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
	private int anInt2991;

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
	public int anInt2992;

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
	private int anInt2993;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
	private int anInt2994;

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
	private int anInt2996;

	@OriginalMember(owner = "client!ffa", name = "o", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
	private Class119() {
		if (Static210.anIntArray261 == null) {
			Static167.method2781();
		}
		this.method2741();
	}

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!ha;Lclient!fca;I)V")
	public Class119(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class3_Sub17 arg1, @OriginalArg(2) int arg2) {
		if (Static210.anIntArray261 == null) {
			Static167.method2781();
		}
		this.anInt2998 = arg1.method4888();
		this.aBoolean237 = (this.anInt2998 & 0x8) != 0;
		this.aBoolean236 = (this.anInt2998 & 0x10) != 0;
		this.anInt2998 &= 0x7;
		@Pc(47) int local47 = arg1.method4858() << arg2;
		@Pc(53) int local53 = arg1.method4858() << arg2;
		@Pc(59) int local59 = arg1.method4858() << arg2;
		@Pc(63) int local63 = arg1.method4888();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray58 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray58.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4858();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray58[local75] = (short) (local90 | local86 << 8);
		}
		local63 = Static589.anInt9316 + (local63 << Static436.anInt7634);
		@Pc(155) int local155 = Static274.anIntArray337 == null ? Static422.anIntArray448[Static231.method3710(arg1.method4858()) & 0xFFFF] : Static274.anIntArray337[arg1.method4858()];
		local86 = arg1.method4888();
		this.anInt2992 = local86 & 0x1F;
		this.anInt2994 = (local86 & 0xE0) << 3;
		if (this.anInt2992 != 31) {
			this.method2741();
		}
		this.method2742(local53, local63, local47, local59, local155, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZIII)V")
	public void method2740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2996 = arg3;
		this.anInt2993 = arg1;
		this.anInt2989 = arg2;
		this.anInt2991 = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	private void method2741() {
		@Pc(8) int local8 = this.anInt2992;
		if (local8 == 2) {
			this.anInt2996 = 1;
			this.anInt2993 = 2048;
			this.anInt2989 = 2048;
			this.anInt2991 = 0;
		} else if (local8 == 3) {
			this.anInt2991 = 0;
			this.anInt2989 = 2048;
			this.anInt2993 = 4096;
			this.anInt2996 = 1;
		} else if (local8 == 4) {
			this.anInt2991 = 0;
			this.anInt2996 = 4;
			this.anInt2993 = 2048;
			this.anInt2989 = 2048;
		} else if (local8 == 5) {
			this.anInt2993 = 8192;
			this.anInt2996 = 4;
			this.anInt2991 = 0;
			this.anInt2989 = 2048;
		} else if (local8 == 12) {
			this.anInt2991 = 0;
			this.anInt2996 = 2;
			this.anInt2993 = 2048;
			this.anInt2989 = 2048;
		} else if (local8 == 13) {
			this.anInt2991 = 0;
			this.anInt2993 = 8192;
			this.anInt2989 = 2048;
			this.anInt2996 = 2;
		} else if (local8 == 10) {
			this.anInt2991 = 1536;
			this.anInt2989 = 512;
			this.anInt2996 = 3;
			this.anInt2993 = 2048;
		} else if (local8 == 11) {
			this.anInt2991 = 1536;
			this.anInt2989 = 512;
			this.anInt2996 = 3;
			this.anInt2993 = 4096;
		} else if (local8 == 6) {
			this.anInt2991 = 1280;
			this.anInt2993 = 2048;
			this.anInt2996 = 3;
			this.anInt2989 = 768;
		} else if (local8 == 7) {
			this.anInt2993 = 4096;
			this.anInt2996 = 3;
			this.anInt2989 = 768;
			this.anInt2991 = 1280;
		} else if (local8 == 8) {
			this.anInt2989 = 1024;
			this.anInt2996 = 3;
			this.anInt2991 = 1024;
			this.anInt2993 = 2048;
		} else if (local8 == 9) {
			this.anInt2989 = 1024;
			this.anInt2993 = 4096;
			this.anInt2996 = 3;
			this.anInt2991 = 1024;
		} else if (local8 == 14) {
			this.anInt2989 = 768;
			this.anInt2996 = 1;
			this.anInt2993 = 2048;
			this.anInt2991 = 1280;
		} else if (local8 == 15) {
			this.anInt2993 = 4096;
			this.anInt2991 = 1536;
			this.anInt2996 = 1;
			this.anInt2989 = 512;
		} else if (local8 == 16) {
			this.anInt2993 = 8192;
			this.anInt2991 = 1792;
			this.anInt2996 = 1;
			this.anInt2989 = 256;
		} else {
			this.anInt2996 = 0;
			this.anInt2991 = 0;
			this.anInt2989 = 2048;
			this.anInt2993 = 2048;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIBIILclient!ha;)V")
	private void method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class16 arg5) {
		this.aClass3_Sub7_1 = arg5.method8154(arg2, arg3, arg0, arg1, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZII)V")
	public void method2745(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		if (arg0) {
			local20 = 2048;
		} else {
			@Pc(34) int local34 = this.anInt2993 * arg1 / 50 + this.anInt2994 & 0x7FF;
			@Pc(37) int local37 = this.anInt2996;
			if (local37 == 1) {
				local20 = (Class3_Sub7_Sub2.anIntArray171[local34 << 3] >> 4) + 1024;
			} else if (local37 == 3) {
				local20 = Static210.anIntArray261[local34] >> 1;
			} else if (local37 == 4) {
				local20 = local34 >> 10 << 11;
			} else if (local37 == 2) {
				local20 = local34;
			} else if (local37 == 5) {
				local20 = (local34 >= 1024 ? 2048 - local34 : local34) << 1;
			} else {
				local20 = 2048;
			}
		}
		this.aClass3_Sub7_1.method6347((float) ((local20 * this.anInt2989 >> 11) + this.anInt2991) / 2048.0F);
	}
}
