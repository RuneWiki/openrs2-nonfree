import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	public static int anInt1345;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	public static int anInt1344 = 0;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	public static int anInt1347 = 0;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "S")
	public static short aShort17 = 1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)Lclient!m;")
	public static Class100 method1126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) long local31 = (long) arg1 & 0xFFFFL | ((long) arg0 & 0xFFFFL) << 32 | ((long) arg2 & 0xFFFFL) << 48 | ((long) arg3 & 0xFFFFL) << 16;
		@Pc(37) Class100 local37 = (Class100) Static258.aClass135_35.method3316(local31);
		if (local37 != null) {
			return local37;
		}
		@Pc(44) Class136[] local44 = null;
		@Pc(48) Class146 local48 = Static113.method2072(arg1);
		if (local48.anIntArray402 != null) {
			local44 = new Class136[local48.anIntArray402.length];
			for (@Pc(59) int local59 = 0; local59 < local44.length; local59++) {
				@Pc(70) Class27 local70 = Static60.method1067(local48.anIntArray402[local59]);
				local44[local59] = new Class136(local70.anInt1022, local70.anInt1026, local70.anInt1019, local70.anInt1021, local70.anInt1016, local70.anInt1027, local70.anInt1018, local70.aBoolean73);
			}
		}
		local37 = new Class100(local48.anInt4518, local44, local48.anInt4516, arg2, arg0, arg3);
		Static258.aClass135_35.method3321(local31, local37);
		return local37;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!wa;Lclient!cg;I)V")
	public static void method1128(@OriginalArg(0) int arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class1_Sub11 arg2) {
		@Pc(5) Class1_Sub23 local5 = new Class1_Sub23();
		local5.anInt3628 = arg2.method2690();
		local5.anInt3629 = arg2.method2643();
		local5.aByteArrayArrayArray19 = new byte[local5.anInt3628][][];
		local5.anIntArray322 = new int[local5.anInt3628];
		local5.aClass116Array2 = new Class116[local5.anInt3628];
		local5.anIntArray324 = new int[local5.anInt3628];
		local5.aClass116Array1 = new Class116[local5.anInt3628];
		local5.anIntArray325 = new int[local5.anInt3628];
		for (@Pc(61) int local61 = 0; local61 < local5.anInt3628; local61++) {
			try {
				@Pc(69) int local69 = arg2.method2690();
				@Pc(95) String local95;
				@Pc(99) String local99;
				@Pc(103) int local103;
				if (local69 == 0 || local69 == 1 || local69 == 2) {
					local95 = arg2.method2629();
					local99 = arg2.method2629();
					local103 = 0;
					if (local69 == 1) {
						local103 = arg2.method2643();
					}
					local5.anIntArray325[local61] = local69;
					local5.anIntArray324[local61] = local103;
					local5.aClass116Array1[local61] = arg1.method4323(local99, Static112.method2056(local95));
				} else if (local69 == 3 || local69 == 4) {
					local95 = arg2.method2629();
					local99 = arg2.method2629();
					local103 = arg2.method2690();
					@Pc(106) String[] local106 = new String[local103];
					for (@Pc(108) int local108 = 0; local108 < local103; local108++) {
						local106[local108] = arg2.method2629();
					}
					@Pc(123) byte[][] local123 = new byte[local103][];
					@Pc(136) int local136;
					if (local69 == 3) {
						for (@Pc(129) int local129 = 0; local129 < local103; local129++) {
							local136 = arg2.method2643();
							local123[local129] = new byte[local136];
							arg2.method2678(local123[local129], local136);
						}
					}
					local5.anIntArray325[local61] = local69;
					@Pc(160) Class[] local160 = new Class[local103];
					for (local136 = 0; local136 < local103; local136++) {
						local160[local136] = Static112.method2056(local106[local136]);
					}
					local5.aClass116Array2[local61] = arg1.method4322(local160, Static112.method2056(local95), local99);
					local5.aByteArrayArrayArray19[local61] = local123;
				}
			} catch (@Pc(241) ClassNotFoundException local241) {
				local5.anIntArray322[local61] = -1;
			} catch (@Pc(248) SecurityException local248) {
				local5.anIntArray322[local61] = -2;
			} catch (@Pc(255) NullPointerException local255) {
				local5.anIntArray322[local61] = -3;
			} catch (@Pc(262) Exception local262) {
				local5.anIntArray322[local61] = -4;
			} catch (@Pc(269) Throwable local269) {
				local5.anIntArray322[local61] = -5;
			}
		}
		Static225.aClass61_25.method1839(local5);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1130(@OriginalArg(1) String arg0) {
		return Static295.method4414(arg0);
	}
}
