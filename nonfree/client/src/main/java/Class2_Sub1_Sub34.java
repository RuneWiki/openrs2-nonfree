import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
	private int anInt6242 = 0;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
	private int anInt6243 = 1365;

	@OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
	private int anInt6245 = 0;

	@OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
	private int anInt6246 = 20;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			for (@Pc(25) int local25 = 0; local25 < Static391.anInt7118; local25++) {
				@Pc(39) int local39 = (Static167.anIntArray267[local25] << 12) / this.anInt6243 + this.anInt6242;
				@Pc(51) int local51 = this.anInt6245 + (Static229.anIntArray382[arg0] << 12) / this.anInt6243;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local71 + local65 < 16384 && this.anInt6246 > local73) {
					local59 = (local57 * local59 >> 12) * 2 + local51;
					local57 = local39 + local65 - local71;
					local73++;
					local71 = local59 * local59 >> 12;
					local65 = local57 * local57 >> 12;
				}
				local19[local25] = local73 < this.anInt6246 - 1 ? (local73 << 12) / this.anInt6246 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt6243 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt6246 = arg1.method5753();
		} else if (arg0 == 2) {
			this.anInt6242 = arg1.method5753();
		} else if (arg0 == 3) {
			this.anInt6245 = arg1.method5753();
		}
	}
}
