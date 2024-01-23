import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class1_Sub4_Sub7 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
	private int anInt1199 = 0;

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
	private int anInt1197 = 4096;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1199 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt1197 = arg0.method1386();
		} else if (arg1 == 2) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(30) int[] local30 = this.method4750(arg0, 0);
			for (@Pc(32) int local32 = 0; local32 < Static182.anInt3492; local32++) {
				@Pc(43) int local43 = local30[local32];
				if (this.anInt1199 > local43) {
					local20[local32] = this.anInt1199;
				} else if (this.anInt1197 < local43) {
					local20[local32] = this.anInt1197;
				} else {
					local20[local32] = local43;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(28) int[][] local28 = this.method4749(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[1];
			@Pc(48) int[] local48 = local18[0];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static182.anInt3492; local54++) {
				@Pc(65) int local65 = local32[local54];
				@Pc(69) int local69 = local36[local54];
				@Pc(73) int local73 = local40[local54];
				if (this.anInt1199 > local65) {
					local48[local54] = this.anInt1199;
				} else if (local65 > this.anInt1197) {
					local48[local54] = this.anInt1197;
				} else {
					local48[local54] = local65;
				}
				if (this.anInt1199 > local69) {
					local44[local54] = this.anInt1199;
				} else if (this.anInt1197 >= local69) {
					local44[local54] = local69;
				} else {
					local44[local54] = this.anInt1197;
				}
				if (this.anInt1199 > local73) {
					local52[local54] = this.anInt1199;
				} else if (local73 > this.anInt1197) {
					local52[local54] = this.anInt1197;
				} else {
					local52[local54] = local73;
				}
			}
		}
		return local18;
	}
}
