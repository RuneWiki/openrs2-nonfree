import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "[I")
	public static int[] anIntArray450 = new int[99];

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "[Lclient!mc;")
	public final Class50[] aClass50Array1;

	static {
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 99; local19++) {
			@Pc(24) int local24 = local19 + 1;
			@Pc(37) int local37 = (int) ((double) local24 + Math.pow(2.0D, (double) local24 / 7.0D) * 300.0D);
			local17 += local37;
			anIntArray450[local19] = local17 / 4;
		}
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!ah;Lclient!ah;IZ)V")
	public Class3_Sub2_Sub13(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class23 local5 = new Class23();
		@Pc(10) int local10 = arg0.method1022(arg2);
		this.aClass50Array1 = new Class50[local10];
		@Pc(19) int[] local19 = arg0.method1015(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(24) Class3_Sub23 local24 = null;
			@Pc(32) byte[] local32 = arg0.method1021(arg2, local19[local21]);
			@Pc(46) int local46 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
			for (@Pc(51) Class3_Sub23 local51 = (Class3_Sub23) local5.method858(); local51 != null; local51 = (Class3_Sub23) local5.method861()) {
				if (local46 == local51.anInt3978) {
					local24 = local51;
					break;
				}
			}
			if (local24 == null) {
				@Pc(87) byte[] local87 = arg1.method1011(0, local46);
				local24 = new Class3_Sub23(local46, local87);
				local5.method850(local24);
			}
			this.aClass50Array1[local19[local21]] = new Class50(local32, local24);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)Z")
	public boolean method2093(@OriginalArg(1) int arg0) {
		return this.aClass50Array1[arg0].aBoolean132;
	}
}
