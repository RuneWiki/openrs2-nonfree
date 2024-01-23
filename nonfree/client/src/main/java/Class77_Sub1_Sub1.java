import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class77_Sub1_Sub1 extends Class77_Sub1 {

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class77_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)[B")
	public byte[] method4716() {
		this.aByteArray76 = new byte[524288];
		this.method4713();
		return this.aByteArray76;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)V")
	@Override
	protected void method4715(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray76[local15] = local12;
		this.aByteArray76[local16] = local12;
	}
}
