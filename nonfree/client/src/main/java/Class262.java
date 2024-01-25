import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class262 {

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "[I")
	public static final int[] anIntArray576 = new int[16384];

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[I")
	public static final int[] anIntArray575 = new int[16384];

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public int anInt7693;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	public int anInt7694;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	public int anInt7695;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
	public int anInt7696;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
	public int anInt7697;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
	public int anInt7698;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	public int anInt7700;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
	public int anInt7701;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public int anInt7691 = -1;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray575[local11] = (int) (Math.sin(local9 * (double) local11) * 32768.0D);
			anIntArray576[local11] = (int) (Math.cos((double) local11 * local9) * 32768.0D);
		}
	}
}
