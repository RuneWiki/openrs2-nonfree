import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public int anInt2118;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
	public int anInt2122;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
	public int anInt2125;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
	public int anInt2126;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
	public int anInt2124 = -1;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
	public int anInt2127 = -1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class56 local6 = arg1.method4739();
		local6.method4683(super.anInt2112, super.anInt2108, super.anInt2116);
		@Pc(30) Class124 local30 = Static230.method5537(this.anInt2126).method938(arg1, -1, 0, this.anInt2118, null, null, 0, 65536);
		if (local30 != null && local30.method4116(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt2124 != -1) {
			local30 = Static230.method5537(this.anInt2124).method938(arg1, -1, 0, this.anInt2122, null, null, 0, 65536);
			if (local30 != null && local30.method4116(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt2127 != -1) {
			local30 = Static230.method5537(this.anInt2127).method938(arg1, -1, 0, this.anInt2125, null, null, 0, 65536);
			if (local30 != null && local30.method4116(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		@Pc(12) Class56 local12 = arg0.method4739();
		local12.method4683(super.anInt2112, super.anInt2108, super.anInt2116);
		@Pc(24) Class8_Sub7 local24 = Static97.method1655(3);
		@Pc(45) Class124 local45;
		if (this.anInt2127 != -1) {
			local45 = Static230.method5537(this.anInt2127).method938(arg0, -1, 0, this.anInt2125, null, null, 0, 1024);
			if (local45 != null) {
				local45.method4079(local12, local24.aClass8_Sub2Array1[2], 0);
			}
		}
		if (this.anInt2124 != -1) {
			local45 = Static230.method5537(this.anInt2124).method938(arg0, -1, 0, this.anInt2122, null, null, 0, 1024);
			if (local45 != null) {
				local45.method4079(local12, local24.aClass8_Sub2Array1[1], 0);
			}
		}
		local45 = Static230.method5537(this.anInt2126).method938(arg0, -1, 0, this.anInt2118, null, null, 0, 1024);
		if (local45 != null) {
			local45.method4079(local12, local24.aClass8_Sub2Array1[0], 0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
	}
}
