import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "cb", descriptor = "[Lclient!vh;")
	private Class15[] aClass15Array1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(10) int[] local10 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			this.method58(super.aClass17_41.method472());
		}
		return local10;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aClass15Array1 = new Class15[arg0.method3793()];
			for (@Pc(19) int local19 = 0; local19 < this.aClass15Array1.length; local19++) {
				@Pc(25) int local25 = arg0.method3793();
				if (local25 == 0) {
					this.aClass15Array1[local19] = Static128.method3730(arg0);
				} else if (local25 == 1) {
					this.aClass15Array1[local19] = Static185.method3106(arg0);
				} else if (local25 == 2) {
					this.aClass15Array1[local19] = Static93.method1549(arg0);
				} else if (local25 == 3) {
					this.aClass15Array1[local19] = Static220.method3636(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[[I)V")
	private void method58(@OriginalArg(1) int[][] arg0) {
		@Pc(12) int local12 = Static157.anInt3431;
		@Pc(14) int local14 = Static187.anInt4033;
		Static160.method2698(arg0);
		Static221.method3637(Static74.anInt1679, Static148.anInt3213);
		if (this.aClass15Array1 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < this.aClass15Array1.length; local30++) {
			@Pc(37) Class15 local37 = this.aClass15Array1[local30];
			@Pc(40) int local40 = local37.anInt2287;
			@Pc(43) int local43 = local37.anInt2283;
			if (local40 >= 0) {
				if (local43 < 0) {
					local37.method1757(local14, local12);
				} else {
					local37.method1760(local14, local12);
				}
			} else if (local43 >= 0) {
				local37.method1765(local14, local12);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(22) int local22 = Static157.anInt3431;
			@Pc(24) int local24 = Static187.anInt4033;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass75_41.method2415();
			this.method58(local28);
			for (@Pc(39) int local39 = 0; local39 < Static187.anInt4033; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static157.anInt3431; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
