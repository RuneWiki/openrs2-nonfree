import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class30_Sub1_Sub2 extends Class30_Sub1 {

	@OriginalMember(owner = "client!lga", name = "J", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
	public Class30_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(IIII)[B")
	public byte[] method5141() {
		this.aByteArray71 = new byte[524288];
		this.method7989();
		return this.aByteArray71;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BII)V")
	@Override
	protected void method5137(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray71[local10] = -1;
		@Pc(17) int local17 = arg0 & 0xFF;
		this.aByteArray71[local11] = (byte) (local17 * 3 >> 5);
	}
}
