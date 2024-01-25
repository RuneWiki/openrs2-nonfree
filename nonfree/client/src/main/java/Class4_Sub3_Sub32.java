import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class4_Sub3_Sub32 extends Class4_Sub3 {

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "[Lclient!sr;")
	private Class31[] aClass31Array1;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.aClass31Array1 = new Class31[arg1.method4614()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass31Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method4614();
				if (local20 == 0) {
					this.aClass31Array1[local14] = Static463.method6258(arg1);
				} else if (local20 == 1) {
					this.aClass31Array1[local14] = Static45.method927(arg1);
				} else if (local20 == 2) {
					this.aClass31Array1[local14] = Static338.method4975(arg1);
				} else if (local20 == 3) {
					this.aClass31Array1[local14] = Static308.method4715(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean587 = arg1.method4614() == 1;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([[IZ)V")
	private void method5391(@OriginalArg(0) int[][] arg0) {
		@Pc(15) int local15 = Static304.anInt5637;
		@Pc(17) int local17 = Static191.anInt3822;
		Static280.method4410(arg0);
		Static308.method4722(Static279.anInt5254, Static429.anInt7355);
		if (this.aClass31Array1 == null) {
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < this.aClass31Array1.length; local31++) {
			@Pc(38) Class31 local38 = this.aClass31Array1[local31];
			@Pc(41) int local41 = local38.anInt3955;
			@Pc(44) int local44 = local38.anInt3958;
			if (local41 >= 0) {
				if (local44 < 0) {
					local38.method3543(local17, local15);
				} else {
					local38.method3544(local15, local17);
				}
			} else if (local44 >= 0) {
				local38.method3541(local17, local15);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6335(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass93_41.method2622(arg0);
		if (super.aClass93_41.aBoolean189) {
			@Pc(25) int local25 = Static304.anInt5637;
			@Pc(27) int local27 = Static191.anInt3822;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = super.aClass93_41.method2623();
			this.method5391(local31);
			for (@Pc(42) int local42 = 0; local42 < Static191.anInt3822; local42++) {
				@Pc(48) int[] local48 = local31[local42];
				@Pc(52) int[][] local52 = local36[local42];
				@Pc(56) int[] local56 = local52[0];
				@Pc(60) int[] local60 = local52[1];
				@Pc(64) int[] local64 = local52[2];
				for (@Pc(66) int local66 = 0; local66 < Static304.anInt5637; local66++) {
					@Pc(72) int local72 = local48[local66];
					local64[local66] = (local72 & 0xFF) << 4;
					local60[local66] = local72 >> 4 & 0xFF0;
					local56[local66] = local72 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			this.method5391(super.aClass157_41.method4028());
		}
		return local14;
	}
}
