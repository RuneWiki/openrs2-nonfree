import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class3_Sub3_Sub16 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
	private int anInt2950 = 1;

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
	private int anInt2947 = 0;

	@OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
	private int anInt2954 = 0;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		Static336.method5504();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(24) int local24 = Static269.anIntArray433[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static131.anInt2755; local32++) {
				@Pc(38) int local38 = Static151.anIntArray211[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt2947 == 0) {
					local70 = (local38 - local24) * this.anInt2950;
				} else {
					@Pc(60) int local60 = local44 * local44 + local30 * local30 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt2950) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt2954 == 0) {
					local70 = Static290.anIntArray474[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2954 == 2) {
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

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2947 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt2954 = arg0.method3643();
		} else if (arg1 == 3) {
			this.anInt2950 = arg0.method3643();
		}
	}
}
