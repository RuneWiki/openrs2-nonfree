import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class28_Sub2_Sub1 extends Class28_Sub2 {

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "[B")
	private byte[] aByteArray78;

	static {
		new Class200("", 73);
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class28_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5044(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray78[local19] = local12;
		this.aByteArray78[local20] = local12;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIII)[B")
	public byte[] method5046() {
		this.aByteArray78 = new byte[524288];
		this.method5042();
		return this.aByteArray78;
	}
}
