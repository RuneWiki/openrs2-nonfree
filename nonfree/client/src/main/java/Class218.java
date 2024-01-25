import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class218 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!fo;")
	private final Class82 aClass82_85;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	public final int anInt6119;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class218(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		new Class102(64);
		this.aClass82_85 = arg2;
		this.anInt6119 = this.aClass82_85.method1823(15);
	}
}
