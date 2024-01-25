import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class60_Sub1_Sub1_Sub2 extends Class60_Sub1_Sub1 {

	@OriginalMember(owner = "client!dr", name = "kb", descriptor = "Lclient!it;")
	private Class60_Sub4 aClass60_Sub4_1;

	@OriginalMember(owner = "client!dr", name = "Y", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!dr", name = "hb", descriptor = "I")
	private int anInt2206 = 0;

	@OriginalMember(owner = "client!dr", name = "ab", descriptor = "I")
	private int anInt2209 = 0;

	@OriginalMember(owner = "client!dr", name = "fb", descriptor = "I")
	private int anInt2199 = 0;

	@OriginalMember(owner = "client!dr", name = "gb", descriptor = "I")
	private final int anInt2211;

	@OriginalMember(owner = "client!dr", name = "U", descriptor = "Lclient!qu;")
	private Class104 aClass104_2;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class60_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt2199 = arg11;
		this.anInt2211 = arg0;
		@Pc(36) Class17 local36 = Static655.aClass172_2.method4449(this.anInt2211);
		@Pc(39) int local39 = local36.anInt251;
		if (local39 != -1) {
			this.aClass104_2 = new Class104_Sub2(this, false);
			@Pc(59) int local59 = local36.aBoolean21 ? 0 : 2;
			this.aClass104_2.method9042(local39, local59, false, arg1);
		}
	}

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7914() {
		return false;
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		return false;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(B)V")
	@Override
	public void method7917() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBILclient!rfa;ZILclient!ha;)V")
	@Override
	public void method7915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class60_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass60_Sub4_1 != null) {
			this.aClass60_Sub4_1.method4543();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "(B)Z")
	public boolean method2108() {
		return this.aClass104_2 == null || this.aClass104_2.method9038();
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return this.anInt2206;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)Z")
	public boolean method2109() {
		return this.aClass104_2 != null && !this.aClass104_2.method9021();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class54 local11 = this.method2113(arg1, arg0, this.anInt2211);
		if (local11 != null) {
			@Pc(16) Class109 local16 = arg0.method6643();
			local16.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
			this.method2112(arg0, local16, local11);
		}
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aBoolean192;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public void method2111() {
		if (this.aClass60_Sub4_1 != null) {
			this.aClass60_Sub4_1.method4543();
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!ha;Lclient!qa;Lclient!ka;)V")
	private void method2112(@OriginalArg(1) Class75 arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) Class54 arg2) {
		arg2.method7410(arg1);
		@Pc(17) Class216[] local17 = arg2.method7408();
		@Pc(20) Class173[] local20 = arg2.method7409();
		if ((this.aClass60_Sub4_1 == null || this.aClass60_Sub4_1.aBoolean376) && (local17 != null || local20 != null)) {
			this.aClass60_Sub4_1 = Static267.method4553(Static141.anInt8737, true);
		}
		if (this.aClass60_Sub4_1 != null) {
			this.aClass60_Sub4_1.method4548(arg0, (long) Static141.anInt8737, local17, local20);
			this.aClass60_Sub4_1.method4547(super.aByte135, super.aShort100, super.aShort101, super.aShort102, super.aShort99);
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		@Pc(24) Class54 local24 = this.method2113((this.anInt2199 == 0 ? 0 : 5) | 0x800, arg0, this.anInt2211);
		if (local24 == null) {
			return null;
		}
		if (this.anInt2199 != 0) {
			local24.a(this.anInt2199 * 2048);
		}
		@Pc(43) Class109 local43 = arg0.method6643();
		local43.method4606(super.anInt9048, super.anInt9051, super.anInt9057);
		this.method2112(arg0, local43, local24);
		@Pc(62) Class60_Sub9 local62 = Static511.method7383(false, 1);
		if (Static490.aBoolean634) {
			local24.method7407(local43, local62.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
		} else {
			local24.method7401(local43, local62.aClass60_Sub10Array1[0], 0);
		}
		if (this.aClass60_Sub4_1 != null) {
			@Pc(94) Class209 local94 = this.aClass60_Sub4_1.method4544();
			if (Static490.aBoolean634) {
				arg0.method6685(local94, Static377.anInt6468);
			} else {
				arg0.method6634(local94);
			}
		}
		this.aBoolean192 = local24.F();
		this.anInt2206 = local24.fa();
		this.anInt2209 = local24.ma();
		return local62;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!ha;I)Lclient!ka;")
	private Class54 method2113(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class17 local16 = Static655.aClass172_2.method4449(arg2);
		@Pc(21) Class96 local21 = Static524.aClass96Array2[super.aByte135];
		@Pc(35) Class96 local35 = super.aByte134 >= 3 ? null : Static524.aClass96Array2[super.aByte134 + 1];
		return this.aClass104_2 == null || this.aClass104_2.method9038() ? local16.method218((byte) 2, local21, (Class104) null, local35, true, super.anInt9048, super.anInt9057, arg1, super.anInt9051, arg0) : local16.method218((byte) 2, local21, this.aClass104_2, local35, true, super.anInt9048, super.anInt9057, arg1, super.anInt9051, arg0);
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		if (arg0 != 114) {
			this.method7915(100, 39, (Class60_Sub1) null, true, -79, (Class75) null);
		}
		return this.anInt2209;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)V")
	public void method2114(@OriginalArg(1) int arg0) {
		if (this.aClass104_2 != null && !this.aClass104_2.method9038()) {
			this.aClass104_2.method9039(arg0);
		}
	}
}
