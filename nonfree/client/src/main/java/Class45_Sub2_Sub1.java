import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class45_Sub2_Sub1 extends Class45_Sub2 {

	@OriginalMember(owner = "client!ica", name = "Q", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "()V")
	public Class45_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZIII)[B")
	public byte[] method3979() {
		this.aByteArray54 = new byte[524288];
		this.method7178();
		return this.aByteArray54;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method5058(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 * 2;
		@Pc(16) int local16 = local13;
		@Pc(17) int local17 = local13 + 1;
		this.aByteArray54[local16] = -1;
		@Pc(23) int local23 = arg0 & 0xFF;
		this.aByteArray54[local17] = (byte) (local23 * 3 >> 5);
	}
}
