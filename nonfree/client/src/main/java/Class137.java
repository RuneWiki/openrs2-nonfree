import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class137 implements Interface5 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!fs;")
	private Class134 aClass134_22;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!la;")
	private final Class208 aClass208_49;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!pm;")
	private final Class280 aClass280_1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!la;Lclient!pm;)V")
	public Class137(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class280 arg1) {
		this.aClass208_49 = arg0;
		this.aClass280_1 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8947() {
		return this.aClass208_49.method4977(this.aClass280_1.anInt7820);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	@Override
	public void method8948() {
		this.aClass134_22 = Static332.method5056(this.aClass208_49, this.aClass280_1.anInt7820);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8946() {
		@Pc(11) int local11 = Static70.anInt1125 <= Static264.anInt4559 ? Static264.anInt4559 : Static70.anInt1125;
		@Pc(23) int local23 = Static47.anInt794 < Static631.anInt10283 ? Static631.anInt10283 : Static47.anInt794;
		@Pc(27) int local27 = this.aClass134_22.method9231();
		@Pc(31) int local31 = this.aClass134_22.method9232();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local11;
		@Pc(41) int local41 = local31 * local11 / local27;
		@Pc(48) int local48 = (local23 - local41) / 2;
		if (local23 < local41) {
			local41 = local23;
			local48 = 0;
			local35 = local27 * local23 / local31;
			local33 = (local11 - local35) / 2;
		}
		this.aClass134_22.method9227(local33, local48, local35, local41);
	}
}
