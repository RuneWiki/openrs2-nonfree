import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lma")
public final class Class228 implements Interface10 {

	@OriginalMember(owner = "client!lma", name = "d", descriptor = "Lclient!ug;")
	private Class43 aClass43_22;

	@OriginalMember(owner = "client!lma", name = "b", descriptor = "Lclient!nca;")
	private final Class254 aClass254_105;

	@OriginalMember(owner = "client!lma", name = "c", descriptor = "Lclient!gh;")
	private final Class136 aClass136_1;

	@OriginalMember(owner = "client!lma", name = "<init>", descriptor = "(Lclient!nca;Lclient!gh;)V")
	public Class228(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class136 arg1) {
		this.aClass254_105 = arg0;
		this.aClass136_1 = arg1;
	}

	@OriginalMember(owner = "client!lma", name = "a", descriptor = "(B)V")
	@Override
	public void method9561() {
		this.aClass43_22 = Static551.method6202(this.aClass254_105, this.aClass136_1.anInt3334);
	}

	@OriginalMember(owner = "client!lma", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method9562() {
		return this.aClass254_105.method6072(this.aClass136_1.anInt3334);
	}

	@OriginalMember(owner = "client!lma", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9560() {
		@Pc(24) int local24 = Static151.anInt7983 > Static33.anInt443 ? Static151.anInt7983 : Static33.anInt443;
		@Pc(32) int local32 = Static295.anInt4558 > Static277.anInt4340 ? Static295.anInt4558 : Static277.anInt4340;
		@Pc(36) int local36 = this.aClass43_22.method9587();
		@Pc(40) int local40 = this.aClass43_22.method9600();
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = local24;
		@Pc(50) int local50 = local40 * local24 / local36;
		@Pc(57) int local57 = (local32 - local50) / 2;
		if (local50 > local32) {
			local50 = local32;
			local44 = local32 * local36 / local40;
			local57 = 0;
			local42 = (local24 - local44) / 2;
		}
		this.aClass43_22.method9589(local42, local57, local44, local50);
	}
}
