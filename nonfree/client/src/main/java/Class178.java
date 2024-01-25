import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class178 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
	private int anInt4469;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
	public int anInt4470;

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
	private int anInt4474;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	private int anInt4475;

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
	private int anInt4477;

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
	private int anInt4478;

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
	public int anInt4479;

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "Lclient!hj;")
	public Class6_Sub7 aClass6_Sub7_2;

	@OriginalMember(owner = "client!ku", name = "r", descriptor = "Z")
	public boolean aBoolean274;

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
	private Class178() {
		if (Static491.anIntArray637 == null) {
			Static60.method771();
		}
		this.method3836();
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!oa;Lclient!dga;I)V")
	public Class178(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class6_Sub14 arg1, @OriginalArg(2) int arg2) {
		if (Static491.anIntArray637 == null) {
			Static60.method771();
		}
		this.anInt4479 = arg1.method6041();
		this.aBoolean273 = (this.anInt4479 & 0x8) != 0;
		this.aBoolean274 = (this.anInt4479 & 0x10) != 0;
		this.anInt4479 &= 0x7;
		@Pc(47) int local47 = arg1.method6006() << arg2;
		@Pc(53) int local53 = arg1.method6006() << arg2;
		@Pc(59) int local59 = arg1.method6006() << arg2;
		@Pc(63) int local63 = arg1.method6041();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray78 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray78.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method6006();
			local86 = local82 >>> 8;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local69 - local86 < local101) {
				local101 = local69 - local86;
			}
			this.aShortArray78[local75] = (short) (local101 | local86 << 8);
		}
		local63 = Static431.anInt7547 + (local63 << Static188.anInt3275);
		@Pc(151) int local151 = Static101.anIntArray262 == null ? Static6.anIntArray272[Static516.method7312(arg1.method6006()) & 0xFFFF] : Static101.anIntArray262[arg1.method6006()];
		local86 = arg1.method6041();
		this.anInt4475 = (local86 & 0xE0) << 3;
		this.anInt4470 = local86 & 0x1F;
		if (this.anInt4470 != 31) {
			this.method3836();
		}
		this.method3840(local151, local59, arg0, local47, local63, local53);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	private void method3836() {
		@Pc(14) int local14 = this.anInt4470;
		if (local14 == 2) {
			this.anInt4477 = 1;
			this.anInt4478 = 2048;
			this.anInt4474 = 2048;
			this.anInt4469 = 0;
		} else if (local14 == 3) {
			this.anInt4474 = 2048;
			this.anInt4477 = 1;
			this.anInt4469 = 0;
			this.anInt4478 = 4096;
		} else if (local14 == 4) {
			this.anInt4469 = 0;
			this.anInt4477 = 4;
			this.anInt4478 = 2048;
			this.anInt4474 = 2048;
		} else if (local14 == 5) {
			this.anInt4478 = 8192;
			this.anInt4477 = 4;
			this.anInt4469 = 0;
			this.anInt4474 = 2048;
		} else if (local14 == 12) {
			this.anInt4474 = 2048;
			this.anInt4469 = 0;
			this.anInt4477 = 2;
			this.anInt4478 = 2048;
		} else if (local14 == 13) {
			this.anInt4477 = 2;
			this.anInt4469 = 0;
			this.anInt4474 = 2048;
			this.anInt4478 = 8192;
		} else if (local14 == 10) {
			this.anInt4474 = 512;
			this.anInt4477 = 3;
			this.anInt4478 = 2048;
			this.anInt4469 = 1536;
		} else if (local14 == 11) {
			this.anInt4478 = 4096;
			this.anInt4477 = 3;
			this.anInt4474 = 512;
			this.anInt4469 = 1536;
		} else if (local14 == 6) {
			this.anInt4469 = 1280;
			this.anInt4478 = 2048;
			this.anInt4474 = 768;
			this.anInt4477 = 3;
		} else if (local14 == 7) {
			this.anInt4478 = 4096;
			this.anInt4469 = 1280;
			this.anInt4477 = 3;
			this.anInt4474 = 768;
		} else if (local14 == 8) {
			this.anInt4477 = 3;
			this.anInt4469 = 1024;
			this.anInt4478 = 2048;
			this.anInt4474 = 1024;
		} else if (local14 == 9) {
			this.anInt4477 = 3;
			this.anInt4478 = 4096;
			this.anInt4474 = 1024;
			this.anInt4469 = 1024;
		} else if (local14 == 14) {
			this.anInt4477 = 1;
			this.anInt4474 = 768;
			this.anInt4469 = 1280;
			this.anInt4478 = 2048;
		} else if (local14 == 15) {
			this.anInt4477 = 1;
			this.anInt4474 = 512;
			this.anInt4469 = 1536;
			this.anInt4478 = 4096;
		} else if (local14 == 16) {
			this.anInt4469 = 1792;
			this.anInt4474 = 256;
			this.anInt4478 = 8192;
			this.anInt4477 = 1;
		} else {
			this.anInt4478 = 2048;
			this.anInt4474 = 2048;
			this.anInt4477 = 0;
			this.anInt4469 = 0;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZB)V")
	public void method3837(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(62) int local62;
		if (arg1) {
			local62 = 2048;
		} else {
			@Pc(25) int local25 = this.anInt4475 + arg0 * this.anInt4478 / 50 & 0x7FF;
			@Pc(28) int local28 = this.anInt4477;
			if (local28 == 1) {
				local62 = (Class138.anIntArray392[local25 << 3] >> 4) + 1024;
			} else if (local28 == 3) {
				local62 = Static491.anIntArray637[local25] >> 1;
			} else if (local28 == 4) {
				local62 = local25 >> 10 << 11;
			} else if (local28 == 2) {
				local62 = local25;
			} else if (local28 == 5) {
				local62 = (local25 < 1024 ? local25 : 2048 - local25) << 1;
			} else {
				local62 = 2048;
			}
		}
		this.aClass6_Sub7_2.method3484((float) (this.anInt4469 + (local62 * this.anInt4474 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIII)V")
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4474 = arg1;
		this.anInt4478 = arg2;
		this.anInt4469 = arg0;
		this.anInt4477 = arg3;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!oa;IIII)V")
	private void method3840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub7_2 = arg2.method7082(arg3, arg1, arg5, arg4, arg0, 1.0F);
	}
}
