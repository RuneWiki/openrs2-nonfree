import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
	private int anInt7578 = 0;

	@OriginalMember(owner = "client!oda", name = "J", descriptor = "I")
	private int anInt7577 = 4096;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(29) int[] local29 = this.method8340(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static164.anInt8839; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt7578 <= local37 && local37 <= this.anInt7577 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7578 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt7577 = arg1.method8414();
		}
	}
}
