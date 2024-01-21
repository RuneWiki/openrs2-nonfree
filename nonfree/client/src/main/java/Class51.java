import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class51 {

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "[I")
	private final int[] anIntArray223;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[I")
	private final int[] anIntArray222;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!cf;")
	private final Class3_Sub1 aClass3_Sub1_2;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "Lclient!cf;")
	private final Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "[Lclient!cf;")
	private final Class3_Sub1[] aClass3_Sub1Array20;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class51() {
		this.anIntArray223 = new int[0];
		this.anIntArray222 = new int[0];
		this.aClass3_Sub1_2 = new Class3_Sub1_Sub4();
		this.aClass3_Sub1_1 = new Class3_Sub1_Sub4();
		this.aClass3_Sub1Array20 = new Class3_Sub1[] { this.aClass3_Sub1_2, this.aClass3_Sub1_1 };
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class51(@OriginalArg(0) Class3_Sub4 arg0) {
		@Pc(7) int local7 = arg0.method191();
		@Pc(10) int[][] local10 = new int[local7][];
		@Pc(15) Class54 local15 = new Class54(64);
		@Pc(20) Class54 local20 = new Class54(64);
		@Pc(25) Class54 local25 = new Class54(64);
		this.aClass3_Sub1Array20 = new Class3_Sub1[local7];
		@Pc(45) int local45;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (@Pc(31) int local31 = 0; local31 < local7; local31++) {
			@Pc(37) Class3_Sub1 local37 = Static112.method1845(arg0);
			@Pc(41) int local41 = local37.method2910();
			local45 = local37.method2915();
			if (local41 >= 0 && local41 >= 0 && local20.method1602((long) local41) == null) {
				local20.method1603((long) local41, new Class3_Sub25(local41));
			}
			if (local45 >= 0 && local45 >= 0 && local25.method1602((long) local45) == null) {
				local25.method1603((long) local45, new Class3_Sub25(local45));
			}
			local100 = local37.aClass3_Sub1Array40.length;
			local10[local31] = new int[local100];
			for (local107 = 0; local107 < local100; local107++) {
				local10[local31][local107] = arg0.method191();
			}
			local15.method1603((long) local37.anInt3998, local37);
			this.aClass3_Sub1Array20[local31] = local37;
		}
		for (@Pc(143) int local143 = 0; local143 < local7; local143++) {
			@Pc(150) Class3_Sub1 local150 = this.aClass3_Sub1Array20[local143];
			local45 = local150.aClass3_Sub1Array40.length;
			for (local100 = 0; local100 < local45; local100++) {
				@Pc(169) Class3_Sub1 local169 = (Class3_Sub1) local15.method1602((long) local10[local143][local100]);
				local150.aClass3_Sub1Array40[local100] = local169;
			}
			local10[local143] = null;
		}
		this.aClass3_Sub1_2 = (Class3_Sub1) local15.method1602((long) arg0.method191());
		this.aClass3_Sub1_1 = (Class3_Sub1) local15.method1602((long) arg0.method191());
		this.anIntArray223 = new int[local20.method1599()];
		this.anIntArray222 = new int[local25.method1599()];
		@Pc(231) Class3[] local231 = new Class3[local20.method1599()];
		@Pc(236) Class3[] local236 = new Class3[local25.method1599()];
		local20.method1608(local231);
		local25.method1608(local236);
		for (local100 = 0; local100 < local231.length; local100++) {
			this.anIntArray223[local100] = ((Class3_Sub25) local231[local100]).anInt3833;
		}
		for (local107 = 0; local107 < local236.length; local107++) {
			this.anIntArray222[local107] = ((Class3_Sub25) local236[local107]).anInt3833;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!jg;Lclient!rh;)Z")
	public boolean method1477(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Interface3 arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray223.length; local12++) {
			if (!arg0.method1621(this.anIntArray223[local12])) {
				return false;
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.anIntArray222.length; local32++) {
			if (!arg1.method2822(this.anIntArray222[local32])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!jg;ILclient!rh;ZIID)[I")
	public int[] method1480(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) double arg5) {
		@Pc(6) int[] local6 = new int[arg1 * arg4];
		Static141.aClass44_26 = arg0;
		Static136.anInterface3_2 = arg2;
		Static155.method2521(arg4, arg1);
		for (@Pc(20) int local20 = 0; local20 < this.aClass3_Sub1Array20.length; local20++) {
			this.aClass3_Sub1Array20[local20].method2909(arg1, arg4);
		}
		@Pc(38) int local38 = 0;
		@Pc(46) int local46;
		@Pc(42) int local42;
		@Pc(48) byte local48;
		if (arg3) {
			local42 = -1;
			local46 = arg4 - 1;
			local48 = -1;
		} else {
			local42 = arg4;
			local48 = 1;
			local46 = 0;
		}
		for (@Pc(58) int local58 = 0; local58 < arg1; local58++) {
			@Pc(74) int[] local74;
			@Pc(78) int[] local78;
			@Pc(82) int[] local82;
			if (this.aClass3_Sub1_2.aBoolean171) {
				@Pc(90) int[] local90 = this.aClass3_Sub1_2.method2911(local58);
				local82 = local90;
				local78 = local90;
				local74 = local90;
			} else {
				@Pc(70) int[][] local70 = this.aClass3_Sub1_2.method2914(local58);
				local74 = local70[0];
				local78 = local70[1];
				local82 = local70[2];
			}
			for (@Pc(98) int local98 = local46; local98 != local42; local98 += local48) {
				@Pc(109) double local109 = Math.pow((double) local74[local98] / 4096.0D, arg5);
				@Pc(114) int local114 = (int) (local109 * 256.0D);
				if (local114 > 255) {
					local114 = 255;
				}
				if (local114 < 0) {
					local114 = 0;
				}
				@Pc(137) double local137 = Math.pow((double) local78[local98] / 4096.0D, arg5);
				@Pc(142) int local142 = (int) (local137 * 256.0D);
				if (local142 > 255) {
					local142 = 255;
				}
				@Pc(156) double local156 = Math.pow((double) local82[local98] / 4096.0D, arg5);
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(168) int local168 = (int) (local156 * 256.0D);
				if (local168 > 255) {
					local168 = 255;
				}
				if (local168 < 0) {
					local168 = 0;
				}
				local6[local38++] = (local142 << 8) + (local114 << 16) + local168;
			}
		}
		for (@Pc(208) int local208 = 0; local208 < this.aClass3_Sub1Array20.length; local208++) {
			this.aClass3_Sub1Array20[local208].method2905();
		}
		return local6;
	}
}
