import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class3_Sub3_Sub23 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
	private int anInt4101;

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
	private int anInt4102;

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "[I")
	private int[] anIntArray344;

	@OriginalMember(owner = "client!mn", name = "W", descriptor = "I")
	private int anInt4106 = -1;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub23() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	@Override
	public void method5724() {
		super.method5724();
		this.anIntArray344 = null;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(Z)I")
	@Override
	public int method5728() {
		return this.anInt4106;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	@Override
	public void method5725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5725(arg0, arg1);
		if (this.anInt4106 >= 0) {
			@Pc(27) int local27 = Static305.anInterface9_6.method2396(this.anInt4106).aBoolean321 ? 64 : 128;
			this.anIntArray344 = Static305.anInterface9_6.method2395(local27, false, this.anInt4106, 1.0F, local27);
			this.anInt4101 = local27;
			this.anInt4102 = local27;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(40) int local40 = (Static182.anInt3888 == this.anInt4101 ? arg0 : this.anInt4101 * arg0 / Static182.anInt3888) * this.anInt4102;
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (Static131.anInt2755 == this.anInt4102) {
				for (local58 = 0; local58 < Static131.anInt2755; local58++) {
					local66 = this.anIntArray344[local40++];
					local52[local58] = (local66 & 0xFF) << 4;
					local48[local58] = local66 >> 4 & 0xFF0;
					local44[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static131.anInt2755; local58++) {
					local66 = this.anInt4102 * local58 / Static131.anInt2755;
					@Pc(115) int local115 = this.anIntArray344[local40 + local66];
					local52[local58] = (local115 & 0xFF) << 4;
					local48[local58] = local115 >> 4 & 0xFF0;
					local44[local58] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4106 = arg0.method3649();
		}
	}
}
