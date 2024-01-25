import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class6_Sub1_Sub37 extends Class6_Sub1 {

	@OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
	private int anInt10425 = 4096;

	@OriginalMember(owner = "client!vr", name = "M", descriptor = "I")
	private int anInt10428 = 4096;

	@OriginalMember(owner = "client!vr", name = "O", descriptor = "I")
	private int anInt10430 = 4096;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(25) int[][] local25 = this.method8959(arg0, 0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			for (@Pc(51) int local51 = 0; local51 < Static479.anInt8231; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(61) int local61 = local37[local51];
				@Pc(65) int local65 = local33[local51];
				if (local57 == local61 && local61 == local65) {
					local41[local51] = this.anInt10428 * local57 >> 12;
					local45[local51] = this.anInt10425 * local61 >> 12;
					local49[local51] = local65 * this.anInt10430 >> 12;
				} else {
					local41[local51] = this.anInt10428;
					local45[local51] = this.anInt10425;
					local49[local51] = this.anInt10430;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10428 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt10425 = arg0.method8363();
		} else if (arg1 == 2) {
			this.anInt10430 = arg0.method8363();
		}
	}
}
