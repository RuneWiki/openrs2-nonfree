import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class111_Sub1_Sub1 extends Class111_Sub1 {

	@OriginalMember(owner = "client!hw", name = "K", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "()V")
	public Class111_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(IIII)[B")
	public byte[] method2308() {
		this.aByteArray27 = new byte[524288];
		this.method5107();
		return this.aByteArray27;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method2304(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(15) int local15 = arg0 * 2;
		@Pc(19) int local19 = arg1 & 0xFF;
		@Pc(22) int local22 = local15;
		@Pc(23) int local23 = local15 + 1;
		this.aByteArray27[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray27[local23] = (byte) (local19 * 3 >> 5);
	}
}
