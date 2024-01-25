import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class50_Sub1_Sub1 extends Class50_Sub1 {

	@OriginalMember(owner = "client!cea", name = "N", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
	public Class50_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4496(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(16) int local16 = arg1 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray16[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray16[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BIII)[B")
	public byte[] method1232() {
		this.aByteArray16 = new byte[524288];
		this.method5238();
		return this.aByteArray16;
	}
}
