import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class343 {

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
	public int anInt9760;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!aq;")
	private final Class22 aClass22_56 = new Class22(64);

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!aq;")
	public final Class22 aClass22_57 = new Class22(50);

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "Lclient!vo;")
	public final Class379 aClass379_1 = new Class379(250);

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!hv;")
	private final Class155 aClass155_1 = new Class155();

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!gga;")
	public final Class124 aClass124_119;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!gga;")
	private final Class124 aClass124_120;

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "Lclient!va;")
	private final Class367 aClass367_2;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
	public final int anInt9758;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public final int anInt9759;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray64;

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray63;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!mca;IZLclient!va;Lclient!gga;Lclient!gga;)V")
	public Class343(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class367 arg3, @OriginalArg(4) Class124 arg4, @OriginalArg(5) Class124 arg5) {
		this.aBoolean718 = arg2;
		this.aClass124_119 = arg5;
		this.aClass124_120 = arg4;
		this.aClass367_2 = arg3;
		this.anInt9758 = arg1;
		if (this.aClass124_120 == null) {
			this.anInt9759 = 0;
		} else {
			@Pc(49) int local49 = this.aClass124_120.method3633() - 1;
			this.anInt9759 = local49 * 256 + this.aClass124_120.method3629(local49);
		}
		this.aStringArray64 = new String[] { null, null, Static205.aClass134_8.method3906(this.anInt9758), null, null };
		this.aStringArray63 = new String[] { null, null, null, null, Static205.aClass134_9.method3906(this.anInt9758) };
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public void method8544() {
		@Pc(6) Class22 local6 = this.aClass22_57;
		synchronized (this.aClass22_57) {
			this.aClass22_57.method461();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method8545() {
		@Pc(2) Class22 local2 = this.aClass22_56;
		synchronized (this.aClass22_56) {
			this.aClass22_56.method461();
		}
		local2 = this.aClass22_57;
		synchronized (this.aClass22_57) {
			this.aClass22_57.method461();
		}
		@Pc(44) Class379 local44 = this.aClass379_1;
		synchronized (this.aClass379_1) {
			this.aClass379_1.method9491();
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	public void method8546() {
		@Pc(6) Class379 local6 = this.aClass379_1;
		synchronized (this.aClass379_1) {
			this.aClass379_1.method9491();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public void method8547() {
		@Pc(16) Class22 local16 = this.aClass22_56;
		synchronized (this.aClass22_56) {
			this.aClass22_56.method473();
		}
		local16 = this.aClass22_57;
		synchronized (this.aClass22_57) {
			this.aClass22_57.method473();
		}
		@Pc(50) Class379 local50 = this.aClass379_1;
		synchronized (this.aClass379_1) {
			this.aClass379_1.method9488();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public void method8548(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean718 != arg0) {
			this.aBoolean718 = arg0;
			this.method8545();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lclient!ts;")
	public Class351 method8549(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_56;
		@Pc(16) Class351 local16;
		synchronized (this.aClass22_56) {
			local16 = (Class351) this.aClass22_56.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_120;
		@Pc(42) byte[] local42;
		synchronized (this.aClass124_120) {
			local42 = this.aClass124_120.method3641(Static176.method3477(arg0), Static421.method6916(arg0));
		}
		local16 = new Class351();
		local16.anInt10163 = arg0;
		local16.aClass343_2 = this;
		local16.aStringArray72 = new String[] { null, null, Static205.aClass134_8.method3906(this.anInt9758), null, null };
		local16.aStringArray71 = new String[] { null, null, null, null, Static205.aClass134_9.method3906(this.anInt9758) };
		if (local42 != null) {
			local16.method8825(new Class2_Sub8(local42));
		}
		local16.method8830();
		if (local16.anInt10178 != -1) {
			local16.method8820(this.method8549(local16.anInt10210), this.method8549(local16.anInt10178));
		}
		if (local16.anInt10154 != -1) {
			local16.method8838(this.method8549(local16.anInt10141), this.method8549(local16.anInt10154));
		}
		if (local16.anInt10155 != -1) {
			local16.method8828(this.method8549(local16.anInt10155), this.method8549(local16.anInt10192));
		}
		if (!this.aBoolean718 && local16.aBoolean739) {
			local16.aString119 = Static205.aClass134_5.method3906(this.anInt9758);
			local16.anIntArray517 = null;
			local16.anInt10149 = 0;
			local16.aBoolean740 = false;
			local16.aStringArray72 = this.aStringArray64;
			local16.aStringArray71 = this.aStringArray63;
			if (local16.aClass335_43 != null) {
				@Pc(217) boolean local217 = false;
				for (@Pc(222) Class2 local222 = local16.aClass335_43.method8358(); local222 != null; local222 = local16.aClass335_43.method8355()) {
					@Pc(231) Class204 local231 = this.aClass367_2.method9243((int) local222.aLong313);
					if (local231.aBoolean437) {
						local222.method9825();
					} else {
						local217 = true;
					}
				}
				if (!local217) {
					local16.aClass335_43 = null;
				}
			}
		}
		@Pc(255) Class22 local255 = this.aClass22_56;
		synchronized (this.aClass22_56) {
			this.aClass22_56.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
	public void method8551(@OriginalArg(1) int arg0) {
		this.anInt9760 = arg0;
		@Pc(9) Class22 local9 = this.aClass22_57;
		synchronized (this.aClass22_57) {
			this.aClass22_57.method461();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZILclient!da;IILclient!ae;IIBLclient!ha;Lclient!ha;Z)Lclient!mq;")
	public Class71 method8552(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class101 arg8, @OriginalArg(10) Class101 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class71 local16 = this.method8554(arg1, arg6, arg8, arg3, arg4, arg5, arg7);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) Class351 local31 = this.method8549(arg7);
		if (arg4 > 1 && local31.anIntArray516 != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (local31.anIntArray518[local43] <= arg4 && local31.anIntArray518[local43] != 0) {
					local41 = local31.anIntArray516[local43];
				}
			}
			if (local41 != -1) {
				local31 = this.method8549(local41);
			}
		}
		@Pc(92) int[] local92 = local31.method8837(arg8, arg3, arg4, arg2, arg6, arg0, arg9, arg5, arg1);
		if (local92 == null) {
			return null;
		}
		@Pc(109) Class71 local109;
		if (arg10) {
			local109 = arg9.method8111(36, local92, 32, 36);
		} else {
			local109 = arg8.method8111(36, local92, 32, 36);
		}
		if (!arg10) {
			@Pc(126) Class155 local126 = new Class155();
			local126.anInt4724 = arg6;
			local126.anInt4725 = arg4;
			local126.aBoolean366 = arg5 != null;
			local126.anInt4721 = arg1;
			local126.anInt4726 = arg3;
			local126.anInt4723 = arg7;
			local126.anInt4727 = arg8.anInt9210;
			this.aClass379_1.method9496(local109, local126);
		}
		return local109;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ha;IIILclient!ae;I)Lclient!mq;")
	public Class71 method8554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class9 arg5, @OriginalArg(7) int arg6) {
		this.aClass155_1.anInt4724 = arg1;
		this.aClass155_1.aBoolean366 = arg5 != null;
		this.aClass155_1.anInt4721 = arg0;
		this.aClass155_1.anInt4725 = arg4;
		this.aClass155_1.anInt4727 = arg2.anInt9210;
		this.aClass155_1.anInt4726 = arg3;
		this.aClass155_1.anInt4723 = arg6;
		return (Class71) this.aClass379_1.method9487(this.aClass155_1);
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	public void method8555() {
		@Pc(2) Class22 local2 = this.aClass22_56;
		synchronized (this.aClass22_56) {
			this.aClass22_56.method468(5);
		}
		local2 = this.aClass22_57;
		synchronized (this.aClass22_57) {
			this.aClass22_57.method468(5);
		}
		@Pc(46) Class379 local46 = this.aClass379_1;
		synchronized (this.aClass379_1) {
			this.aClass379_1.method9495();
		}
	}
}
