import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class47_Sub5_Sub2 extends Class47_Sub5 implements Interface11 {

	@OriginalMember(owner = "client!lk", name = "K", descriptor = "Lclient!ws;")
	public final Class266 aClass266_2;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIIZII)V")
	public Class47_Sub5_Sub2(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean52, arg1.aBoolean45);
		this.aClass266_2 = new Class266(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean318 = arg1.anInt550 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return this.aClass266_2.anInt7768;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return false;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		@Pc(16) Class37 local16 = this.aClass266_2.method5988(super.anInt4037, super.anInt4036, false, arg0, 2048, true);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class43 local28 = arg0.method4588();
		local28.R(super.anInt4036, super.anInt4033, super.anInt4037);
		@Pc(38) Class36_Sub1 local38 = null;
		if (this.aBoolean318) {
			local38 = Static309.method4241(1);
		}
		if (this.aClass266_2.aClass36_Sub7_7 == null) {
			local16.method4167(local28, local38 == null ? null : local38.aClass36_Sub8Array1[0], 0);
		} else {
			@Pc(54) Class101 local54 = this.aClass266_2.aClass36_Sub7_7.method4874();
			arg0.method4574(local16, local54, local28, local38 == null ? null : local38.aClass36_Sub8Array1[0]);
		}
		@Pc(87) int local87 = super.anInt4036 >> 7;
		@Pc(92) int local92 = super.anInt4037 >> 7;
		this.aClass266_2.method5990(local87, local92, local92, local16, true, local87, arg0);
		return local38;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		this.aClass266_2.method5983(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(21) Class37 local21 = this.aClass266_2.method5988(super.anInt4037, super.anInt4036, false, arg2, 131072, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class43 local28 = arg2.method4588();
			local28.R(super.anInt4036, super.anInt4033, super.anInt4037);
			return local21.method4166(arg1, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass266_2.method5988(0, 0, false, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		@Pc(22) Class37 local22 = this.aClass266_2.method5988(super.anInt4037, super.anInt4036, true, arg0, 262144, true);
		if (local22 != null) {
			@Pc(29) int local29 = super.anInt4036 >> 7;
			@Pc(34) int local34 = super.anInt4037 >> 7;
			this.aClass266_2.method5990(local29, local34, local34, local22, false, local29, arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aClass266_2.anInt7786;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aClass266_2.method5984();
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		this.aClass266_2.method5981(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aClass266_2.anInt7784;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
	}
}
