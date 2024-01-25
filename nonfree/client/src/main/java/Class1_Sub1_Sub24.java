import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ns", name = "K", descriptor = "Z")
	private boolean aBoolean329 = true;

	@OriginalMember(owner = "client!ns", name = "L", descriptor = "Z")
	private boolean aBoolean330 = true;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(37) int[] local37 = this.method6013(this.aBoolean330 ? Static279.anInt5435 - arg0 : arg0, 0);
			if (this.aBoolean329) {
				for (@Pc(50) int local50 = 0; local50 < Static85.anInt1910; local50++) {
					local19[local50] = local37[Static346.anInt6542 - local50];
				}
			} else {
				Static374.method2828(local37, 0, local19, 0, Static85.anInt1910);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.aBoolean329 = arg1.method2132() == 1;
		} else if (arg0 == 1) {
			this.aBoolean330 = arg1.method2132() == 1;
		} else if (arg0 == 2) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(33) int[][] local33 = this.method6006(0, this.aBoolean330 ? Static279.anInt5435 - arg0 : arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local16[0];
			@Pc(53) int[] local53 = local16[1];
			@Pc(57) int[] local57 = local16[2];
			@Pc(62) int local62;
			if (this.aBoolean329) {
				for (local62 = 0; local62 < Static85.anInt1910; local62++) {
					local49[local62] = local37[Static346.anInt6542 - local62];
					local53[local62] = local41[Static346.anInt6542 - local62];
					local57[local62] = local45[Static346.anInt6542 - local62];
				}
			} else {
				for (local62 = 0; local62 < Static85.anInt1910; local62++) {
					local49[local62] = local37[local62];
					local53[local62] = local41[local62];
					local57[local62] = local45[local62];
				}
			}
		}
		return local16;
	}
}
