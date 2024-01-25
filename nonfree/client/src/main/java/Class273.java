import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class273 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!dda;")
	private final Class53 aClass53_133;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public final int anInt8357;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!oda;ILclient!dda;)V")
	public Class273(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2) {
		new Class231(64);
		this.aClass53_133 = arg2;
		this.anInt8357 = this.aClass53_133.method1592(15);
	}
}
