import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
	private int anInt1020 = 1;

	@OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
	private int anInt1022 = 0;

	@OriginalMember(owner = "client!dk", name = "cb", descriptor = "I")
	private int anInt1026 = 0;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		Static96.method1624();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(24) int local24 = Static187.anIntArray345[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static11.anInt294; local32++) {
				@Pc(38) int local38 = Static36.anIntArray81[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt1022 == 0) {
					local58 = (local38 - local24) * this.anInt1020;
				} else {
					@Pc(70) int local70 = local30 * local30 + local44 * local44 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (this.anInt1020 * local58) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt1026 == 0) {
					local58 = Static10.anIntArray33[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1026 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local16[local32] = local58;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1022 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt1026 = arg0.method2945();
		} else if (arg1 == 3) {
			this.anInt1020 = arg0.method2945();
		}
	}
}
