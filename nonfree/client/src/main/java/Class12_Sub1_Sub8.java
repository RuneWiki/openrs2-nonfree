import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class12_Sub1_Sub8 extends Class12_Sub1 {

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
	private int anInt2632 = 4096;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2632 = arg0.method5199();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(33) int[] local33 = this.method7795(0, Static162.anInt3758 & arg0 - 1);
			@Pc(39) int[] local39 = this.method7795(0, arg0);
			@Pc(51) int[] local51 = this.method7795(0, Static162.anInt3758 & arg0 + 1);
			for (@Pc(53) int local53 = 0; local53 < Static357.anInt6670; local53++) {
				@Pc(67) int local67 = (local51[local53] - local33[local53]) * this.anInt2632;
				@Pc(87) int local87 = (local39[Static149.anInt3278 & local53 + 1] - local39[local53 - 1 & Static149.anInt3278]) * this.anInt2632;
				@Pc(91) int local91 = local87 >> 12;
				@Pc(95) int local95 = local67 >> 12;
				@Pc(101) int local101 = local91 * local91 >> 12;
				@Pc(107) int local107 = local95 * local95 >> 12;
				@Pc(121) int local121 = (int) (Math.sqrt((double) ((float) (local107 + local101 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132 = local121 == 0 ? 0 : 16777216 / local121;
				local13[local53] = 4096 - local132;
			}
		}
		return local13;
	}
}
