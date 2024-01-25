import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class43_Sub2_Sub1 extends Class43_Sub2 {

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class43_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method3180(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray53[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray53[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIB)[B")
	public byte[] method3187() {
		this.aByteArray53 = new byte[524288];
		this.method3173();
		return this.aByteArray53;
	}
}
