import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method190(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray6[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray6[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)[B")
	public byte[] method192() {
		this.aByteArray6 = new byte[524288];
		this.method4365();
		return this.aByteArray6;
	}
}
