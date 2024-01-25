import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class7_Sub4_Sub12 extends Class7_Sub4 {

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean220 = arg0.method2772() == 1;
		} else if (arg1 == 1) {
			this.aBoolean221 = arg0.method2772() == 1;
		} else if (arg1 == 2) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(37) int[] local37 = this.method5634(0, this.aBoolean221 ? Static153.anInt3263 - arg0 : arg0);
			if (this.aBoolean220) {
				for (@Pc(42) int local42 = 0; local42 < Static201.anInt4174; local42++) {
					local11[local42] = local37[Static110.anInt2508 - local42];
				}
			} else {
				Static366.method4204(local37, 0, local11, 0, Static201.anInt4174);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(23) int[][] local23 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(41) int[][] local41 = this.method5638(this.aBoolean221 ? Static153.anInt3263 - arg0 : arg0, 0);
			@Pc(45) int[] local45 = local41[0];
			@Pc(49) int[] local49 = local41[1];
			@Pc(53) int[] local53 = local41[2];
			@Pc(57) int[] local57 = local23[0];
			@Pc(61) int[] local61 = local23[1];
			@Pc(65) int[] local65 = local23[2];
			@Pc(70) int local70;
			if (this.aBoolean220) {
				for (local70 = 0; local70 < Static201.anInt4174; local70++) {
					local57[local70] = local45[Static110.anInt2508 - local70];
					local61[local70] = local49[Static110.anInt2508 - local70];
					local65[local70] = local53[Static110.anInt2508 - local70];
				}
			} else {
				for (local70 = 0; local70 < Static201.anInt4174; local70++) {
					local57[local70] = local45[local70];
					local61[local70] = local49[local70];
					local65[local70] = local53[local70];
				}
			}
		}
		return local23;
	}
}
