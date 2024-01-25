import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_87 = new Class337(7, 3);

	@OriginalMember(owner = "client!jl", name = "Lb", descriptor = "I")
	public static int anInt4785 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/io/File;B)V")
	public static void method4268(@OriginalArg(1) File arg0) {
		if (Static427.anObject19 == null) {
			Static447.method6738();
		}
		try {
			@Pc(14) Class local14 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(35) Method local35 = local14.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local35.invoke(Static427.anObject19, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(55) Exception local55) {
			System.out.println("HeapDump error:");
			local55.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)I")
	public static int method4269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) byte local20;
		if (arg1 > 20000) {
			local20 = 4;
			Static111.method1715();
		} else if (arg1 > 10000) {
			Static459.method6830();
			local20 = 3;
		} else if (arg1 > 5000) {
			Static339.method5106();
			local20 = 2;
		} else {
			local20 = 1;
			Static178.method2715();
		}
		if (arg0 != Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988()) {
			Static97.aClass5_Sub25_8.method3683(arg0, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
			Static638.method9004(arg0, false);
		}
		Static273.method4418();
		return local20;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!sr;)[I")
	public static int[] method4273(@OriginalArg(1) Class5_Sub48 arg0) {
		@Pc(10) Class5_Sub22 local10 = new Class5_Sub22(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method5905(10);
		local10.method5949(local13[0]);
		local10.method5949(local13[1]);
		local10.method5949(local13[2]);
		local10.method5949(local13[3]);
		for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
			local10.method5949((int) (Math.random() * 9.9999999E7D));
		}
		local10.method5918((int) (Math.random() * 9.9999999E7D));
		local10.method5955(Static227.aBigInteger4, Static170.aBigInteger2);
		arg0.aClass5_Sub22_Sub1_2.method5925(local10.aByteArray71, 0, local10.anInt6629);
		return local13;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	public static void method4274() {
		Static348.aClass155_3 = Static348.aClass155_2;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
	public static void method4283() {
		@Pc(5) Class87 local5 = Static295.aClass87_129;
		synchronized (Static295.aClass87_129) {
			Static295.aClass87_129.method1801();
		}
	}
}
