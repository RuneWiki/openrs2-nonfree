import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!kca", name = "z", descriptor = "Lclient!la;")
	public static Class205 aClass205_3;

	@OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
	public static int anInt6295;

	@OriginalMember(owner = "client!kca", name = "F", descriptor = "I")
	public static int anInt6298;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)Lclient!bt;")
	public static Class43 method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass43_4;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)I")
	public static int method5214(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
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

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(BII)Z")
	public static boolean method5215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static535.method7641(arg1, arg0) | (arg0 & 0x70000) != 0 || Static70.method1361(arg1, arg0);
	}
}
