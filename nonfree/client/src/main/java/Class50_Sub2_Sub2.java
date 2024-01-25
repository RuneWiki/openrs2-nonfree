import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class50_Sub2_Sub2 extends Class50_Sub2 {

	@OriginalMember(owner = "client!mea", name = "I", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
	public Class50_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5246(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray70[local19] = local16;
		this.aByteArray70[local20] = local16;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIII)[B")
	public byte[] method5252() {
		this.aByteArray70 = new byte[524288];
		this.method5238();
		return this.aByteArray70;
	}
}
