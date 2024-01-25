import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!sc", name = "K", descriptor = "Lclient!ck;")
	public final Class42 aClass42_4;

	@OriginalMember(owner = "client!sc", name = "R", descriptor = "Z")
	private final boolean aBoolean398;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIIZII)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean211, arg1.aBoolean209);
		this.aClass42_4 = new Class42(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean398 = arg1.anInt2984 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		this.aClass42_4.method967(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		this.aClass42_4.method965(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.aClass42_4.method968(false, 0, 0, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class39 local16 = this.aClass42_4.method968(false, super.anInt7088, super.anInt7084, arg0, false, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class132 local28 = arg0.method3564();
			local28.method3986(super.anInt7084, super.anInt7091, super.anInt7088);
			return local16.method4888(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aClass42_4.anInt1023;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.aClass42_4.method968(true, super.anInt7088, super.anInt7084, arg0, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class132 local28 = arg0.method3564();
		local28.method3986(super.anInt7084, super.anInt7091, super.anInt7088);
		@Pc(38) Class48_Sub6 local38 = null;
		if (this.aBoolean398) {
			local38 = Static403.method5489(1);
		}
		if (this.aClass42_4.aClass48_Sub1_1 == null) {
			local16.method4910(local28, local38 == null ? null : local38.aClass48_Sub7Array1[0], 0);
		} else {
			@Pc(54) Class115 local54 = this.aClass42_4.aClass48_Sub1_1.method1293();
			arg0.method3571(local16, local54, local28, local38 == null ? null : local38.aClass48_Sub7Array1[0]);
		}
		@Pc(87) int local87 = super.anInt7084 >> 7;
		@Pc(92) int local92 = super.anInt7088 >> 7;
		this.aClass42_4.method966(local92, local87, local87, local16, true, arg0, local92);
		return local38;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aClass42_4.anInt1029;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return this.aClass42_4.anInt1043;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aClass42_4.method960();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		@Pc(21) Class39 local21 = this.aClass42_4.method968(true, super.anInt7088, super.anInt7084, arg0, true, 262144);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt7084 >> 7;
			@Pc(33) int local33 = super.anInt7088 >> 7;
			this.aClass42_4.method966(local33, local28, local28, local21, false, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
