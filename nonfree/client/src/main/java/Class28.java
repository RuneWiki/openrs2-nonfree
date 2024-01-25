import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public final class Class28 {

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "Lclient!bt;")
	private final Class34 aClass34_7;

	@OriginalMember(owner = "client!bka", name = "e", descriptor = "I")
	public final int anInt900;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class28(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		new Class352(64);
		this.aClass34_7 = arg2;
		this.anInt900 = this.aClass34_7.method1233(15);
	}
}
