import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class14_Sub7_Sub30 extends Class14_Sub7 {

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
	private int anInt8187 = 4;

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
	private int anInt8192 = 4;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(27) int local27 = Static613.anInt10114 / this.anInt8187;
			@Pc(32) int local32 = Static497.anInt8633 / this.anInt8192;
			@Pc(48) int[][] local48;
			if (local32 > 0) {
				@Pc(38) int local38 = arg0 % local32;
				local48 = this.method9384(local38 * Static497.anInt8633 / local32, 0);
			} else {
				local48 = this.method9384(0, 0);
			}
			@Pc(60) int[] local60 = local48[0];
			@Pc(64) int[] local64 = local48[1];
			@Pc(68) int[] local68 = local48[2];
			@Pc(72) int[] local72 = local18[0];
			@Pc(76) int[] local76 = local18[1];
			@Pc(80) int[] local80 = local18[2];
			for (@Pc(82) int local82 = 0; local82 < Static613.anInt10114; local82++) {
				@Pc(101) int local101;
				if (local27 > 0) {
					@Pc(95) int local95 = local82 % local27;
					local101 = Static613.anInt10114 * local95 / local27;
				} else {
					local101 = 0;
				}
				local72[local82] = local60[local101];
				local76[local82] = local64[local101];
				local80[local82] = local68[local101];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt8187 = arg1.method7695(110);
		} else if (arg0 == 1) {
			this.anInt8192 = arg1.method7695(120);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(30) int local30 = Static613.anInt10114 / this.anInt8187;
			@Pc(35) int local35 = Static497.anInt8633 / this.anInt8192;
			@Pc(54) int[] local54;
			@Pc(44) int local44;
			if (local35 > 0) {
				local44 = arg0 % local35;
				local54 = this.method9379(0, Static497.anInt8633 * local44 / local35);
			} else {
				local54 = this.method9379(0, 0);
			}
			for (local44 = 0; local44 < Static613.anInt10114; local44++) {
				if (local30 > 0) {
					@Pc(77) int local77 = local44 % local30;
					local21[local44] = local54[Static613.anInt10114 * local77 / local30];
				} else {
					local21[local44] = local54[0];
				}
			}
		}
		return local21;
	}
}
