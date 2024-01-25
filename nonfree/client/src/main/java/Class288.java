import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class288 implements Interface21 {

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "Lclient!pga;")
	private Class32 aClass32_36;

	@OriginalMember(owner = "client!rha", name = "h", descriptor = "Lclient!vd;")
	private final Class353 aClass353_95;

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "Lclient!hba;")
	private final Class124 aClass124_1;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lclient!vd;Lclient!hba;)V")
	public Class288(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class124 arg1) {
		this.aClass353_95 = arg0;
		this.aClass124_1 = arg1;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7903() {
		@Pc(12) int local12 = Static321.anInt6137 <= Static507.anInt8741 ? Static507.anInt8741 : Static321.anInt6137;
		@Pc(23) int local23 = Static356.anInt6630 > Static106.anInt2101 ? Static356.anInt6630 : Static106.anInt2101;
		@Pc(27) int local27 = this.aClass32_36.method5080();
		@Pc(31) int local31 = this.aClass32_36.method5079();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local12;
		@Pc(41) int local41 = local12 * local31 / local27;
		@Pc(48) int local48 = (local23 - local41) / 2;
		if (local23 < local41) {
			local41 = local23;
			local35 = local23 * local27 / local31;
			local48 = 0;
			local33 = (local12 - local35) / 2;
		}
		this.aClass32_36.method5090(local33, local48, local35, local41);
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)V")
	@Override
	public void method7902() {
		this.aClass32_36 = Static293.method5063(this.aClass124_1.anInt4041, this.aClass353_95);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		return this.aClass353_95.method8401(this.aClass124_1.anInt4041);
	}
}
