import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub5_Sub5 extends Class1_Sub5 {

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "[Lclient!pc;")
	private Class49[] aClass49Array1;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass49Array1 = new Class49[arg0.method5720()];
			for (@Pc(17) int local17 = 0; local17 < this.aClass49Array1.length; local17++) {
				@Pc(23) int local23 = arg0.method5720();
				if (local23 == 0) {
					this.aClass49Array1[local17] = Static236.method4203(arg0);
				} else if (local23 == 1) {
					this.aClass49Array1[local17] = Static76.method1301(arg0);
				} else if (local23 == 2) {
					this.aClass49Array1[local17] = Static112.method1813(arg0);
				} else if (local23 == 3) {
					this.aClass49Array1[local17] = Static261.method4698(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			this.method783(super.aClass214_41.method5647());
		}
		return local13;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(22) int local22 = Static75.anInt1566;
			@Pc(24) int local24 = Static129.anInt2574;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass151_41.method4014();
			this.method783(local28);
			for (@Pc(39) int local39 = 0; local39 < Static129.anInt2574; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static75.anInt1566; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([[IB)V")
	private void method783(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static75.anInt1566;
		@Pc(13) int local13 = Static129.anInt2574;
		Static288.method5032(arg0);
		Static220.method4065(Static42.anInt1137, Static239.anInt2816);
		if (this.aClass49Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass49Array1.length; local27++) {
			@Pc(34) Class49 local34 = this.aClass49Array1[local27];
			@Pc(37) int local37 = local34.anInt5597;
			@Pc(40) int local40 = local34.anInt5595;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method4887(local13, local7);
				}
			} else if (local40 < 0) {
				local34.method4891(local7, local13);
			} else {
				local34.method4890(local7, local13);
			}
		}
	}
}
