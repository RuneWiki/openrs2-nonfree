import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class12_Sub1_Sub2 extends Class12_Sub1 {

	@OriginalMember(owner = "client!qda", name = "T", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray78[local14] = -1;
		this.aByteArray78[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIB)[B")
	public byte[] method7652() {
		this.aByteArray78 = new byte[524288];
		this.method7640();
		return this.aByteArray78;
	}
}
