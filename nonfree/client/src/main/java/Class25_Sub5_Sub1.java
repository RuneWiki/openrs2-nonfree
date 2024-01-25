import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class25_Sub5_Sub1 extends Class25_Sub5 {

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "I")
	public int anInt6310;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
	public int anInt6314;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
	public int anInt6316;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
	public int anInt6318;

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
	public int anInt6319 = -1;

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
	public int anInt6321 = -1;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(6) Class112 local6 = arg2.method4798();
		local6.method3589(super.anInt6309, super.anInt6304, super.anInt6307);
		@Pc(35) Class101 local35 = Static88.method1382(this.anInt6310).method4428(65536, this.anInt6316, 0, -1, null, arg2, 0, null);
		if (local35 != null && local35.method5187(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt6321 != -1) {
			local35 = Static88.method1382(this.anInt6321).method4428(65536, this.anInt6314, 0, -1, null, arg2, 0, null);
			if (local35 != null && local35.method5187(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt6319 != -1) {
			local35 = Static88.method1382(this.anInt6319).method4428(65536, this.anInt6318, 0, -1, null, arg2, 0, null);
			if (local35 != null && local35.method5187(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		@Pc(6) Class112 local6 = arg0.method4798();
		local6.method3589(super.anInt6309, super.anInt6304, super.anInt6307);
		@Pc(23) Class63_Sub3 local23 = Static273.method4667(3);
		@Pc(44) Class101 local44;
		if (this.anInt6319 != -1) {
			local44 = Static88.method1382(this.anInt6319).method4428(1024, this.anInt6318, 0, -1, null, arg0, 0, null);
			if (local44 != null) {
				local44.method5172(local6, local23.aClass63_Sub7Array1[2], 0);
			}
		}
		if (this.anInt6321 != -1) {
			local44 = Static88.method1382(this.anInt6321).method4428(1024, this.anInt6314, 0, -1, null, arg0, 0, null);
			if (local44 != null) {
				local44.method5172(local6, local23.aClass63_Sub7Array1[1], 0);
			}
		}
		local44 = Static88.method1382(this.anInt6310).method4428(1024, this.anInt6316, 0, -1, null, arg0, 0, null);
		if (local44 != null) {
			local44.method5172(local6, local23.aClass63_Sub7Array1[0], 0);
		}
		return local23;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
	}
}
