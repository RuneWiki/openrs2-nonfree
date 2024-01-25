import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class266 {

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!gp;")
	private final Class117 aClass117_184;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public final int anInt7781;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class266(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		new Class288(64);
		this.aClass117_184 = arg2;
		this.anInt7781 = this.aClass117_184.method2951(15);
	}
}
