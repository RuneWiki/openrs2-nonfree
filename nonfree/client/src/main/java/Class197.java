import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class197 {

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_74;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	public final int anInt5738;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class197(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		new Class68(64);
		this.aClass76_74 = arg2;
		this.anInt5738 = this.aClass76_74.method2108(15);
	}
}
