import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class17_Sub1_Sub2 extends Class17_Sub1 {

	@OriginalMember(owner = "client!uba", name = "K", descriptor = "[B")
	private byte[] aByteArray123;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V")
	public Class17_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(IIII)[B")
	public byte[] method8426() {
		this.aByteArray123 = new byte[524288];
		this.method8415();
		return this.aByteArray123;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method8423(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray123[local14] = -1;
		this.aByteArray123[local15] = (byte) (local11 * 3 >> 5);
	}
}
