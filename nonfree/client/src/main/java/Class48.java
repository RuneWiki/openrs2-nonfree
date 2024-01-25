import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class48 {

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!uu;")
	private final Class250 aClass250_26;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	public final int anInt1323;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class48(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		new Class268(64);
		this.aClass250_26 = arg2;
		this.anInt1323 = this.aClass250_26.method5815(15);
	}
}
