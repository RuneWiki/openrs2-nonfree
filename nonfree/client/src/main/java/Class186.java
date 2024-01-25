import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class186 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "Lclient!vh;")
	private final Class250 aClass250_62;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public final int anInt5597;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class186(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		new Class83(64);
		this.aClass250_62 = arg2;
		this.anInt5597 = this.aClass250_62.method5653(15);
	}
}
