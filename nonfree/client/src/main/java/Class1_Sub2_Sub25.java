import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "[Lclient!b;")
	public final Class8[] aClass8Array1;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!ve;Lclient!ve;IZ)V")
	public Class1_Sub2_Sub25(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class87 local5 = new Class87();
		@Pc(10) int local10 = arg0.method2216(arg2);
		this.aClass8Array1 = new Class8[local10];
		@Pc(19) int[] local19 = arg0.method2225(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method2208(arg2, local19[local21]);
			@Pc(32) Class1_Sub17 local32 = null;
			@Pc(46) int local46 = local30[1] & 0xFF | (local30[0] & 0xFF) << 8;
			for (@Pc(51) Class1_Sub17 local51 = (Class1_Sub17) local5.method2827(); local51 != null; local51 = (Class1_Sub17) local5.method2830()) {
				if (local51.anInt2782 == local46) {
					local32 = local51;
					break;
				}
			}
			if (local32 == null) {
				@Pc(83) byte[] local83 = arg1.method2204(0, local46);
				local32 = new Class1_Sub17(local46, local83);
				local5.method2823(local32);
			}
			this.aClass8Array1[local19[local21]] = new Class8(local30, local32);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Z")
	public boolean method3560(@OriginalArg(0) int arg0) {
		return this.aClass8Array1[arg0].aBoolean12;
	}
}
