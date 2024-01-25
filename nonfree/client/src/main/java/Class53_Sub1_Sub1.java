import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class53_Sub1_Sub1 extends Class53_Sub1 {

	@OriginalMember(owner = "client!kq", name = "K", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class53_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7338(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray68[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray68[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIBI)[B")
	public byte[] method4397() {
		this.aByteArray68 = new byte[524288];
		this.method7334();
		return this.aByteArray68;
	}
}
