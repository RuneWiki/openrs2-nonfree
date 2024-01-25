import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "Lclient!uf;")
	public Class5_Sub43 aClass5_Sub43_1;

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "Z")
	public boolean aBoolean1;

	@OriginalMember(owner = "client!aaa", name = "o", descriptor = "Z")
	public boolean aBoolean2;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	private int anInt8;

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
	public int anInt14;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	private Class2() {
		if (Static547.anIntArray522 == null) {
			Static661.method9156();
		}
		this.method23();
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!ha;Lclient!ib;I)V")
	public Class2(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class5_Sub23 arg1, @OriginalArg(2) int arg2) {
		if (Static547.anIntArray522 == null) {
			Static661.method9156();
		}
		this.anInt14 = arg1.method8529();
		this.aBoolean2 = (this.anInt14 & 0x10) != 0;
		this.aBoolean1 = (this.anInt14 & 0x8) != 0;
		this.anInt14 &= 0x7;
		@Pc(49) int local49 = arg1.method8519() << arg2;
		@Pc(55) int local55 = arg1.method8519() << arg2;
		@Pc(61) int local61 = arg1.method8519() << arg2;
		@Pc(65) int local65 = arg1.method8529();
		@Pc(71) int local71 = local65 * 2 + 1;
		this.aShortArray1 = new short[local71];
		@Pc(90) int local90;
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray1.length; local77++) {
			@Pc(86) short local86 = (short) arg1.method8519();
			local90 = local86 >>> 8;
			if (local71 <= local90) {
				local90 = local71 - 1;
			}
			@Pc(105) int local105 = local86 & 0xFF;
			if (local105 > local71 - local90) {
				local105 = local71 - local90;
			}
			this.aShortArray1[local77] = (short) (local90 << 8 | local105);
		}
		local65 = (local65 << Static611.anInt10115) + Static349.anInt6143;
		@Pc(165) int local165 = Static560.anIntArray534 == null ? Static351.anIntArray337[Static230.method3289(arg1.method8519()) & 0xFFFF] : Static560.anIntArray534[arg1.method8519()];
		local90 = arg1.method8529();
		this.anInt13 = local90 & 0x1F;
		this.anInt8 = (local90 & 0xE0) << 3;
		if (this.anInt13 != 31) {
			this.method23();
		}
		this.method21(arg0, local65, local49, local61, local165, local55);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZBI)V")
	public void method20(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt8 + arg1 * this.anInt12 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt9;
			if (local26 == 1) {
				local9 = (Class5_Sub12.anIntArray544[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local9 = Static547.anIntArray522[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass5_Sub43_1.method8256((float) ((this.anInt10 * local9 >> 11) + this.anInt4) / 2048.0F);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	private void method21(@OriginalArg(0) Class57 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass5_Sub43_1 = arg0.method7680(arg2, arg3, arg5, arg1, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZIIII)V")
	public void method22(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt12 = arg1;
		this.anInt4 = arg0;
		this.anInt10 = arg2;
		this.anInt9 = arg3;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V")
	private void method23() {
		@Pc(9) int local9 = this.anInt13;
		if (local9 == 2) {
			this.anInt12 = 2048;
			this.anInt10 = 2048;
			this.anInt9 = 1;
			this.anInt4 = 0;
		} else if (local9 == 3) {
			this.anInt12 = 4096;
			this.anInt4 = 0;
			this.anInt9 = 1;
			this.anInt10 = 2048;
		} else if (local9 == 4) {
			this.anInt9 = 4;
			this.anInt4 = 0;
			this.anInt12 = 2048;
			this.anInt10 = 2048;
		} else if (local9 == 5) {
			this.anInt4 = 0;
			this.anInt9 = 4;
			this.anInt12 = 8192;
			this.anInt10 = 2048;
		} else if (local9 == 12) {
			this.anInt9 = 2;
			this.anInt12 = 2048;
			this.anInt4 = 0;
			this.anInt10 = 2048;
		} else if (local9 == 13) {
			this.anInt4 = 0;
			this.anInt9 = 2;
			this.anInt10 = 2048;
			this.anInt12 = 8192;
		} else if (local9 == 10) {
			this.anInt10 = 512;
			this.anInt12 = 2048;
			this.anInt9 = 3;
			this.anInt4 = 1536;
		} else if (local9 == 11) {
			this.anInt10 = 512;
			this.anInt9 = 3;
			this.anInt4 = 1536;
			this.anInt12 = 4096;
		} else if (local9 == 6) {
			this.anInt9 = 3;
			this.anInt4 = 1280;
			this.anInt10 = 768;
			this.anInt12 = 2048;
		} else if (local9 == 7) {
			this.anInt10 = 768;
			this.anInt12 = 4096;
			this.anInt9 = 3;
			this.anInt4 = 1280;
		} else if (local9 == 8) {
			this.anInt10 = 1024;
			this.anInt12 = 2048;
			this.anInt9 = 3;
			this.anInt4 = 1024;
		} else if (local9 == 9) {
			this.anInt10 = 1024;
			this.anInt12 = 4096;
			this.anInt9 = 3;
			this.anInt4 = 1024;
		} else if (local9 == 14) {
			this.anInt10 = 768;
			this.anInt4 = 1280;
			this.anInt9 = 1;
			this.anInt12 = 2048;
		} else if (local9 == 15) {
			this.anInt4 = 1536;
			this.anInt9 = 1;
			this.anInt10 = 512;
			this.anInt12 = 4096;
		} else if (local9 == 16) {
			this.anInt10 = 256;
			this.anInt9 = 1;
			this.anInt12 = 8192;
			this.anInt4 = 1792;
		} else {
			this.anInt10 = 2048;
			this.anInt4 = 0;
			this.anInt12 = 2048;
			this.anInt9 = 0;
		}
	}
}
