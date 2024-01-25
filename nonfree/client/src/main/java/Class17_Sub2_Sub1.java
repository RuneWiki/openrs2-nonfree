import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class17_Sub2_Sub1 extends Class17_Sub2 {

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class17_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method5101(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(21) int local21 = arg0 * 2;
		@Pc(24) int local24 = local21;
		@Pc(25) int local25 = local21 + 1;
		this.aByteArray53[local24] = local12;
		this.aByteArray53[local25] = local12;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)[B")
	public byte[] method3269() {
		this.aByteArray53 = new byte[524288];
		this.method8415();
		return this.aByteArray53;
	}
}
