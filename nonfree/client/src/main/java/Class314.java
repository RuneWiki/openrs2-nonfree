import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class314 {

	@OriginalMember(owner = "client!su", name = "c", descriptor = "Lclient!la;")
	private final Class196 aClass196_110;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "I")
	public final int anInt9080;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class314(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		new Class102(64);
		this.aClass196_110 = arg2;
		this.anInt9080 = this.aClass196_110.method5118(15);
	}
}
