import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class26 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
	public static int[] anIntArray184 = new int[256];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public int anInt1052;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public int anInt1054;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
	public int anInt1058;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
	public int anInt1061;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!od;")
	public Class1_Sub3_Sub4 aClass1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public int anInt1055 = 0;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
	public int anInt1056 = 0;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray184[local8] = local11;
		}
	}
}
