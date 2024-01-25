import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public class Class129 implements Interface25 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "Lclient!it;")
	protected Class28 aClass28_32;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "Lclient!la;")
	private final Class207 aClass207_117;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!nda;")
	protected final Class177 aClass177_2;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!la;Lclient!nda;)V")
	public Class129(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class177 arg1) {
		this.aClass207_117 = arg0;
		this.aClass177_2 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8109() {
		return this.aClass207_117.method4678(this.aClass177_2.anInt4702);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8110() {
		@Pc(24) int local24 = this.aClass177_2.aClass245_11.method5486(Static79.anInt1667, this.aClass28_32.method4035()) + this.aClass177_2.anInt4699;
		@Pc(38) int local38 = this.aClass177_2.aClass183_8.method4291(this.aClass28_32.method4042(), Static627.anInt10422) + this.aClass177_2.anInt4704;
		this.aClass28_32.method4040(local24, local38);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	@Override
	public final void method8111() {
		this.aClass28_32 = Static124.method1879(this.aClass207_117, this.aClass177_2.anInt4702);
	}
}
