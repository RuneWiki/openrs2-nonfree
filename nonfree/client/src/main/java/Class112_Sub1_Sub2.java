import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class112_Sub1_Sub2 extends Class112_Sub1 {

	@OriginalMember(owner = "client!rs", name = "G", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class112_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7424(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray85[local10] = -1;
		@Pc(17) int local17 = arg0 & 0xFF;
		this.aByteArray85[local11] = (byte) (local17 * 3 >> 5);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BIII)[B")
	public byte[] method7426() {
		this.aByteArray85 = new byte[524288];
		this.method8629();
		return this.aByteArray85;
	}
}
