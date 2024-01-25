import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class98_Sub1_Sub1 extends Class98_Sub1 {

	@OriginalMember(owner = "client!ev", name = "F", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
	public Class98_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(IIII)[B")
	public byte[] method2605() {
		this.aByteArray27 = new byte[524288];
		this.method7054();
		return this.aByteArray27;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method2909(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray27[local10] = -1;
		@Pc(21) int local21 = arg1 & 0xFF;
		this.aByteArray27[local11] = (byte) (local21 * 3 >> 5);
	}
}
