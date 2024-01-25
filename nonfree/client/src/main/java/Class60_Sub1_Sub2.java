import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class60_Sub1_Sub2 extends Class60_Sub1 {

	@OriginalMember(owner = "client!nca", name = "V", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "()V")
	public Class60_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method5676(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray72[local14] = -1;
		this.aByteArray72[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)[B")
	public byte[] method5677() {
		this.aByteArray72 = new byte[524288];
		this.method8976((byte) 126);
		return this.aByteArray72;
	}
}
