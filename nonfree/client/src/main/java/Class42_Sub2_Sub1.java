import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class42_Sub2_Sub1 extends Class42_Sub2 {

	@OriginalMember(owner = "client!js", name = "J", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class42_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BII)V")
	@Override
	protected void method2860(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray42[local19] = local16;
		this.aByteArray42[local20] = local16;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BIII)[B")
	public byte[] method2868() {
		this.aByteArray42 = new byte[524288];
		this.method2855();
		return this.aByteArray42;
	}
}
