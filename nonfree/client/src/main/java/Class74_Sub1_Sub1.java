import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class74_Sub1_Sub1 extends Class74_Sub1 {

	@OriginalMember(owner = "client!dha", name = "H", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "()V")
	public Class74_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method9051(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg0 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray37[local23] = local16;
		this.aByteArray37[local24] = local16;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IBII)[B")
	public byte[] method2648() {
		this.aByteArray37 = new byte[524288];
		this.method9043();
		return this.aByteArray37;
	}
}
