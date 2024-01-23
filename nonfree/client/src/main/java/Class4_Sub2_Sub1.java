import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)[B")
	public byte[] method292() {
		this.aByteArray9 = new byte[524288];
		this.method279();
		return this.aByteArray9;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)V")
	@Override
	protected void method286(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray9[local15] = local12;
		this.aByteArray9[local16] = local12;
	}
}
