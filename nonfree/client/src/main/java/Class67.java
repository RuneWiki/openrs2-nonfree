import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public class Class67 implements Interface20 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Lclient!kr;")
	protected Class20 aClass20_29;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "Lclient!eq;")
	private final Class97 aClass97_98;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "Lclient!rv;")
	protected final Class138 aClass138_2;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!eq;Lclient!rv;)V")
	public Class67(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class138 arg1) {
		this.aClass97_98 = arg0;
		this.aClass138_2 = arg1;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	@Override
	public final void method8024() {
		this.aClass20_29 = Static385.method5796(this.aClass97_98, this.aClass138_2.anInt4159);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022() {
		@Pc(20) int local20 = this.aClass138_2.aClass174_8.method4260(Static386.anInt6961, this.aClass20_29.method4588()) + this.aClass138_2.anInt4158;
		@Pc(34) int local34 = this.aClass138_2.aClass176_8.method4289(this.aClass20_29.method4576(), Static135.anInt3053) + this.aClass138_2.anInt4160;
		this.aClass20_29.method4582(local20, local34);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8023() {
		return this.aClass97_98.method2564(this.aClass138_2.anInt4159);
	}
}
