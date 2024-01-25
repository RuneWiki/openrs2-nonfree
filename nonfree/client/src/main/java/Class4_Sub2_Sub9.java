import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class4_Sub2_Sub9 extends Class4_Sub2 {

	@OriginalMember(owner = "client!gr", name = "I", descriptor = "[Lclient!lga;")
	private Class30[] aClass30Array1;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			this.method2922(super.aClass135_41.method3010());
		}
		return local9;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass30Array1 = new Class30[arg0.method7004()];
			for (@Pc(36) int local36 = 0; local36 < this.aClass30Array1.length; local36++) {
				@Pc(42) int local42 = arg0.method7004();
				if (local42 == 0) {
					this.aClass30Array1[local36] = Static86.method1809(arg0);
				} else if (local42 == 1) {
					this.aClass30Array1[local36] = Static456.method6707(arg0);
				} else if (local42 == 2) {
					this.aClass30Array1[local36] = Static327.method6512(arg0);
				} else if (local42 == 3) {
					this.aClass30Array1[local36] = Static144.method2512(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean713 = arg0.method7004() == 1;
			return;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([[II)V")
	private void method2922(@OriginalArg(0) int[][] arg0) {
		@Pc(11) int local11 = Static417.anInt5248;
		@Pc(13) int local13 = Static38.anInt1239;
		Static55.method1287(arg0);
		Static487.method7087(Static565.anInt5164, Static359.anInt6929);
		if (this.aClass30Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass30Array1.length; local27++) {
			@Pc(34) Class30 local34 = this.aClass30Array1[local27];
			@Pc(37) int local37 = local34.anInt9990;
			@Pc(40) int local40 = local34.anInt9988;
			if (local37 < 0) {
				if (local40 >= 0) {
					local34.method7661(local11, local13);
				}
			} else if (local40 >= 0) {
				local34.method7659(local13, local11);
			} else {
				local34.method7660(local11, local13);
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(22) int local22 = Static417.anInt5248;
			@Pc(24) int local24 = Static38.anInt1239;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass64_41.method1619();
			this.method2922(local28);
			for (@Pc(39) int local39 = 0; local39 < Static38.anInt1239; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static417.anInt5248; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
