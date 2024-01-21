import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class35 {

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
	public static int[] anIntArray176 = new int[32];

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	public int anInt1323;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public int anInt1325;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!db;")
	public Class2_Sub1_Sub4 aClass2_Sub1_Sub4_3;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	public int anInt1328;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	public int anInt1333;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public int anInt1335;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!db;")
	public Class2_Sub1_Sub4 aClass2_Sub1_Sub4_4;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	public int anInt1327 = 0;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	public int anInt1331 = 0;

	static {
		@Pc(8) int local8 = 2;
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			anIntArray176[local10] = local8 - 1;
			local8 += local8;
		}
	}
}
