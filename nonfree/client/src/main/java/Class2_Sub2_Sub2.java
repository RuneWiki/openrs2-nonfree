import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qu", name = "J", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII)V")
	@Override
	protected void method6207(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg1 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray84[local23] = local16;
		this.aByteArray84[local24] = local16;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBII)[B")
	public byte[] method6214() {
		this.aByteArray84 = new byte[524288];
		this.method6202();
		return this.aByteArray84;
	}
}
