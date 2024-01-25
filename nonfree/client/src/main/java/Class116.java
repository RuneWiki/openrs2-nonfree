import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class116 implements Interface12 {

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "Lclient!f;")
	private Class22 aClass22_15;

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "Lclient!pu;")
	private final Class270 aClass270_35;

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "Lclient!ul;")
	private final Class332 aClass332_1;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!pu;Lclient!ul;)V")
	public Class116(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class332 arg1) {
		this.aClass270_35 = arg0;
		this.aClass332_1 = arg1;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	@Override
	public void method4315() {
		this.aClass22_15 = Static155.method2241(this.aClass332_1.anInt8935, this.aClass270_35);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4316() {
		return this.aClass270_35.method5694(this.aClass332_1.anInt8935);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BZ)V")
	@Override
	public void method4317() {
		@Pc(20) int local20 = Static130.anInt2566 > Static573.anInt9475 ? Static130.anInt2566 : Static573.anInt9475;
		@Pc(31) int local31 = Static103.anInt2084 < Static499.anInt4149 ? Static499.anInt4149 : Static103.anInt2084;
		@Pc(35) int local35 = this.aClass22_15.A();
		@Pc(39) int local39 = this.aClass22_15.ca();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local20;
		@Pc(49) int local49 = local39 * local20 / local35;
		@Pc(56) int local56 = (local31 - local49) / 2;
		if (local49 > local31) {
			local49 = local31;
			local56 = 0;
			local43 = local31 * local35 / local39;
			local41 = (local20 - local43) / 2;
		}
		this.aClass22_15.method7653(local41, local56, local43, local49);
	}
}
