import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pha")
public final class Class16_Sub2_Sub1 extends Class16_Sub2 {

	@OriginalMember(owner = "client!pha", name = "E", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
	public Class16_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method7188(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(16) int local16 = arg1 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray72[local19] = -1;
		this.aByteArray72[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIII)[B")
	public byte[] method6447() {
		this.aByteArray72 = new byte[524288];
		this.method7182();
		return this.aByteArray72;
	}
}
