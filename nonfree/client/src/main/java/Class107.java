import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class107 {

	@OriginalMember(owner = "client!io", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_116 = new Class89(87, -2);

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	public int anInt2787;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Lclient!hu;")
	private final Class98 aClass98_21 = new Class98(64);

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Lclient!hu;")
	public final Class98 aClass98_22 = new Class98(50);

	@OriginalMember(owner = "client!io", name = "t", descriptor = "Lclient!hs;")
	public final Class97 aClass97_1 = new Class97(250);

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Lclient!dt;")
	private final Class53 aClass53_1 = new Class53();

	@OriginalMember(owner = "client!io", name = "e", descriptor = "Lclient!r;")
	public final Class197 aClass197_41;

	@OriginalMember(owner = "client!io", name = "f", descriptor = "I")
	public final int anInt2778;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!be;")
	private final Class18 aClass18_1;

	@OriginalMember(owner = "client!io", name = "r", descriptor = "Lclient!r;")
	private final Class197 aClass197_42;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public final int anInt2776;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray21;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray22;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!dn;IZLclient!be;Lclient!r;Lclient!r;)V", line = 349)
	public Class107(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) Class197 arg4, @OriginalArg(5) Class197 arg5) {
		this.aClass197_41 = arg5;
		this.anInt2778 = arg1;
		this.aClass18_1 = arg3;
		this.aClass197_42 = arg4;
		this.aBoolean195 = arg2;
		if (this.aClass197_42 == null) {
			this.anInt2776 = 0;
		} else {
			@Pc(54) int local54 = this.aClass197_42.method5093() - 1;
			this.anInt2776 = local54 * 256 + this.aClass197_42.method5082(local54);
		}
		this.aStringArray21 = new String[] { null, null, Class154.aClass79_83.method2269(this.anInt2778), null, null };
		this.aStringArray22 = new String[] { null, null, null, null, Class2_Sub26_Sub1.aClass79_95.method2269(this.anInt2778) };
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V", line = 16)
	public void method2759() {
		@Pc(6) Class98 local6 = this.aClass98_21;
		synchronized (this.aClass98_21) {
			this.aClass98_21.method2617(5);
		}
		local6 = this.aClass98_22;
		synchronized (this.aClass98_22) {
			this.aClass98_22.method2617(5);
		}
		@Pc(42) Class97 local42 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2591();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIILclient!jo;Lclient!wm;III)Lclient!jd;", line = 35)
	public Class13 method2760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class117 arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass53_1.aBoolean128 = arg2 != null;
		this.aClass53_1.anInt1643 = arg6;
		this.aClass53_1.anInt1642 = arg1;
		this.aClass53_1.anInt1637 = arg3.anInt2833;
		this.aClass53_1.anInt1638 = arg4;
		this.aClass53_1.anInt1640 = arg5;
		this.aClass53_1.anInt1639 = arg0;
		return (Class13) this.aClass97_1.method2598(this.aClass53_1);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(II)Lclient!qf;", line = 55)
	public Class188 method2761(@OriginalArg(0) int arg0) {
		@Pc(8) Class98 local8 = this.aClass98_21;
		@Pc(18) Class188 local18;
		synchronized (this.aClass98_21) {
			local18 = (Class188) this.aClass98_21.method2614((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(44) byte[] local44 = this.aClass197_42.method5090(Static223.method4180(arg0), Static252.method4642(arg0));
		local18 = new Class188();
		local18.anInt5244 = arg0;
		local18.aClass107_1 = this;
		local18.aStringArray50 = new String[] { null, null, Class154.aClass79_83.method2269(this.anInt2778), null, null };
		local18.aStringArray51 = new String[] { null, null, null, null, Class2_Sub26_Sub1.aClass79_95.method2269(this.anInt2778) };
		if (local44 != null) {
			local18.method4772(new Class2_Sub4(local44));
		}
		local18.method4778();
		if (local18.anInt5247 != -1) {
			local18.method4781(this.method2761(local18.anInt5192), this.method2761(local18.anInt5247));
		}
		if (local18.anInt5225 != -1) {
			local18.method4785(this.method2761(local18.anInt5225), this.method2761(local18.anInt5236));
		}
		if (!this.aBoolean195 && local18.aBoolean382) {
			local18.aString55 = Class73.aClass79_44.method2269(this.anInt2778);
			local18.aStringArray51 = this.aStringArray22;
			local18.anIntArray364 = null;
			local18.anInt5246 = 0;
			local18.aBoolean381 = false;
			local18.aStringArray50 = this.aStringArray21;
			if (local18.aClass4_103 != null) {
				@Pc(194) boolean local194 = false;
				for (@Pc(199) Class2 local199 = local18.aClass4_103.method80(); local199 != null; local199 = local18.aClass4_103.method79()) {
					@Pc(211) Class240 local211 = this.aClass18_1.method565((int) local199.aLong232);
					if (local211.aBoolean476) {
						local199.method6469();
					} else {
						local194 = true;
					}
				}
				if (!local194) {
					local18.aClass4_103 = null;
				}
			}
		}
		@Pc(238) Class98 local238 = this.aClass98_21;
		synchronized (this.aClass98_21) {
			this.aClass98_21.method2626((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 132)
	public void method2762() {
		@Pc(6) Class97 local6 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2586();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 146)
	public void method2763() {
		@Pc(24) Class98 local24 = this.aClass98_21;
		synchronized (this.aClass98_21) {
			this.aClass98_21.method2616();
		}
		local24 = this.aClass98_22;
		synchronized (this.aClass98_22) {
			this.aClass98_22.method2616();
		}
		@Pc(54) Class97 local54 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2586();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZB)V", line = 166)
	public void method2764(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean195 != arg0) {
			this.aBoolean195 = arg0;
			this.method2763();
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 185)
	public void method2765() {
		@Pc(6) Class98 local6 = this.aClass98_21;
		synchronized (this.aClass98_21) {
			this.aClass98_21.method2623();
		}
		local6 = this.aClass98_22;
		synchronized (this.aClass98_22) {
			this.aClass98_22.method2623();
		}
		@Pc(40) Class97 local40 = this.aClass97_1;
		synchronized (this.aClass97_1) {
			this.aClass97_1.method2592();
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(II)V", line = 212)
	public void method2767(@OriginalArg(1) int arg0) {
		this.anInt2787 = arg0;
		@Pc(9) Class98 local9 = this.aClass98_22;
		synchronized (this.aClass98_22) {
			this.aClass98_22.method2616();
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V", line = 243)
	public void method2769() {
		@Pc(2) Class98 local2 = this.aClass98_22;
		synchronized (this.aClass98_22) {
			this.aClass98_22.method2616();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILclient!ur;ILclient!wm;ZIZLclient!jo;ILclient!wm;IB)Lclient!jd;", line = 267)
	public Class13 method2771(@OriginalArg(0) int arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class117 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class19 arg9, @OriginalArg(10) int arg10) {
		@Pc(22) Class13 local22 = this.method2760(arg8, arg0, arg7, arg3, arg5, arg10, arg2);
		if (local22 != null) {
			return local22;
		}
		@Pc(33) Class188 local33 = this.method2761(arg0);
		if (arg2 > 1 && local33.anIntArray365 != null) {
			@Pc(43) int local43 = -1;
			for (@Pc(45) int local45 = 0; local45 < 10; local45++) {
				if (arg2 >= local33.anIntArray366[local45] && local33.anIntArray366[local45] != 0) {
					local43 = local33.anIntArray365[local45];
				}
			}
			if (local43 != -1) {
				local33 = this.method2761(local43);
			}
		}
		@Pc(97) int[] local97 = local33.method4782(arg1, arg7, arg3, arg5, arg9, arg8, arg10, arg2, arg6);
		if (local97 == null) {
			return null;
		}
		@Pc(111) Class13 local111;
		if (arg4) {
			local111 = arg9.method2886(local97, 36, 36, 32);
		} else {
			local111 = arg3.method2886(local97, 36, 36, 32);
		}
		if (!arg4) {
			@Pc(127) Class53 local127 = new Class53();
			local127.anInt1637 = arg3.anInt2833;
			local127.aBoolean128 = arg7 != null;
			local127.anInt1639 = arg8;
			local127.anInt1643 = arg2;
			local127.anInt1638 = arg5;
			local127.anInt1640 = arg10;
			local127.anInt1642 = arg0;
			this.aClass97_1.method2585(local127, local111);
		}
		return local111;
	}
}
