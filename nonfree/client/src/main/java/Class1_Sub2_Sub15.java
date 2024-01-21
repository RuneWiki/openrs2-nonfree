import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[Lclient!ab;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([[IB)V")
	private void method1448(@OriginalArg(0) int[][] arg0) {
		@Pc(7) int local7 = Static22.anInt596;
		@Pc(13) int local13 = Static181.anInt4508;
		Static5.method185(arg0);
		Static101.method2123(Static28.anInt833, Static14.anInt436);
		if (this.aClass3Array1 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass3Array1.length; local27++) {
			@Pc(34) Class3 local34 = this.aClass3Array1[local27];
			@Pc(37) int local37 = local34.anInt126;
			@Pc(40) int local40 = local34.anInt127;
			if (local37 >= 0) {
				if (local40 >= 0) {
					local34.method142(local7, local13);
				} else {
					local34.method143(local13, local7);
				}
			} else if (local40 >= 0) {
				local34.method145(local13, local7);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(22) int local22 = Static22.anInt596;
			@Pc(24) int local24 = Static181.anInt4508;
			@Pc(28) int[][] local28 = new int[local24][local22];
			@Pc(33) int[][][] local33 = super.aClass19_41.method1030();
			this.method1448(local28);
			for (@Pc(39) int local39 = 0; local39 < Static181.anInt4508; local39++) {
				@Pc(45) int[] local45 = local28[local39];
				@Pc(49) int[][] local49 = local33[local39];
				@Pc(53) int[] local53 = local49[0];
				@Pc(57) int[] local57 = local49[1];
				@Pc(61) int[] local61 = local49[2];
				for (@Pc(63) int local63 = 0; local63 < Static22.anInt596; local63++) {
					@Pc(69) int local69 = local45[local63];
					local61[local63] = (local69 & 0xFF) << 4;
					local57[local63] = local69 >> 4 & 0xFF0;
					local53[local63] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			this.method1448(super.aClass85_41.method3436());
		}
		return local14;
	}
}
