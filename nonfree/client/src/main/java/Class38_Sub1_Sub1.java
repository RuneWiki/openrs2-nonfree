import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class38_Sub1_Sub1 extends Class38_Sub1 {

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class38_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(IIII)[B")
	public byte[] method805() {
		this.aByteArray13 = new byte[524288];
		this.method5557();
		return this.aByteArray13;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5561(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(13) int local13 = arg0 * 2;
		@Pc(17) int local17 = arg1 & 0xFF;
		@Pc(20) int local20 = local13;
		@Pc(21) int local21 = local13 + 1;
		this.aByteArray13[local20] = (byte) (local17 * 3 >> 5);
		this.aByteArray13[local21] = (byte) (local17 * 3 >> 5);
	}
}
