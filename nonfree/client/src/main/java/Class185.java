import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class185 implements Interface23 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!xa;")
	private Class13 aClass13_16;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!bi;")
	private final Class31 aClass31_56;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!lr;")
	private final Class214 aClass214_1;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!bi;Lclient!lr;)V")
	public Class185(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class214 arg1) {
		this.aClass31_56 = arg0;
		this.aClass214_1 = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7806() {
		return this.aClass31_56.method679(this.aClass214_1.anInt5614);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7805() {
		@Pc(8) int local8 = Static9.anInt8933 >= Static2.anInt29 ? Static9.anInt8933 : Static2.anInt29;
		@Pc(19) int local19 = Static19.anInt390 <= Static576.anInt9547 ? Static576.anInt9547 : Static19.anInt390;
		@Pc(23) int local23 = this.aClass13_16.AA();
		@Pc(27) int local27 = this.aClass13_16.a();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local8;
		@Pc(37) int local37 = local27 * local8 / local23;
		@Pc(43) int local43 = (local19 - local37) / 2;
		if (local37 > local19) {
			local43 = 0;
			local31 = local19 * local23 / local27;
			local37 = local19;
			local29 = (local8 - local31) / 2;
		}
		this.aClass13_16.method8024(local29, local43, local31, local37);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	@Override
	public void method7804() {
		this.aClass13_16 = Static484.method7810(this.aClass31_56, this.aClass214_1.anInt5614);
	}
}
