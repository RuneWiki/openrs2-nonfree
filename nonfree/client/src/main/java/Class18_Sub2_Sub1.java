import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class18_Sub2_Sub1 extends Class18_Sub2 {

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class18_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)[B")
	public byte[] method5646() {
		this.aByteArray69 = new byte[524288];
		this.method7247();
		return this.aByteArray69;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method7250(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(17) int local17 = arg0 * 2;
		@Pc(21) int local21 = arg1 & 0xFF;
		@Pc(24) int local24 = local17;
		@Pc(25) int local25 = local17 + 1;
		this.aByteArray69[local24] = (byte) (local21 * 3 >> 5);
		this.aByteArray69[local25] = (byte) (local21 * 3 >> 5);
	}
}
