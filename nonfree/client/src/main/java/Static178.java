import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public static int anInt3780;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	public static int anInt3781;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "[B")
	public static final byte[] aByteArray43 = new byte[2048];

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_9 = new Class284(7, 4);

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "Lclient!db;")
	public static final Class64 aClass64_154 = new Class64(99, -2);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIII)V")
	public static void method3349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static189.aClass4_Sub2_Sub1_1.anInt9295 * arg0 >> 8;
		if (arg1 == -1 && !Static327.aBoolean615) {
			Static459.method6461();
		} else if (arg1 != -1 && (arg1 != Static416.anInt7187 || !Static295.method4625()) && local6 != 0 && !Static327.aBoolean615) {
			Static318.method4857(arg2, Static291.aClass31_66, local6, arg1);
		}
		Static416.anInt7187 = arg1;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILclient!l;Lclient!l;)V")
	public static void method3351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub4 arg3, @OriginalArg(4) Class10_Sub4 arg4) {
		@Pc(4) Class100 local4 = Static279.method4433(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass10_Sub4_1 = arg3;
			local4.aClass10_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V")
	public static void method3352(@OriginalArg(1) File arg0, @OriginalArg(2) String arg1) {
		Static524.aHashtable7.put(arg1, arg0);
	}
}
