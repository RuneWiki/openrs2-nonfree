import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class53_Sub2_Sub2 extends Class53_Sub2 {

	@OriginalMember(owner = "client!tm", name = "E", descriptor = "[B")
	private byte[] aByteArray116;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class53_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(IIII)[B")
	public byte[] method6633() {
		this.aByteArray116 = new byte[524288];
		this.method7334();
		return this.aByteArray116;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method6628(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray116[local19] = local16;
		this.aByteArray116[local20] = local16;
	}
}
