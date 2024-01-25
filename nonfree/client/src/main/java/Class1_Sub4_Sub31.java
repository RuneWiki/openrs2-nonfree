import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class1_Sub4_Sub31 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
	private int anInt5904 = 4096;

	@OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
	private int anInt5907 = 4096;

	@OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
	private int anInt5905 = 409;

	@OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
	private int anInt5906 = 4096;

	@OriginalMember(owner = "client!ru", name = "I", descriptor = "[I")
	private final int[] anIntArray544 = new int[3];

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47) {
			@Pc(29) int[][] local29 = this.method5956(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static66.anInt1511; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray544[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (local68 > this.anInt5905) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(102) int local102 = local37[local55];
					local68 = local102 - this.anIntArray544[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt5905 < local68) {
						local45[local55] = local61;
						local49[local55] = local102;
						local53[local55] = local41[local55];
					} else {
						@Pc(142) int local142 = local41[local55];
						local68 = local142 - this.anIntArray544[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (local68 > this.anInt5905) {
							local45[local55] = local61;
							local49[local55] = local102;
							local53[local55] = local142;
						} else {
							local45[local55] = local61 * this.anInt5907 >> 12;
							local49[local55] = local102 * this.anInt5904 >> 12;
							local53[local55] = this.anInt5906 * local142 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt5905 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt5906 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt5904 = arg1.method5362();
		} else if (arg0 == 3) {
			this.anInt5907 = arg1.method5362();
		} else if (arg0 == 4) {
			@Pc(57) int local57 = arg1.method5399();
			this.anIntArray544[2] = local57 >> 12 & 0x0;
			this.anIntArray544[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray544[1] = local57 >> 4 & 0xFF0;
		}
	}
}
