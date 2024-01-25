import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class229 implements Interface4 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Lclient!nd;")
	private final Class238 aClass238_166;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class229(@OriginalArg(0) Class238 arg0) {
		this.aClass238_166 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Lclient!qia;")
	@Override
	public Class288 method6365() {
		return Static470.aClass288_2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
	@Override
	public int method6364() {
		return this.aClass238_166.method5586() ? 100 : this.aClass238_166.method5584();
	}
}
