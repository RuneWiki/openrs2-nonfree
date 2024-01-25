import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class127_Sub1_Sub2 extends Class127_Sub1 {

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class127_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method4131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 * 2;
		@Pc(17) int local17 = arg0 & 0xFF;
		@Pc(20) int local20 = local13;
		@Pc(21) int local21 = local13 + 1;
		this.aByteArray57[local20] = -1;
		this.aByteArray57[local21] = (byte) (local17 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)[B")
	public byte[] method4134() {
		this.aByteArray57 = new byte[524288];
		this.method7972();
		return this.aByteArray57;
	}
}
