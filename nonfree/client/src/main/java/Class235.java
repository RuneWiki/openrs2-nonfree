import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public class Class235 implements Interface7 {

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!f;")
	protected Class78 aClass78_32;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "Lclient!sea;")
	protected final Class194 aClass194_2;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!jn;")
	private final Class176 aClass176_125;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!jn;Lclient!sea;)V")
	public Class235(@OriginalArg(0) Class176 arg0, @OriginalArg(1) Class194 arg1) {
		this.aClass194_2 = arg1;
		this.aClass176_125 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7418() {
		@Pc(15) int local15 = this.aClass194_2.aClass258_4.method6279(Static501.anInt6750, this.aClass78_32.A()) + this.aClass194_2.anInt5694;
		@Pc(30) int local30 = this.aClass194_2.aClass250_6.method6077(this.aClass78_32.ca(), Static212.anInt3952) + this.aClass194_2.anInt5698;
		this.aClass78_32.method8185(local15, local30);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method7417() {
		return this.aClass176_125.method3996(this.aClass194_2.anInt5695);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	@Override
	public final void method7416() {
		this.aClass78_32 = Static335.method5482(this.aClass176_125, this.aClass194_2.anInt5695);
	}
}
