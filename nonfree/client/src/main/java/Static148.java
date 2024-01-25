import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "[Lclient!s;")
	public static Class245[] aClass245Array1;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
	public static int anInt3475;

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "[I")
	public static final int[] anIntArray154 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "[I")
	public static final int[] anIntArray155 = new int[32];

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILclient!jn;Lclient!jn;)V")
	public static void method2948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub4_Sub5 arg3, @OriginalArg(4) Class9_Sub4_Sub5 arg4) {
		@Pc(4) Class186 local4 = Static180.method3388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub4_Sub5_1 = arg3;
		local4.aClass9_Sub4_Sub5_2 = arg4;
		@Pc(19) int local19 = aClass245Array1 == Static152.aClass245Array3 ? 1 : 0;
		if (!arg3.method8413()) {
			arg3.aClass9_Sub4_23 = Static249.aClass9_Sub4Array4[local19];
			Static249.aClass9_Sub4Array4[local19] = arg3;
		} else if (arg3.method8422()) {
			arg3.aClass9_Sub4_23 = Static611.aClass9_Sub4Array5[local19];
			Static611.aClass9_Sub4Array5[local19] = arg3;
		} else {
			arg3.aClass9_Sub4_23 = Static645.aClass9_Sub4Array6[local19];
			Static645.aClass9_Sub4Array6[local19] = arg3;
			Static610.aBoolean810 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8413()) {
			if (arg4.method8422()) {
				arg4.aClass9_Sub4_23 = Static611.aClass9_Sub4Array5[local19];
				Static611.aClass9_Sub4Array5[local19] = arg4;
				return;
			}
			arg4.aClass9_Sub4_23 = Static645.aClass9_Sub4Array6[local19];
			Static645.aClass9_Sub4Array6[local19] = arg4;
			Static610.aBoolean810 = true;
			return;
		}
		arg4.aClass9_Sub4_23 = Static249.aClass9_Sub4Array4[local19];
		Static249.aClass9_Sub4Array4[local19] = arg4;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
	public static void method2949() {
		@Pc(11) Class360 local11 = null;
		try {
			@Pc(17) Class159 local17 = Static496.aClass104_4.method3144("2");
			while (local17.anInt5910 == 0) {
				Static344.method5698(1L);
			}
			if (local17.anInt5910 == 1) {
				local11 = (Class360) local17.anObject13;
				@Pc(42) byte[] local42 = new byte[(int) local11.method8357()];
				@Pc(57) int local57;
				for (@Pc(44) int local44 = 0; local44 < local42.length; local44 += local57) {
					local57 = local11.method8358(local42.length - local44, local44, local42);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static64.method8771(new Class6_Sub8(local42));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local11 != null) {
				local11.method8359();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}
}
