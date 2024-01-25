import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public final class Class8 implements Interface22 {

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!lb;")
	private final Class221 aClass221_4;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class8(@OriginalArg(0) Class221 arg0) {
		this.aClass221_4 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
	@Override
	public int method8879() {
		return this.aClass221_4.method5091() ? 100 : this.aClass221_4.method5075();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lclient!pia;")
	@Override
	public Class287 method8878() {
		return Static489.aClass287_1;
	}
}
