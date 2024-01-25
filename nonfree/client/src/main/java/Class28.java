import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public class Class28 implements Interface12 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Lclient!f;")
	protected Class22 aClass22_13;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!ew;")
	protected final Class97 aClass97_2;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!pu;")
	private final Class270 aClass270_31;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!pu;Lclient!ew;)V")
	public Class28(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class97 arg1) {
		this.aClass97_2 = arg1;
		this.aClass270_31 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Z")
	@Override
	public final boolean method4316() {
		return this.aClass270_31.method5694(this.aClass97_2.anInt6633);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	@Override
	public final void method4315() {
		this.aClass22_13 = Static155.method2241(this.aClass97_2.anInt6633, this.aClass270_31);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4317() {
		@Pc(28) int local28 = this.aClass97_2.aClass335_13.method7396(Static573.anInt9475, this.aClass22_13.A()) + this.aClass97_2.anInt6629;
		@Pc(43) int local43 = this.aClass97_2.aClass122_12.method2394(Static103.anInt2084, this.aClass22_13.ca()) + this.aClass97_2.anInt6628;
		this.aClass22_13.method7662(local28, local43);
	}
}
