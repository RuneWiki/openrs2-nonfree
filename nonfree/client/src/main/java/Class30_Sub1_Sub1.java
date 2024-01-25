import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class30_Sub1_Sub1 extends Class30_Sub1 {

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "[B")
	private byte[] aByteArray33;

	static {
		new Class84(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class30_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method1644(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray33[local19] = local16;
		this.aByteArray33[local20] = local16;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)[B")
	public byte[] method1648() {
		this.aByteArray33 = new byte[524288];
		this.method4061();
		return this.aByteArray33;
	}
}
