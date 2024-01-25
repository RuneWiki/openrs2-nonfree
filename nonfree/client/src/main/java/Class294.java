import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class294 implements Interface7 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!nf;")
	private Class102 aClass102_34;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!gj;")
	private final Class143 aClass143_114;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Lclient!bp;")
	private final Class45 aClass45_1;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!gj;Lclient!bp;)V")
	public Class294(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class45 arg1) {
		this.aClass143_114 = arg0;
		this.aClass45_1 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7985() {
		@Pc(20) int local20 = Static507.anInt8484 < Static654.anInt10064 ? Static654.anInt10064 : Static507.anInt8484;
		@Pc(27) int local27 = Static483.anInt8181 > Static581.anInt9218 ? Static483.anInt8181 : Static581.anInt9218;
		@Pc(31) int local31 = this.aClass102_34.method6951();
		@Pc(35) int local35 = this.aClass102_34.method6958();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = local20;
		@Pc(45) int local45 = local35 * local20 / local31;
		@Pc(52) int local52 = (local27 - local45) / 2;
		if (local45 > local27) {
			local45 = local27;
			local52 = 0;
			local39 = local27 * local31 / local35;
			local37 = (local20 - local39) / 2;
		}
		this.aClass102_34.method6947(local37, local52, local39, local45);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	@Override
	public void method7986() {
		this.aClass102_34 = Static188.method3032(this.aClass45_1.anInt1425, this.aClass143_114);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7984() {
		return this.aClass143_114.method3130(this.aClass45_1.anInt1425);
	}
}
