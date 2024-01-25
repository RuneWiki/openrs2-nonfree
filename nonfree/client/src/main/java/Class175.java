import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class175 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!jp;")
	private Class1 aClass1_154;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
	private int anInt5007 = 0;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Lclient!bu;")
	private final Class38 aClass38_21;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!bu;)V")
	public Class175(@OriginalArg(0) Class38 arg0) {
		this.aClass38_21 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)Lclient!jp;")
	public Class1 method3822() {
		@Pc(21) Class1 local21;
		if (this.anInt5007 > 0 && this.aClass1_154 != this.aClass38_21.aClass1Array1[this.anInt5007 - 1]) {
			local21 = this.aClass1_154;
			this.aClass1_154 = local21.aClass1_264;
			return local21;
		}
		while (this.aClass38_21.anInt1044 > this.anInt5007) {
			local21 = this.aClass38_21.aClass1Array1[this.anInt5007++].aClass1_264;
			if (local21 != this.aClass38_21.aClass1Array1[this.anInt5007 - 1]) {
				this.aClass1_154 = local21.aClass1_264;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)Lclient!jp;")
	public Class1 method3825() {
		this.anInt5007 = 0;
		return this.method3822();
	}
}
