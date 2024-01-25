import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class284 implements Interface12 {

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "Lclient!hu;")
	private Class44 aClass44_20;

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "Lclient!wu;")
	private final Class384 aClass384_109;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "Lclient!qk;")
	private final Class289 aClass289_1;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!wu;Lclient!qk;)V")
	public Class284(@OriginalArg(0) Class384 arg0, @OriginalArg(1) Class289 arg1) {
		this.aClass384_109 = arg0;
		this.aClass289_1 = arg1;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8776() {
		return this.aClass384_109.method8883(this.aClass289_1.anInt7882);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8775() {
		@Pc(19) int local19 = Static519.anInt7022 >= Static254.anInt4283 ? Static519.anInt7022 : Static254.anInt4283;
		@Pc(30) int local30 = Static363.anInt6413 >= Static438.anInt7403 ? Static363.anInt6413 : Static438.anInt7403;
		@Pc(34) int local34 = this.aClass44_20.method5313();
		@Pc(38) int local38 = this.aClass44_20.method5325();
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = local19;
		@Pc(48) int local48 = local19 * local38 / local34;
		@Pc(55) int local55 = (local30 - local48) / 2;
		if (local48 > local30) {
			local48 = local30;
			local55 = 0;
			local42 = local34 * local30 / local38;
			local40 = (local19 - local42) / 2;
		}
		this.aClass44_20.method5329(local40, local55, local42, local48);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	@Override
	public void method8777() {
		this.aClass44_20 = Static68.method1134(this.aClass289_1.anInt7882, this.aClass384_109);
	}
}
