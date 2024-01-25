import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class250 implements Interface4 {

	@OriginalMember(owner = "client!om", name = "m", descriptor = "Lclient!ac;")
	private Class5 aClass5_32;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "Lclient!ag;")
	private final Class12 aClass12_1;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!kha;")
	private final Class181 aClass181_77;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!kha;Lclient!ag;)V")
	public Class250(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class12 arg1) {
		this.aClass12_1 = arg1;
		this.aClass181_77 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	@Override
	public void method8346() {
		this.aClass5_32 = Static336.method3828(this.aClass181_77, this.aClass12_1.anInt84);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8344() {
		return this.aClass181_77.method5040(this.aClass12_1.anInt84);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8345() {
		@Pc(16) int local16 = Static199.anInt4634 < Static114.anInt2970 ? Static114.anInt2970 : Static199.anInt4634;
		@Pc(23) int local23 = Static256.anInt5669 <= Static523.anInt9075 ? Static523.anInt9075 : Static256.anInt5669;
		@Pc(27) int local27 = this.aClass5_32.method7589();
		@Pc(31) int local31 = this.aClass5_32.method7585();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local16;
		@Pc(41) int local41 = local16 * local31 / local27;
		@Pc(48) int local48 = (local23 - local41) / 2;
		if (local23 < local41) {
			local35 = local27 * local23 / local31;
			local48 = 0;
			local41 = local23;
			local33 = (local16 - local35) / 2;
		}
		this.aClass5_32.method7590(local33, local48, local35, local41);
	}
}
