import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class60_Sub1_Sub1 extends Class60_Sub1 {

	@OriginalMember(owner = "client!nt", name = "L", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class60_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method4165(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray61[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray61[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(IIII)[B")
	public byte[] method4167() {
		this.aByteArray61 = new byte[524288];
		this.method4154();
		return this.aByteArray61;
	}
}
