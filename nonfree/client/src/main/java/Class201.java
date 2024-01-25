import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class201 implements Interface19 {

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!oh;")
	private final Class233 aClass233_1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!oh;)V")
	public Class201(@OriginalArg(0) Class233 arg0) {
		this.aClass233_1 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6771() {
		@Pc(11) Class82 local11 = Static264.aClass82_3;
		@Pc(24) int local24 = this.aClass233_1.aClass72_9.method1433(Static112.anInt1892, 12) + this.aClass233_1.anInt6735;
		@Pc(37) int local37 = this.aClass233_1.aClass114_10.method2576(0, Static168.anInt3084) + this.aClass233_1.anInt6732;
		if (Static224.aClass114_4 == this.aClass233_1.aClass114_10) {
			local11.method7875(local24, this.aClass233_1.anInt6734, this.aClass233_1.anInt6733, this.aClass233_1.aString52, local37);
		} else if (this.aClass233_1.aClass114_10 == Static298.aClass114_7) {
			local11.method7873(this.aClass233_1.anInt6733, local24, this.aClass233_1.aString52, local37, this.aClass233_1.anInt6734);
		} else if (this.aClass233_1.aClass114_10 == Static498.aClass114_11) {
			local11.method7868(local24, local37, this.aClass233_1.anInt6733, this.aClass233_1.aString52, this.aClass233_1.anInt6734);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6772() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public void method6770() {
	}
}
