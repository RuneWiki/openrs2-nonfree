import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)[B")
	public byte[] method4750() {
		this.aByteArray54 = new byte[524288];
		this.method6173();
		return this.aByteArray54;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(BII)V")
	@Override
	protected void method4746(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray54[local24] = local16;
		this.aByteArray54[local25] = local16;
	}
}
