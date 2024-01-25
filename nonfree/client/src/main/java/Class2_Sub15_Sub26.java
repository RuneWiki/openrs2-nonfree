import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class2_Sub15_Sub26 extends Class2_Sub15 {

	@OriginalMember(owner = "client!qu", name = "H", descriptor = "I")
	private int anInt8870 = 4096;

	@OriginalMember(owner = "client!qu", name = "J", descriptor = "I")
	private int anInt8872 = 0;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(27) int[] local27 = this.method9725(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static329.anInt6017; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = this.anInt8872 <= local35 && this.anInt8870 >= local35 ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt8872 = arg1.method5211();
		} else if (arg0 == 1) {
			this.anInt8870 = arg1.method5211();
		}
	}
}
