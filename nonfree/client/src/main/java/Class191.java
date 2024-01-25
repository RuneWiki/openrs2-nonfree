import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class191 {

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!ul;")
	private final Class246 aClass246_165;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public final int anInt5264;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class191(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		new Class134(64);
		this.aClass246_165 = arg2;
		this.anInt5264 = this.aClass246_165.method5492(15);
	}
}
