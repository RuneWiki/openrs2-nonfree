import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class69_Sub1_Sub1 extends Class69_Sub1 {

	@OriginalMember(owner = "client!ep", name = "A", descriptor = "[B")
	private byte[] aByteArray10;

	static {
		new Class151("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V")
	public Class69_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method1434(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg0 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray10[local27] = local20;
		this.aByteArray10[local28] = local20;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIB)[B")
	public byte[] method1437() {
		this.aByteArray10 = new byte[524288];
		this.method4734();
		return this.aByteArray10;
	}
}
