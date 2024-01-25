import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class285 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "[I")
	public static final int[] anIntArray475 = new int[16384];

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
	public static final int[] anIntArray476 = new int[16384];

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public final int anInt6995;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray476[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray475[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class285(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6995 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	public int method5717() {
		return this.anInt6995;
	}

	@OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
