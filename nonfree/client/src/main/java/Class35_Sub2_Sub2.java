import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class35_Sub2_Sub2 extends Class35_Sub2 {

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "[B")
	private byte[] aByteArray87;

	static {
		new Class45("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class35_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIII)[B")
	public byte[] method5910() {
		this.aByteArray87 = new byte[524288];
		this.method5904();
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method5907(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 * 2;
		@Pc(15) int local15 = arg0 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray87[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray87[local19] = (byte) (local15 * 3 >> 5);
	}
}
