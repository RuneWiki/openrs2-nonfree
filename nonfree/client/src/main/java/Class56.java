import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class56 implements Interface17 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "Lclient!la;")
	private final Class196 aClass196_27;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class56(@OriginalArg(0) Class196 arg0) {
		this.aClass196_27 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I")
	@Override
	public int method6808() {
		return this.aClass196_27.method5122() ? 100 : this.aClass196_27.method5112();
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Lclient!wea;")
	@Override
	public Class370 method6809() {
		return Static623.aClass370_2;
	}
}
