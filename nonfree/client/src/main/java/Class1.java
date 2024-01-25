import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!lt;")
	private final Class158 aClass158_1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	public final int anInt3;

	static {
		new Class231(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class1(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		new Class220(64);
		this.aClass158_1 = arg2;
		this.anInt3 = this.aClass158_1.method3683(15);
	}
}
