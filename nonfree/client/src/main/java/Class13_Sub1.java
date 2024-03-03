import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public abstract class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	protected static int anInt1921 = 0;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	protected static int anInt1920 = 0;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	private static int anInt1919 = 0;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	private static int anInt1925 = 0;

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
	protected static int anInt1938 = 0;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	protected static int anInt1923 = 0;

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
	protected static int anInt1939 = 0;

	@OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
	protected static int anInt1940 = 0;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	protected int anInt1914;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
	protected int anInt1917;

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
	protected int anInt1927;

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
	protected int anInt1936;

	@OriginalMember(owner = "client!ik", name = "G", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "Lclient!j;")
	protected final Class19_Sub2 aClass19_Sub2_5;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
	protected final int anInt1934;

	@OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
	protected final int anInt1942;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!j;II)V", line = 346)
	protected Class13_Sub1(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub2_5 = arg0;
		this.anInt1934 = arg1;
		this.anInt1942 = arg2;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFLclient!kf;II)V", line = 4)
	@Override
	protected final void method6388(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class78 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass19_Sub2_5.method2914()) {
			throw new IllegalStateException();
		}
		this.method1992(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class78_Sub1 local18 = (Class78_Sub1) arg6;
		this.method1991(local18.anIntArray139, local18.anIntArray140, Static140.anInt1943 - arg7, -arg8 - (Static140.anInt1931 - Static140.anInt1941));
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFIII)V", line = 31)
	@Override
	protected final void method6395(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass19_Sub2_5.method2914()) {
			throw new IllegalStateException();
		}
		this.method1992(arg0, arg1, arg2, arg3, arg4, arg5);
		Static140.anInt1918 = arg7;
		if (arg6 != 0) {
			anInt1923 = arg7 >>> 24;
			anInt1940 = 256 - anInt1923;
			if (arg6 == 1) {
				anInt1921 = arg7 >> 16 & 0xFF;
				anInt1939 = arg7 >> 8 & 0xFF;
				anInt1920 = arg7 & 0xFF;
			} else {
				anInt1925 = arg7 >>> 24;
				anInt1919 = 256 - anInt1925;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * anInt1919 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * anInt1919 & 0xFF0000;
				anInt1938 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method1993(0);
		} else if (arg6 == 1) {
			this.method1993(1);
		} else if (arg6 == 2) {
			this.method1993(2);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()I", line = 115)
	@Override
	public final int method6383() {
		return this.anInt1942;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)V", line = 120)
	@Override
	public final void method6392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1936 = arg0;
		this.anInt1914 = arg1;
		this.anInt1917 = arg2;
		this.anInt1927 = arg3;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()I", line = 130)
	@Override
	public final int method6385() {
		return this.anInt1914 + this.anInt1942 + this.anInt1927;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()I", line = 140)
	@Override
	public final int method6390() {
		return this.anInt1934;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIIIIII)V", line = 155)
	@Override
	public final void method6398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass19_Sub2_5.method2914()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray124 == null) {
			this.anIntArray124 = new int[4];
		}
		this.aClass19_Sub2_5.method2853(this.anIntArray124);
		this.aClass19_Sub2_5.method2819(this.aClass19_Sub2_5.anInt2865, this.aClass19_Sub2_5.anInt2854, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method6400();
		@Pc(40) int local40 = this.method6385();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method6402(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass19_Sub2_5.method2897(this.anIntArray124[0], this.anIntArray124[1], this.anIntArray124[2], this.anIntArray124[3]);
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()I", line = 195)
	@Override
	public final int method6400() {
		return this.anInt1936 + this.anInt1934 + this.anInt1917;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFF)V", line = 204)
	private void method1992(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt1936 + this.anInt1934 + this.anInt1917;
		@Pc(17) int local17 = this.anInt1914 + this.anInt1942 + this.anInt1927;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt1934 || local17 != this.anInt1942) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt1914;
			local65 = local53 * (float) this.anInt1914;
			local71 = local32 * (float) this.anInt1936;
			local77 = local39 * (float) this.anInt1936;
			@Pc(84) float local84 = -local32 * (float) this.anInt1917;
			@Pc(91) float local91 = -local39 * (float) this.anInt1917;
			@Pc(98) float local98 = -local46 * (float) this.anInt1927;
			@Pc(105) float local105 = -local53 * (float) this.anInt1927;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass19_Sub2_5.anInt2865) {
			local46 = this.aClass19_Sub2_5.anInt2865;
		}
		if (local53 > (float) this.aClass19_Sub2_5.anInt2851) {
			local53 = this.aClass19_Sub2_5.anInt2851;
		}
		if (local59 < (float) this.aClass19_Sub2_5.anInt2854) {
			local59 = this.aClass19_Sub2_5.anInt2854;
		}
		if (local65 > (float) this.aClass19_Sub2_5.anInt2856) {
			local65 = this.aClass19_Sub2_5.anInt2856;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static140.anInt1932 = this.aClass19_Sub2_5.anInt2860;
		Static140.anInt1916 = (int) ((float) ((int) local59 * Static140.anInt1932) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static140.anInt1913 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt1934 / local71);
		Static140.anInt1926 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt1942 / local77);
		Static140.anInt1922 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt1934 / local77);
		Static140.anInt1928 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt1942 / local71);
		Static140.anInt1930 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static140.anInt1924 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static140.anInt1937 = (this.anInt1934 >> 1 << 12) + (Static140.anInt1924 * Static140.anInt1922 >> 4);
		Static140.anInt1915 = (this.anInt1942 >> 1 << 12) + (Static140.anInt1924 * Static140.anInt1928 >> 4);
		Static140.anInt1933 = Static140.anInt1930 * Static140.anInt1913 >> 4;
		Static140.anInt1929 = Static140.anInt1930 * Static140.anInt1926 >> 4;
		Static140.anInt1943 = (int) local46;
		Static140.anInt1935 = (int) local53;
		Static140.anInt1941 = (int) local59;
		Static140.anInt1931 = (int) local65;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([I[III)V")
	protected abstract void method1991(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	public abstract void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILclient!kf;II)V")
	public abstract void method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	protected abstract void method1993(@OriginalArg(0) int arg0);
}
