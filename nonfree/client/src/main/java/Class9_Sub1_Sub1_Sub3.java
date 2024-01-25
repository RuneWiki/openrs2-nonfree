import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class9_Sub1_Sub1_Sub3 extends Class9_Sub1_Sub1 {

	@OriginalMember(owner = "client!bka", name = "ib", descriptor = "Lclient!ms;")
	private Class9_Sub5 aClass9_Sub5_3;

	@OriginalMember(owner = "client!bka", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!bka", name = "W", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!bka", name = "gb", descriptor = "I")
	private int anInt1364 = 0;

	@OriginalMember(owner = "client!bka", name = "hb", descriptor = "I")
	private int anInt1379 = 0;

	@OriginalMember(owner = "client!bka", name = "jb", descriptor = "I")
	private final int anInt1369;

	@OriginalMember(owner = "client!bka", name = "nb", descriptor = "Lclient!rf;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class9_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt1369 = arg0;
		this.anInt1364 = arg11;
		@Pc(36) Class139 local36 = Static381.aClass106_2.method2618(this.anInt1369);
		@Pc(39) int local39 = local36.anInt3453;
		if (local39 != -1) {
			this.aClass45_5 = new Class45_Sub2(this, false);
			@Pc(60) int local60 = local36.aBoolean218 ? 0 : 2;
			if (arg12) {
				local60 = 1;
			}
			this.aClass45_5.method6586(local60, arg1, false, local39);
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(II)V")
	public void method1285() {
		if (this.aClass45_5 != null && !this.aClass45_5.method6584()) {
			this.aClass45_5.method6593(1);
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bka", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		if (arg0 >= -5) {
			this.anInt1379 = 17;
		}
		return this.anInt1379;
	}

	@OriginalMember(owner = "client!bka", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass9_Sub5_3 != null) {
			this.aClass9_Sub5_3.method5583();
		}
	}

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "(B)Z")
	public boolean method1287() {
		return this.aClass45_5 != null && !this.aClass45_5.method6589();
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
		@Pc(11) Class170 local11 = this.method1290(arg0, 0, this.anInt1369);
		if (local11 != null) {
			@Pc(16) Class58 local16 = arg0.method9354();
			local16.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
			this.method1289(arg0, local11, local16);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		@Pc(24) Class170 local24 = this.method1290(arg0, (this.anInt1364 == 0 ? 0 : 5) | 0x800, this.anInt1369);
		if (local24 == null) {
			return null;
		}
		if (this.anInt1364 != 0) {
			local24.a(this.anInt1364 * 2048);
		}
		@Pc(43) Class58 local43 = arg0.method9354();
		local43.method9524(super.anInt10694, super.anInt10690, super.anInt10695);
		this.method1289(arg0, local24, local43);
		@Pc(62) Class9_Sub6 local62 = Static135.method9083(1, false);
		if (Static444.aBoolean451) {
			local24.method8350(local43, local62.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
		} else {
			local24.method8360(local43, local62.aClass9_Sub9Array1[0], 0);
		}
		if (this.aClass9_Sub5_3 != null) {
			@Pc(100) Class346 local100 = this.aClass9_Sub5_3.method5580();
			if (Static444.aBoolean451) {
				arg0.method9360(local100, Static668.anInt10260);
			} else {
				arg0.method9384(local100);
			}
		}
		this.aBoolean95 = local24.F();
		this.lb = local24.fa();
		this.anInt1379 = local24.ma();
		return local62;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Z)Z")
	public boolean method1288() {
		return this.aClass45_5 == null || this.aClass45_5.method6584();
	}

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		return false;
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return false;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!ha;Lclient!ka;Lclient!cl;B)V")
	private void method1289(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) Class58 arg2) {
		arg1.method8357(arg2);
		@Pc(18) Class184[] local18 = arg1.method8354();
		@Pc(21) Class232[] local21 = arg1.method8352();
		if ((this.aClass9_Sub5_3 == null || this.aClass9_Sub5_3.aBoolean434) && (local18 != null || local21 != null)) {
			this.aClass9_Sub5_3 = Static421.method5577(Static716.anInt11157, true);
		}
		if (this.aClass9_Sub5_3 != null) {
			this.aClass9_Sub5_3.method5585(arg0, (long) Static716.anInt11157, local18, local21);
			this.aClass9_Sub5_3.method5570(super.aByte139, super.aShort123, super.aShort122, super.aShort120, super.aShort121);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!ha;III)Lclient!ka;")
	private Class170 method1290(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class139 local8 = Static381.aClass106_2.method2618(arg2);
		@Pc(13) Class259 local13 = Static43.aClass259Array1[super.aByte139];
		@Pc(37) Class259 local37 = super.aByte140 >= 3 ? null : Static43.aClass259Array1[super.aByte140 + 1];
		return this.aClass45_5 == null || this.aClass45_5.method6584() ? local8.method3144(true, local37, local13, arg1, (Class45) null, (byte) 2, super.anInt10694, super.anInt10695, super.anInt10690, arg0) : local8.method3144(true, local37, local13, arg1, this.aClass45_5, (byte) 2, super.anInt10694, super.anInt10695, super.anInt10690, arg0);
	}

	@OriginalMember(owner = "client!bka", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aBoolean95;
	}

	@OriginalMember(owner = "client!bka", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return this.lb;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)V")
	public void method1293() {
		if (this.aClass9_Sub5_3 != null) {
			this.aClass9_Sub5_3.method5583();
		}
	}
}
