import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class6_Sub4_Sub11 extends Class6_Sub4 {

	@OriginalMember(owner = "client!gaa", name = "E", descriptor = "I")
	private int anInt3606 = 0;

	@OriginalMember(owner = "client!gaa", name = "J", descriptor = "I")
	private int anInt3608 = 1365;

	@OriginalMember(owner = "client!gaa", name = "L", descriptor = "I")
	private int anInt3610 = 0;

	@OriginalMember(owner = "client!gaa", name = "N", descriptor = "I")
	private int anInt3611 = 20;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			for (@Pc(23) int local23 = 0; local23 < Static6.anInt111; local23++) {
				@Pc(37) int local37 = this.anInt3610 + (Static284.anIntArray482[local23] << 12) / this.anInt3608;
				@Pc(49) int local49 = this.anInt3606 + (Static629.anIntArray635[arg0] << 12) / this.anInt3608;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && this.anInt3611 > local71) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local63 + local37 - local69;
					local71++;
					local69 = local57 * local57 >> 12;
					local63 = local55 * local55 >> 12;
				}
				local11[local23] = local71 < this.anInt3611 - 1 ? (local71 << 12) / this.anInt3611 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt3608 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt3611 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt3610 = arg1.method8571();
		} else if (arg0 == 3) {
			this.anInt3606 = arg1.method8571();
		}
	}
}
