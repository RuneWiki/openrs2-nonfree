import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "[Lclient!jg;")
	public static final Class128[] aClass128Array1 = new Class128[5];

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public int anInt6623;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	public int anInt6624;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	public int anInt6626;

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public int anInt6629;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	public int anInt6625 = -1;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public int anInt6632 = -1;

	static {
		for (@Pc(10) int local10 = 0; local10 < aClass128Array1.length; local10++) {
			aClass128Array1[local10] = new Class128();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class132 local6 = arg0.method3564();
		local6.method3986(super.anInt6619, super.anInt6620, super.anInt6618);
		@Pc(36) Class39 local36 = Static354.aClass170_2.method3865(this.anInt6623).method771(131072, null, null, -1, arg0, 0, this.anInt6629, 0);
		if (local36 != null && local36.method4888(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt6632 != -1) {
			local36 = Static354.aClass170_2.method3865(this.anInt6632).method771(131072, null, null, -1, arg0, 0, this.anInt6626, 0);
			if (local36 != null && local36.method4888(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt6625 != -1) {
			local36 = Static354.aClass170_2.method3865(this.anInt6625).method771(131072, null, null, -1, arg0, 0, this.anInt6624, 0);
			if (local36 != null && local36.method4888(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		@Pc(6) Class132 local6 = arg0.method3564();
		local6.method3986(super.anInt6619, super.anInt6620, super.anInt6618);
		@Pc(18) Class48_Sub6 local18 = Static403.method5489(3);
		@Pc(40) Class39 local40;
		if (this.anInt6625 != -1) {
			local40 = Static354.aClass170_2.method3865(this.anInt6625).method771(2048, null, null, -1, arg0, 0, this.anInt6624, 0);
			if (local40 != null) {
				local40.method4910(local6, local18.aClass48_Sub7Array1[2], 0);
			}
		}
		if (this.anInt6632 != -1) {
			local40 = Static354.aClass170_2.method3865(this.anInt6632).method771(2048, null, null, -1, arg0, 0, this.anInt6626, 0);
			if (local40 != null) {
				local40.method4910(local6, local18.aClass48_Sub7Array1[1], 0);
			}
		}
		local40 = Static354.aClass170_2.method3865(this.anInt6623).method771(2048, null, null, -1, arg0, 0, this.anInt6629, 0);
		if (local40 != null) {
			local40.method4910(local6, local18.aClass48_Sub7Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
	}
}
