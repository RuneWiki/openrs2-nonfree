import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
	private int anInt346;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt342 = arg1.method208();
		} else if (arg0 == 1) {
			this.anInt346 = arg1.method208();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(21) int[] local21 = this.method2904(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static141.anInt3261; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt342 <= local29 && this.anInt346 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
