import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class223_Sub2_Sub1 extends Class223_Sub2 {

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class223_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method6904(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(15) int local15 = arg0 & 0xFF;
		@Pc(18) int local18 = local7;
		@Pc(19) int local19 = local7 + 1;
		this.aByteArray78[local18] = -1;
		this.aByteArray78[local19] = (byte) (local15 * 3 >> 5);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIB)[B")
	public byte[] method6889() {
		this.aByteArray78 = new byte[524288];
		this.method6924();
		return this.aByteArray78;
	}
}
