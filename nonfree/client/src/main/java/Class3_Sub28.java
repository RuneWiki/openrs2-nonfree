import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "[I")
	public static final int[] anIntArray231 = new int[16384];

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "[I")
	public static final int[] anIntArray232 = new int[16384];

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
	public volatile int anInt4967 = -1;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString122;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			anIntArray232[local15] = (int) (Math.sin((double) local15 * local13) * 16384.0D);
			anIntArray231[local15] = (int) (Math.cos((double) local15 * local13) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub28(@OriginalArg(0) String arg0) {
		this.aString122 = arg0;
	}
}
