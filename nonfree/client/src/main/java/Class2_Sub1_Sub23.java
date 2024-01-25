import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
	private int anInt4287 = 1;

	@OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
	private int anInt4291 = 0;

	@OriginalMember(owner = "client!mk", name = "Q", descriptor = "I")
	private int anInt4292 = 0;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		Static155.method2766();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4291 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt4292 = arg1.method5732();
		} else if (arg0 == 3) {
			this.anInt4287 = arg1.method5732();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(24) int local24 = Static229.anIntArray382[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static391.anInt7118; local32++) {
				@Pc(38) int local38 = Static167.anIntArray267[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt4291 == 0) {
					local70 = this.anInt4287 * (local38 - local24);
				} else {
					@Pc(60) int local60 = local30 * local30 + local44 * local44 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt4287) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt4292 == 0) {
					local70 = Static40.anIntArray60[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4292 == 2) {
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
}
