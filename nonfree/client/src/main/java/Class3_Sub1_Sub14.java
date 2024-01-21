import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
	private int anInt2215;

	@OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
	private int anInt2217;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2217 = arg1.method1510();
		} else if (arg0 == 1) {
			this.anInt2215 = arg1.method1510();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(21) int[] local21 = this.method3120(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static129.anInt3285; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt2217 && local29 <= this.anInt2215 ? 4096 : 0;
			}
		}
		return local11;
	}
}
