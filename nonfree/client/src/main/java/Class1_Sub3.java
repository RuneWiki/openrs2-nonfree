import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "[I")
	public static int[] anIntArray18 = new int[32];

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Lclient!dg;")
	public Class28_Sub1 aClass28_Sub1_12;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	public int anInt254;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "Lclient!lg;")
	public Class73 aClass73_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray18[local6] = local4 - 1;
			local4 += local4;
		}
	}
}
