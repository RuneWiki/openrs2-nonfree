import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class14_Sub1_Sub36 extends Class14_Sub1 {

	@OriginalMember(owner = "client!uw", name = "K", descriptor = "Z")
	private boolean aBoolean723 = true;

	@OriginalMember(owner = "client!uw", name = "P", descriptor = "Z")
	private boolean aBoolean724 = true;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(34) int[][] local34 = this.method8904(0, this.aBoolean724 ? Static52.anInt1266 - arg0 : arg0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			@Pc(63) int local63;
			if (this.aBoolean723) {
				for (local63 = 0; local63 < Static371.anInt6835; local63++) {
					local50[local63] = local38[Static192.anInt3590 - local63];
					local54[local63] = local42[Static192.anInt3590 - local63];
					local58[local63] = local46[Static192.anInt3590 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static371.anInt6835; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(35) int[] local35 = this.method8897(0, this.aBoolean724 ? Static52.anInt1266 - arg0 : arg0);
			if (this.aBoolean723) {
				for (@Pc(48) int local48 = 0; local48 < Static371.anInt6835; local48++) {
					local11[local48] = local35[Static192.anInt3590 - local48];
				}
			} else {
				Static681.method2482(local35, 0, local11, 0, Static371.anInt6835);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean723 = arg0.method5866() == 1;
		} else if (arg1 == 1) {
			this.aBoolean724 = arg0.method5866() == 1;
		} else if (arg1 == 2) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}
}
