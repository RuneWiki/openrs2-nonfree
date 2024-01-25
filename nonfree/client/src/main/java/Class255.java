import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class255 {

	@OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
	public int anInt5955;

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "Lclient!tja;")
	private final Class352 aClass352_49 = new Class352(64);

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "Lclient!tja;")
	public final Class352 aClass352_50 = new Class352(50);

	@OriginalMember(owner = "client!nq", name = "z", descriptor = "Lclient!iw;")
	public final Class173 aClass173_1 = new Class173(250);

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Lclient!nha;")
	private final Class250 aClass250_1 = new Class250();

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "Lclient!bt;")
	public final Class34 aClass34_89;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "Lclient!eca;")
	private final Class84 aClass84_1;

	@OriginalMember(owner = "client!nq", name = "u", descriptor = "Lclient!bt;")
	private final Class34 aClass34_90;

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
	public final int anInt5953;

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
	public final int anInt5946;

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray30;

	@OriginalMember(owner = "client!nq", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!mja;IZLclient!eca;Lclient!bt;Lclient!bt;)V")
	public Class255(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) Class34 arg4, @OriginalArg(5) Class34 arg5) {
		this.aClass34_89 = arg5;
		this.aBoolean449 = arg2;
		this.aClass84_1 = arg3;
		this.aClass34_90 = arg4;
		this.anInt5953 = arg1;
		if (this.aClass34_90 == null) {
			this.anInt5946 = 0;
		} else {
			@Pc(49) int local49 = this.aClass34_90.method1247() - 1;
			this.anInt5946 = local49 * 256 + this.aClass34_90.method1233(local49);
		}
		this.aStringArray30 = new String[] { null, null, Static279.aClass179_8.method4066(this.anInt5953), null, null };
		this.aStringArray29 = new String[] { null, null, null, null, Static279.aClass179_9.method4066(this.anInt5953) };
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZ)V")
	public void method5206(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean449) {
			this.aBoolean449 = arg0;
			this.method5209();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;IIIILclient!nba;IB)Lclient!tf;")
	public Class17 method5207(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class245 arg5, @OriginalArg(6) int arg6) {
		this.aClass250_1.anInt5854 = arg2;
		this.aClass250_1.aBoolean446 = arg5 != null;
		this.aClass250_1.anInt5855 = arg6;
		this.aClass250_1.anInt5853 = arg0.anInt9458;
		this.aClass250_1.anInt5852 = arg4;
		this.aClass250_1.anInt5858 = arg1;
		this.aClass250_1.anInt5856 = arg3;
		return (Class17) this.aClass173_1.method3814(this.aClass250_1);
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public void method5209() {
		@Pc(6) Class352 local6 = this.aClass352_49;
		synchronized (this.aClass352_49) {
			this.aClass352_49.method7659();
		}
		local6 = this.aClass352_50;
		synchronized (this.aClass352_50) {
			this.aClass352_50.method7659();
		}
		@Pc(40) Class173 local40 = this.aClass173_1;
		synchronized (this.aClass173_1) {
			this.aClass173_1.method3820();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Lclient!fda;")
	public Class110 method5210(@OriginalArg(0) int arg0) {
		@Pc(8) Class352 local8 = this.aClass352_49;
		@Pc(18) Class110 local18;
		synchronized (this.aClass352_49) {
			local18 = (Class110) this.aClass352_49.method7653((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class34 local31 = this.aClass34_90;
		@Pc(44) byte[] local44;
		synchronized (this.aClass34_90) {
			local44 = this.aClass34_90.method1239(Static25.method573(arg0), Static403.method3850(arg0));
		}
		local18 = new Class110();
		local18.anInt2791 = arg0;
		local18.aClass255_1 = this;
		local18.aStringArray14 = new String[] { null, null, Static279.aClass179_8.method4066(this.anInt5953), null, null };
		local18.aStringArray15 = new String[] { null, null, null, null, Static279.aClass179_9.method4066(this.anInt5953) };
		if (local44 != null) {
			local18.method2627(new Class4_Sub11(local44));
		}
		local18.method2620();
		if (local18.anInt2774 != -1) {
			local18.method2623(this.method5210(local18.anInt2799), this.method5210(local18.anInt2774));
		}
		if (local18.anInt2752 != -1) {
			local18.method2615(this.method5210(local18.anInt2752), this.method5210(local18.anInt2769));
		}
		if (local18.anInt2806 != -1) {
			local18.method2621(this.method5210(local18.anInt2762), this.method5210(local18.anInt2806));
		}
		if (!this.aBoolean449 && local18.aBoolean202) {
			local18.aString24 = Static279.aClass179_5.method4066(this.anInt5953);
			local18.aBoolean201 = false;
			local18.aStringArray14 = this.aStringArray30;
			local18.anInt2803 = 0;
			local18.anIntArray199 = null;
			local18.aStringArray15 = this.aStringArray29;
			if (local18.aClass66_14 != null) {
				@Pc(221) boolean local221 = false;
				for (@Pc(228) Class4 local228 = local18.aClass66_14.method1992(); local228 != null; local228 = local18.aClass66_14.method1984()) {
					@Pc(238) Class257 local238 = this.aClass84_1.method2152((int) local228.aLong307);
					if (local238.aBoolean508) {
						local228.method9000();
					} else {
						local221 = true;
					}
				}
				if (!local221) {
					local18.aClass66_14 = null;
				}
			}
		}
		@Pc(263) Class352 local263 = this.aClass352_49;
		synchronized (this.aClass352_49) {
			this.aClass352_49.method7655((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
	public void method5211() {
		@Pc(2) Class352 local2 = this.aClass352_49;
		synchronized (this.aClass352_49) {
			this.aClass352_49.method7663(5);
		}
		local2 = this.aClass352_50;
		synchronized (this.aClass352_50) {
			this.aClass352_50.method7663(5);
		}
		@Pc(38) Class173 local38 = this.aClass173_1;
		synchronized (this.aClass173_1) {
			this.aClass173_1.method3821();
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
	public void method5212() {
		@Pc(2) Class173 local2 = this.aClass173_1;
		synchronized (this.aClass173_1) {
			this.aClass173_1.method3820();
		}
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
	public void method5213() {
		@Pc(6) Class352 local6 = this.aClass352_49;
		synchronized (this.aClass352_49) {
			this.aClass352_49.method7656();
		}
		local6 = this.aClass352_50;
		synchronized (this.aClass352_50) {
			this.aClass352_50.method7656();
		}
		@Pc(41) Class173 local41 = this.aClass173_1;
		synchronized (this.aClass173_1) {
			this.aClass173_1.method3819();
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)V")
	public void method5214(@OriginalArg(0) int arg0) {
		this.anInt5955 = arg0;
		@Pc(9) Class352 local9 = this.aClass352_50;
		synchronized (this.aClass352_50) {
			this.aClass352_50.method7659();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!da;IZIZIILclient!ha;Lclient!nba;Lclient!ha;II)Lclient!tf;")
	public Class17 method5215(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class33 arg6, @OriginalArg(8) Class245 arg7, @OriginalArg(9) Class33 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class17 local16 = this.method5207(arg6, arg5, arg4, arg9, arg10, arg7, arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class110 local30 = this.method5210(arg1);
		if (arg5 > 1 && local30.anIntArray197 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (local30.anIntArray200[local40] <= arg5 && local30.anIntArray200[local40] != 0) {
					local38 = local30.anIntArray197[local40];
				}
			}
			if (local38 != -1) {
				local30 = this.method5210(local38);
			}
		}
		@Pc(90) int[] local90 = local30.method2609(arg0, arg4, arg9, arg6, arg2, arg7, arg10, arg8, arg5);
		if (local90 == null) {
			return null;
		}
		@Pc(105) Class17 local105;
		if (arg3) {
			local105 = arg8.method8128(local90, 32, 36, 36);
		} else {
			local105 = arg6.method8128(local90, 32, 36, 36);
		}
		if (!arg3) {
			@Pc(122) Class250 local122 = new Class250();
			local122.aBoolean446 = arg7 != null;
			local122.anInt5853 = arg6.anInt9458;
			local122.anInt5858 = arg5;
			local122.anInt5856 = arg9;
			local122.anInt5852 = arg10;
			local122.anInt5854 = arg4;
			local122.anInt5855 = arg1;
			this.aClass173_1.method3816(local122, local105);
		}
		return local105;
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
	public void method5216() {
		@Pc(10) Class352 local10 = this.aClass352_50;
		synchronized (this.aClass352_50) {
			this.aClass352_50.method7659();
		}
	}
}
