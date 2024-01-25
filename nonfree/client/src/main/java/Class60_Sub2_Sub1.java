import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class60_Sub2_Sub1 extends Class60_Sub2 {

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class60_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIII)[B")
	public byte[] method4046() {
		this.aByteArray59 = new byte[524288];
		this.method4154();
		return this.aByteArray59;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4040(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(24) int local24 = local16;
		@Pc(25) int local25 = local16 + 1;
		this.aByteArray59[local24] = local12;
		this.aByteArray59[local25] = local12;
	}
}
