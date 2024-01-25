import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class250 {

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!qs;")
	private final Class211 aClass211_82;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	public final int anInt7363;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;)V")
	public Class250(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		new Class91(64);
		this.aClass211_82 = arg2;
		this.anInt7363 = this.aClass211_82.method4772(15);
	}
}
