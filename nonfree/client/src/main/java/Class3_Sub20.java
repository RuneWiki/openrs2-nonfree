import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "[I")
	public static final int[] anIntArray222 = new int[99];

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!eo;")
	public Class68 aClass68_4;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public int anInt2703;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!eo;")
	public Class68 aClass68_5;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public int anInt2706;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	public int anInt2707;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray35;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Z")
	public boolean aBoolean208;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	public int anInt2711;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
	public int anInt2712;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
	public int anInt2713;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Ljava/lang/String;")
	public String aString26;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 99; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local8 += local28;
			anIntArray222[local10] = local8 / 4;
		}
	}
}
