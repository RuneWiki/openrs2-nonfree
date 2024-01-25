import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class51 {

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_8;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "J")
	public final long aLong41;

	static {
		new Class202("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Lclient!os;J[Lclient!vt;)V")
	public Class51(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class305[] arg2) {
		this.aClass39_Sub3_8 = arg0;
		this.aLong41 = arg1;
	}

	@OriginalMember(owner = "client!dca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub3_8.method5748(this.aLong41);
		super.finalize();
	}
}
