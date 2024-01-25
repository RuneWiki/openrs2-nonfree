import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	public static int anInt1887 = 0;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([BIBIIIII[B)V")
	public static void method1814(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(24) int local24 = -(arg4 & 0x3);
		for (@Pc(27) int local27 = -arg5; local27 < 0; local27++) {
			@Pc(35) int local35;
			for (@Pc(31) int local31 = local10; local31 < 0; local31++) {
				local35 = arg1++;
				arg0[local35] = (byte) (arg0[local35] - arg7[arg3++]);
				@Pc(48) int local48 = arg1++;
				arg0[local48] = (byte) (arg0[local48] - arg7[arg3++]);
				@Pc(61) int local61 = arg1++;
				arg0[local61] = (byte) (arg0[local61] - arg7[arg3++]);
				@Pc(74) int local74 = arg1++;
				arg0[local74] = (byte) (arg0[local74] - arg7[arg3++]);
			}
			for (@Pc(90) int local90 = local24; local90 < 0; local90++) {
				local35 = arg1++;
				arg0[local35] = (byte) (arg0[local35] - arg7[arg3++]);
			}
			arg1 += arg6;
			arg3 += arg2;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
	public static void method1816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(4, arg0);
		local8.method6693();
		local8.anInt7482 = arg2;
		local8.anInt7487 = arg1;
		local8.anInt7491 = arg3;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Lclient!rs;")
	public static Class1_Sub2_Sub16 method1817() {
		@Pc(8) Class1_Sub2_Sub16 local8 = (Class1_Sub2_Sub16) Static22.aClass259_1.method6652();
		if (local8 != null) {
			local8.method8239();
			local8.method7390();
			return local8;
		}
		@Pc(31) Class1_Sub2_Sub16 local31;
		do {
			local31 = (Class1_Sub2_Sub16) Static412.aClass259_9.method6652();
			if (local31 == null) {
				return null;
			}
			if (local31.method6702() > Static110.method2222()) {
				return null;
			}
			local31.method8239();
			local31.method7390();
		} while ((Long.MIN_VALUE & local31.aLong228) == 0L);
		return local31;
	}
}
