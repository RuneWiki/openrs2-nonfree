import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class42_Sub1_Sub1 extends Class42_Sub1 {

	@OriginalMember(owner = "client!cq", name = "I", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class42_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIII)[B")
	public byte[] method1036() {
		this.aByteArray4 = new byte[524288];
		this.method2855();
		return this.aByteArray4;
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(IIB)V")
	@Override
	protected void method1031(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray4[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray4[local15] = (byte) (local11 * 3 >> 5);
	}
}
