import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class74_Sub2_Sub1 extends Class74_Sub2 {

	@OriginalMember(owner = "client!hha", name = "T", descriptor = "[B")
	private byte[] aByteArray57;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "()V")
	public Class74_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7981(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(14) int local14 = local11;
		@Pc(15) int local15 = local11 + 1;
		this.aByteArray57[local14] = -1;
		@Pc(21) int local21 = arg1 & 0xFF;
		this.aByteArray57[local15] = (byte) (local21 * 3 >> 5);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IIBI)[B")
	public byte[] method4174() {
		this.aByteArray57 = new byte[524288];
		this.method9043();
		return this.aByteArray57;
	}
}
