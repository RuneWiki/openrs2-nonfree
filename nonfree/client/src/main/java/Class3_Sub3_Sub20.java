import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class3_Sub3_Sub20 extends Class3_Sub3 {

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "[Lclient!rb;")
	public final Class81[] aClass81Array1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!ke;Lclient!ke;IZ)V")
	public Class3_Sub3_Sub20(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class10 local5 = new Class10();
		@Pc(10) int local10 = arg0.method1575(arg2);
		this.aClass81Array1 = new Class81[local10];
		@Pc(19) int[] local19 = arg0.method1553(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method1581(arg2, local19[local21]);
			@Pc(32) Class3_Sub12 local32 = null;
			@Pc(46) int local46 = (local30[0] & 0xFF) << 8 | local30[1] & 0xFF;
			for (@Pc(51) Class3_Sub12 local51 = (Class3_Sub12) local5.method267(); local51 != null; local51 = (Class3_Sub12) local5.method268()) {
				if (local46 == local51.anInt1664) {
					local32 = local51;
					break;
				}
			}
			if (local32 == null) {
				@Pc(83) byte[] local83 = arg1.method1568(0, local46);
				local32 = new Class3_Sub12(local46, local83);
				local5.method261(local32);
			}
			this.aClass81Array1[local19[local21]] = new Class81(local30, local32);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)Z")
	public boolean method2220(@OriginalArg(0) int arg0) {
		return this.aClass81Array1[arg0].aBoolean149;
	}
}
