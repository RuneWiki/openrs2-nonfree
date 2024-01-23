import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sl", name = "cb", descriptor = "[I")
	private int[] anIntArray550 = new int[3];

	@OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
	private int anInt5370 = 409;

	@OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
	private int anInt5372 = 4096;

	@OriginalMember(owner = "client!sl", name = "gb", descriptor = "I")
	private int anInt5373 = 4096;

	@OriginalMember(owner = "client!sl", name = "db", descriptor = "I")
	private int anInt5371 = 4096;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5370 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt5372 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt5373 = arg0.method2652();
		} else if (arg1 == 3) {
			this.anInt5371 = arg0.method2652();
		} else if (arg1 == 4) {
			@Pc(66) int local66 = arg0.method2634();
			this.anIntArray550[1] = local66 >> 4 & 0xFF0;
			this.anIntArray550[2] = local66 >> 12 & 0x0;
			this.anIntArray550[0] = (local66 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(25) int[][] local25 = this.method4758(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local15[1];
			@Pc(41) int[] local41 = local25[2];
			@Pc(45) int[] local45 = local15[0];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static75.anInt1848; local51++) {
				@Pc(58) int local58 = local29[local51];
				@Pc(66) int local66 = local58 - this.anIntArray550[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt5370 >= local66) {
					@Pc(105) int local105 = local33[local51];
					local66 = local105 - this.anIntArray550[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 <= this.anInt5370) {
						@Pc(144) int local144 = local41[local51];
						local66 = local144 - this.anIntArray550[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt5370 >= local66) {
							local45[local51] = this.anInt5371 * local58 >> 12;
							local37[local51] = this.anInt5373 * local105 >> 12;
							local49[local51] = this.anInt5372 * local144 >> 12;
						} else {
							local45[local51] = local58;
							local37[local51] = local105;
							local49[local51] = local144;
						}
					} else {
						local45[local51] = local58;
						local37[local51] = local105;
						local49[local51] = local41[local51];
					}
				} else {
					local45[local51] = local58;
					local37[local51] = local33[local51];
					local49[local51] = local41[local51];
				}
			}
		}
		return local15;
	}
}
