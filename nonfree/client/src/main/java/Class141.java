import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class141 {

	@OriginalMember(owner = "client!hg", name = "s", descriptor = "[I")
	public static final int[] anIntArray243 = new int[4096];

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
	private int anInt2902;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public int anInt2905;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "Lclient!tg;")
	public Class2_Sub11 aClass2_Sub11_1;

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	public int anInt2907;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
	private int anInt2908;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
	private int anInt2909;

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	private int anInt2910;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	private int anInt2911;

	static {
		for (@Pc(13) int local13 = 0; local13 < 4096; local13++) {
			anIntArray243[local13] = Static380.method6540(local13);
		}
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	private Class141() {
		if (Static469.anIntArray505 == null) {
			Static595.method7744();
		}
		this.method2505();
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!r;Lclient!gk;I)V")
	public Class141(@OriginalArg(0) Class162 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (Static469.anIntArray505 == null) {
			Static595.method7744();
		}
		this.anInt2907 = arg1.method4464();
		this.aBoolean206 = (this.anInt2907 & 0x10) != 0;
		this.aBoolean207 = (this.anInt2907 & 0x8) != 0;
		this.anInt2907 &= 0x7;
		@Pc(44) int local44 = arg1.method4518() << arg2;
		@Pc(50) int local50 = arg1.method4518() << arg2;
		@Pc(56) int local56 = arg1.method4518() << arg2;
		@Pc(60) int local60 = arg1.method4464();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray69 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray69.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method4518();
			local83 = local79 >>> 8;
			@Pc(87) int local87 = local79 & 0xFF;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			if (local66 - local83 < local87) {
				local87 = local66 - local83;
			}
			this.aShortArray69[local72] = (short) (local87 | local83 << 8);
		}
		local60 = (local60 << Static562.anInt9207) + Static437.anInt7021;
		@Pc(153) int local153 = Static142.anIntArray365 == null ? Static73.anIntArray126[Static565.method7389(arg1.method4518()) & 0xFFFF] : Static142.anIntArray365[arg1.method4518()];
		local83 = arg1.method4464();
		this.anInt2902 = (local83 & 0xE0) << 3;
		this.anInt2905 = local83 & 0x1F;
		if (this.anInt2905 != 31) {
			this.method2505();
		}
		this.method2503(local56, local60, local44, arg0, local50, local153);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
	public void method2500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2911 = arg1;
		this.anInt2908 = arg0;
		this.anInt2909 = arg2;
		this.anInt2910 = arg3;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBIILclient!r;II)V")
	private void method2503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class162 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub11_1 = arg3.method6867(arg2, arg0, arg4, arg1, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BZI)V")
	public void method2504(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21;
		if (arg0) {
			local21 = 2048;
		} else {
			@Pc(36) int local36 = this.anInt2902 + this.anInt2908 * arg1 / 50 & 0x7FF;
			@Pc(39) int local39 = this.anInt2909;
			if (local39 == 1) {
				local21 = (Class285.anIntArray476[local36 << 3] >> 4) + 1024;
			} else if (local39 == 3) {
				local21 = Static469.anIntArray505[local36] >> 1;
			} else if (local39 == 4) {
				local21 = local36 >> 10 << 11;
			} else if (local39 == 2) {
				local21 = local36;
			} else if (local39 == 5) {
				local21 = (local36 < 1024 ? local36 : 2048 - local36) << 1;
			} else {
				local21 = 2048;
			}
		}
		this.aClass2_Sub11_1.method7275((float) (this.anInt2911 + (local21 * this.anInt2910 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	private void method2505() {
		@Pc(8) int local8 = this.anInt2905;
		if (local8 == 2) {
			this.anInt2910 = 2048;
			this.anInt2911 = 0;
			this.anInt2908 = 2048;
			this.anInt2909 = 1;
		} else if (local8 == 3) {
			this.anInt2908 = 4096;
			this.anInt2910 = 2048;
			this.anInt2911 = 0;
			this.anInt2909 = 1;
		} else if (local8 == 4) {
			this.anInt2910 = 2048;
			this.anInt2909 = 4;
			this.anInt2911 = 0;
			this.anInt2908 = 2048;
		} else if (local8 == 5) {
			this.anInt2909 = 4;
			this.anInt2911 = 0;
			this.anInt2910 = 2048;
			this.anInt2908 = 8192;
		} else if (local8 == 12) {
			this.anInt2909 = 2;
			this.anInt2910 = 2048;
			this.anInt2911 = 0;
			this.anInt2908 = 2048;
		} else if (local8 == 13) {
			this.anInt2910 = 2048;
			this.anInt2908 = 8192;
			this.anInt2909 = 2;
			this.anInt2911 = 0;
		} else if (local8 == 10) {
			this.anInt2911 = 1536;
			this.anInt2909 = 3;
			this.anInt2908 = 2048;
			this.anInt2910 = 512;
		} else if (local8 == 11) {
			this.anInt2908 = 4096;
			this.anInt2910 = 512;
			this.anInt2909 = 3;
			this.anInt2911 = 1536;
		} else if (local8 == 6) {
			this.anInt2911 = 1280;
			this.anInt2909 = 3;
			this.anInt2908 = 2048;
			this.anInt2910 = 768;
		} else if (local8 == 7) {
			this.anInt2909 = 3;
			this.anInt2911 = 1280;
			this.anInt2908 = 4096;
			this.anInt2910 = 768;
		} else if (local8 == 8) {
			this.anInt2910 = 1024;
			this.anInt2911 = 1024;
			this.anInt2908 = 2048;
			this.anInt2909 = 3;
		} else if (local8 == 9) {
			this.anInt2911 = 1024;
			this.anInt2910 = 1024;
			this.anInt2908 = 4096;
			this.anInt2909 = 3;
		} else if (local8 == 14) {
			this.anInt2911 = 1280;
			this.anInt2909 = 1;
			this.anInt2908 = 2048;
			this.anInt2910 = 768;
		} else if (local8 == 15) {
			this.anInt2911 = 1536;
			this.anInt2908 = 4096;
			this.anInt2910 = 512;
			this.anInt2909 = 1;
		} else if (local8 == 16) {
			this.anInt2910 = 256;
			this.anInt2911 = 1792;
			this.anInt2909 = 1;
			this.anInt2908 = 8192;
		} else {
			this.anInt2909 = 0;
			this.anInt2911 = 0;
			this.anInt2908 = 2048;
			this.anInt2910 = 2048;
		}
	}
}
