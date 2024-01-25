import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class7_Sub2_Sub2 extends Class7_Sub2 {

	@OriginalMember(owner = "client!oba", name = "z", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V")
	public Class7_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method5806(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg1 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray69[local23] = local12;
		this.aByteArray69[local24] = local12;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIII)[B")
	public byte[] method5808() {
		this.aByteArray69 = new byte[524288];
		this.method5797();
		return this.aByteArray69;
	}
}
