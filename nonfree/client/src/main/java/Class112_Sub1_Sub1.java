import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class112_Sub1_Sub1 extends Class112_Sub1 {

	@OriginalMember(owner = "client!iv", name = "H", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	public Class112_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BIII)[B")
	public byte[] method4089() {
		this.aByteArray45 = new byte[524288];
		this.method8629();
		return this.aByteArray45;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7424(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray45[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray45[local20] = (byte) (local16 * 3 >> 5);
	}
}
