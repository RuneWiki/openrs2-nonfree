import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class14_Sub3_Sub20 extends Class14_Sub3 {

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
	private int anInt3200 = 0;

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
	private int anInt3202 = 1;

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
	private int anInt3206 = 0;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3206 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt3200 = arg0.method2548();
		} else if (arg1 == 3) {
			this.anInt3202 = arg0.method2548();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(24) int local24 = Static213.anIntArray381[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static294.anInt5657; local32++) {
				@Pc(38) int local38 = Static346.anIntArray638[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt3206 == 0) {
					local70 = (local38 - local24) * this.anInt3202;
				} else {
					@Pc(60) int local60 = local30 * local30 + local44 * local44 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt3202) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt3200 == 0) {
					local70 = Static345.anIntArray635[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3200 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local11[local32] = local70;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		Static74.method4762();
	}
}
