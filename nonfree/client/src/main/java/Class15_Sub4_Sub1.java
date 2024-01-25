import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class15_Sub4_Sub1 extends Class15_Sub4 {

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
	public int anInt3218;

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
	public int anInt3220;

	@OriginalMember(owner = "client!gea", name = "B", descriptor = "I")
	public int anInt3225;

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
	public int anInt3226;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
	public int anInt3216 = -1;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
	public int anInt3223 = -1;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class78 local11 = arg0.method6994();
		local11.oa(super.anInt3209, super.anInt3212, super.anInt3207);
		@Pc(36) Class36 local36 = Static451.aClass67_2.method2006(this.anInt3220).method675(0, -1, this.anInt3225, arg0, 131072, null, null, 0);
		if (local36 != null && local36.method7359(arg1, arg2, local11, true)) {
			return true;
		}
		if (this.anInt3216 != -1) {
			local36 = Static451.aClass67_2.method2006(this.anInt3216).method675(0, -1, this.anInt3218, arg0, 131072, null, null, 0);
			if (local36 != null && local36.method7359(arg1, arg2, local11, true)) {
				return true;
			}
		}
		if (this.anInt3223 != -1) {
			local36 = Static451.aClass67_2.method2006(this.anInt3223).method675(0, -1, this.anInt3226, arg0, 131072, null, null, 0);
			if (local36 != null && local36.method7359(arg1, arg2, local11, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		@Pc(6) Class78 local6 = arg0.method6994();
		local6.oa(super.anInt3209, super.anInt3212, super.anInt3207);
		@Pc(24) Class30_Sub1 local24 = Static363.method5549(3);
		@Pc(45) Class36 local45;
		if (this.anInt3223 != -1) {
			local45 = Static451.aClass67_2.method2006(this.anInt3223).method675(0, -1, this.anInt3226, arg0, 2048, null, null, 0);
			if (local45 != null) {
				local45.method7360(local6, local24.aClass30_Sub6Array1[2], 0);
			}
		}
		if (this.anInt3216 != -1) {
			local45 = Static451.aClass67_2.method2006(this.anInt3216).method675(0, -1, this.anInt3218, arg0, 2048, null, null, 0);
			if (local45 != null) {
				local45.method7360(local6, local24.aClass30_Sub6Array1[1], 0);
			}
		}
		local45 = Static451.aClass67_2.method2006(this.anInt3220).method675(0, -1, this.anInt3225, arg0, 2048, null, null, 0);
		if (local45 != null) {
			local45.method7360(local6, local24.aClass30_Sub6Array1[0], 0);
		}
		return local24;
	}
}
