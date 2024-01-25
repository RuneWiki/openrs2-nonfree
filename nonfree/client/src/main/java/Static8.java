import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "[Lclient!nfa;")
	public static Class15_Sub3[] aClass15_Sub3Array1;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_1 = new Class146(8, 0, 4, 1);

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
	public static int anInt147 = 0;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(II)I")
	public static int method135(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BIII)I")
	public static int method136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static95.anInt1689 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static331.anInt10589;
		@Pc(30) int local30 = arg0 - Static331.anInt10590;
		for (@Pc(35) Class2_Sub33 local35 = (Class2_Sub33) Static331.aClass271_65.method7177(); local35 != null; local35 = (Class2_Sub33) Static331.aClass271_65.method7175()) {
			if (arg1 == local35.anInt5215) {
				@Pc(48) int local48 = local35.anInt5213;
				@Pc(51) int local51 = local35.anInt5210;
				@Pc(63) int local63 = local51 + Static331.anInt10590 | local48 - -Static331.anInt10589 << 14;
				@Pc(83) int local83 = (local30 - local51) * (-local51 + local30) + (local21 - local48) * (-local48 + local21);
				if (local14 < 0 || local16 > local83) {
					local14 = local63;
					local16 = local83;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Z)Lclient!mha;")
	public static Class234_Sub1 method137() {
		Static461.anInt8252 = 0;
		return Static525.method8174();
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)[Lclient!bn;")
	public static Class37[] method138() {
		return new Class37[] { Static314.aClass37_6, Static612.aClass37_10, Static415.aClass37_3, Static188.aClass37_8, Static466.aClass37_9, Static357.aClass37_7 };
	}
}
