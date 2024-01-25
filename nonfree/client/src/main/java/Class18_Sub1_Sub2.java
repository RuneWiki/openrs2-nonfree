import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class18_Sub1_Sub2 extends Class18_Sub1 {

	@OriginalMember(owner = "client!nu", name = "R", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	public Class18_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(IIZI)[B")
	public byte[] method5646() {
		this.aByteArray59 = new byte[524288];
		this.method8416();
		return this.aByteArray59;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method5643(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 * 2;
		@Pc(19) int local19 = arg0 & 0xFF;
		@Pc(22) int local22 = local15;
		@Pc(23) int local23 = local15 + 1;
		this.aByteArray59[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray59[local23] = (byte) (local19 * 3 >> 5);
	}
}
