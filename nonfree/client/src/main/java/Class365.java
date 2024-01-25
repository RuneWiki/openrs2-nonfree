import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class365 implements Interface6 {

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Lclient!f;")
	private Class5 aClass5_39;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!sea;")
	private final Class308 aClass308_197;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "Lclient!ec;")
	private final Class75 aClass75_1;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!sea;Lclient!ec;)V")
	public Class365(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class75 arg1) {
		this.aClass308_197 = arg0;
		this.aClass75_1 = arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7886() {
		return this.aClass308_197.method6538(this.aClass75_1.anInt1813);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	@Override
	public void method7888() {
		this.aClass5_39 = Static375.method5452(this.aClass75_1.anInt1813, this.aClass308_197);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7887() {
		@Pc(16) int local16 = Static349.anInt6422 <= Static318.anInt5819 ? Static318.anInt5819 : Static349.anInt6422;
		@Pc(27) int local27 = Static594.anInt9806 <= Static192.anInt3766 ? Static192.anInt3766 : Static594.anInt9806;
		@Pc(31) int local31 = this.aClass5_39.A();
		@Pc(35) int local35 = this.aClass5_39.ca();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = local16;
		@Pc(45) int local45 = local16 * local35 / local31;
		@Pc(52) int local52 = (local27 - local45) / 2;
		if (local27 < local45) {
			local45 = local27;
			local39 = local27 * local31 / local35;
			local52 = 0;
			local37 = (local16 - local39) / 2;
		}
		this.aClass5_39.method7801(local37, local52, local39, local45);
	}
}
