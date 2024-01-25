import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	private int anInt1001 = 1;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
	private int anInt1003 = 204;

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private int anInt1006 = 1;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			for (@Pc(24) int local24 = 0; local24 < Static263.anInt5504; local24++) {
				@Pc(30) int local30 = Static269.anIntArray507[local24];
				@Pc(34) int local34 = Static76.anIntArray121[arg0];
				@Pc(41) int local41 = local30 * this.anInt1006 >> 12;
				@Pc(48) int local48 = local34 * this.anInt1001 >> 12;
				@Pc(58) int local58 = this.anInt1006 * (local30 % (4096 / this.anInt1006));
				@Pc(68) int local68 = local34 % (4096 / this.anInt1001) * this.anInt1001;
				if (local68 < this.anInt1003) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 != 1) {
						local18[local24] = 0;
						continue;
					}
					if (this.anInt1003 > local58) {
						local18[local24] = 0;
						continue;
					}
				}
				if (local58 < this.anInt1003) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 > 0) {
						local18[local24] = 0;
						continue;
					}
				}
				local18[local24] = 4096;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt1006 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt1001 = arg1.method3124();
		} else if (arg0 == 2) {
			this.anInt1003 = arg1.method3104();
		}
	}
}
