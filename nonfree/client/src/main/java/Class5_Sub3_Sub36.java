import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class5_Sub3_Sub36 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ur", name = "U", descriptor = "[B")
	public static final byte[] aByteArray93;

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "[Lclient!vb;")
	private Class7[] aClass7Array1;

	static {
		new Class85(null, "der Spieler ist momentan nicht verfügbar.", null, null);
		aByteArray93 = new byte[32896];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray93[local10++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass7Array1 = new Class7[arg0.method5115()];
			for (@Pc(18) int local18 = 0; local18 < this.aClass7Array1.length; local18++) {
				@Pc(24) int local24 = arg0.method5115();
				if (local24 == 0) {
					this.aClass7Array1[local18] = Static346.method5929(arg0);
				} else if (local24 == 1) {
					this.aClass7Array1[local18] = Static252.method4466(arg0);
				} else if (local24 == 2) {
					this.aClass7Array1[local18] = Static60.method1853(arg0);
				} else if (local24 == 3) {
					this.aClass7Array1[local18] = Static172.method4056(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			this.method5700(super.aClass188_41.method5316());
		}
		return local14;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(17) int local17 = Static7.anInt129;
			@Pc(19) int local19 = Static227.anInt4557;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass53_41.method970();
			this.method5700(local23);
			for (@Pc(34) int local34 = 0; local34 < Static227.anInt4557; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static7.anInt129; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([[IB)V")
	private void method5700(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static7.anInt129;
		@Pc(9) int local9 = Static227.anInt4557;
		Static258.method4532(arg0);
		Static298.method1799(Static221.anInt4359, Static177.anInt3515);
		if (this.aClass7Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass7Array1.length; local27++) {
			@Pc(34) Class7 local34 = this.aClass7Array1[local27];
			@Pc(37) int local37 = local34.anInt6834;
			@Pc(40) int local40 = local34.anInt6830;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method6053(local9, local7);
				}
			} else if (local40 >= 0) {
				local34.method6051(local7, local9);
			} else {
				local34.method6054(local9, local7);
			}
		}
	}
}
