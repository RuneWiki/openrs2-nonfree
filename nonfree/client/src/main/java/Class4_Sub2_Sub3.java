import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class4_Sub2_Sub3 extends Class4_Sub2 implements Interface9 {

	@OriginalMember(owner = "client!mt", name = "T", descriptor = "Lclient!id;")
	public final Class117 aClass117_2;

	@OriginalMember(owner = "client!mt", name = "K", descriptor = "Z")
	private final boolean aBoolean395;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIIZIIIIIII)V")
	public Class4_Sub2_Sub3(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7142 == 1, Static178.method2787(arg13, arg12));
		this.aClass117_2 = new Class117(arg0, arg1, arg12, arg13, super.aByte92, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean395 = arg1.anInt7186 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aClass117_2.method2625();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class32 local23 = this.aClass117_2.method2618(false, false, arg1, super.anInt7111, super.anInt7117, 131072);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class102 local30 = arg1.method2223();
			local30.R(super.anInt7117, super.anInt7109, super.anInt7111);
			return local23.method5671(arg2, arg0, local30, false);
		}
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return this.aClass117_2.anInt3233;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
		@Pc(16) Class32 local16 = this.aClass117_2.method2618(true, true, arg0, super.anInt7111, super.anInt7117, 262144);
		if (local16 != null) {
			this.aClass117_2.method2614(local16, arg0, super.aShort88, super.aShort86, super.aShort89, super.aShort87, false);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.aClass117_2.method2618(false, false, arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)I")
	@Override
	public int method5562() {
		return this.aClass117_2.method2623();
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		@Pc(16) Class32 local16 = this.aClass117_2.method2618(false, true, arg0, super.anInt7111, super.anInt7117, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class102 local23 = arg0.method2223();
		local23.R(super.anInt7117, super.anInt7109, super.anInt7111);
		@Pc(38) Class38_Sub3 local38 = null;
		if (this.aBoolean395) {
			local38 = Static313.method4433(1);
		}
		if (this.aClass117_2.aClass38_Sub6_1 == null) {
			local16.method5675(local23, local38 == null ? null : local38.aClass38_Sub4Array1[0], 0);
		} else {
			@Pc(56) Class192 local56 = this.aClass117_2.aClass38_Sub6_1.method3549();
			arg0.method2218(local16, local56, local23, local38 == null ? null : local38.aClass38_Sub4Array1[0]);
		}
		this.aClass117_2.method2614(local16, arg0, super.aShort88, super.aShort86, super.aShort89, super.aShort87, true);
		return local38;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V")
	@Override
	public void method5889() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILclient!qa;Lclient!eq;IIZ)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5891() {
		return false;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aClass117_2.anInt3237;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aClass117_2.anInt3240;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		this.aClass117_2.method2619(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		this.aClass117_2.method2617(arg0);
	}
}
