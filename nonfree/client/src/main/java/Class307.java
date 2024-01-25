import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class307 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Lclient!pj;")
	private final Class248 aClass248_97;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	public final int anInt8656;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class307(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		new Class330(64);
		this.aClass248_97 = arg2;
		this.anInt8656 = this.aClass248_97.method5793(15);
	}
}
