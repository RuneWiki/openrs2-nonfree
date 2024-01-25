import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class3_Sub2_Sub31 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qda", name = "I", descriptor = "I")
	private int anInt7740 = 20;

	@OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
	private int anInt7739 = 0;

	@OriginalMember(owner = "client!qda", name = "M", descriptor = "I")
	private int anInt7743 = 0;

	@OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
	private int anInt7736 = 1365;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			for (@Pc(25) int local25 = 0; local25 < Static201.anInt3738; local25++) {
				@Pc(39) int local39 = this.anInt7743 + (Static57.anIntArray536[local25] << 12) / this.anInt7736;
				@Pc(51) int local51 = (Static376.anIntArray665[arg0] << 12) / this.anInt7736 + this.anInt7739;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local65 + local71 < 16384 && local73 < this.anInt7740) {
					local59 = (local59 * local57 >> 12) * 2 + local51;
					local57 = local65 + local39 - local71;
					local73++;
					local71 = local59 * local59 >> 12;
					local65 = local57 * local57 >> 12;
				}
				local11[local25] = this.anInt7740 - 1 > local73 ? (local73 << 12) / this.anInt7740 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7736 = arg0.method5610();
		} else if (arg1 == 1) {
			this.anInt7740 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt7743 = arg0.method5610();
		} else if (arg1 == 3) {
			this.anInt7739 = arg0.method5610();
		}
	}
}
