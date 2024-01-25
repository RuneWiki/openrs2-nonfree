import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class64 {

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public int anInt1681;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Lclient!jk;")
	private final Class137 aClass137_13 = new Class137(64);

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Lclient!jk;")
	public final Class137 aClass137_14 = new Class137(50);

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "Lclient!lt;")
	public final Class162 aClass162_1 = new Class162(250);

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "Lclient!nv;")
	private final Class185 aClass185_1 = new Class185();

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
	public final int anInt1671;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "Z")
	private boolean aBoolean115;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Lclient!qn;")
	private final Class211 aClass211_25;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "Lclient!tl;")
	private final Class240 aClass240_1;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!qn;")
	public final Class211 aClass211_24;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
	public final int anInt1669;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray13;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray12;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!ae;IZLclient!tl;Lclient!qn;Lclient!qn;)V")
	public Class64(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class240 arg3, @OriginalArg(4) Class211 arg4, @OriginalArg(5) Class211 arg5) {
		this.anInt1671 = arg1;
		this.aBoolean115 = arg2;
		this.aClass211_25 = arg4;
		this.aClass240_1 = arg3;
		this.aClass211_24 = arg5;
		if (this.aClass211_25 == null) {
			this.anInt1669 = 0;
		} else {
			@Pc(49) int local49 = this.aClass211_25.method4368() - 1;
			this.anInt1669 = local49 * 256 + this.aClass211_25.method4365(local49);
		}
		this.aStringArray13 = new String[] { null, null, Static15.aClass15_9.method180(this.anInt1671), null, null };
		this.aStringArray12 = new String[] { null, null, null, null, Static92.aClass15_32.method180(this.anInt1671) };
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIILclient!eb;Lclient!ya;II)Lclient!l;")
	public Class95 method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class60 arg3, @OriginalArg(5) Class135 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass185_1.anInt4593 = arg2;
		this.aClass185_1.anInt4586 = arg5;
		this.aClass185_1.anInt4591 = arg1;
		this.aClass185_1.aBoolean342 = arg3 != null;
		this.aClass185_1.anInt4589 = arg4.anInt6589;
		this.aClass185_1.anInt4592 = arg0;
		this.aClass185_1.anInt4585 = arg6;
		return (Class95) this.aClass162_1.method3168(this.aClass185_1);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V")
	public void method1365(@OriginalArg(1) int arg0) {
		this.anInt1681 = arg0;
		@Pc(17) Class137 local17 = this.aClass137_14;
		synchronized (this.aClass137_14) {
			this.aClass137_14.method2739();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public void method1366() {
		@Pc(2) Class137 local2 = this.aClass137_13;
		synchronized (this.aClass137_13) {
			this.aClass137_13.method2737();
		}
		local2 = this.aClass137_14;
		synchronized (this.aClass137_14) {
			this.aClass137_14.method2737();
		}
		@Pc(38) Class162 local38 = this.aClass162_1;
		synchronized (this.aClass162_1) {
			this.aClass162_1.method3178();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public void method1367() {
		@Pc(20) Class162 local20 = this.aClass162_1;
		synchronized (this.aClass162_1) {
			this.aClass162_1.method3173();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public void method1369() {
		@Pc(6) Class137 local6 = this.aClass137_13;
		synchronized (this.aClass137_13) {
			this.aClass137_13.method2745(5);
		}
		local6 = this.aClass137_14;
		synchronized (this.aClass137_14) {
			this.aClass137_14.method2745(5);
		}
		@Pc(38) Class162 local38 = this.aClass162_1;
		synchronized (this.aClass162_1) {
			this.aClass162_1.method3166();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BZ)V")
	public void method1370(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean115 != arg0) {
			this.aBoolean115 = arg0;
			this.method1375();
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)Lclient!ff;")
	public Class80 method1372(@OriginalArg(1) int arg0) {
		@Pc(8) Class137 local8 = this.aClass137_13;
		@Pc(18) Class80 local18;
		synchronized (this.aClass137_13) {
			local18 = (Class80) this.aClass137_13.method2744((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(38) Class211 local38 = this.aClass211_25;
		@Pc(51) byte[] local51;
		synchronized (this.aClass211_25) {
			local51 = this.aClass211_25.method4377(Static68.method1153(arg0), Static32.method436(arg0));
		}
		local18 = new Class80();
		local18.anInt2015 = arg0;
		local18.aClass64_1 = this;
		local18.aStringArray17 = new String[] { null, null, Static15.aClass15_9.method180(this.anInt1671), null, null };
		local18.aStringArray16 = new String[] { null, null, null, null, Static92.aClass15_32.method180(this.anInt1671) };
		if (local51 != null) {
			local18.method1591(new Class4_Sub9(local51));
		}
		local18.method1604();
		if (local18.anInt1990 != -1) {
			local18.method1594(this.method1372(local18.anInt1998), this.method1372(local18.anInt1990));
		}
		if (local18.anInt1999 != -1) {
			local18.method1603(this.method1372(local18.anInt1999), this.method1372(local18.lb));
		}
		if (!this.aBoolean115 && local18.aBoolean140) {
			local18.aString10 = Static332.aClass15_98.method180(this.anInt1671);
			local18.aStringArray16 = this.aStringArray12;
			local18.anIntArray153 = null;
			local18.anInt2014 = 0;
			local18.aStringArray17 = this.aStringArray13;
			local18.aBoolean141 = false;
			if (local18.aClass67_8 != null) {
				@Pc(206) boolean local206 = false;
				for (@Pc(211) Class4 local211 = local18.aClass67_8.method1428(); local211 != null; local211 = local18.aClass67_8.method1424()) {
					@Pc(221) Class247 local221 = this.aClass240_1.method5128((int) local211.aLong227);
					if (local221.aBoolean489) {
						local211.method6059();
					} else {
						local206 = true;
					}
				}
				if (!local206) {
					local18.aClass67_8 = null;
				}
			}
		}
		@Pc(246) Class137 local246 = this.aClass137_13;
		synchronized (this.aClass137_13) {
			this.aClass137_13.method2732((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
	public void method1373() {
		@Pc(13) Class137 local13 = this.aClass137_14;
		synchronized (this.aClass137_14) {
			this.aClass137_14.method2739();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!eb;Lclient!la;ZLclient!ya;IIIIIZLclient!ya;I)Lclient!l;")
	public Class95 method1374(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class135 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class135 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class95 local16 = this.method1364(arg6, arg7, arg10, arg0, arg3, arg5, arg4);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class80 local25 = this.method1372(arg5);
		if (arg7 > 1 && local25.anIntArray151 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local25.anIntArray152[local35] <= arg7 && local25.anIntArray152[local35] != 0) {
					local33 = local25.anIntArray151[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method1372(local33);
			}
		}
		@Pc(79) int[] local79 = local25.method1599(arg8, arg0, arg10, arg3, arg6, arg4, arg9, arg1, arg7);
		if (local79 == null) {
			return null;
		}
		@Pc(93) Class95 local93;
		if (arg2) {
			local93 = arg9.method5351(local79, 36, 36, 32);
		} else {
			local93 = arg3.method5351(local79, 36, 36, 32);
		}
		if (!arg2) {
			@Pc(109) Class185 local109 = new Class185();
			local109.anInt4592 = arg6;
			local109.anInt4589 = arg3.anInt6589;
			local109.aBoolean342 = arg0 != null;
			local109.anInt4585 = arg4;
			local109.anInt4591 = arg7;
			local109.anInt4586 = arg5;
			local109.anInt4593 = arg10;
			this.aClass162_1.method3175(local109, local93);
		}
		return local93;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public void method1375() {
		@Pc(6) Class137 local6 = this.aClass137_13;
		synchronized (this.aClass137_13) {
			this.aClass137_13.method2739();
		}
		local6 = this.aClass137_14;
		synchronized (this.aClass137_14) {
			this.aClass137_14.method2739();
		}
		@Pc(36) Class162 local36 = this.aClass162_1;
		synchronized (this.aClass162_1) {
			this.aClass162_1.method3173();
		}
	}
}
