import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class25_Sub1_Sub2 extends Class25_Sub1 {

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class25_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method1164(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 * 2;
		@Pc(16) int local16 = local13;
		@Pc(17) int local17 = local13 + 1;
		this.aByteArray25[local16] = -1;
		@Pc(23) int local23 = arg0 & 0xFF;
		this.aByteArray25[local17] = (byte) (local23 * 3 >> 5);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)[B")
	public byte[] method1167() {
		this.aByteArray25 = new byte[524288];
		this.method4064();
		return this.aByteArray25;
	}
}
