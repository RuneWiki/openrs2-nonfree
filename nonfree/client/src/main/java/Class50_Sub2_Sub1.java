import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class50_Sub2_Sub1 extends Class50_Sub2 {

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class50_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5246(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray23[local19] = local12;
		this.aByteArray23[local20] = local12;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)[B")
	public byte[] method1959() {
		this.aByteArray23 = new byte[524288];
		this.method5238();
		return this.aByteArray23;
	}
}
