import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!b", name = "ab", descriptor = "I")
	private int anInt380 = 0;

	@OriginalMember(owner = "client!b", name = "R", descriptor = "I")
	private int anInt375 = 0;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "I")
	private int anInt376 = 1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
	@Override
	public void method3563() {
		Static53.method1249();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt380 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt375 = arg1.method218();
		} else if (arg0 == 3) {
			this.anInt376 = arg1.method218();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(24) int local24 = Static160.anIntArray187[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static106.anInt3045; local32++) {
				@Pc(38) int local38 = Static15.anIntArray41[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt380 == 0) {
					local58 = this.anInt376 * (local38 - local24);
				} else {
					@Pc(71) int local71 = local44 * local44 + local30 * local30 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local71 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt376) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt375 == 0) {
					local58 = Static155.anIntArray438[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt375 == 2) {
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
}
