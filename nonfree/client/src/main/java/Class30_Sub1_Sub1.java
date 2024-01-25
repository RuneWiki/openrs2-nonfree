import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class30_Sub1_Sub1 extends Class30_Sub1 {

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class30_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIII)[B")
	public byte[] method663() {
		this.aByteArray9 = new byte[524288];
		this.method7989();
		return this.aByteArray9;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BII)V")
	@Override
	protected void method5137(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 * 2;
		@Pc(15) int local15 = arg0 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray9[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray9[local19] = (byte) (local15 * 3 >> 5);
	}
}
