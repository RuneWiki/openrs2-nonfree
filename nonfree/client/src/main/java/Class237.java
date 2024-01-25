import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class237 {

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "Lclient!aj;")
	private final Class15 aClass15_106;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
	public final int anInt6307;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class237(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		new Class165(64);
		this.aClass15_106 = arg2;
		this.anInt6307 = this.aClass15_106.method512(15);
	}
}
