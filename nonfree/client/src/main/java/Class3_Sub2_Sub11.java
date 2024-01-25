import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class3_Sub2_Sub11 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
	private int anInt3222 = 1;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	private int anInt3223 = 1;

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
	private int anInt3225 = 204;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3223 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt3222 = arg0.method5633();
		} else if (arg1 == 2) {
			this.anInt3225 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			for (@Pc(23) int local23 = 0; local23 < Static201.anInt3738; local23++) {
				@Pc(29) int local29 = Static57.anIntArray536[local23];
				@Pc(33) int local33 = Static376.anIntArray665[arg0];
				@Pc(40) int local40 = this.anInt3223 * local29 >> 12;
				@Pc(47) int local47 = local33 * this.anInt3222 >> 12;
				@Pc(57) int local57 = this.anInt3223 * (local29 % (4096 / this.anInt3223));
				@Pc(67) int local67 = this.anInt3222 * (local33 % (4096 / this.anInt3222));
				if (local67 < this.anInt3225) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local17[local23] = 0;
						continue;
					}
					if (local57 < this.anInt3225) {
						local17[local23] = 0;
						continue;
					}
				}
				if (this.anInt3225 > local57) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local17[local23] = 0;
						continue;
					}
				}
				local17[local23] = 4096;
			}
		}
		return local17;
	}
}
