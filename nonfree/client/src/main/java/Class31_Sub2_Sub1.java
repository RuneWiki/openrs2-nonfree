import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class31_Sub2_Sub1 extends Class31_Sub2 {

	@OriginalMember(owner = "client!of", name = "L", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class31_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V")
	@Override
	protected void method2906(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray32[local15] = local12;
		this.aByteArray32[local16] = local12;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(III)[B")
	public byte[] method2913() {
		this.aByteArray32 = new byte[524288];
		this.method4122();
		return this.aByteArray32;
	}
}
