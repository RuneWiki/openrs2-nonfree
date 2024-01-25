import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method6638(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray88[local10] = -1;
		@Pc(17) int local17 = arg1 & 0xFF;
		this.aByteArray88[local11] = (byte) (local17 * 3 >> 5);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)[B")
	public byte[] method6644() {
		this.aByteArray88 = new byte[524288];
		this.method6635();
		return this.aByteArray88;
	}
}
