import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class132 {

	@OriginalMember(owner = "client!go", name = "z", descriptor = "I")
	public int anInt3572;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Lclient!gw;")
	private final Class136 aClass136_26 = new Class136(64);

	@OriginalMember(owner = "client!go", name = "u", descriptor = "Lclient!gw;")
	public final Class136 aClass136_27 = new Class136(50);

	@OriginalMember(owner = "client!go", name = "v", descriptor = "Lclient!gda;")
	public final Class122 aClass122_1 = new Class122(250);

	@OriginalMember(owner = "client!go", name = "w", descriptor = "Lclient!qh;")
	private final Class281 aClass281_1 = new Class281();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!uu;")
	private final Class343 aClass343_96;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Lclient!uu;")
	public final Class343 aClass343_97;

	@OriginalMember(owner = "client!go", name = "y", descriptor = "Lclient!lv;")
	private final Class214 aClass214_1;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "I")
	public final int anInt3570;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "Z")
	private boolean aBoolean259;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "I")
	public final int anInt3568;

	@OriginalMember(owner = "client!go", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray27;

	@OriginalMember(owner = "client!go", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!gp;IZLclient!lv;Lclient!uu;Lclient!uu;)V")
	public Class132(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class214 arg3, @OriginalArg(4) Class343 arg4, @OriginalArg(5) Class343 arg5) {
		this.aClass343_96 = arg4;
		this.aClass343_97 = arg5;
		this.aClass214_1 = arg3;
		this.anInt3570 = arg1;
		this.aBoolean259 = arg2;
		if (this.aClass343_96 == null) {
			this.anInt3568 = 0;
		} else {
			@Pc(54) int local54 = this.aClass343_96.method8144() - 1;
			this.anInt3568 = local54 * 256 + this.aClass343_96.method8157(local54);
		}
		this.aStringArray27 = new String[] { null, null, Static369.aClass235_10.method5893(this.anInt3570), null, null };
		this.aStringArray28 = new String[] { null, null, null, null, Static369.aClass235_11.method5893(this.anInt3570) };
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public void method3056() {
		@Pc(12) Class136 local12 = this.aClass136_26;
		synchronized (this.aClass136_26) {
			this.aClass136_26.method3138();
		}
		local12 = this.aClass136_27;
		synchronized (this.aClass136_27) {
			this.aClass136_27.method3138();
		}
		@Pc(42) Class122 local42 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2911();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!wh;IILclient!ha;IIII)Lclient!fd;")
	public Class103 method3057(@OriginalArg(0) Class375 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass281_1.anInt7892 = arg5;
		this.aClass281_1.aBoolean567 = arg0 != null;
		this.aClass281_1.anInt7895 = arg1;
		this.aClass281_1.anInt7898 = arg6;
		this.aClass281_1.anInt7899 = arg4;
		this.aClass281_1.anInt7900 = arg2.anInt7008;
		this.aClass281_1.anInt7897 = arg3;
		return (Class103) this.aClass122_1.method2910(this.aClass281_1);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V")
	public void method3058(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean259) {
			this.aBoolean259 = arg0;
			this.method3065();
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V")
	public void method3059() {
		@Pc(2) Class136 local2 = this.aClass136_27;
		synchronized (this.aClass136_27) {
			this.aClass136_27.method3142();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	public void method3061(@OriginalArg(0) int arg0) {
		this.anInt3572 = arg0;
		@Pc(12) Class136 local12 = this.aClass136_27;
		synchronized (this.aClass136_27) {
			this.aClass136_27.method3142();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)Lclient!ov;")
	public Class259 method3062(@OriginalArg(0) int arg0) {
		@Pc(8) Class136 local8 = this.aClass136_26;
		@Pc(18) Class259 local18;
		synchronized (this.aClass136_26) {
			local18 = (Class259) this.aClass136_26.method3134((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(45) Class343 local45 = this.aClass343_96;
		@Pc(58) byte[] local58;
		synchronized (this.aClass343_96) {
			local58 = this.aClass343_96.method8132(Static274.method4526(arg0), Static58.method1039(arg0));
		}
		local18 = new Class259();
		local18.aClass132_2 = this;
		local18.anInt7366 = arg0;
		local18.aStringArray59 = new String[] { null, null, Static369.aClass235_10.method5893(this.anInt3570), null, null };
		local18.aStringArray58 = new String[] { null, null, null, null, Static369.aClass235_11.method5893(this.anInt3570) };
		if (local58 != null) {
			local18.method6456(new Class3_Sub9(local58));
		}
		local18.method6462();
		if (local18.anInt7377 != -1) {
			local18.method6455(this.method3062(local18.anInt7377), this.method3062(local18.anInt7385));
		}
		if (local18.anInt7334 != -1) {
			local18.method6458(this.method3062(local18.anInt7376), this.method3062(local18.anInt7334));
		}
		if (local18.anInt7392 != -1) {
			local18.method6467(this.method3062(local18.anInt7379), this.method3062(local18.anInt7392));
		}
		if (!this.aBoolean259 && local18.aBoolean525) {
			local18.aString63 = Static369.aClass235_7.method5893(this.anInt3570);
			local18.aStringArray59 = this.aStringArray27;
			local18.anInt7398 = 0;
			local18.aBoolean526 = false;
			local18.anIntArray436 = null;
			local18.aStringArray58 = this.aStringArray28;
			if (local18.aClass25_31 != null) {
				@Pc(230) boolean local230 = false;
				for (@Pc(235) Class3 local235 = local18.aClass25_31.method435(); local235 != null; local235 = local18.aClass25_31.method432()) {
					@Pc(245) Class108 local245 = this.aClass214_1.method5419((int) local235.aLong277);
					if (local245.aBoolean237) {
						local235.method8682();
					} else {
						local230 = true;
					}
				}
				if (!local230) {
					local18.aClass25_31 = null;
				}
			}
		}
		@Pc(270) Class136 local270 = this.aClass136_26;
		synchronized (this.aClass136_26) {
			this.aClass136_26.method3135(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public void method3064() {
		@Pc(10) Class122 local10 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2906();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	public void method3065() {
		@Pc(2) Class136 local2 = this.aClass136_26;
		synchronized (this.aClass136_26) {
			this.aClass136_26.method3142();
		}
		local2 = this.aClass136_27;
		synchronized (this.aClass136_27) {
			this.aClass136_27.method3142();
		}
		@Pc(42) Class122 local42 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2906();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILclient!da;ZZLclient!wh;ILclient!ha;ILclient!ha;I)Lclient!fd;")
	public Class103 method3066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class375 arg6, @OriginalArg(8) Class82 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class82 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class103 local16 = this.method3057(arg6, arg8, arg7, arg10, arg1, arg0, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class259 local25 = this.method3062(arg10);
		if (arg1 > 1 && local25.anIntArray435 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg1 >= local25.anIntArray437[local35] && local25.anIntArray437[local35] != 0) {
					local33 = local25.anIntArray435[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method3062(local33);
			}
		}
		@Pc(89) int[] local89 = local25.method6453(arg0, arg9, arg2, arg1, arg3, arg7, arg8, arg5, arg6);
		if (local89 == null) {
			return null;
		}
		@Pc(104) Class103 local104;
		if (arg4) {
			local104 = arg9.method6112(32, local89, 36, 36);
		} else {
			local104 = arg7.method6112(32, local89, 36, 36);
		}
		if (!arg4) {
			@Pc(121) Class281 local121 = new Class281();
			local121.anInt7900 = arg7.anInt7008;
			local121.anInt7892 = arg0;
			local121.anInt7895 = arg8;
			local121.anInt7899 = arg1;
			local121.anInt7898 = arg2;
			local121.anInt7897 = arg10;
			local121.aBoolean567 = arg6 != null;
			this.aClass122_1.method2908(local121, local104);
		}
		return local104;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)V")
	public void method3067() {
		@Pc(6) Class136 local6 = this.aClass136_26;
		synchronized (this.aClass136_26) {
			this.aClass136_26.method3132(5);
		}
		local6 = this.aClass136_27;
		synchronized (this.aClass136_27) {
			this.aClass136_27.method3132(5);
		}
		@Pc(46) Class122 local46 = this.aClass122_1;
		synchronized (this.aClass122_1) {
			this.aClass122_1.method2903();
		}
	}
}
