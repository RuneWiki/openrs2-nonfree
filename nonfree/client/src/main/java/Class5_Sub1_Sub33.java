import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class5_Sub1_Sub33 extends Class5_Sub1 {

	@OriginalMember(owner = "client!tfa", name = "H", descriptor = "[Lclient!jr;")
	private Class125[] aClass125Array1;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.aClass125Array1 = new Class125[arg1.method8529()];
			for (@Pc(39) int local39 = 0; local39 < this.aClass125Array1.length; local39++) {
				@Pc(45) int local45 = arg1.method8529();
				if (local45 == 0) {
					this.aClass125Array1[local39] = Static549.method7983(arg1);
				} else if (local45 == 1) {
					this.aClass125Array1[local39] = Static354.method5309(arg1);
				} else if (local45 == 2) {
					this.aClass125Array1[local39] = Static286.method4305(arg1);
				} else if (local45 == 3) {
					this.aClass125Array1[local39] = Static286.method4307(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean786 = arg1.method8529() == 1;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(17) int local17 = Static648.anInt9588;
			@Pc(19) int local19 = Static269.anInt4686;
			@Pc(23) int[][] local23 = new int[local19][local17];
			@Pc(28) int[][][] local28 = super.aClass307_41.method7493();
			this.method8180(local23);
			for (@Pc(34) int local34 = 0; local34 < Static269.anInt4686; local34++) {
				@Pc(40) int[] local40 = local23[local34];
				@Pc(44) int[][] local44 = local28[local34];
				@Pc(48) int[] local48 = local44[0];
				@Pc(52) int[] local52 = local44[1];
				@Pc(56) int[] local56 = local44[2];
				for (@Pc(58) int local58 = 0; local58 < Static648.anInt9588; local58++) {
					@Pc(64) int local64 = local40[local58];
					local56[local58] = (local64 & 0xFF) << 4;
					local52[local58] = local64 >> 4 & 0xFF0;
					local48[local58] = local64 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I[[I)V")
	private void method8180(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static648.anInt9588;
		@Pc(9) int local9 = Static269.anInt4686;
		Static137.method1950(arg0);
		Static120.method1682(Static116.anInt3312, Static542.anInt9254);
		if (this.aClass125Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass125Array1.length; local30++) {
			@Pc(37) Class125 local37 = this.aClass125Array1[local30];
			@Pc(40) int local40 = local37.anInt10754;
			@Pc(43) int local43 = local37.anInt10751;
			if (local40 >= 0) {
				if (local43 < 0) {
					local37.method9263(local7, local9);
				} else {
					local37.method9264(local9, local7);
				}
			} else if (local43 >= 0) {
				local37.method9258(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			this.method8180(super.aClass83_41.method1412());
		}
		return local9;
	}
}
