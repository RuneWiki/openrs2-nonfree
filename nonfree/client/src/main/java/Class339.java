import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class339 implements Interface16 {

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "Lclient!hu;")
	private Class21 aClass21_31;

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "Lclient!kk;")
	private final Class180 aClass180_1;

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "Lclient!oh;")
	private final Class237 aClass237_137;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!oh;Lclient!kk;)V")
	public Class339(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class180 arg1) {
		this.aClass180_1 = arg1;
		this.aClass237_137 = arg0;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8623() {
		return this.aClass237_137.method6296(this.aClass180_1.anInt5898);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	@Override
	public void method8624() {
		this.aClass21_31 = Static269.method4648(this.aClass237_137, this.aClass180_1.anInt5898);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8622() {
		@Pc(12) int local12 = Static235.anInt5298 > Static328.anInt9768 ? Static235.anInt5298 : Static328.anInt9768;
		@Pc(19) int local19 = Static313.anInt6355 > Static594.anInt10159 ? Static313.anInt6355 : Static594.anInt10159;
		@Pc(23) int local23 = this.aClass21_31.method5779();
		@Pc(27) int local27 = this.aClass21_31.method5785();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local12;
		@Pc(37) int local37 = local12 * local27 / local23;
		@Pc(44) int local44 = (local19 - local37) / 2;
		if (local19 < local37) {
			local31 = local19 * local23 / local27;
			local37 = local19;
			local44 = 0;
			local29 = (local12 - local31) / 2;
		}
		this.aClass21_31.method5777(local29, local44, local31, local37);
	}
}
