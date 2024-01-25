import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class3_Sub3_Sub10 extends Class3_Sub3 {

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "[B")
	public final byte[] aByteArray50;

	static {
		new Class174("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([B)V")
	public Class3_Sub3_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray50 = arg0;
	}
}
