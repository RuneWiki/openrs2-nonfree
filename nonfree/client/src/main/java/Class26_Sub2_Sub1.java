import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class26_Sub2_Sub1 extends Class26_Sub2 {

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "[B")
	private byte[] aByteArray190;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class26_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)[B")
	public byte[] method4622() {
		this.aByteArray190 = new byte[524288];
		this.method4617();
		return this.aByteArray190;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)V")
	@Override
	protected void method4619(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray190[local15] = local12;
		this.aByteArray190[local16] = local12;
	}
}
