import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class60_Sub2_Sub2 extends Class60_Sub2 {

	@OriginalMember(owner = "client!vv", name = "F", descriptor = "[B")
	private byte[] aByteArray113;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class60_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIBI)[B")
	public byte[] method8981() {
		this.aByteArray113 = new byte[524288];
		this.method8976((byte) 123);
		return this.aByteArray113;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BII)V")
	@Override
	protected void method8980(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(19) byte local19 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = arg1 * 2;
		@Pc(26) int local26 = local23;
		@Pc(27) int local27 = local23 + 1;
		this.aByteArray113[local26] = local19;
		this.aByteArray113[local27] = local19;
	}
}
