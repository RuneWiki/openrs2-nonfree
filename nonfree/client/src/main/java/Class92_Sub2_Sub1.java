import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class92_Sub2_Sub1 extends Class92_Sub2 {

	@OriginalMember(owner = "client!on", name = "D", descriptor = "[B")
	private byte[] aByteArray66;

	static {
		new Class198(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
		new Class198(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	public Class92_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method3788(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg1 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray66[local23] = local16;
		this.aByteArray66[local24] = local16;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(IIII)[B")
	public byte[] method3793() {
		this.aByteArray66 = new byte[524288];
		this.method3782();
		return this.aByteArray66;
	}
}
