import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "[Lclient!nj;")
	public Class70[] aClass70Array1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!oe;Lclient!oe;IZ)V")
	public Class2_Sub3_Sub22(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class44 local5 = new Class44();
		@Pc(10) int local10 = arg0.method3177(arg2);
		this.aClass70Array1 = new Class70[local10];
		@Pc(19) int[] local19 = arg0.method3189(arg2);
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(30) byte[] local30 = arg0.method3197(local19[local21], arg2);
			@Pc(44) int local44 = local30[1] & 0xFF | (local30[0] & 0xFF) << 8;
			@Pc(46) Class2_Sub24 local46 = null;
			for (@Pc(51) Class2_Sub24 local51 = (Class2_Sub24) local5.method1359(); local51 != null; local51 = (Class2_Sub24) local5.method1356()) {
				if (local51.anInt2868 == local44) {
					local46 = local51;
					break;
				}
			}
			if (local46 == null) {
				@Pc(87) byte[] local87 = arg1.method3195(0, local44);
				local46 = new Class2_Sub24(local44, local87);
				local5.method1355(local46);
			}
			this.aClass70Array1[local19[local21]] = new Class70(local30, local46);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)Z")
	public boolean method2707(@OriginalArg(0) int arg0) {
		return this.aClass70Array1[arg0].aBoolean141;
	}
}
