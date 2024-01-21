import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "[Lclient!ce;")
	public final Class13[] aClass13Array1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ie;Lclient!ie;IZ)V")
	public Class1_Sub1_Sub7(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class38 local5 = new Class38();
		@Pc(10) int local10 = arg0.method1579(arg2);
		this.aClass13Array1 = new Class13[local10];
		@Pc(19) int[] local19 = arg0.method1580(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method1573(arg2, local19[local21]);
			@Pc(32) Class1_Sub10 local32 = null;
			@Pc(46) int local46 = (local30[0] & 0xFF) << 8 | local30[1] & 0xFF;
			for (@Pc(51) Class1_Sub10 local51 = (Class1_Sub10) local5.method1034(); local51 != null; local51 = (Class1_Sub10) local5.method1038()) {
				if (local51.anInt1173 == local46) {
					local32 = local51;
					break;
				}
			}
			if (local32 == null) {
				@Pc(87) byte[] local87 = arg1.method1577(0, local46);
				local32 = new Class1_Sub10(local46, local87);
				local5.method1046(local32);
			}
			this.aClass13Array1[local19[local21]] = new Class13(local30, local32);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)Z")
	public boolean method743(@OriginalArg(0) int arg0) {
		return this.aClass13Array1[arg0].aBoolean31;
	}
}
