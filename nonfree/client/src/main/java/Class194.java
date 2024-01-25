import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class194 implements Interface17 {

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lclient!iea;")
	private Class31 aClass31_13;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "Lclient!kd;")
	private final Class198 aClass198_1;

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "Lclient!nd;")
	private final Class238 aClass238_131;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!nd;Lclient!kd;)V")
	public Class194(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class198 arg1) {
		this.aClass198_1 = arg1;
		this.aClass238_131 = arg0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
	@Override
	public void method8062() {
		this.aClass31_13 = Static449.method6408(this.aClass198_1.anInt5224, this.aClass238_131);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8064() {
		@Pc(12) int local12 = Static143.anInt2998 >= Class16_Sub1_Sub5_Sub1.lb ? Static143.anInt2998 : Class16_Sub1_Sub5_Sub1.lb;
		@Pc(23) int local23 = Static71.anInt1925 <= Static478.anInt7732 ? Static478.anInt7732 : Static71.anInt1925;
		@Pc(27) int local27 = this.aClass31_13.method8788();
		@Pc(31) int local31 = this.aClass31_13.method8807();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local12;
		@Pc(41) int local41 = local31 * local12 / local27;
		@Pc(48) int local48 = (local23 - local41) / 2;
		if (local23 < local41) {
			local35 = local23 * local27 / local31;
			local48 = 0;
			local41 = local23;
			local33 = (local12 - local35) / 2;
		}
		this.aClass31_13.method8795(local33, local48, local35, local41);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8063() {
		return this.aClass238_131.method5568(this.aClass198_1.anInt5224);
	}
}
