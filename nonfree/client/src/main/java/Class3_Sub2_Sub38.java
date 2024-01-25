import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vr", name = "G", descriptor = "[Lclient!gfa;")
	private Class74[] aClass74Array1;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			this.method8493(super.aClass340_41.method7838());
		}
		return local14;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aClass74Array1 = new Class74[arg0.method4888()];
			for (@Pc(19) int local19 = 0; local19 < this.aClass74Array1.length; local19++) {
				@Pc(25) int local25 = arg0.method4888();
				if (local25 == 0) {
					this.aClass74Array1[local19] = Static290.method4542(arg0);
				} else if (local25 == 1) {
					this.aClass74Array1[local19] = Static298.method4630(arg0);
				} else if (local25 == 2) {
					this.aClass74Array1[local19] = Static121.method2183(arg0);
				} else if (local25 == 3) {
					this.aClass74Array1[local19] = Static244.method3913(arg0);
				}
			}
		} else if (arg1 == 1) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B[[I)V")
	private void method8493(@OriginalArg(1) int[][] arg0) {
		@Pc(7) int local7 = Static30.anInt908;
		@Pc(9) int local9 = Static157.anInt2964;
		Static578.method7791(arg0);
		Static93.method1878(Static241.anInt4556, Static622.anInt9680);
		if (this.aClass74Array1 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass74Array1.length; local23++) {
			@Pc(30) Class74 local30 = this.aClass74Array1[local23];
			@Pc(33) int local33 = local30.anInt9644;
			@Pc(36) int local36 = local30.anInt9645;
			if (local33 < 0) {
				if (local36 >= 0) {
					local30.method8221(local9, local7);
				}
			} else if (local36 >= 0) {
				local30.method8218(local7, local9);
			} else {
				local30.method8219(local7, local9);
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(24) int local24 = Static30.anInt908;
			@Pc(26) int local26 = Static157.anInt2964;
			@Pc(30) int[][] local30 = new int[local26][local24];
			@Pc(35) int[][][] local35 = super.aClass115_41.method2720();
			this.method8493(local30);
			for (@Pc(41) int local41 = 0; local41 < Static157.anInt2964; local41++) {
				@Pc(47) int[] local47 = local30[local41];
				@Pc(51) int[][] local51 = local35[local41];
				@Pc(55) int[] local55 = local51[0];
				@Pc(59) int[] local59 = local51[1];
				@Pc(63) int[] local63 = local51[2];
				for (@Pc(65) int local65 = 0; local65 < Static30.anInt908; local65++) {
					@Pc(71) int local71 = local47[local65];
					local63[local65] = (local71 & 0xFF) << 4;
					local59[local65] = local71 >> 4 & 0xFF0;
					local55[local65] = local71 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}
}
