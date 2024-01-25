import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 {

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
	public int anInt1667;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	public int anInt1669;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	public int anInt1672;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
	public int anInt1675;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	public int anInt1666 = -1;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	public int anInt1668 = -1;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		@Pc(6) Class72 local6 = arg0.method2092();
		local6.C(super.anInt1658, super.anInt1663, super.anInt1659);
		@Pc(18) Class71_Sub3 local18 = Static127.method2399(3);
		@Pc(40) Class57 local40;
		if (this.anInt1668 != -1) {
			local40 = Static139.aClass193_1.method4650(this.anInt1668).method6259(0, null, 2048, this.anInt1675, -1, arg0, null, 0);
			if (local40 != null) {
				local40.method6073(local6, local18.aClass71_Sub7Array1[2], 0);
			}
		}
		if (this.anInt1666 != -1) {
			local40 = Static139.aClass193_1.method4650(this.anInt1666).method6259(0, null, 2048, this.anInt1667, -1, arg0, null, 0);
			if (local40 != null) {
				local40.method6073(local6, local18.aClass71_Sub7Array1[1], 0);
			}
		}
		local40 = Static139.aClass193_1.method4650(this.anInt1672).method6259(0, null, 2048, this.anInt1669, -1, arg0, null, 0);
		if (local40 != null) {
			local40.method6073(local6, local18.aClass71_Sub7Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(16) Class72 local16 = arg2.method2092();
		local16.C(super.anInt1658, super.anInt1663, super.anInt1659);
		@Pc(41) Class57 local41 = Static139.aClass193_1.method4650(this.anInt1672).method6259(0, null, 131072, this.anInt1669, -1, arg2, null, 0);
		if (local41 != null && local41.method6070(arg1, arg0, local16, true)) {
			return true;
		}
		if (this.anInt1666 != -1) {
			local41 = Static139.aClass193_1.method4650(this.anInt1666).method6259(0, null, 131072, this.anInt1667, -1, arg2, null, 0);
			if (local41 != null && local41.method6070(arg1, arg0, local16, true)) {
				return true;
			}
		}
		if (this.anInt1668 != -1) {
			local41 = Static139.aClass193_1.method4650(this.anInt1668).method6259(0, null, 131072, this.anInt1675, -1, arg2, null, 0);
			if (local41 != null && local41.method6070(arg1, arg0, local16, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
	}
}
