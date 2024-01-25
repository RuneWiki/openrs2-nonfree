import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class10_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
	@Override
	protected void method3915(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray83[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray83[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIII)[B")
	public byte[] method3922() {
		this.aByteArray83 = new byte[524288];
		this.method3913();
		return this.aByteArray83;
	}
}
