import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class128 implements Interface22 {

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!lb;")
	private final Class221 aClass221_59;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString64;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!lb;Ljava/lang/String;)V")
	public Class128(@OriginalArg(0) Class221 arg0, @OriginalArg(1) String arg1) {
		this.aClass221_59 = arg0;
		this.aString64 = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lclient!pia;")
	@Override
	public Class287 method8878() {
		return Static489.aClass287_3;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	@Override
	public int method8879() {
		return this.aClass221_59.method5094(this.aString64) ? 100 : this.aClass221_59.method5069(this.aString64);
	}
}
