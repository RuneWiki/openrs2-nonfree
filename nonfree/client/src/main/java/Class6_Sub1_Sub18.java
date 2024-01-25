import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class6_Sub1_Sub18 extends Class6_Sub1 {

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "[I")
	public static final int[] anIntArray642 = new int[16384];

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "[I")
	public static final int[] anIntArray643 = new int[16384];

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "I")
	public int anInt7269;

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "[I")
	public int[] anIntArray641;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "[I")
	public int[] anIntArray644;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray47;

	@OriginalMember(owner = "client!wt", name = "B", descriptor = "[Lclient!ke;")
	public Class137[] aClass137Array1;

	@OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
	public int anInt7271;

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
	public int anInt7272;

	@OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
	public int anInt7273;

	@OriginalMember(owner = "client!wt", name = "F", descriptor = "Lclient!oq;")
	public Class193 aClass193_9;

	@OriginalMember(owner = "client!wt", name = "J", descriptor = "Ljava/lang/String;")
	public String aString71;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray642[local9] = (int) (Math.sin((double) local9 * local7) * 32768.0D);
			anIntArray643[local9] = (int) (Math.cos((double) local9 * local7) * 32768.0D);
		}
	}
}
