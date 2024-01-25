import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class165 {

	@OriginalMember(owner = "client!jda", name = "f", descriptor = "Lclient!wu;")
	private final Class384 aClass384_63;

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
	public final int anInt4287;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class165(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		new Class293(64);
		this.aClass384_63 = arg2;
		this.anInt4287 = this.aClass384_63.method8862(15);
	}
}
