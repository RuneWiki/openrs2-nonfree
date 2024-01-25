import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wga")
public class Class399 implements Interface2 {

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "Lclient!kw;")
	protected Class178 aClass178_32;

	@OriginalMember(owner = "client!wga", name = "k", descriptor = "Lclient!os;")
	protected final Class227 aClass227_2;

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "Lclient!ik;")
	private final Class182 aClass182_129;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!ik;Lclient!os;)V")
	public Class399(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class227 arg1) {
		this.aClass227_2 = arg1;
		this.aClass182_129 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	@Override
	public final void method9316() {
		this.aClass178_32 = Static686.method9056(this.aClass182_129, this.aClass227_2.anInt5832);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9317() {
		@Pc(15) int local15 = this.aClass227_2.aClass223_9.method5074(this.aClass178_32.method7627(), Static221.anInt3616) + this.aClass227_2.anInt5833;
		@Pc(30) int local30 = this.aClass227_2.aClass352_9.method7803(Static700.anInt10927, this.aClass178_32.method7632()) + this.aClass227_2.anInt5837;
		this.aClass178_32.method7637(local15, local30);
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method9318() {
		return this.aClass182_129.method3964(this.aClass227_2.anInt5832);
	}
}
