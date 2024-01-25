import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class3_Sub1_Sub2_Sub5 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "Lclient!sia;")
	private Class3_Sub7 aClass3_Sub7_7;

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
	private int anInt7015 = 0;

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
	private final int anInt7011 = -1;

	@OriginalMember(owner = "client!pa", name = "ab", descriptor = "Z")
	private boolean aBoolean545 = true;

	@OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
	private int anInt7020 = 0;

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "Z")
	public boolean aBoolean544 = false;

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
	private int anInt7012 = 0;

	@OriginalMember(owner = "client!pa", name = "vb", descriptor = "I")
	private int anInt7029 = 0;

	@OriginalMember(owner = "client!pa", name = "yb", descriptor = "I")
	private int anInt7032 = 0;

	@OriginalMember(owner = "client!pa", name = "ob", descriptor = "I")
	public final int anInt7023;

	@OriginalMember(owner = "client!pa", name = "wb", descriptor = "I")
	private final int anInt7030;

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "Lclient!fs;")
	private Class124 aClass124_3;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class3_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt7023 = arg1 + arg2;
		this.anInt7032 = arg12;
		this.anInt7030 = arg0;
		@Pc(53) Class323 local53 = Static341.aClass349_1.method7597(this.anInt7030);
		@Pc(56) int local56 = local53.anInt8322;
		if (local56 == -1) {
			this.aBoolean544 = true;
		} else {
			this.aClass124_3 = Static99.aClass2_1.method22(local56);
			this.aBoolean544 = false;
		}
		if (this.anInt7023 == arg2) {
			Static633.method8389(this.anInt7029, this, this.aClass124_3);
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(Z)V")
	@Override
	public void method8504() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method8505() {
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			this.aBoolean545 = true;
		}
		return this.anInt7015;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		@Pc(23) Class62 local23 = this.method6182((this.anInt7032 == 0 ? 0 : 5) | 0x800, this.anInt7030, arg0);
		if (local23 == null) {
			return null;
		}
		if (this.anInt7032 != 0) {
			local23.a(this.anInt7032 * 2048);
		}
		@Pc(50) Class92 local50 = arg0.method8078();
		local50.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
		this.method6180(local50, arg0, local23);
		@Pc(69) Class3_Sub6 local69 = Static665.method8806(1, false);
		if (Static499.aBoolean608) {
			local23.method7332(local50, local69.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
		} else {
			local23.method7335(local50, local69.aClass3_Sub4Array1[0], 0);
		}
		if (this.aClass3_Sub7_7 != null) {
			@Pc(97) Class9 local97 = this.aClass3_Sub7_7.method7301();
			if (Static499.aBoolean608) {
				arg0.method8094(local97, Static140.anInt8126);
			} else {
				arg0.method8085(local97);
			}
		}
		this.aBoolean545 = local23.F();
		this.anInt7020 = local23.fa();
		this.anInt7015 = local23.ma();
		return local69;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!gda;Lclient!ha;IIZII)V")
	@Override
	public void method8491(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aBoolean545;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
		@Pc(11) Class62 local11 = this.method6182(0, this.anInt7030, arg0);
		if (local11 != null) {
			@Pc(16) Class92 local16 = arg0.method8078();
			local16.method3854(super.anInt9925, super.anInt9915, super.anInt9917);
			this.method6180(local16, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!nh;Lclient!ha;Lclient!ka;)V")
	private void method6180(@OriginalArg(1) Class92 arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) Class62 arg2) {
		arg2.method7336(arg0);
		@Pc(21) Class235[] local21 = arg2.method7331();
		@Pc(24) Class170[] local24 = arg2.method7333();
		if ((this.aClass3_Sub7_7 == null || this.aClass3_Sub7_7.aBoolean652) && (local21 != null || local24 != null)) {
			this.aClass3_Sub7_7 = Static549.method7310(Static177.anInt3088, true);
		}
		if (this.aClass3_Sub7_7 != null) {
			this.aClass3_Sub7_7.method7307(arg1, (long) Static177.anInt3088, local21, local24);
			this.aClass3_Sub7_7.method7297(super.aByte141, super.aShort124, super.aShort123, super.aShort125, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return this.anInt7020;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILclient!ha;)Lclient!ka;")
	private Class62 method6182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(8) Class323 local8 = Static341.aClass349_1.method7597(arg1);
		@Pc(13) Class42 local13 = Static655.aClass42Array5[super.aByte141];
		@Pc(34) Class42 local34 = super.aByte142 >= 3 ? null : Static655.aClass42Array5[super.aByte142 + 1];
		return this.aBoolean544 ? local8.method7202(-1, arg0, Static99.aClass2_1, super.anInt9917, 0, arg2, local13, -1, local34, super.anInt9915, super.anInt9925) : local8.method7202(this.anInt7029, arg0, Static99.aClass2_1, super.anInt9917, this.anInt7012, arg2, local13, this.anInt7011, local34, super.anInt9915, super.anInt9925);
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)V")
	public void method6183(@OriginalArg(1) int arg0) {
		if (this.aBoolean544) {
			return;
		}
		this.anInt7012 += arg0;
		while (this.aClass124_3.anIntArray221[this.anInt7029] < this.anInt7012) {
			this.anInt7012 -= this.aClass124_3.anIntArray221[this.anInt7029];
			this.anInt7029++;
			if (this.aClass124_3.anIntArray224.length <= this.anInt7029) {
				this.aBoolean544 = true;
				break;
			}
		}
		if (!this.aBoolean544) {
			Static633.method8389(this.anInt7029, this, this.aClass124_3);
		}
	}

	@OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass3_Sub7_7 != null) {
			this.aClass3_Sub7_7.method7304();
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public void method6184() {
		if (this.aClass3_Sub7_7 != null) {
			this.aClass3_Sub7_7.method7304();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return null;
	}
}
