import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "J")
	public static long aLong77 = 0L;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public static int anInt2143 = 0;

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "[I")
	public static final int[] anIntArray194 = new int[2048];

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI[B)V")
	public static void method1812(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static315.aClass2_Sub34_14 == null) {
			Static315.aClass2_Sub34_14 = new Class2_Sub34(20000);
		}
		Static315.aClass2_Sub34_14.method6914(0, arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static266.method4305(Static315.aClass2_Sub34_14.aByteArray77);
		Static339.aClass202_Sub1Array1 = new Class202_Sub1[Static231.anInt4666];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static191.anInt6072; local33 <= Static619.anInt10078; local33++) {
			@Pc(39) Class202_Sub1 local39 = Static619.method8431(local33);
			if (local39 != null) {
				Static339.aClass202_Sub1Array1[local31++] = local39;
			}
		}
		Static343.aBoolean474 = false;
		Static602.aLong266 = Static438.method6517();
		Static315.aClass2_Sub34_14 = null;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZIII)I")
	public static int method1816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 >= arg2) {
			return arg1 > arg0 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}
}
