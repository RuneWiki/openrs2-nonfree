import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "[Lclient!la;")
	public final Class51[] aClass51Array1;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!sd;Lclient!sd;IZ)V")
	public Class1_Sub2_Sub22(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class91 local5 = new Class91();
		@Pc(10) int local10 = arg0.method2342(arg2);
		this.aClass51Array1 = new Class51[local10];
		@Pc(19) int[] local19 = arg0.method2320(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method2340(local19[local21], arg2);
			@Pc(32) Class1_Sub22 local32 = null;
			@Pc(46) int local46 = (local30[0] & 0xFF) << 8 | local30[1] & 0xFF;
			for (@Pc(51) Class1_Sub22 local51 = (Class1_Sub22) local5.method3148(); local51 != null; local51 = (Class1_Sub22) local5.method3150()) {
				if (local51.anInt3516 == local46) {
					local32 = local51;
					break;
				}
			}
			if (local32 == null) {
				@Pc(83) byte[] local83 = arg1.method2336(0, local46);
				local32 = new Class1_Sub22(local46, local83);
				local5.method3151(local32);
			}
			this.aClass51Array1[local19[local21]] = new Class51(local30, local32);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(II)Z")
	public boolean method2892(@OriginalArg(1) int arg0) {
		return this.aClass51Array1[arg0].aBoolean103;
	}
}
