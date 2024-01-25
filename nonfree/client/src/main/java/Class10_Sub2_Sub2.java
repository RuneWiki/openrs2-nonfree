import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class10_Sub2_Sub2 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ws", name = "I", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(15) int local15 = arg0 * 2;
		@Pc(18) int local18 = local15;
		@Pc(19) int local19 = local15 + 1;
		this.aByteArray103[local18] = -1;
		@Pc(25) int local25 = arg1 & 0xFF;
		this.aByteArray103[local19] = (byte) (local25 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BIII)[B")
	public byte[] method7706() {
		this.aByteArray103 = new byte[524288];
		this.method7696();
		return this.aByteArray103;
	}
}
