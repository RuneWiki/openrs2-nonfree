import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	public int anInt7967;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
	public int anInt7968;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
	public int anInt7970;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
	public int anInt7974;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
	public int anInt7963 = -1;

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
	public int anInt7975 = -1;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class181 local6 = arg1.method6022();
		local6.oa(super.anInt7956, super.anInt7962, super.anInt7960);
		@Pc(33) Class63 local33 = Static464.aClass115_1.method2970(this.anInt7967).method7480(0, null, 0, -1, 131072, this.anInt7968, null, arg1);
		if (local33 != null && local33.method7697(arg0, arg2, local6, true)) {
			return true;
		}
		if (this.anInt7975 != -1) {
			local33 = Static464.aClass115_1.method2970(this.anInt7975).method7480(0, null, 0, -1, 131072, this.anInt7974, null, arg1);
			if (local33 != null && local33.method7697(arg0, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt7963 != -1) {
			local33 = Static464.aClass115_1.method2970(this.anInt7963).method7480(0, null, 0, -1, 131072, this.anInt7970, null, arg1);
			if (local33 != null && local33.method7697(arg0, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		@Pc(6) Class181 local6 = arg0.method6022();
		local6.oa(super.anInt7956, super.anInt7962, super.anInt7960);
		@Pc(23) Class6_Sub5 local23 = Static356.method2696(3);
		@Pc(46) Class63 local46;
		if (this.anInt7963 != -1) {
			local46 = Static464.aClass115_1.method2970(this.anInt7963).method7480(0, null, 0, -1, 2048, this.anInt7970, null, arg0);
			if (local46 != null) {
				local46.method7700(local6, local23.aClass6_Sub4Array1[2], 0);
			}
		}
		if (this.anInt7975 != -1) {
			local46 = Static464.aClass115_1.method2970(this.anInt7975).method7480(0, null, 0, -1, 2048, this.anInt7974, null, arg0);
			if (local46 != null) {
				local46.method7700(local6, local23.aClass6_Sub4Array1[1], 0);
			}
		}
		local46 = Static464.aClass115_1.method2970(this.anInt7967).method7480(0, null, 0, -1, 2048, this.anInt7968, null, arg0);
		if (local46 != null) {
			local46.method7700(local6, local23.aClass6_Sub4Array1[0], 0);
		}
		return local23;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return null;
	}
}
