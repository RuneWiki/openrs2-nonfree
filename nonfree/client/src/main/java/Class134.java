import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public final class Class134 {

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "Lclient!mv;")
	private final Class229 aClass229_38;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	public final int anInt2751;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class134(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		new Class21(64);
		this.aClass229_38 = arg2;
		this.anInt2751 = this.aClass229_38.method4981(15);
	}
}
