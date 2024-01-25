import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
	public final int anInt9096;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
	public final int anInt9095;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "[Z")
	public final boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "[I")
	public final int[] anIntArray571;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "[I")
	public final int[] anIntArray570;

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "[[I")
	public final int[][] anIntArrayArray90;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(I[B)V")
	public Class3_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt9096 = arg0;
		@Pc(11) Class3_Sub15 local11 = new Class3_Sub15(arg1);
		this.anInt9095 = local11.method8401();
		this.aBooleanArray25 = new boolean[this.anInt9095];
		this.anIntArray571 = new int[this.anInt9095];
		this.anIntArray570 = new int[this.anInt9095];
		this.anIntArrayArray90 = new int[this.anInt9095][];
		for (@Pc(38) int local38 = 0; local38 < this.anInt9095; local38++) {
			this.anIntArray570[local38] = local11.method8401();
			if (this.anIntArray570[local38] == 6) {
				this.anIntArray570[local38] = 2;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt9095; local71++) {
			this.aBooleanArray25[local71] = local11.method8401() == 1;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt9095; local92++) {
			this.anIntArray571[local92] = local11.method8414();
		}
		for (@Pc(108) int local108 = 0; local108 < this.anInt9095; local108++) {
			this.anIntArrayArray90[local108] = new int[local11.method8401()];
		}
		for (@Pc(129) int local129 = 0; local129 < this.anInt9095; local129++) {
			for (@Pc(133) int local133 = 0; local133 < this.anIntArrayArray90[local129].length; local133++) {
				this.anIntArrayArray90[local129][local133] = local11.method8401();
			}
		}
	}
}
