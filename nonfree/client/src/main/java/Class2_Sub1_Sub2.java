import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nda", name = "N", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(IIII)[B")
	public byte[] method5156() {
		this.aByteArray61 = new byte[524288];
		this.method6202();
		return this.aByteArray61;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method5153(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(16) int local16 = arg1 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray61[local19] = -1;
		this.aByteArray61[local20] = (byte) (local16 * 3 >> 5);
	}
}
