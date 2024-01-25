import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBI)[B")
	public byte[] method8806() {
		this.aByteArray101 = new byte[524288];
		this.method8927();
		return this.aByteArray101;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method8802(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = arg0 * 2;
		@Pc(26) int local26 = local23;
		@Pc(27) int local27 = local23 + 1;
		this.aByteArray101[local26] = local12;
		this.aByteArray101[local27] = local12;
	}
}
