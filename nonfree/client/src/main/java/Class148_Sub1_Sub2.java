import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class148_Sub1_Sub2 extends Class148_Sub1 {

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
	public Class148_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BII)V")
	@Override
	protected void method5651(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray61[local19] = -1;
		this.aByteArray61[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIZ)[B")
	public byte[] method5655() {
		this.aByteArray61 = new byte[524288];
		this.method7949();
		return this.aByteArray61;
	}
}
