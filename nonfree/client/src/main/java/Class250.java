import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class250 {

	@OriginalMember(owner = "client!us", name = "b", descriptor = "Lclient!sa;")
	public Class2_Sub29 aClass2_Sub29_2;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "I")
	public int anInt6796;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "I")
	private int anInt6799;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	private int anInt6801;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "I")
	private int anInt6802;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "I")
	private int anInt6803;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "I")
	private int anInt6804;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!us", name = "q", descriptor = "I")
	public int anInt6807;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	private Class250() {
		if (Static93.anIntArray139 == null) {
			Static321.method4359();
		}
		this.method5256();
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!za;Lclient!sv;I)V")
	public Class250(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class2_Sub13 arg1, @OriginalArg(2) int arg2) {
		if (Static93.anIntArray139 == null) {
			Static321.method4359();
		}
		this.anInt6796 = arg1.method3580();
		this.aBoolean486 = (this.anInt6796 & 0x8) != 0;
		this.aBoolean487 = (this.anInt6796 & 0x10) != 0;
		this.anInt6796 &= 0x7;
		@Pc(44) int local44 = arg1.method3555() << arg2;
		@Pc(50) int local50 = arg1.method3555() << arg2;
		@Pc(56) int local56 = arg1.method3555() << arg2;
		@Pc(60) int local60 = arg1.method3580();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray98 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray98.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method3555();
			local83 = local79 >>> 8;
			@Pc(87) int local87 = local79 & 0xFF;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			if (local66 - local83 < local87) {
				local87 = local66 - local83;
			}
			this.aShortArray98[local72] = (short) (local83 << 8 | local87);
		}
		local60 = Static179.anInt3078 + (local60 << Static460.anInt7074);
		@Pc(152) int local152 = Static237.anIntArray330 == null ? Static216.anIntArray305[Static362.method4761(arg1.method3555()) & 0xFFFF] : Static237.anIntArray330[arg1.method3555()];
		local83 = arg1.method3580();
		this.anInt6807 = local83 & 0x1F;
		this.anInt6802 = (local83 & 0xE0) << 3;
		if (this.anInt6807 != 31) {
			this.method5256();
		}
		this.method5252(arg0, local56, local44, local50, local60, local152);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZB)V")
	public void method5250(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt6802 + this.anInt6801 * arg0 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt6803;
			if (local26 == 1) {
				local9 = (Class155.anIntArray342[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static93.anIntArray139[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 >= 1024 ? 2048 - local23 : local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass2_Sub29_2.method5688((float) ((local9 * this.anInt6799 >> 11) + this.anInt6804) / 2048.0F);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	private void method5252(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass2_Sub29_2 = arg0.method5542(arg2, arg1, arg3, arg4, arg5, (float) 1);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	private void method5256() {
		@Pc(14) int local14 = this.anInt6807;
		if (local14 == 2) {
			this.anInt6803 = 1;
			this.anInt6804 = 0;
			this.anInt6799 = 2048;
			this.anInt6801 = 2048;
		} else if (local14 == 3) {
			this.anInt6803 = 1;
			this.anInt6804 = 0;
			this.anInt6801 = 4096;
			this.anInt6799 = 2048;
		} else if (local14 == 4) {
			this.anInt6799 = 2048;
			this.anInt6801 = 2048;
			this.anInt6804 = 0;
			this.anInt6803 = 4;
		} else if (local14 == 5) {
			this.anInt6804 = 0;
			this.anInt6801 = 8192;
			this.anInt6799 = 2048;
			this.anInt6803 = 4;
		} else if (local14 == 12) {
			this.anInt6803 = 2;
			this.anInt6801 = 2048;
			this.anInt6799 = 2048;
			this.anInt6804 = 0;
		} else if (local14 == 13) {
			this.anInt6803 = 2;
			this.anInt6801 = 8192;
			this.anInt6804 = 0;
			this.anInt6799 = 2048;
		} else if (local14 == 10) {
			this.anInt6804 = 1536;
			this.anInt6803 = 3;
			this.anInt6799 = 512;
			this.anInt6801 = 2048;
		} else if (local14 == 11) {
			this.anInt6801 = 4096;
			this.anInt6803 = 3;
			this.anInt6804 = 1536;
			this.anInt6799 = 512;
		} else if (local14 == 6) {
			this.anInt6803 = 3;
			this.anInt6801 = 2048;
			this.anInt6799 = 768;
			this.anInt6804 = 1280;
		} else if (local14 == 7) {
			this.anInt6803 = 3;
			this.anInt6804 = 1280;
			this.anInt6799 = 768;
			this.anInt6801 = 4096;
		} else if (local14 == 8) {
			this.anInt6799 = 1024;
			this.anInt6804 = 1024;
			this.anInt6801 = 2048;
			this.anInt6803 = 3;
		} else if (local14 == 9) {
			this.anInt6801 = 4096;
			this.anInt6803 = 3;
			this.anInt6799 = 1024;
			this.anInt6804 = 1024;
		} else if (local14 == 14) {
			this.anInt6803 = 1;
			this.anInt6801 = 2048;
			this.anInt6799 = 768;
			this.anInt6804 = 1280;
		} else if (local14 == 15) {
			this.anInt6803 = 1;
			this.anInt6801 = 4096;
			this.anInt6804 = 1536;
			this.anInt6799 = 512;
		} else if (local14 == 16) {
			this.anInt6799 = 256;
			this.anInt6804 = 1792;
			this.anInt6803 = 1;
			this.anInt6801 = 8192;
		} else {
			this.anInt6801 = 2048;
			this.anInt6803 = 0;
			this.anInt6804 = 0;
			this.anInt6799 = 2048;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZII)V")
	public void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6804 = arg1;
		this.anInt6799 = arg2;
		this.anInt6803 = arg3;
		this.anInt6801 = arg0;
	}
}
