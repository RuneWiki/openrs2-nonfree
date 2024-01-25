import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class266 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!wm;")
	private final Class390 aClass390_83;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public final int anInt7485;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class266(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		new Class340(64);
		this.aClass390_83 = arg2;
		this.anInt7485 = this.aClass390_83.method8913(15);
	}
}
