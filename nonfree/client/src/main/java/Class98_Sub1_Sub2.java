import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class98_Sub1_Sub2 extends Class98_Sub1 {

	@OriginalMember(owner = "client!fr", name = "H", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class98_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(IIII)[B")
	public byte[] method2914() {
		this.aByteArray39 = new byte[524288];
		this.method7054();
		return this.aByteArray39;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method2909(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(17) int local17 = local7;
		@Pc(18) int local18 = local7 + 1;
		this.aByteArray39[local17] = (byte) (local11 * 3 >> 5);
		this.aByteArray39[local18] = (byte) (local11 * 3 >> 5);
	}
}
