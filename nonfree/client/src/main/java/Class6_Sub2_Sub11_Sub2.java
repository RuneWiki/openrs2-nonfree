import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class6_Sub2_Sub11_Sub2 extends Class6_Sub2_Sub11 {

	@OriginalMember(owner = "client!rl", name = "L", descriptor = "[I")
	public static final int[] anIntArray569 = new int[32];

	@OriginalMember(owner = "client!rl", name = "C", descriptor = "Lclient!uf;")
	public Class197 aClass197_4;

	@OriginalMember(owner = "client!rl", name = "G", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
	public int anInt5294;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray569[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4802() {
		if (super.aBoolean366) {
			throw new RuntimeException();
		}
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)I")
	@Override
	public int method4804() {
		return super.aBoolean366 ? 0 : 100;
	}
}
