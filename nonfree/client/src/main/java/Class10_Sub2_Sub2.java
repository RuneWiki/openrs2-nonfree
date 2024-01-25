import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class10_Sub2_Sub2 extends Class10_Sub2 {

	@OriginalMember(owner = "client!dp", name = "A", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIB)[B")
	public byte[] method1718() {
		this.aByteArray45 = new byte[524288];
		this.method3913();
		return this.aByteArray45;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BZI)V")
	@Override
	protected void method1716(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * 2;
		@Pc(26) byte local26 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(29) int local29 = local17;
		@Pc(30) int local30 = local17 + 1;
		this.aByteArray45[local29] = local26;
		this.aByteArray45[local30] = local26;
	}
}
