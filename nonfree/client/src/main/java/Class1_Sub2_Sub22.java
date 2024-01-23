import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	private int anInt3134 = 4096;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
	private int anInt3133 = 4096;

	@OriginalMember(owner = "client!ld", name = "Z", descriptor = "[I")
	private int[] anIntArray250 = new int[3];

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
	private int anInt3138 = 409;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
	private int anInt3137 = 4096;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3138 = arg0.method2593();
		} else if (arg1 == 1) {
			this.anInt3134 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt3137 = arg0.method2593();
		} else if (arg1 == 3) {
			this.anInt3133 = arg0.method2593();
		} else if (arg1 == 4) {
			@Pc(68) int local68 = arg0.method2588();
			this.anIntArray250[1] = local68 >> 4 & 0xFF0;
			this.anIntArray250[2] = local68 >> 12 & 0x0;
			this.anIntArray250[0] = (local68 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(31) int[][] local31 = this.method4575(0, arg0);
			@Pc(35) int[] local35 = local31[2];
			@Pc(39) int[] local39 = local31[0];
			@Pc(43) int[] local43 = local20[1];
			@Pc(47) int[] local47 = local31[1];
			@Pc(51) int[] local51 = local20[0];
			@Pc(55) int[] local55 = local20[2];
			for (@Pc(57) int local57 = 0; local57 < Static299.anInt5670; local57++) {
				@Pc(64) int local64 = local39[local57];
				@Pc(72) int local72 = local64 - this.anIntArray250[0];
				if (local72 < 0) {
					local72 = -local72;
				}
				if (this.anInt3138 >= local72) {
					@Pc(105) int local105 = local47[local57];
					local72 = local105 - this.anIntArray250[1];
					if (local72 < 0) {
						local72 = -local72;
					}
					if (this.anInt3138 < local72) {
						local51[local57] = local64;
						local43[local57] = local105;
						local55[local57] = local35[local57];
					} else {
						@Pc(148) int local148 = local35[local57];
						local72 = local148 - this.anIntArray250[2];
						if (local72 < 0) {
							local72 = -local72;
						}
						if (this.anInt3138 < local72) {
							local51[local57] = local64;
							local43[local57] = local105;
							local55[local57] = local148;
						} else {
							local51[local57] = this.anInt3133 * local64 >> 12;
							local43[local57] = local105 * this.anInt3137 >> 12;
							local55[local57] = local148 * this.anInt3134 >> 12;
						}
					}
				} else {
					local51[local57] = local64;
					local43[local57] = local47[local57];
					local55[local57] = local35[local57];
				}
			}
		}
		return local20;
	}
}
