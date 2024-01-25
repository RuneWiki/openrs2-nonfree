import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class108 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
	public int anInt2837;

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
	private int anInt2838;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	private int anInt2839;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
	private int anInt2841;

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
	public int anInt2842;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
	private int anInt2844;

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "Z")
	public boolean aBoolean241;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "Lclient!cba;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
	private int anInt2849;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "Z")
	public boolean aBoolean242;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	private Class108() {
		if (Static210.anIntArray331 == null) {
			Static306.method5367();
		}
		this.method2646();
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!qa;Lclient!os;I)V")
	public Class108(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class1_Sub17 arg1, @OriginalArg(2) int arg2) {
		if (Static210.anIntArray331 == null) {
			Static306.method5367();
		}
		this.anInt2842 = arg1.method4487();
		this.aBoolean242 = (this.anInt2842 & 0x8) != 0;
		this.aBoolean241 = (this.anInt2842 & 0x10) != 0;
		this.anInt2842 &= 0x7;
		@Pc(47) int local47 = arg1.method4494() << arg2;
		@Pc(53) int local53 = arg1.method4494() << arg2;
		@Pc(59) int local59 = arg1.method4494() << arg2;
		@Pc(63) int local63 = arg1.method4487();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray62 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray62.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4494();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray62[local75] = (short) (local86 << 8 | local90);
		}
		local63 = Static270.anInt5197 + (local63 << Static275.anInt5260);
		@Pc(155) int local155 = Static107.anIntArray176 == null ? Static19.anIntArray30[Static518.method7915(arg1.method4494()) & 0xFFFF] : Static107.anIntArray176[arg1.method4494()];
		local86 = arg1.method4487();
		this.anInt2837 = local86 & 0x1F;
		this.anInt2838 = (local86 & 0xE0) << 3;
		if (this.anInt2837 != 31) {
			this.method2646();
		}
		this.method2650(local47, arg0, local59, local63, local155, local53);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V")
	public void method2645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2849 = arg3;
		this.anInt2844 = arg0;
		this.anInt2841 = arg2;
		this.anInt2839 = arg1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	private void method2646() {
		@Pc(4) int local4 = this.anInt2837;
		if (local4 == 2) {
			this.anInt2844 = 2048;
			this.anInt2839 = 2048;
			this.anInt2841 = 0;
			this.anInt2849 = 1;
		} else if (local4 == 3) {
			this.anInt2844 = 2048;
			this.anInt2839 = 4096;
			this.anInt2841 = 0;
			this.anInt2849 = 1;
		} else if (local4 == 4) {
			this.anInt2849 = 4;
			this.anInt2844 = 2048;
			this.anInt2841 = 0;
			this.anInt2839 = 2048;
		} else if (local4 == 5) {
			this.anInt2844 = 2048;
			this.anInt2841 = 0;
			this.anInt2849 = 4;
			this.anInt2839 = 8192;
		} else if (local4 == 12) {
			this.anInt2839 = 2048;
			this.anInt2844 = 2048;
			this.anInt2841 = 0;
			this.anInt2849 = 2;
		} else if (local4 == 13) {
			this.anInt2841 = 0;
			this.anInt2849 = 2;
			this.anInt2844 = 2048;
			this.anInt2839 = 8192;
		} else if (local4 == 10) {
			this.anInt2839 = 2048;
			this.anInt2844 = 512;
			this.anInt2849 = 3;
			this.anInt2841 = 1536;
		} else if (local4 == 11) {
			this.anInt2839 = 4096;
			this.anInt2841 = 1536;
			this.anInt2844 = 512;
			this.anInt2849 = 3;
		} else if (local4 == 6) {
			this.anInt2841 = 1280;
			this.anInt2844 = 768;
			this.anInt2839 = 2048;
			this.anInt2849 = 3;
		} else if (local4 == 7) {
			this.anInt2849 = 3;
			this.anInt2839 = 4096;
			this.anInt2841 = 1280;
			this.anInt2844 = 768;
		} else if (local4 == 8) {
			this.anInt2839 = 2048;
			this.anInt2849 = 3;
			this.anInt2844 = 1024;
			this.anInt2841 = 1024;
		} else if (local4 == 9) {
			this.anInt2849 = 3;
			this.anInt2844 = 1024;
			this.anInt2839 = 4096;
			this.anInt2841 = 1024;
		} else if (local4 == 14) {
			this.anInt2841 = 1280;
			this.anInt2844 = 768;
			this.anInt2839 = 2048;
			this.anInt2849 = 1;
		} else if (local4 == 15) {
			this.anInt2841 = 1536;
			this.anInt2839 = 4096;
			this.anInt2844 = 512;
			this.anInt2849 = 1;
		} else if (local4 == 16) {
			this.anInt2849 = 1;
			this.anInt2844 = 256;
			this.anInt2841 = 1792;
			this.anInt2839 = 8192;
		} else {
			this.anInt2841 = 0;
			this.anInt2849 = 0;
			this.anInt2844 = 2048;
			this.anInt2839 = 2048;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZZI)V")
	public void method2647(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt2838 + this.anInt2839 * arg1 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt2849;
			if (local27 == 1) {
				local9 = (Class200_Sub1.lb[local24 << 3] >> 5) + 1024;
			} else if (local27 == 3) {
				local9 = Static210.anIntArray331[local24] >> 1;
			} else if (local27 == 4) {
				local9 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local9 = local24;
			} else if (local27 == 5) {
				local9 = (local24 >= 1024 ? 2048 - local24 : local24) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass1_Sub5_1.method4312((float) (this.anInt2841 + (this.anInt2844 * local9 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!qa;IIIII)V")
	private void method2650(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass1_Sub5_1 = arg1.method7170(arg0, arg2, arg5, arg3, arg4, 1.0F);
	}
}
