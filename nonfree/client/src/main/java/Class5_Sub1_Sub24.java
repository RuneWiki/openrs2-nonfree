import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class5_Sub1_Sub24 extends Class5_Sub1 {

	@OriginalMember(owner = "client!lu", name = "I", descriptor = "Z")
	private boolean aBoolean257 = true;

	@OriginalMember(owner = "client!lu", name = "D", descriptor = "Z")
	private boolean aBoolean256 = true;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(37) int[] local37 = this.method5772(0, this.aBoolean257 ? Static157.anInt2733 - arg0 : arg0);
			if (this.aBoolean256) {
				for (@Pc(50) int local50 = 0; local50 < Static148.anInt2666; local50++) {
					local11[local50] = local37[Static273.anInt4299 - local50];
				}
			} else {
				Static468.method3859(local37, 0, local11, 0, Static148.anInt2666);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.aBoolean256 = arg1.method5539() == 1;
		} else if (arg0 == 1) {
			this.aBoolean257 = arg1.method5539() == 1;
		} else if (arg0 == 2) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(37) int[][] local37 = this.method5764(0, this.aBoolean257 ? Static157.anInt2733 - arg0 : arg0);
			@Pc(41) int[] local41 = local37[0];
			@Pc(45) int[] local45 = local37[1];
			@Pc(49) int[] local49 = local37[2];
			@Pc(53) int[] local53 = local19[0];
			@Pc(57) int[] local57 = local19[1];
			@Pc(61) int[] local61 = local19[2];
			@Pc(66) int local66;
			if (this.aBoolean256) {
				for (local66 = 0; local66 < Static148.anInt2666; local66++) {
					local53[local66] = local41[Static273.anInt4299 - local66];
					local57[local66] = local45[Static273.anInt4299 - local66];
					local61[local66] = local49[Static273.anInt4299 - local66];
				}
			} else {
				for (local66 = 0; local66 < Static148.anInt2666; local66++) {
					local53[local66] = local41[local66];
					local57[local66] = local45[local66];
					local61[local66] = local49[local66];
				}
			}
		}
		return local19;
	}
}
