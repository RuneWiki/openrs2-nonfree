import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class266 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Lclient!qn;")
	private final Class211 aClass211_98;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
	public final int anInt7472;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ae;ILclient!qn;)V")
	public Class266(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		new Class137(64);
		this.aClass211_98 = arg2;
		this.anInt7472 = this.aClass211_98.method4365(15);
	}
}
