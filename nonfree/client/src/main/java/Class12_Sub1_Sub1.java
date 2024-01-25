import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!nia", name = "N", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(IIII)[B")
	public byte[] method6282() {
		this.aByteArray61 = new byte[524288];
		this.method8927();
		return this.aByteArray61;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method8932(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(18) int local18 = arg0 * 2;
		@Pc(21) int local21 = local18;
		@Pc(22) int local22 = local18 + 1;
		this.aByteArray61[local21] = -1;
		@Pc(28) int local28 = arg1 & 0xFF;
		this.aByteArray61[local22] = (byte) (local28 * 3 >> 5);
	}
}
