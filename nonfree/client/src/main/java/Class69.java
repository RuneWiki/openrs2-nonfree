import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class69 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "Lclient!dk;")
	private final Class54 aClass54_30;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public final int anInt1894;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class69(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		new Class132(64);
		this.aClass54_30 = arg2;
		this.anInt1894 = this.aClass54_30.method1123(15);
	}
}
