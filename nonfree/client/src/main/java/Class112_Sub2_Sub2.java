import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class112_Sub2_Sub2 extends Class112_Sub2 {

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class112_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)[B")
	public byte[] method8635() {
		this.aByteArray105 = new byte[524288];
		this.method8629();
		return this.aByteArray105;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method8633(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray105[local19] = local16;
		this.aByteArray105[local20] = local16;
	}
}
