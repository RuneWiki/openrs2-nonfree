import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class96_Sub1_Sub1 extends Class96_Sub1 {

	@OriginalMember(owner = "client!gh", name = "N", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class96_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(17) byte local17 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(21) int local21 = arg0 * 2;
		@Pc(24) int local24 = local21;
		@Pc(25) int local25 = local21 + 1;
		this.aByteArray19[local24] = local17;
		this.aByteArray19[local25] = local17;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIII)[B")
	public byte[] method1850() {
		this.aByteArray19 = new byte[524288];
		this.method2166();
		return this.aByteArray19;
	}
}
