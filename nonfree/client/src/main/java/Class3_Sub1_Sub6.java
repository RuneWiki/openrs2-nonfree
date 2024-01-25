import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
	private int anInt1597 = 4096;

	@OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
	private int anInt1600 = 4096;

	@OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
	private int anInt1598 = 4096;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(29) int[][] local29 = this.method7779(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static307.anInt4846; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local69 == local65) {
					local45[local55] = this.anInt1600 * local61 >> 12;
					local49[local55] = this.anInt1598 * local65 >> 12;
					local53[local55] = this.anInt1597 * local69 >> 12;
				} else {
					local45[local55] = this.anInt1600;
					local49[local55] = this.anInt1598;
					local53[local55] = this.anInt1597;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt1600 = arg1.method7591();
		} else if (arg0 == 1) {
			this.anInt1598 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt1597 = arg1.method7591();
		}
	}
}
