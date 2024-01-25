import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class363 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "[I")
	public static final int[] anIntArray697 = new int[16384];

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "[I")
	public static final int[] anIntArray698 = new int[16384];

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
	public final int anInt9573;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	private final int anInt9576;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray697[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray698[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V")
	public Class363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9573 = arg1;
		this.anInt9576 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I")
	public int method7961() {
		return this.anInt9576;
	}

	@OriginalMember(owner = "client!wp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
