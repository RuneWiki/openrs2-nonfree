import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class50_Sub1_Sub2 extends Class50_Sub1 {

	@OriginalMember(owner = "client!km", name = "G", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class50_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BIII)[B")
	public byte[] method4498() {
		this.aByteArray54 = new byte[524288];
		this.method5238();
		return this.aByteArray54;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4496(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(14) int local14 = arg0 * 2;
		@Pc(18) int local18 = arg1 & 0xFF;
		@Pc(21) int local21 = local14;
		@Pc(22) int local22 = local14 + 1;
		this.aByteArray54[local21] = -1;
		this.aByteArray54[local22] = (byte) (local18 * 3 >> 5);
	}
}
