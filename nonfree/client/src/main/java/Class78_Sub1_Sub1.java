import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class78_Sub1_Sub1 extends Class78_Sub1 {

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class78_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIII)[B")
	public byte[] method2597() {
		this.aByteArray18 = new byte[524288];
		this.method7619();
		return this.aByteArray18;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7621(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 * 2;
		@Pc(20) byte local20 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local11;
		@Pc(24) int local24 = local11 + 1;
		this.aByteArray18[local23] = local20;
		this.aByteArray18[local24] = local20;
	}
}
