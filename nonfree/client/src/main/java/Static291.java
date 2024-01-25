import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public static int anInt5067;

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "Lclient!rt;")
	public static final Class312 aClass312_3 = new Class312();

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public static int anInt5066 = 0;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)I")
	public static int method4315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static127.anIntArrayArray14 == null ? 0 : Static127.anIntArrayArray14[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)I")
	public static int method4317() {
		if (Static370.aClass73_22 == null) {
			if (!Static526.aBoolean669 && Static133.aClass5_Sub5_Sub19_2 != null) {
				return Static133.aClass5_Sub5_Sub19_2.anInt9211;
			}
			@Pc(19) int local19 = Static205.aClass107_1.method4079();
			@Pc(23) int local23 = Static205.aClass107_1.method4072();
			@Pc(47) int local47;
			@Pc(49) int local49;
			@Pc(67) int local67;
			@Pc(144) Class5_Sub5_Sub19 local144;
			if (Static320.aBoolean437) {
				@Pc(304) Class390 local304;
				if (local19 > Static327.anInt5831 && Static498.anInt8306 + Static327.anInt5831 > local19) {
					local47 = -1;
					for (local49 = 0; local49 < Static220.anInt3580; local49++) {
						if (Static519.aBoolean664) {
							local67 = local49 * 16 + Static507.anInt8693 + 33;
							if (local67 - 13 < local23 && local23 <= local67 + 3) {
								local47 = local49;
							}
						} else {
							local67 = local49 * 16 + Static507.anInt8693 + 31;
							if (local67 - 13 < local23 && local23 <= local67 + 3) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local67 = 0;
						local304 = new Class390(Static86.aClass149_5);
						for (@Pc(423) Class5_Sub5_Sub18 local423 = (Class5_Sub5_Sub18) local304.method9272(); local423 != null; local423 = (Class5_Sub5_Sub18) local304.method9270()) {
							if (local47 == local67++) {
								return ((Class5_Sub5_Sub19) local423.aClass149_8.aClass5_Sub5_24.aClass5_Sub5_66).anInt9211;
							}
						}
					}
				} else if (Static604.aClass5_Sub5_Sub18_1 != null && Static652.anInt10541 < local19 && local19 < Static652.anInt10541 + Static493.anInt8236) {
					local47 = -1;
					for (local49 = 0; local49 < Static604.aClass5_Sub5_Sub18_1.anInt7610; local49++) {
						if (Static519.aBoolean664) {
							local67 = local49 * 16 + Static422.anInt7304 + 33;
							if (local67 - 13 < local23 && local23 <= local67 + 3) {
								local47 = local49;
							}
						} else {
							local67 = local49 * 16 + Static422.anInt7304 + 31;
							if (local67 - 13 < local23 && local23 <= local67 + 3) {
								local47 = local49;
							}
						}
					}
					if (local47 != -1) {
						local67 = 0;
						local304 = new Class390(Static604.aClass5_Sub5_Sub18_1.aClass149_8);
						for (local144 = (Class5_Sub5_Sub19) local304.method9272(); local144 != null; local144 = (Class5_Sub5_Sub19) local304.method9270()) {
							if (local47 == local67++) {
								return local144.anInt9211;
							}
						}
					}
				}
			} else if (Static327.anInt5831 < local19 && Static327.anInt5831 + Static498.anInt8306 > local19) {
				local47 = -1;
				for (local49 = 0; local49 < Static481.anInt8130; local49++) {
					if (Static519.aBoolean664) {
						local67 = Static507.anInt8693 + (Static481.anInt8130 - 1 + -local49) * 16 + 33;
						if (local67 - 13 < local23 && local23 <= local67 + 3) {
							local47 = local49;
						}
					} else {
						local67 = (Static481.anInt8130 - local49 - 1) * 16 + Static507.anInt8693 + 31;
						if (local23 > local67 - 13 && local67 + 3 >= local23) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local67 = 0;
					@Pc(139) Class238 local139 = new Class238(Static199.aClass102_63);
					for (local144 = (Class5_Sub5_Sub19) local139.method5463(); local144 != null; local144 = (Class5_Sub5_Sub19) local139.method5466()) {
						if (local47 == local67++) {
							return local144.anInt9211;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!ha;II)Lclient!fs;")
	public static Class134 method4318(@OriginalArg(0) Class57 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class5_Sub9 local17 = (Class5_Sub9) Static134.aClass291_12.method6993((long) arg1, 1);
		if (local17 != null) {
			@Pc(24) Class5_Sub12_Sub3 local24 = local17.aClass272_Sub1_1.method6472();
			local17.aBoolean142 = true;
			if (local24 != null) {
				return local24.method8026(arg0);
			}
		}
		return null;
	}
}
