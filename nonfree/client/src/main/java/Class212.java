import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class212 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "Lclient!fc;")
	private final Class71 aClass71_78;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public final int anInt5774;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!dk;ILclient!fc;)V")
	public Class212(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2) {
		new Class154(64);
		this.aClass71_78 = arg2;
		this.anInt5774 = this.aClass71_78.method1580(15);
	}
}
