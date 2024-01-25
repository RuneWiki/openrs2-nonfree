import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ms")
public final class Class42_Sub2_Sub1 extends Class42_Sub2 {

	@OriginalMember(owner = "client!ms", name = "J", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
	public Class42_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIII)[B")
	public byte[] method4158() {
		this.aByteArray64 = new byte[524288];
		this.method4150();
		return this.aByteArray64;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method4154(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray64[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray64[local15] = (byte) (local11 * 3 >> 5);
	}
}
