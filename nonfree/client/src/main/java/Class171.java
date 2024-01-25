import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class171 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "Lclient!nd;")
	private final Class238 aClass238_118;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public final int anInt4843;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class171(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		new Class69(64);
		this.aClass238_118 = arg2;
		this.anInt4843 = this.aClass238_118.method5592(15);
	}
}
