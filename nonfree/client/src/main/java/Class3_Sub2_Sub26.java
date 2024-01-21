import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ph", name = "Z", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
	private int anInt3126;

	@OriginalMember(owner = "client!ph", name = "eb", descriptor = "I")
	private int anInt3128;

	@OriginalMember(owner = "client!ph", name = "jb", descriptor = "I")
	private int anInt3131 = -1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V")
	@Override
	public void method3331() {
		super.method3331();
		this.anIntArray226 = null;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Z")
	private boolean method2240() {
		if (this.anIntArray226 != null) {
			return true;
		} else if (this.anInt3131 >= 0) {
			@Pc(18) int local18 = Static97.anInt2014;
			@Pc(20) int local20 = Static190.anInt3865;
			@Pc(30) int local30 = Static67.anInterface1_6.method559(this.anInt3131) ? 64 : 128;
			this.anIntArray226 = Static67.anInterface1_6.method565(this.anInt3131);
			this.anInt3128 = local30;
			this.anInt3126 = local30;
			Static19.method317(local18, local20);
			return this.anIntArray226 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3131 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135 && this.method2240()) {
			@Pc(40) int local40 = this.anInt3128 * (this.anInt3126 == Static97.anInt2014 ? arg0 : arg0 * this.anInt3126 / Static97.anInt2014);
			@Pc(44) int[] local44 = local16[1];
			@Pc(48) int[] local48 = local16[0];
			@Pc(52) int[] local52 = local16[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt3128 == Static190.anInt3865) {
				for (local62 = 0; local62 < Static190.anInt3865; local62++) {
					local71 = this.anIntArray226[local40++];
					local52[local62] = (local71 & 0xFF) << 4;
					local44[local62] = local71 >> 4 & 0xFF0;
					local48[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static190.anInt3865; local62++) {
					local71 = local62 * this.anInt3128 / Static190.anInt3865;
					@Pc(78) int local78 = this.anIntArray226[local71 + local40];
					local52[local62] = (local78 & 0xFF) << 4;
					local44[local62] = local78 >> 4 & 0xFF0;
					local48[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)I")
	@Override
	public int method3333() {
		return this.anInt3131;
	}
}
