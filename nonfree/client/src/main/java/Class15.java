import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class15 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
	private final int[] anIntArray122;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "[I")
	private final int[] anIntArray123;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "Lclient!df;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Lclient!df;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "[Lclient!df;")
	private final Class1_Sub1[] aClass1_Sub1Array8;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class15() {
		this.anIntArray122 = new int[0];
		this.anIntArray123 = new int[0];
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub6();
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub6();
		this.aClass1_Sub1Array8 = new Class1_Sub1[] { this.aClass1_Sub1_1, this.aClass1_Sub1_2 };
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class15(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method1607();
		@Pc(10) int[][] local10 = new int[local7][];
		@Pc(15) Class45 local15 = new Class45(64);
		@Pc(20) Class45 local20 = new Class45(64);
		@Pc(25) Class45 local25 = new Class45(64);
		this.aClass1_Sub1Array8 = new Class1_Sub1[local7];
		@Pc(45) int local45;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class1_Sub1 local37 = Static163.method2795(arg0);
			@Pc(41) int local41 = local37.method3007();
			local45 = local37.method3005();
			if (local41 >= 0 && local41 >= 0 && local20.method1988((long) local41) == null) {
				local20.method1981(new Class1_Sub6(local41), (long) local41);
			}
			if (local45 >= 0 && local45 >= 0 && local25.method1988((long) local45) == null) {
				local25.method1981(new Class1_Sub6(local45), (long) local45);
			}
			local100 = local37.aClass1_Sub1Array42.length;
			local10[local31] = new int[local100];
			for (local107 = 0; local107 < local100; local107++) {
				local10[local31][local107] = arg0.method1607();
			}
			local15.method1981(local37, (long) local37.anInt4096);
			this.aClass1_Sub1Array8[local31] = local37;
		}
		for (@Pc(143) int local143 = 0; local143 < local7; local143++) {
			@Pc(150) Class1_Sub1 local150 = this.aClass1_Sub1Array8[local143];
			local45 = local150.aClass1_Sub1Array42.length;
			for (local100 = 0; local100 < local45; local100++) {
				@Pc(169) Class1_Sub1 local169 = (Class1_Sub1) local15.method1988((long) local10[local143][local100]);
				local150.aClass1_Sub1Array42[local100] = local169;
			}
			local10[local143] = null;
		}
		this.aClass1_Sub1_1 = (Class1_Sub1) local15.method1988((long) arg0.method1607());
		this.aClass1_Sub1_2 = (Class1_Sub1) local15.method1988((long) arg0.method1607());
		this.anIntArray122 = new int[local20.method1984()];
		this.anIntArray123 = new int[local25.method1984()];
		@Pc(227) Class1[] local227 = new Class1[local20.method1984()];
		@Pc(232) Class1[] local232 = new Class1[local25.method1984()];
		local20.method1985(local227);
		local25.method1985(local232);
		for (local100 = 0; local100 < local227.length; local100++) {
			this.anIntArray122[local100] = ((Class1_Sub6) local227[local100]).anInt423;
		}
		for (local107 = 0; local107 < local232.length; local107++) {
			this.anIntArray123[local107] = ((Class1_Sub6) local232[local107]).anInt423;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ag;IIDZLclient!ph;I)[I")
	public int[] method958(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) double arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5) {
		Static111.method2158(arg2);
		Static59.anInterface3_2 = arg4;
		Static123.aClass4_77 = arg0;
		Static3.method73(arg1, arg5);
		@Pc(23) int[] local23 = new int[arg5 * arg1];
		for (@Pc(25) int local25 = 0; local25 < this.aClass1_Sub1Array8.length; local25++) {
			this.aClass1_Sub1Array8[local25].method3015(arg1, arg5);
		}
		@Pc(49) int local49;
		@Pc(45) int local45;
		@Pc(51) byte local51;
		if (arg3) {
			local45 = -1;
			local49 = arg1 - 1;
			local51 = -1;
		} else {
			local51 = 1;
			local49 = 0;
			local45 = arg1;
		}
		@Pc(61) int local61 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg5; local70++) {
			@Pc(92) int[] local92;
			@Pc(96) int[] local96;
			@Pc(88) int[] local88;
			if (this.aClass1_Sub1_1.aBoolean319) {
				@Pc(104) int[] local104 = this.aClass1_Sub1_1.method3008(local70);
				local96 = local104;
				local92 = local104;
				local88 = local104;
			} else {
				@Pc(84) int[][] local84 = this.aClass1_Sub1_1.method3006(local70);
				local88 = local84[2];
				local92 = local84[0];
				local96 = local84[1];
			}
			for (@Pc(112) int local112 = local49; local112 != local45; local112 += local51) {
				@Pc(120) int local120 = local92[local112] >> 4;
				@Pc(126) int local126 = local96[local112] >> 4;
				if (local126 > 255) {
					local126 = 255;
				}
				if (local120 > 255) {
					local120 = 255;
				}
				@Pc(142) int local142 = local88[local112] >> 4;
				if (local126 < 0) {
					local126 = 0;
				}
				if (local142 > 255) {
					local142 = 255;
				}
				if (local120 < 0) {
					local120 = 0;
				}
				local120 = Static12.anIntArray50[local120];
				local126 = Static12.anIntArray50[local126];
				if (local142 < 0) {
					local142 = 0;
				}
				local142 = Static12.anIntArray50[local142];
				local23[local61++] = local142 + (local126 << 8) + (local120 << 16);
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.aClass1_Sub1Array8.length; local203++) {
			this.aClass1_Sub1Array8[local203].method3010();
		}
		return local23;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ag;ILclient!ph;)Z")
	public boolean method959(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Interface3 arg1) {
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray122.length; local14++) {
			if (!arg0.method2244(this.anIntArray122[local14])) {
				return false;
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.anIntArray123.length; local38++) {
			if (!arg1.method2047(this.anIntArray123[local38])) {
				return false;
			}
		}
		return true;
	}
}
