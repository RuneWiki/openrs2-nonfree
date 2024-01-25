import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "[Lclient!fn;")
	private Class25[] aClass25Array1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z[[I)V")
	private void method1804(@OriginalArg(1) int[][] arg0) {
		@Pc(12) int local12 = Static85.anInt1910;
		@Pc(14) int local14 = Static208.anInt4105;
		Static206.method4906(arg0);
		Static130.method2678(Static346.anInt6542, Static279.anInt5435);
		if (this.aClass25Array1 == null) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < this.aClass25Array1.length; local28++) {
			@Pc(35) Class25 local35 = this.aClass25Array1[local28];
			@Pc(38) int local38 = local35.anInt7041;
			@Pc(41) int local41 = local35.anInt7042;
			if (local38 >= 0) {
				if (local41 >= 0) {
					local35.method6072(local14, local12);
				} else {
					local35.method6074(local14, local12);
				}
			} else if (local41 >= 0) {
				local35.method6075(local14, local12);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			this.method1804(super.aClass98_41.method2852());
		}
		return local17;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.aClass25Array1 = new Class25[arg1.method2132()];
			for (@Pc(37) int local37 = 0; local37 < this.aClass25Array1.length; local37++) {
				@Pc(43) int local43 = arg1.method2132();
				if (local43 == 0) {
					this.aClass25Array1[local37] = Static272.method4845(arg1);
				} else if (local43 == 1) {
					this.aClass25Array1[local37] = Static15.method344(arg1);
				} else if (local43 == 2) {
					this.aClass25Array1[local37] = Static72.method1600(arg1);
				} else if (local43 == 3) {
					this.aClass25Array1[local37] = Static82.method1766(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean509 = arg1.method2132() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(22) int local22 = Static85.anInt1910;
			@Pc(24) int local24 = Static208.anInt4105;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass34_41.method1353();
			this.method1804(local28);
			for (@Pc(39) int local39 = 0; local39 < Static208.anInt4105; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static85.anInt1910; local63++) {
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
