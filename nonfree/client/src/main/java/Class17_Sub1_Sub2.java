import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class17_Sub1_Sub2 extends Class17_Sub1 {

	@OriginalMember(owner = "client!jda", name = "D", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
	public Class17_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IBII)[B")
	public byte[] method4016() {
		this.aByteArray44 = new byte[524288];
		this.method6650();
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(IBI)V")
	@Override
	protected void method4014(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray44[local19] = local16;
		this.aByteArray44[local20] = local16;
	}
}
