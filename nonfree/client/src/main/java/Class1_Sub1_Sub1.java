import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
	private int anInt68;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
	private int anInt81;

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
	private int anInt70 = -1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt70 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
	@Override
	public int method4448() {
		return this.anInt70;
	}

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "(I)V")
	@Override
	public void method4460() {
		super.method4460();
		this.anIntArray9 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396 && this.method63()) {
			@Pc(44) int local44 = this.anInt68 * (this.anInt81 == Static219.anInt4483 ? arg0 : arg0 * this.anInt81 / Static219.anInt4483);
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			@Pc(56) int[] local56 = local18[0];
			@Pc(66) int local66;
			@Pc(75) int local75;
			if (this.anInt68 == Static131.anInt2513) {
				for (local66 = 0; local66 < Static131.anInt2513; local66++) {
					local75 = this.anIntArray9[local44++];
					local52[local66] = (local75 & 0xFF) << 4;
					local48[local66] = local75 >> 4 & 0xFF0;
					local56[local66] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static131.anInt2513; local66++) {
					local75 = local66 * this.anInt68 / Static131.anInt2513;
					@Pc(127) int local127 = this.anIntArray9[local75 + local44];
					local52[local66] = (local127 & 0xFF) << 4;
					local48[local66] = local127 >> 4 & 0xFF0;
					local56[local66] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "(I)Z")
	private boolean method63() {
		if (this.anIntArray9 != null) {
			return true;
		} else if (this.anInt70 < 0) {
			return false;
		} else {
			@Pc(23) int local23 = Static131.anInt2513;
			@Pc(25) int local25 = Static219.anInt4483;
			@Pc(36) int local36 = Static259.anInterface3_1.method959(this.anInt70).aBoolean364 ? 64 : 128;
			this.anIntArray9 = Static259.anInterface3_1.method960(local36, local36, this.anInt70, 1.0F);
			this.anInt81 = local36;
			this.anInt68 = local36;
			Static130.method2052(local23, local25);
			return this.anIntArray9 != null;
		}
	}
}
