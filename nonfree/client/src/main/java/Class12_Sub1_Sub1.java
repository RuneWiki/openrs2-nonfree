import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qaa")
public final class Class12_Sub1_Sub1 extends Class12_Sub1 {

	@OriginalMember(owner = "client!qaa", name = "W", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIB)[B")
	public byte[] method7568() {
		this.aByteArray74 = new byte[524288];
		this.method7640();
		return this.aByteArray74;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray74[local19] = (byte) (local11 * 3 >> 5);
		this.aByteArray74[local20] = (byte) (local11 * 3 >> 5);
	}
}
