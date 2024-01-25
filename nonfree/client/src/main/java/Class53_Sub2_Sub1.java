import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class53_Sub2_Sub1 extends Class53_Sub2 {

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "[B")
	private byte[] aByteArray38;

	static {
		new Class40("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	public Class53_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "(IIII)[B")
	public byte[] method2377() {
		this.aByteArray38 = new byte[524288];
		this.method7334();
		return this.aByteArray38;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method6628(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(21) byte local21 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local12;
		@Pc(25) int local25 = local12 + 1;
		this.aByteArray38[local24] = local21;
		this.aByteArray38[local25] = local21;
	}
}
