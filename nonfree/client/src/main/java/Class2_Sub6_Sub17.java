import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub6_Sub17 extends Class2_Sub6 {

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
	private int anInt3327 = 4;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
	private int anInt3324 = 4;

	static {
		new Class221("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3324 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt3327 = arg0.method4240();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(25) int local25 = Static151.anInt2711 / this.anInt3324;
			@Pc(30) int local30 = Static372.anInt6520 / this.anInt3327;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method5640(0, Static372.anInt6520 * local36 / local30);
			} else {
				local46 = this.method5640(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static151.anInt2711; local80++) {
				@Pc(94) int local94;
				if (local25 > 0) {
					@Pc(88) int local88 = local80 % local25;
					local94 = local88 * Static151.anInt2711 / local25;
				} else {
					local94 = 0;
				}
				local70[local80] = local58[local94];
				local74[local80] = local62[local94];
				local78[local80] = local66[local94];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(27) int local27 = Static151.anInt2711 / this.anInt3324;
			@Pc(32) int local32 = Static372.anInt6520 / this.anInt3327;
			@Pc(50) int[] local50;
			@Pc(38) int local38;
			if (local32 > 0) {
				local38 = arg0 % local32;
				local50 = this.method5635(local38 * Static372.anInt6520 / local32, 0);
			} else {
				local50 = this.method5635(0, 0);
			}
			for (local38 = 0; local38 < Static151.anInt2711; local38++) {
				if (local27 <= 0) {
					local11[local38] = local50[0];
				} else {
					@Pc(78) int local78 = local38 % local27;
					local11[local38] = local50[Static151.anInt2711 * local78 / local27];
				}
			}
		}
		return local11;
	}
}
