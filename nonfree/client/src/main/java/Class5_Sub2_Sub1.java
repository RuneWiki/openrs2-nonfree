import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII)[B")
	public byte[] method4374() {
		this.aByteArray105 = new byte[524288];
		this.method4365();
		return this.aByteArray105;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBZ)V")
	@Override
	protected void method4370(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray105[local19] = local12;
		this.aByteArray105[local20] = local12;
	}
}
