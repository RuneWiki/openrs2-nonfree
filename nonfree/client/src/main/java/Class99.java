import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public class Class99 implements Interface12 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!hu;")
	protected Class44 aClass44_16;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!rw;")
	protected final Class129 aClass129_2;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!wu;")
	private final Class384 aClass384_54;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!wu;Lclient!rw;)V")
	public Class99(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class129 arg1) {
		this.aClass129_2 = arg1;
		this.aClass384_54 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8775() {
		@Pc(24) int local24 = this.aClass129_2.aClass204_6.method4964(this.aClass44_16.method5313(), Static519.anInt7022) + this.aClass129_2.anInt3269;
		@Pc(38) int local38 = this.aClass129_2.aClass288_7.method6878(Static363.anInt6413, this.aClass44_16.method5325()) + this.aClass129_2.anInt3271;
		this.aClass44_16.method5312(local24, local38);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
	@Override
	public final void method8777() {
		this.aClass44_16 = Static68.method1134(this.aClass129_2.anInt3276, this.aClass384_54);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8776() {
		return this.aClass384_54.method8883(this.aClass129_2.anInt3276);
	}
}
