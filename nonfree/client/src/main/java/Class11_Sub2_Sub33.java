import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class11_Sub2_Sub33 extends Class11_Sub2 {

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
	private int anInt5645 = 1;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	private int anInt5642 = 204;

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
	private int anInt5649 = 1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			for (@Pc(24) int local24 = 0; local24 < Static339.anInt6549; local24++) {
				@Pc(30) int local30 = Static73.anIntArray91[local24];
				@Pc(34) int local34 = Static155.anIntArray196[arg0];
				@Pc(41) int local41 = local30 * this.anInt5645 >> 12;
				@Pc(48) int local48 = local34 * this.anInt5649 >> 12;
				@Pc(58) int local58 = local30 % (4096 / this.anInt5645) * this.anInt5645;
				@Pc(68) int local68 = this.anInt5649 * (local34 % (4096 / this.anInt5649));
				if (this.anInt5642 > local68) {
					for (local41 -= local48; local41 < 0; local41 += 4) {
					}
					while (local41 > 3) {
						local41 -= 4;
					}
					if (local41 != 1) {
						local18[local24] = 0;
						continue;
					}
					if (this.anInt5642 > local58) {
						local18[local24] = 0;
						continue;
					}
				}
				if (this.anInt5642 > local58) {
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

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5645 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt5649 = arg0.method5185();
		} else if (arg1 == 2) {
			this.anInt5642 = arg0.method5187();
		}
	}
}
