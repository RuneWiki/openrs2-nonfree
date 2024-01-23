import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gk", name = "G", descriptor = "[Lclient!ih;")
	public Class61[] aClass61Array1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!hc;Lclient!hc;IZ)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class3 local7 = new Class3();
		@Pc(12) int local12 = arg0.method1875(arg2);
		this.aClass61Array1 = new Class61[local12];
		@Pc(21) int[] local21 = arg0.method1865(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1874(arg2, local21[local23]);
			@Pc(35) Class1_Sub6 local35 = null;
			@Pc(49) int local49 = (local33[0] & 0xFF) << 8 | local33[1] & 0xFF;
			for (@Pc(54) Class1_Sub6 local54 = (Class1_Sub6) local7.method30(); local54 != null; local54 = (Class1_Sub6) local7.method33()) {
				if (local54.anInt1378 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(80) byte[] local80 = arg1.method1878(local49, 0);
				local35 = new Class1_Sub6(local49, local80);
				local7.method28(local35);
			}
			this.aClass61Array1[local21[local23]] = new Class61(local33, local35);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Z")
	public boolean method1657(@OriginalArg(1) int arg0) {
		return this.aClass61Array1[arg0].aBoolean149;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)Z")
	public boolean method1660(@OriginalArg(0) int arg0) {
		return this.aClass61Array1[arg0].aBoolean150;
	}
}
