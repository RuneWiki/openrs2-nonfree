import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class142 implements Interface27 {

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Lclient!tb;")
	private Class49 aClass49_10;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Lclient!gca;")
	private final Class129 aClass129_1;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Lclient!lga;")
	private final Class223 aClass223_40;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!lga;Lclient!gca;)V")
	public Class142(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class129 arg1) {
		this.aClass129_1 = arg1;
		this.aClass223_40 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8039() {
		@Pc(15) int local15 = Static339.anInt5789 >= Static535.anInt4128 ? Static339.anInt5789 : Static535.anInt4128;
		@Pc(27) int local27 = Static274.anInt3226 > Static48.anInt6772 ? Static274.anInt3226 : Static48.anInt6772;
		@Pc(31) int local31 = this.aClass49_10.method8991();
		@Pc(35) int local35 = this.aClass49_10.method8987();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = local15;
		@Pc(45) int local45 = local35 * local15 / local31;
		@Pc(52) int local52 = (local27 - local45) / 2;
		if (local27 < local45) {
			local45 = local27;
			local39 = local27 * local31 / local35;
			local52 = 0;
			local37 = (local15 - local39) / 2;
		}
		this.aClass49_10.method8986(local37, local52, local39, local45);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8038() {
		return this.aClass223_40.method5285(this.aClass129_1.anInt3685);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	@Override
	public void method8040() {
		this.aClass49_10 = Static527.method7563(this.aClass223_40, this.aClass129_1.anInt3685);
	}
}
