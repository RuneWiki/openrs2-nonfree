import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class151 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!tca;")
	public Class337 aClass337_1;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	private int anInt4349;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	public int anInt4350;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	public int anInt4354;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!jc;)V")
	public void method4010(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method3030();
			if (local18 == 0) {
				return;
			}
			this.method4011(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLclient!jc;I)V")
	private void method4011(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4349 = arg0.method3018();
		} else if (arg1 == 2) {
			this.anInt4354 = arg0.method3030();
			this.anInt4350 = arg0.method3030();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Lclient!cu;")
	public synchronized Class64 method4012() {
		@Pc(19) Class64 local19 = (Class64) this.aClass337_1.aClass359_64.method8517((long) this.anInt4349);
		if (local19 != null) {
			return local19;
		}
		local19 = Static691.method1249(this.aClass337_1.aClass223_112, this.anInt4349, 0);
		if (local19 != null) {
			this.aClass337_1.aClass359_64.method8515((long) this.anInt4349, local19);
		}
		return local19;
	}
}
