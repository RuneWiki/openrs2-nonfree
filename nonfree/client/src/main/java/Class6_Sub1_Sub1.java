import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)V")
	@Override
	protected void method4847(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray6[local19] = local12;
		this.aByteArray6[local20] = local12;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)[B")
	public byte[] method749() {
		this.aByteArray6 = new byte[524288];
		this.method6635();
		return this.aByteArray6;
	}
}
