import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class35_Sub1_Sub1 extends Class35_Sub1 {

	@OriginalMember(owner = "client!ida", name = "F", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
	public Class35_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(IIII)[B")
	public byte[] method3754() {
		this.aByteArray50 = new byte[524288];
		this.method5904();
		return this.aByteArray50;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method4816(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg1 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray50[local23] = local12;
		this.aByteArray50[local24] = local12;
	}
}
