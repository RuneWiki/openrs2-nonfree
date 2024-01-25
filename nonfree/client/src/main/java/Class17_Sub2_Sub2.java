import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class17_Sub2_Sub2 extends Class17_Sub2 {

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class17_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBII)[B")
	public byte[] method6659() {
		this.aByteArray103 = new byte[524288];
		this.method6650();
		return this.aByteArray103;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method6657(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray103[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray103[local15] = (byte) (local11 * 3 >> 5);
	}
}
