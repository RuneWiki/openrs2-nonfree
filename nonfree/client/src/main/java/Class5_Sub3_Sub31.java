import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class5_Sub3_Sub31 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
	private int anInt8914 = 20;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	private int anInt8915 = 0;

	@OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
	private int anInt8916 = 1365;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	private int anInt8917 = 0;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			for (@Pc(27) int local27 = 0; local27 < Static7.anInt102; local27++) {
				@Pc(41) int local41 = this.anInt8917 + (Static382.anIntArray368[local27] << 12) / this.anInt8916;
				@Pc(53) int local53 = (Static458.anIntArray438[arg0] << 12) / this.anInt8916 + this.anInt8915;
				@Pc(59) int local59 = local41;
				@Pc(61) int local61 = local53;
				@Pc(67) int local67 = local41 * local41 >> 12;
				@Pc(73) int local73 = local53 * local53 >> 12;
				@Pc(75) int local75 = 0;
				while (local73 + local67 < 16384 && local75 < this.anInt8914) {
					local61 = local53 + (local61 * local59 >> 12) * 2;
					local59 = local67 + local41 - local73;
					local75++;
					local67 = local59 * local59 >> 12;
					local73 = local61 * local61 >> 12;
				}
				local21[local27] = this.anInt8914 - 1 <= local75 ? 0 : (local75 << 12) / this.anInt8914;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8916 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt8914 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt8917 = arg0.method7333();
		} else if (arg1 == 3) {
			this.anInt8915 = arg0.method7333();
		}
	}
}
