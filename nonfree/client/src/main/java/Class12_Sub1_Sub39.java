import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class12_Sub1_Sub39 extends Class12_Sub1 {

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
	private int anInt9410 = 4096;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "Z")
	private boolean aBoolean664 = true;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9410 = arg0.method5199();
		} else if (arg1 == 1) {
			this.aBoolean664 = arg0.method5216() == 1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(31) int[] local31 = this.method7795(0, arg0 - 1 & Static162.anInt3758);
			@Pc(37) int[] local37 = this.method7795(0, arg0);
			@Pc(47) int[] local47 = this.method7795(0, Static162.anInt3758 & arg0 + 1);
			@Pc(51) int[] local51 = local11[0];
			@Pc(55) int[] local55 = local11[1];
			@Pc(59) int[] local59 = local11[2];
			for (@Pc(61) int local61 = 0; local61 < Static357.anInt6670; local61++) {
				@Pc(75) int local75 = this.anInt9410 * (local47[local61] - local31[local61]);
				@Pc(94) int local94 = this.anInt9410 * (local37[Static149.anInt3278 & local61 + 1] - local37[Static149.anInt3278 & local61 - 1]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local75 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(137) int local137;
				@Pc(139) int local139;
				if (local128 == 0) {
					local135 = 0;
					local137 = 0;
					local139 = 0;
				} else {
					local137 = local75 / local128;
					local139 = 16777216 / local128;
					local135 = local94 / local128;
				}
				if (this.aBoolean664) {
					local139 = (local139 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local137 = (local137 >> 1) + 2048;
				}
				local51[local61] = local135;
				local55[local61] = local137;
				local59[local61] = local139;
			}
		}
		return local11;
	}
}
