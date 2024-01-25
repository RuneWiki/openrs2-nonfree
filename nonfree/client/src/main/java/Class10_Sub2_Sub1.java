import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 {

	@OriginalMember(owner = "client!be", name = "v", descriptor = "[B")
	private byte[] aByteArray23;

	static {
		new Class202("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BZI)V")
	@Override
	protected void method1716(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg1 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray23[local23] = local16;
		this.aByteArray23[local24] = local16;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIB)[B")
	public byte[] method702() {
		this.aByteArray23 = new byte[524288];
		this.method3913();
		return this.aByteArray23;
	}
}
