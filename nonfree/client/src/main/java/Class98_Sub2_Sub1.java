import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class98_Sub2_Sub1 extends Class98_Sub2 {

	@OriginalMember(owner = "client!od", name = "B", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class98_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIII)[B")
	public byte[] method6367() {
		this.aByteArray78 = new byte[524288];
		this.method7054();
		return this.aByteArray78;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7055(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray78[local19] = local16;
		this.aByteArray78[local20] = local16;
	}
}
