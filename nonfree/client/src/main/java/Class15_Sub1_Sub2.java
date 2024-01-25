import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hja")
public final class Class15_Sub1_Sub2 extends Class15_Sub1 {

	@OriginalMember(owner = "client!hja", name = "F", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "()V")
	public Class15_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method3205(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray31[local14] = -1;
		this.aByteArray31[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIB)[B")
	public byte[] method3208() {
		this.aByteArray31 = new byte[524288];
		this.method8197();
		return this.aByteArray31;
	}
}
