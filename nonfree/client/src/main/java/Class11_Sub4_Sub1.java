import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 {

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public int anInt5595;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public int anInt5596;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public int anInt5597;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public int anInt5600;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
	public int anInt5599 = -1;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
	public int anInt5602 = -1;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(6) Class6 local6 = arg2.method5990();
		local6.U(super.anInt5591, super.anInt5590, super.anInt5593);
		@Pc(31) Class63 local31 = Static413.aClass271_2.method6193(this.anInt5596).method4999(-1, this.anInt5600, null, 0, 0, null, arg2, 131072);
		if (local31 != null && local31.method6292(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt5599 != -1) {
			local31 = Static413.aClass271_2.method6193(this.anInt5599).method4999(-1, this.anInt5597, null, 0, 0, null, arg2, 131072);
			if (local31 != null && local31.method6292(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt5602 != -1) {
			local31 = Static413.aClass271_2.method6193(this.anInt5602).method4999(-1, this.anInt5595, null, 0, 0, null, arg2, 131072);
			if (local31 != null && local31.method6292(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		@Pc(6) Class6 local6 = arg0.method5990();
		local6.U(super.anInt5591, super.anInt5590, super.anInt5593);
		@Pc(24) Class28_Sub5 local24 = Static29.method474(3);
		@Pc(46) Class63 local46;
		if (this.anInt5602 != -1) {
			local46 = Static413.aClass271_2.method6193(this.anInt5602).method4999(-1, this.anInt5595, null, 0, 0, null, arg0, 2048);
			if (local46 != null) {
				local46.method6293(local6, local24.aClass28_Sub4Array1[2], 0);
			}
		}
		if (this.anInt5599 != -1) {
			local46 = Static413.aClass271_2.method6193(this.anInt5599).method4999(-1, this.anInt5597, null, 0, 0, null, arg0, 2048);
			if (local46 != null) {
				local46.method6293(local6, local24.aClass28_Sub4Array1[1], 0);
			}
		}
		local46 = Static413.aClass271_2.method6193(this.anInt5596).method4999(-1, this.anInt5600, null, 0, 0, null, arg0, 2048);
		if (local46 != null) {
			local46.method6293(local6, local24.aClass28_Sub4Array1[0], 0);
		}
		return local24;
	}
}
