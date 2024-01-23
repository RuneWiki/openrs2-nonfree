import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!af", name = "X", descriptor = "[I")
	private int[] anIntArray18;

	@OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!af", name = "S", descriptor = "I")
	private int anInt148 = -1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90 && this.method124()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(48) int local48 = (Static30.anInt572 == this.anInt158 ? arg0 : this.anInt158 * arg0 / Static30.anInt572) * this.anInt155;
			@Pc(52) int[] local52 = local11[2];
			@Pc(56) int[] local56 = local11[1];
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (Static76.anInt1531 == this.anInt155) {
				for (local62 = 0; local62 < Static76.anInt1531; local62++) {
					local70 = this.anIntArray18[local48++];
					local52[local62] = (local70 & 0xFF) << 4;
					local56[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static76.anInt1531; local62++) {
					local70 = local62 * this.anInt155 / Static76.anInt1531;
					@Pc(123) int local123 = this.anIntArray18[local48 + local70];
					local52[local62] = (local123 & 0xFF) << 4;
					local56[local62] = local123 >> 4 & 0xFF0;
					local28[local62] = local123 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(B)Z")
	private boolean method124() {
		if (this.anIntArray18 != null) {
			return true;
		} else if (this.anInt148 >= 0) {
			@Pc(16) int local16 = Static76.anInt1531;
			@Pc(18) int local18 = Static30.anInt572;
			@Pc(28) int local28 = Static230.anInterface4_2.method2509(this.anInt148) ? 64 : 128;
			this.anIntArray18 = Static230.anInterface4_2.method2506(this.anInt148);
			this.anInt158 = local28;
			this.anInt155 = local28;
			Static26.method384(local18, local16);
			return this.anIntArray18 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt148 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	@Override
	public void method3470() {
		super.method3470();
		this.anIntArray18 = null;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)I")
	@Override
	public int method3471() {
		return this.anInt148;
	}
}
