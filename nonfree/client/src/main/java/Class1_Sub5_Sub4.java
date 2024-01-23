import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 {

	@OriginalMember(owner = "client!db", name = "L", descriptor = "[Lclient!ed;")
	public Class42[] aClass42Array1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!nm;Lclient!nm;IZ)V")
	public Class1_Sub5_Sub4(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class96 local7 = new Class96();
		@Pc(12) int local12 = arg0.method3217(arg2);
		this.aClass42Array1 = new Class42[local12];
		@Pc(21) int[] local21 = arg0.method3246(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method3235(local21[local23], arg2);
			@Pc(37) Class1_Sub32 local37 = null;
			@Pc(51) int local51 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(56) Class1_Sub32 local56 = (Class1_Sub32) local7.method2340(); local56 != null; local56 = (Class1_Sub32) local7.method2342()) {
				if (local56.anInt5294 == local51) {
					local37 = local56;
					break;
				}
			}
			if (local37 == null) {
				@Pc(86) byte[] local86 = arg1.method3242(local51, 0);
				local37 = new Class1_Sub32(local51, local86);
				local7.method2336(local37);
			}
			this.aClass42Array1[local21[local23]] = new Class42(local35, local37);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
	public boolean method894(@OriginalArg(1) int arg0) {
		return this.aClass42Array1[arg0].aBoolean123;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Z")
	public boolean method895(@OriginalArg(0) int arg0) {
		return this.aClass42Array1[arg0].aBoolean124;
	}
}
