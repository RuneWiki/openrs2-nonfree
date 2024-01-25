import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class298 implements Interface6 {

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Lclient!f;")
	private Class10 aClass10_38;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Lclient!wea;")
	private final Class353 aClass353_1;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "Lclient!ga;")
	private final Class111 aClass111_112;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!ga;Lclient!wea;)V")
	public Class298(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class353 arg1) {
		this.aClass353_1 = arg1;
		this.aClass111_112 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	@Override
	public void method6804() {
		this.aClass10_38 = Static543.method7365(this.aClass111_112, this.aClass353_1.anInt9404);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6805() {
		return this.aClass111_112.method2434(this.aClass353_1.anInt9404);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6803() {
		@Pc(20) int local20 = Static483.anInt8133 >= Static443.anInt7718 ? Static483.anInt8133 : Static443.anInt7718;
		@Pc(31) int local31 = Static300.anInt5516 <= Static443.anInt7712 ? Static443.anInt7712 : Static300.anInt5516;
		@Pc(35) int local35 = this.aClass10_38.A();
		@Pc(39) int local39 = this.aClass10_38.ca();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local20;
		@Pc(49) int local49 = local20 * local39 / local35;
		@Pc(56) int local56 = (local31 - local49) / 2;
		if (local31 < local49) {
			local56 = 0;
			local49 = local31;
			local43 = local31 * local35 / local39;
			local41 = (local20 - local43) / 2;
		}
		this.aClass10_38.method7682(local41, local56, local43, local49);
	}
}
