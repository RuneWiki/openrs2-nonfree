import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub4_Sub33 extends Class1_Sub4 {

	@OriginalMember(owner = "client!re", name = "M", descriptor = "[Lclient!em;")
	private Class44[] aClass44Array1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([[IB)V")
	private void method3800(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static182.anInt3492;
		@Pc(9) int local9 = Static117.anInt2472;
		Static236.method3648(arg0);
		Static165.method2817(Static61.anInt1166, Static171.anInt3359);
		if (this.aClass44Array1 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass44Array1.length; local32++) {
			@Pc(46) Class44 local46 = this.aClass44Array1[local32];
			@Pc(49) int local49 = local46.anInt4980;
			@Pc(52) int local52 = local46.anInt4984;
			if (local49 < 0) {
				if (local52 >= 0) {
					local46.method4279(local9, local7);
				}
			} else if (local52 >= 0) {
				local46.method4284(local7, local9);
			} else {
				local46.method4277(local9, local7);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass44Array1 = new Class44[arg0.method1378()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass44Array1.length; local14++) {
				@Pc(27) int local27 = arg0.method1378();
				if (local27 == 0) {
					this.aClass44Array1[local14] = Static137.method2374(arg0);
				} else if (local27 == 1) {
					this.aClass44Array1[local14] = Static143.method2468(arg0);
				} else if (local27 == 2) {
					this.aClass44Array1[local14] = Static40.method4540(arg0);
				} else if (local27 == 3) {
					this.aClass44Array1[local14] = Static43.method808(arg0);
				}
			}
		} else if (arg1 == 1) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			this.method3800(this.aClass7_41.method112());
		}
		return local13;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(25) int local25 = Static182.anInt3492;
			@Pc(27) int local27 = Static117.anInt2472;
			@Pc(31) int[][] local31 = new int[local27][local25];
			@Pc(36) int[][][] local36 = this.aClass85_41.method2341();
			this.method3800(local31);
			for (@Pc(42) int local42 = 0; local42 < Static117.anInt2472; local42++) {
				@Pc(49) int[] local49 = local31[local42];
				@Pc(53) int[][] local53 = local36[local42];
				@Pc(57) int[] local57 = local53[1];
				@Pc(61) int[] local61 = local53[2];
				@Pc(65) int[] local65 = local53[0];
				for (@Pc(67) int local67 = 0; local67 < Static182.anInt3492; local67++) {
					@Pc(78) int local78 = local49[local67];
					local61[local67] = (local78 & 0xFF) << 4;
					local57[local67] = local78 >> 4 & 0xFF0;
					local65[local67] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}
}
