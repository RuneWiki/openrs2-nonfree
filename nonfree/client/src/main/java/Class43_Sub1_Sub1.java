import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class43_Sub1_Sub1 extends Class43_Sub1 {

	@OriginalMember(owner = "client!qba", name = "K", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
	public Class43_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method8133(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(15) int local15 = arg0 * 2;
		@Pc(19) int local19 = arg1 & 0xFF;
		@Pc(22) int local22 = local15;
		@Pc(23) int local23 = local15 + 1;
		this.aByteArray86[local22] = -1;
		this.aByteArray86[local23] = (byte) (local19 * 3 >> 5);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIII)[B")
	public byte[] method6779() {
		this.aByteArray86 = new byte[524288];
		this.method8278();
		return this.aByteArray86;
	}
}
