import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "[Lclient!ba;")
	private Class18[] aClass18Array1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(22) int local22 = Static263.anInt5504;
			@Pc(24) int local24 = Static363.anInt6995;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass90_41.method2389();
			this.method1584(local28);
			for (@Pc(39) int local39 = 0; local39 < Static363.anInt6995; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static263.anInt5504; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			this.method1584(super.aClass137_41.method3983());
		}
		return local9;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.aClass18Array1 = new Class18[arg1.method3124()];
			for (@Pc(14) int local14 = 0; local14 < this.aClass18Array1.length; local14++) {
				@Pc(20) int local20 = arg1.method3124();
				if (local20 == 0) {
					this.aClass18Array1[local14] = Static354.method5663(arg1);
				} else if (local20 == 1) {
					this.aClass18Array1[local14] = Static346.method5012(arg1);
				} else if (local20 == 2) {
					this.aClass18Array1[local14] = Static149.method2973(arg1);
				} else if (local20 == 3) {
					this.aClass18Array1[local14] = Static46.method884(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([[II)V")
	private void method1584(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static263.anInt5504;
		@Pc(9) int local9 = Static363.anInt6995;
		Static74.method3128(arg0);
		Static330.method5383(Static241.anInt5135, Static171.anInt3863);
		if (this.aClass18Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass18Array1.length; local23++) {
			@Pc(30) Class18 local30 = this.aClass18Array1[local23];
			@Pc(33) int local33 = local30.anInt3164;
			@Pc(36) int local36 = local30.anInt3162;
			if (local33 >= 0) {
				if (local36 >= 0) {
					local30.method2849(local7, local9);
				} else {
					local30.method2850(local7, local9);
				}
			} else if (local36 >= 0) {
				local30.method2847(local9, local7);
			}
		}
	}
}
