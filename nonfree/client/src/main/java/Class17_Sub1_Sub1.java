import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class17_Sub1_Sub1 extends Class17_Sub1 {

	@OriginalMember(owner = "client!ida", name = "J", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
	public Class17_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBII)[B")
	public byte[] method3652() {
		this.aByteArray41 = new byte[524288];
		this.method6650();
		return this.aByteArray41;
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(IBI)V")
	@Override
	protected void method4014(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(19) byte local19 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = arg0 * 2;
		@Pc(26) int local26 = local23;
		@Pc(27) int local27 = local23 + 1;
		this.aByteArray41[local26] = local19;
		this.aByteArray41[local27] = local19;
	}
}
