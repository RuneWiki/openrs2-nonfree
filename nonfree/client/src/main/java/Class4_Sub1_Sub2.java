import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
	private int anInt371 = 409;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
	private int anInt374 = 4096;

	@OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
	private int anInt378 = 4096;

	@OriginalMember(owner = "client!bl", name = "Z", descriptor = "[I")
	private int[] anIntArray40 = new int[3];

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
	private int anInt373 = 4096;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(23) int[][] local23 = this.method4723(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local12[1];
			@Pc(43) int[] local43 = local12[0];
			@Pc(47) int[] local47 = local12[2];
			for (@Pc(49) int local49 = 0; local49 < Static73.anInt1626; local49++) {
				@Pc(56) int local56 = local27[local49];
				@Pc(64) int local64 = local56 - this.anIntArray40[0];
				if (local64 < 0) {
					local64 = -local64;
				}
				if (local64 > this.anInt371) {
					local43[local49] = local56;
					local39[local49] = local31[local49];
					local47[local49] = local35[local49];
				} else {
					@Pc(98) int local98 = local31[local49];
					local64 = local98 - this.anIntArray40[1];
					if (local64 < 0) {
						local64 = -local64;
					}
					if (local64 <= this.anInt371) {
						@Pc(141) int local141 = local35[local49];
						local64 = local141 - this.anIntArray40[2];
						if (local64 < 0) {
							local64 = -local64;
						}
						if (this.anInt371 < local64) {
							local43[local49] = local56;
							local39[local49] = local98;
							local47[local49] = local141;
						} else {
							local43[local49] = local56 * this.anInt374 >> 12;
							local39[local49] = this.anInt373 * local98 >> 12;
							local47[local49] = local141 * this.anInt378 >> 12;
						}
					} else {
						local43[local49] = local56;
						local39[local49] = local98;
						local47[local49] = local35[local49];
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt371 = arg0.method4653();
		} else if (arg1 == 1) {
			this.anInt378 = arg0.method4653();
		} else if (arg1 == 2) {
			this.anInt373 = arg0.method4653();
		} else if (arg1 == 3) {
			this.anInt374 = arg0.method4653();
		} else if (arg1 == 4) {
			@Pc(55) int local55 = arg0.method4655();
			this.anIntArray40[0] = (local55 & 0xFF0000) << 4;
			this.anIntArray40[2] = local55 >> 12 & 0x0;
			this.anIntArray40[1] = local55 >> 4 & 0xFF0;
		}
	}
}
