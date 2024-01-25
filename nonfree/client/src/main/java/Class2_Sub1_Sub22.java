import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lt", name = "P", descriptor = "Z")
	private boolean aBoolean306 = true;

	@OriginalMember(owner = "client!lt", name = "Q", descriptor = "I")
	private int anInt4203 = 4096;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(25) int[] local25 = this.method6069(0, arg0 - 1 & Static67.anInt1510);
			@Pc(31) int[] local31 = this.method6069(0, arg0);
			@Pc(41) int[] local41 = this.method6069(0, Static67.anInt1510 & arg0 + 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static391.anInt7118; local55++) {
				@Pc(68) int local68 = (local41[local55] - local25[local55]) * this.anInt4203;
				@Pc(88) int local88 = this.anInt4203 * (local31[local55 + 1 & Static235.anInt4676] - local31[local55 - 1 & Static235.anInt4676]);
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local68 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((double) ((float) (local108 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(139) int local139;
				@Pc(131) int local131;
				@Pc(135) int local135;
				if (local122 == 0) {
					local131 = 0;
					local139 = 0;
					local135 = 0;
				} else {
					local131 = local68 / local122;
					local135 = 16777216 / local122;
					local139 = local88 / local122;
				}
				if (this.aBoolean306) {
					local139 = (local139 >> 1) + 2048;
					local131 = (local131 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
				}
				local45[local55] = local139;
				local49[local55] = local131;
				local53[local55] = local135;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4203 = arg1.method5753();
		} else if (arg0 == 1) {
			this.aBoolean306 = arg1.method5732() == 1;
		}
	}
}
