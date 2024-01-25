import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hja")
public final class Class2_Sub15_Sub12 extends Class2_Sub15 {

	@OriginalMember(owner = "client!hja", name = "M", descriptor = "I")
	private int anInt4593 = 1;

	@OriginalMember(owner = "client!hja", name = "E", descriptor = "I")
	private int anInt4587 = 0;

	@OriginalMember(owner = "client!hja", name = "N", descriptor = "I")
	private int anInt4594 = 0;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(24) int local24 = Static401.anIntArray357[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static329.anInt6017; local32++) {
				@Pc(38) int local38 = Static537.anIntArray480[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt4594 == 0) {
					local58 = this.anInt4593 * (local38 - local24);
				} else {
					@Pc(70) int local70 = local30 * local30 + local44 * local44 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (this.anInt4593 * local58) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt4587 == 0) {
					local58 = Static148.anIntArray154[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4587 == 2) {
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

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		Static410.method6766();
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4594 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt4587 = arg1.method5203();
		} else if (arg0 == 3) {
			this.anInt4593 = arg1.method5203();
		}
	}
}
