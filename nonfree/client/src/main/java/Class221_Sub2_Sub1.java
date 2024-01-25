import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class221_Sub2_Sub1 extends Class221_Sub2 {

	@OriginalMember(owner = "client!sg", name = "S", descriptor = "[B")
	private byte[] aByteArray80;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class221_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBII)[B")
	public byte[] method7451() {
		this.aByteArray80 = new byte[524288];
		this.method7471();
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7474(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 * 2;
		@Pc(15) int local15 = arg0 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray80[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray80[local19] = (byte) (local15 * 3 >> 5);
	}
}
