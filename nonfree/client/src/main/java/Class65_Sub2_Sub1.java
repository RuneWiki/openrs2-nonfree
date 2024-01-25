import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class65_Sub2_Sub1 extends Class65_Sub2 {

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "[B")
	private byte[] aByteArray74;

	static {
		new Class55("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class65_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method3921(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg0 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray74[local27] = local20;
		this.aByteArray74[local28] = local20;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIII)[B")
	public byte[] method3924() {
		this.aByteArray74 = new byte[524288];
		this.method3912();
		return this.aByteArray74;
	}
}
