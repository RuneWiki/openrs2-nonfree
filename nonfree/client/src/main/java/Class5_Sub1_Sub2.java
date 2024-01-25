import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!od", name = "M", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method5030(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(17) int local17 = arg0 * 2;
		@Pc(26) byte local26 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(29) int local29 = local17;
		@Pc(30) int local30 = local17 + 1;
		this.aByteArray71[local29] = local26;
		this.aByteArray71[local30] = local26;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)[B")
	public byte[] method5034() {
		this.aByteArray71 = new byte[524288];
		this.method5028();
		return this.aByteArray71;
	}
}
