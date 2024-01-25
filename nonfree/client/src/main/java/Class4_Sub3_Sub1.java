import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class4_Sub3_Sub1 extends Class4_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!hp", name = "R", descriptor = "Lclient!mj;")
	public final Class133 aClass133_2;

	@OriginalMember(owner = "client!hp", name = "O", descriptor = "Z")
	private final boolean aBoolean180;

	static {
		new Class85("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIIIIZI)V")
	public Class4_Sub3_Sub1(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static231.method4151(arg2, arg3));
		this.aClass133_2 = new Class133(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt5781, super.anInt5783, arg9, arg10);
		this.aBoolean180 = arg1.anInt4756 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return this.aClass133_2.anInt3926;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		@Pc(18) Class112 local18 = this.aClass133_2.method3491(super.anInt5781, arg0, false, super.anInt5783, 1024, true);
		if (local18 == null) {
			return null;
		}
		@Pc(29) Class66 local29 = arg0.method5195();
		local29.method5822(super.anInt5781, super.anInt5785, super.anInt5783);
		@Pc(39) Class32_Sub4 local39 = null;
		if (this.aBoolean180) {
			local39 = Static232.method4183(1);
		}
		if (this.aClass133_2.aClass32_Sub7_4 == null) {
			local18.method4338(local29, local39 == null ? null : local39.aClass32_Sub8Array1[0], 0);
		} else {
			@Pc(55) Class146 local55 = this.aClass133_2.aClass32_Sub7_4.method4955();
			arg0.method5241(local18, local55, local29, local39 == null ? null : local39.aClass32_Sub8Array1[0]);
		}
		this.aClass133_2.method3493(arg0, true, super.anInt5783 >> 7, super.anInt5783 >> 7, super.anInt5781 >> 7, super.anInt5781 >> 7, local18);
		return local39;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		this.aClass133_2.method3494(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		this.aClass133_2.method3484(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_2.method3491(0, arg0, false, 0, arg1, false);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aClass133_2.method3490();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		@Pc(22) Class112 local22 = this.aClass133_2.method3491(super.anInt5781, arg0, true, super.anInt5783, 131072, true);
		if (local22 != null) {
			this.aClass133_2.method3493(arg0, false, super.anInt5783 >> 7, super.anInt5783 >> 7, super.anInt5781 >> 7, super.anInt5781 >> 7, local22);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aClass133_2.anInt3925;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class112 local21 = this.aClass133_2.method3491(super.anInt5781, arg1, false, super.anInt5783, 65536, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class66 local28 = arg1.method5195();
			local28.method5822(super.anInt5781, super.anInt5785, super.anInt5783);
			return local21.method4340(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aClass133_2.anInt3933;
	}
}
