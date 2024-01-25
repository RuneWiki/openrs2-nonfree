import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "[B")
	private byte[] aByteArray6;

	static {
		new Class306("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIII)[B")
	public byte[] method367() {
		this.aByteArray6 = new byte[524288];
		this.method6047();
		return this.aByteArray6;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method6056(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = arg1 * 2;
		@Pc(26) int local26 = local23;
		@Pc(27) int local27 = local23 + 1;
		this.aByteArray6[local26] = local12;
		this.aByteArray6[local27] = local12;
	}
}
