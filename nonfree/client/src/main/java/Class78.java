import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class78 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Z")
	public boolean aBoolean145;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	private int anInt2069;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	private int anInt2072;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Z")
	public boolean aBoolean146;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	private int anInt2073;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "[S")
	public short[] aShortArray13;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public int anInt2076;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!bj;")
	public Class6_Sub7 aClass6_Sub7_1;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	private int anInt2077;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	private Class78() {
		if (Static373.anIntArray489 == null) {
			Static33.method930();
		}
		this.method1924();
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!oa;Lclient!ji;I)V")
	public Class78(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class6_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (Static373.anIntArray489 == null) {
			Static33.method930();
		}
		this.anInt2074 = arg1.method6069();
		this.aBoolean145 = (this.anInt2074 & 0x8) != 0;
		this.aBoolean146 = (this.anInt2074 & 0x10) != 0;
		this.anInt2074 &= 0x7;
		@Pc(44) int local44 = arg1.method6003() << arg2;
		@Pc(50) int local50 = arg1.method6003() << arg2;
		@Pc(56) int local56 = arg1.method6003() << arg2;
		@Pc(60) int local60 = arg1.method6069();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray13 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray13.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method6003();
			local83 = local79 >>> 8;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			@Pc(94) int local94 = local79 & 0xFF;
			if (local66 - local83 < local94) {
				local94 = local66 - local83;
			}
			this.aShortArray13[local72] = (short) (local94 | local83 << 8);
		}
		local60 = (local60 << Static339.anInt6128) + Static108.anInt2068;
		@Pc(150) int local150 = Static171.anIntArray212 == null ? Static50.anIntArray51[Static402.method5873(arg1.method6003()) & 0xFFFF] : Static171.anIntArray212[arg1.method6003()];
		local83 = arg1.method6069();
		this.anInt2076 = local83 & 0x1F;
		this.anInt2069 = (local83 & 0xE0) << 3;
		if (this.anInt2076 != 31) {
			this.method1924();
		}
		this.method1926(local150, local56, local60, local50, arg0, local44);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIB)V")
	public void method1921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2072 = arg3;
		this.anInt2071 = arg2;
		this.anInt2073 = arg0;
		this.anInt2077 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZI)V")
	public void method1923(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt2069 + arg1 * this.anInt2073 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt2072;
			if (local26 == 1) {
				local9 = (Class6_Sub2_Sub7.anIntArray178[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local9 = Static373.anIntArray489[local23] >> 1;
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
		this.aClass6_Sub7_1.method4289((float) (this.anInt2077 + (local9 * this.anInt2071 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	private void method1924() {
		@Pc(8) int local8 = this.anInt2076;
		if (local8 == 2) {
			this.anInt2077 = 0;
			this.anInt2073 = 2048;
			this.anInt2072 = 1;
			this.anInt2071 = 2048;
		} else if (local8 == 3) {
			this.anInt2072 = 1;
			this.anInt2071 = 2048;
			this.anInt2077 = 0;
			this.anInt2073 = 4096;
		} else if (local8 == 4) {
			this.anInt2071 = 2048;
			this.anInt2072 = 4;
			this.anInt2077 = 0;
			this.anInt2073 = 2048;
		} else if (local8 == 5) {
			this.anInt2071 = 2048;
			this.anInt2073 = 8192;
			this.anInt2077 = 0;
			this.anInt2072 = 4;
		} else if (local8 == 12) {
			this.anInt2072 = 2;
			this.anInt2073 = 2048;
			this.anInt2071 = 2048;
			this.anInt2077 = 0;
		} else if (local8 == 13) {
			this.anInt2071 = 2048;
			this.anInt2072 = 2;
			this.anInt2077 = 0;
			this.anInt2073 = 8192;
		} else if (local8 == 10) {
			this.anInt2071 = 512;
			this.anInt2073 = 2048;
			this.anInt2072 = 3;
			this.anInt2077 = 1536;
		} else if (local8 == 11) {
			this.anInt2072 = 3;
			this.anInt2073 = 4096;
			this.anInt2077 = 1536;
			this.anInt2071 = 512;
		} else if (local8 == 6) {
			this.anInt2071 = 768;
			this.anInt2072 = 3;
			this.anInt2073 = 2048;
			this.anInt2077 = 1280;
		} else if (local8 == 7) {
			this.anInt2073 = 4096;
			this.anInt2072 = 3;
			this.anInt2077 = 1280;
			this.anInt2071 = 768;
		} else if (local8 == 8) {
			this.anInt2077 = 1024;
			this.anInt2072 = 3;
			this.anInt2071 = 1024;
			this.anInt2073 = 2048;
		} else if (local8 == 9) {
			this.anInt2073 = 4096;
			this.anInt2071 = 1024;
			this.anInt2072 = 3;
			this.anInt2077 = 1024;
		} else if (local8 == 14) {
			this.anInt2072 = 1;
			this.anInt2077 = 1280;
			this.anInt2071 = 768;
			this.anInt2073 = 2048;
		} else if (local8 == 15) {
			this.anInt2073 = 4096;
			this.anInt2077 = 1536;
			this.anInt2072 = 1;
			this.anInt2071 = 512;
		} else if (local8 == 16) {
			this.anInt2071 = 256;
			this.anInt2073 = 8192;
			this.anInt2077 = 1792;
			this.anInt2072 = 1;
		} else {
			this.anInt2073 = 2048;
			this.anInt2071 = 2048;
			this.anInt2077 = 0;
			this.anInt2072 = 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIBILclient!oa;I)V")
	private void method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class14 arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub7_1 = arg4.method6827(arg5, arg1, arg3, arg2, arg0, 1.0F);
	}
}
