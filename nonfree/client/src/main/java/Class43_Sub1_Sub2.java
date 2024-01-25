import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class43_Sub1_Sub2 extends Class43_Sub1 {

	@OriginalMember(owner = "client!vca", name = "G", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
	public Class43_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII)[B")
	public byte[] method8137() {
		this.aByteArray101 = new byte[524288];
		this.method8278();
		return this.aByteArray101;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method8133(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray101[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray101[local15] = (byte) (local11 * 3 >> 5);
	}
}
