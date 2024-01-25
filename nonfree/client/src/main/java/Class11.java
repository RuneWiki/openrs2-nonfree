import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class11 implements Interface21 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!ufa;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!wd;")
	private final Class371 aClass371_1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!ni;")
	private final Class223 aClass223_3;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ni;Lclient!wd;)V")
	public Class11(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class371 arg1) {
		this.aClass371_1 = arg1;
		this.aClass223_3 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	@Override
	public void method7992() {
		this.aClass4_1 = Static100.method2419(this.aClass371_1.anInt10505, this.aClass223_3);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7993() {
		return this.aClass223_3.method5951(this.aClass371_1.anInt10505);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7994() {
		@Pc(12) int local12 = Static294.anInt6026 > Static182.anInt4018 ? Static294.anInt6026 : Static182.anInt4018;
		@Pc(19) int local19 = Static52.anInt1780 >= Static277.anInt5899 ? Static52.anInt1780 : Static277.anInt5899;
		@Pc(23) int local23 = this.aClass4_1.method7700();
		@Pc(27) int local27 = this.aClass4_1.method7712();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local12;
		@Pc(37) int local37 = local12 * local27 / local23;
		@Pc(43) int local43 = (local19 - local37) / 2;
		if (local19 < local37) {
			local31 = local23 * local19 / local27;
			local43 = 0;
			local37 = local19;
			local29 = (local12 - local31) / 2;
		}
		this.aClass4_1.method7689(local29, local43, local31, local37);
	}
}
