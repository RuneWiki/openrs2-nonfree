import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class4_Sub1_Sub18 extends Class4_Sub1 {

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt2728 = 4096;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(31) int[] local31 = this.method4538(0, Static19.anInt437 & arg0 - 1);
			@Pc(37) int[] local37 = this.method4538(0, arg0);
			@Pc(47) int[] local47 = this.method4538(0, Static19.anInt437 & arg0 + 1);
			@Pc(51) int[] local51 = local17[0];
			@Pc(55) int[] local55 = local17[2];
			@Pc(59) int[] local59 = local17[1];
			for (@Pc(61) int local61 = 0; local61 < Static68.anInt1753; local61++) {
				@Pc(75) int local75 = this.anInt2728 * (local47[local61] - local31[local61]);
				@Pc(94) int local94 = this.anInt2728 * (local37[Static295.anInt5711 & local61 + 1] - local37[Static295.anInt5711 & local61 - 1]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(108) int local108 = local75 >> 12;
				@Pc(114) int local114 = local108 * local108 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local104 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(138) int local138;
				@Pc(142) int local142;
				@Pc(134) int local134;
				if (local128 == 0) {
					local134 = 0;
					local142 = 0;
					local138 = 0;
				} else {
					local134 = 16777216 / local128;
					local138 = local94 / local128;
					local142 = local75 / local128;
				}
				if (this.aBoolean179) {
					local138 = (local138 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local51[local61] = local138;
				local59[local61] = local142;
				local55[local61] = local134;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2728 = arg1.method3085();
		} else if (arg0 == 1) {
			this.aBoolean179 = arg1.method3110() == 1;
		}
	}
}
