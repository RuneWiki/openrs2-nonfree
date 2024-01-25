import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class34_Sub1_Sub1 extends Class34_Sub1 {

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class34_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method984(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local7;
		@Pc(24) int local24 = local7 + 1;
		this.aByteArray34[local23] = local20;
		this.aByteArray34[local24] = local20;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBII)[B")
	public byte[] method989() {
		this.aByteArray34 = new byte[524288];
		this.method3796();
		return this.aByteArray34;
	}
}
