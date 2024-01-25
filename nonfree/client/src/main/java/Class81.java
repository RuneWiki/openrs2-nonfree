import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class81 {

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
	public int anInt2159;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!mo;")
	private final Class160 aClass160_19 = new Class160(64);

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "Lclient!mo;")
	public final Class160 aClass160_20 = new Class160(50);

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!kq;")
	public final Class140 aClass140_1 = new Class140(250);

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!cs;")
	private final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Lclient!jo;")
	private final Class125 aClass125_1;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public final int anInt2156;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!nl;")
	public final Class171 aClass171_32;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!nl;")
	private final Class171 aClass171_33;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	public final int anInt2148;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray59;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray58;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!lo;IZLclient!jo;Lclient!nl;Lclient!nl;)V")
	public Class81(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) Class171 arg4, @OriginalArg(5) Class171 arg5) {
		this.aClass125_1 = arg3;
		this.anInt2156 = arg1;
		this.aClass171_32 = arg5;
		this.aClass171_33 = arg4;
		this.aBoolean168 = arg2;
		if (this.aClass171_33 == null) {
			this.anInt2148 = 0;
		} else {
			@Pc(49) int local49 = this.aClass171_33.method3770() - 1;
			this.anInt2148 = local49 * 256 + this.aClass171_33.method3750(local49);
		}
		this.aStringArray59 = new String[] { null, null, Static262.aClass32_67.method701(this.anInt2156), null, null };
		this.aStringArray58 = new String[] { null, null, null, null, Static207.aClass32_77.method701(this.anInt2156) };
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!ok;")
	public Class179 method2175(@OriginalArg(0) int arg0) {
		@Pc(13) Class160 local13 = this.aClass160_19;
		@Pc(23) Class179 local23;
		synchronized (this.aClass160_19) {
			local23 = (Class179) this.aClass160_19.method3599((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(44) byte[] local44 = this.aClass171_33.method3745(Static319.method4726(arg0), Static329.method4853(arg0));
		local23 = new Class179();
		local23.aClass81_2 = this;
		local23.anInt4432 = arg0;
		local23.aStringArray110 = new String[] { null, null, Static262.aClass32_67.method701(this.anInt2156), null, null };
		local23.aStringArray111 = new String[] { null, null, null, null, Static207.aClass32_77.method701(this.anInt2156) };
		if (local44 != null) {
			local23.method3949(new Class2_Sub16(local44));
		}
		local23.method3947();
		if (local23.anInt4398 != -1) {
			local23.method3946(this.method2175(local23.anInt4426), this.method2175(local23.anInt4398));
		}
		if (local23.anInt4404 != -1) {
			local23.method3950(this.method2175(local23.anInt4404), this.method2175(local23.anInt4390));
		}
		if (!this.aBoolean168 && local23.aBoolean334) {
			local23.aString51 = Static100.aClass32_32.method701(this.anInt2156);
			local23.aStringArray111 = this.aStringArray58;
			local23.aBoolean333 = false;
			local23.aStringArray110 = this.aStringArray59;
			local23.anIntArray853 = null;
			local23.anInt4412 = 0;
			if (local23.aClass246_24 != null) {
				@Pc(191) boolean local191 = false;
				for (@Pc(196) Class2 local196 = local23.aClass246_24.method5606(); local196 != null; local196 = local23.aClass246_24.method5614()) {
					@Pc(206) Class144 local206 = this.aClass125_1.method2922((int) local196.aLong209);
					if (local206.aBoolean277) {
						local196.method5617();
					} else {
						local191 = true;
					}
				}
				if (!local191) {
					local23.aClass246_24 = null;
				}
			}
		}
		@Pc(231) Class160 local231 = this.aClass160_19;
		synchronized (this.aClass160_19) {
			this.aClass160_19.method3602((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!tj;Lclient!vc;Lclient!am;ILclient!vc;IZIIIZI)Lclient!rn;")
	public Class18 method2177(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class63 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class18 local16 = this.method2182(arg8, arg1, arg10, arg0, arg3, arg7, arg5);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class179 local30 = this.method2175(arg10);
		if (arg8 > 1 && local30.anIntArray855 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (arg8 >= local30.anIntArray854[local40] && local30.anIntArray854[local40] != 0) {
					local38 = local30.anIntArray855[local40];
				}
			}
			if (local38 != -1) {
				local30 = this.method2175(local38);
			}
		}
		@Pc(83) int[] local83 = local30.method3938(arg4, arg9, arg0, arg2, arg8, arg1, arg3, arg5, arg7);
		if (local83 == null) {
			return null;
		}
		@Pc(97) Class18 local97;
		if (arg6) {
			local97 = arg4.method2029(local83, 36, 36, 32);
		} else {
			local97 = arg1.method2029(local83, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(113) Class40 local113 = new Class40();
			local113.aBoolean80 = arg0 != null;
			local113.anInt1015 = arg8;
			local113.anInt1007 = arg1.anInt2081;
			local113.anInt1010 = arg5;
			local113.anInt1014 = arg3;
			local113.anInt1011 = arg7;
			local113.anInt1016 = arg10;
			this.aClass140_1.method3176(local113, local97);
		}
		return local97;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
	public void method2179(@OriginalArg(1) int arg0) {
		this.anInt2159 = arg0;
		@Pc(19) Class160 local19 = this.aClass160_20;
		synchronized (this.aClass160_20) {
			this.aClass160_20.method3595();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!vc;ILclient!tj;IBII)Lclient!rn;")
	public Class18 method2182(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class224 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass40_1.aBoolean80 = arg3 != null;
		this.aClass40_1.anInt1014 = arg4;
		this.aClass40_1.anInt1011 = arg5;
		this.aClass40_1.anInt1015 = arg0;
		this.aClass40_1.anInt1007 = arg1.anInt2081;
		this.aClass40_1.anInt1010 = arg6;
		this.aClass40_1.anInt1016 = arg2;
		return (Class18) this.aClass140_1.method3167(this.aClass40_1);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public void method2183() {
		@Pc(2) Class160 local2 = this.aClass160_19;
		synchronized (this.aClass160_19) {
			this.aClass160_19.method3595();
		}
		@Pc(29) Class160 local29 = this.aClass160_20;
		synchronized (this.aClass160_20) {
			this.aClass160_20.method3595();
		}
		@Pc(44) Class140 local44 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3172();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)V")
	public void method2184() {
		@Pc(6) Class160 local6 = this.aClass160_19;
		synchronized (this.aClass160_19) {
			this.aClass160_19.method3606(5);
		}
		local6 = this.aClass160_20;
		synchronized (this.aClass160_20) {
			this.aClass160_20.method3606(5);
		}
		@Pc(38) Class140 local38 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3177();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V")
	public void method2185(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean168 != arg0) {
			this.aBoolean168 = arg0;
			this.method2183();
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public void method2187() {
		@Pc(2) Class140 local2 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3172();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public void method2188() {
		@Pc(6) Class160 local6 = this.aClass160_20;
		synchronized (this.aClass160_20) {
			this.aClass160_20.method3595();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public void method2189() {
		@Pc(2) Class160 local2 = this.aClass160_19;
		synchronized (this.aClass160_19) {
			this.aClass160_19.method3605();
		}
		local2 = this.aClass160_20;
		synchronized (this.aClass160_20) {
			this.aClass160_20.method3605();
		}
		@Pc(43) Class140 local43 = this.aClass140_1;
		synchronized (this.aClass140_1) {
			this.aClass140_1.method3173();
		}
	}
}
