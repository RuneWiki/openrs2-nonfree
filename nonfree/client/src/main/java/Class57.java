import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class57 implements Interface13 {

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "Lclient!tf;")
	private Class17 aClass17_13;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "Lclient!tda;")
	private final Class346 aClass346_1;

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "Lclient!bt;")
	private final Class34 aClass34_17;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!bt;Lclient!tda;)V")
	public Class57(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class346 arg1) {
		this.aClass346_1 = arg1;
		this.aClass34_17 = arg0;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
	@Override
	public void method8638() {
		this.aClass17_13 = Static203.method3069(this.aClass346_1.anInt8817, this.aClass34_17);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8636() {
		return this.aClass34_17.method1235(this.aClass346_1.anInt8817);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8637() {
		@Pc(20) int local20 = Static632.anInt9867 <= Static606.anInt9314 ? Static606.anInt9314 : Static632.anInt9867;
		@Pc(31) int local31 = Static357.anInt5421 <= Static353.anInt5368 ? Static353.anInt5368 : Static357.anInt5421;
		@Pc(35) int local35 = this.aClass17_13.method5256();
		@Pc(39) int local39 = this.aClass17_13.method5251();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local20;
		@Pc(49) int local49 = local39 * local20 / local35;
		@Pc(56) int local56 = (local31 - local49) / 2;
		if (local49 > local31) {
			local43 = local35 * local31 / local39;
			local49 = local31;
			local56 = 0;
			local41 = (local20 - local43) / 2;
		}
		this.aClass17_13.method5245(local41, local56, local43, local49);
	}
}
