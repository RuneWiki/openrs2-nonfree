import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class48 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "Lclient!pe;")
	private final Class254 aClass254_23;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	public final int anInt1703;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!vd;ILclient!pe;)V")
	public Class48(@OriginalArg(0) Class335 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		new Class211(64);
		this.aClass254_23 = arg2;
		this.anInt1703 = this.aClass254_23.method6396(15);
	}
}
