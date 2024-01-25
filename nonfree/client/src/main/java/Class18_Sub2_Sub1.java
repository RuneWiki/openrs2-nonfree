import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class18_Sub2_Sub1 extends Class18_Sub2 {

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class18_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method8422(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg0 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray73[local23] = local16;
		this.aByteArray73[local24] = local16;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)[B")
	public byte[] method7019() {
		this.aByteArray73 = new byte[524288];
		this.method8416();
		return this.aByteArray73;
	}
}
