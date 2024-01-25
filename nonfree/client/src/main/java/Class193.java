import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class193 {

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
	public int anInt5245;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "Lclient!lh;")
	private final Class151 aClass151_132 = new Class151(64);

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Lclient!lh;")
	public final Class151 aClass151_133 = new Class151(50);

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "Lclient!tg;")
	public final Class225 aClass225_1 = new Class225(250);

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "Lclient!vh;")
	private final Class252 aClass252_1 = new Class252();

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Lclient!hh;")
	public final Class109 aClass109_71;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "Z")
	private boolean aBoolean421;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "I")
	public final int anInt5244;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "Lclient!hh;")
	private final Class109 aClass109_70;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "Lclient!et;")
	private final Class75 aClass75_2;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	public final int anInt5241;

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray25;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray26;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!mt;IZLclient!et;Lclient!hh;Lclient!hh;)V")
	public Class193(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) Class109 arg5) {
		this.aClass109_71 = arg5;
		this.aBoolean421 = arg2;
		this.anInt5244 = arg1;
		this.aClass109_70 = arg4;
		this.aClass75_2 = arg3;
		if (this.aClass109_70 == null) {
			this.anInt5241 = 0;
		} else {
			@Pc(49) int local49 = this.aClass109_70.method2324() - 1;
			this.anInt5241 = local49 * 256 + this.aClass109_70.method2322(local49);
		}
		this.aStringArray25 = new String[] { null, null, Static375.aClass96_109.method1935(this.anInt5244), null, null };
		this.aStringArray26 = new String[] { null, null, null, null, Static414.aClass96_106.method1935(this.anInt5244) };
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!qn;ILclient!qa;Lclient!oa;Lclient!qa;IZIIIZ)Lclient!f;")
	public Class78 method4245(@OriginalArg(0) int arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class121 arg3, @OriginalArg(4) Class4 arg4, @OriginalArg(5) Class121 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class78 local16 = this.method4256(arg6, arg5, arg9, arg2, arg8, arg1, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class206 local25 = this.method4249(arg0);
		if (arg6 > 1 && local25.anIntArray460 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg6 >= local25.anIntArray459[local35] && local25.anIntArray459[local35] != 0) {
					local33 = local25.anIntArray460[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method4249(local33);
			}
		}
		@Pc(92) int[] local92 = local25.method4973(arg6, arg1, arg3, arg10, arg4, arg2, arg8, arg5, arg9);
		if (local92 == null) {
			return null;
		}
		@Pc(106) Class78 local106;
		if (arg7) {
			local106 = arg3.method4575(local92, 36, 36, 32);
		} else {
			local106 = arg5.method4575(local92, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(122) Class252 local122 = new Class252();
			local122.anInt7414 = arg8;
			local122.aBoolean634 = arg1 != null;
			local122.anInt7410 = arg5.anInt5745;
			local122.anInt7416 = arg2;
			local122.anInt7415 = arg6;
			local122.anInt7417 = arg9;
			local122.anInt7409 = arg0;
			this.aClass225_1.method5355(local106, local122);
		}
		return local106;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	public void method4246(@OriginalArg(0) int arg0) {
		this.anInt5245 = arg0;
		@Pc(19) Class151 local19 = this.aClass151_133;
		synchronized (this.aClass151_133) {
			this.aClass151_133.method3298();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public void method4247() {
		@Pc(6) Class151 local6 = this.aClass151_133;
		synchronized (this.aClass151_133) {
			this.aClass151_133.method3298();
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	public void method4248() {
		@Pc(6) Class225 local6 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5357();
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Lclient!rh;")
	public Class206 method4249(@OriginalArg(1) int arg0) {
		@Pc(8) Class151 local8 = this.aClass151_132;
		@Pc(18) Class206 local18;
		synchronized (this.aClass151_132) {
			local18 = (Class206) this.aClass151_132.method3288((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(47) byte[] local47 = this.aClass109_70.method2349(Static171.method2648(arg0), Static252.method3610(arg0));
		local18 = new Class206();
		local18.aClass193_1 = this;
		local18.anInt6342 = arg0;
		local18.aStringArray31 = new String[] { null, null, Static375.aClass96_109.method1935(this.anInt5244), null, null };
		local18.aStringArray30 = new String[] { null, null, null, null, Static414.aClass96_106.method1935(this.anInt5244) };
		if (local47 != null) {
			local18.method4963(new Class1_Sub14(local47));
		}
		local18.method4965();
		if (local18.anInt6306 != -1) {
			local18.method4975(this.method4249(local18.anInt6306), this.method4249(local18.anInt6317));
		}
		if (local18.anInt6295 != -1) {
			local18.method4962(this.method4249(local18.anInt6295), this.method4249(local18.anInt6325));
		}
		if (!this.aBoolean421 && local18.aBoolean511) {
			local18.aString72 = Static261.aClass96_72.method1935(this.anInt5244);
			local18.anIntArray457 = null;
			local18.anInt6308 = 0;
			local18.aStringArray30 = this.aStringArray26;
			local18.aBoolean510 = false;
			local18.aStringArray31 = this.aStringArray25;
			if (local18.aClass51_21 != null) {
				@Pc(195) boolean local195 = false;
				for (@Pc(200) Class1 local200 = local18.aClass51_21.method928(); local200 != null; local200 = local18.aClass51_21.method926()) {
					@Pc(210) Class108 local210 = this.aClass75_2.method1517((int) local200.aLong237);
					if (local210.aBoolean204) {
						local200.method5965();
					} else {
						local195 = true;
					}
				}
				if (!local195) {
					local18.aClass51_21 = null;
				}
			}
		}
		@Pc(235) Class151 local235 = this.aClass151_132;
		synchronized (this.aClass151_132) {
			this.aClass151_132.method3291((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
	public void method4250() {
		@Pc(2) Class151 local2 = this.aClass151_132;
		synchronized (this.aClass151_132) {
			this.aClass151_132.method3299();
		}
		local2 = this.aClass151_133;
		synchronized (this.aClass151_133) {
			this.aClass151_133.method3299();
		}
		@Pc(36) Class225 local36 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5363();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZB)V")
	public void method4251(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean421 != arg0) {
			this.aBoolean421 = arg0;
			this.method4252();
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
	public void method4252() {
		@Pc(2) Class151 local2 = this.aClass151_132;
		synchronized (this.aClass151_132) {
			this.aClass151_132.method3298();
		}
		local2 = this.aClass151_133;
		synchronized (this.aClass151_133) {
			this.aClass151_133.method3298();
		}
		@Pc(50) Class225 local50 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5357();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)V")
	public void method4255() {
		@Pc(6) Class151 local6 = this.aClass151_132;
		synchronized (this.aClass151_132) {
			this.aClass151_132.method3297(5);
		}
		local6 = this.aClass151_133;
		synchronized (this.aClass151_133) {
			this.aClass151_133.method3297(5);
		}
		@Pc(38) Class225 local38 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5364();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!qa;IIIBLclient!qn;I)Lclient!f;")
	public Class78 method4256(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class201 arg5, @OriginalArg(7) int arg6) {
		this.aClass252_1.anInt7416 = arg3;
		this.aClass252_1.anInt7417 = arg2;
		this.aClass252_1.anInt7414 = arg4;
		this.aClass252_1.anInt7409 = arg6;
		this.aClass252_1.aBoolean634 = arg5 != null;
		this.aClass252_1.anInt7410 = arg1.anInt5745;
		this.aClass252_1.anInt7415 = arg0;
		return (Class78) this.aClass225_1.method5362(this.aClass252_1);
	}
}
