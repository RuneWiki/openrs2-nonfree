import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class14_Sub1_Sub4 extends Class14_Sub1 {

	@OriginalMember(owner = "client!cea", name = "H", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!cea", name = "G", descriptor = "I")
	private int anInt1546 = 4096;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1546 = arg0.method5900();
		} else if (arg1 == 1) {
			this.aBoolean119 = arg0.method5866() == 1;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(31) int[] local31 = this.method8897(0, arg0 - 1 & Static52.anInt1266);
			@Pc(37) int[] local37 = this.method8897(0, arg0);
			@Pc(47) int[] local47 = this.method8897(0, arg0 + 1 & Static52.anInt1266);
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[1];
			@Pc(59) int[] local59 = local17[2];
			for (@Pc(61) int local61 = 0; local61 < Static371.anInt6835; local61++) {
				@Pc(74) int local74 = this.anInt1546 * (local47[local61] - local31[local61]);
				@Pc(94) int local94 = (local37[Static192.anInt3590 & local61 + 1] - local37[Static192.anInt3590 & local61 - 1]) * this.anInt1546;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(145) int local145;
				@Pc(137) int local137;
				@Pc(141) int local141;
				if (local128 == 0) {
					local141 = 0;
					local145 = 0;
					local137 = 0;
				} else {
					local137 = local74 / local128;
					local141 = 16777216 / local128;
					local145 = local94 / local128;
				}
				if (this.aBoolean119) {
					local137 = (local137 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
					local141 = (local141 >> 1) + 2048;
				}
				local51[local61] = local145;
				local55[local61] = local137;
				local59[local61] = local141;
			}
		}
		return local17;
	}
}
