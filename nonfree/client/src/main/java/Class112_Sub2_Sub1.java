import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class112_Sub2_Sub1 extends Class112_Sub2 {

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class112_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(IIII)[B")
	public byte[] method3325() {
		this.aByteArray36 = new byte[524288];
		this.method8629();
		return this.aByteArray36;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method8633(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray36[local19] = local12;
		this.aByteArray36[local20] = local12;
	}
}
