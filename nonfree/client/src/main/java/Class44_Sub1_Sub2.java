import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class44_Sub1_Sub2 extends Class44_Sub1 {

	@OriginalMember(owner = "client!gm", name = "M", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class44_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local7;
		@Pc(19) int local19 = local7 + 1;
		this.aByteArray30[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray30[local19] = (byte) (local15 * 3 >> 5);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)[B")
	public byte[] method3266() {
		this.aByteArray30 = new byte[524288];
		this.method8024();
		return this.aByteArray30;
	}
}
