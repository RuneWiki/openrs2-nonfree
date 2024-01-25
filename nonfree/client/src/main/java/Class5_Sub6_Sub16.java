import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class5_Sub6_Sub16 extends Class5_Sub6 {

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	private int anInt3255 = 4096;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
	private int anInt3253 = 4096;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	private int anInt3254 = 4096;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(25) int[][] local25 = this.method8116(0, arg0);
			@Pc(29) int[] local29 = local25[0];
			@Pc(33) int[] local33 = local25[1];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local13[0];
			@Pc(45) int[] local45 = local13[1];
			@Pc(49) int[] local49 = local13[2];
			for (@Pc(51) int local51 = 0; local51 < Static421.anInt7443; local51++) {
				@Pc(57) int local57 = local29[local51];
				@Pc(61) int local61 = local37[local51];
				@Pc(65) int local65 = local33[local51];
				if (local61 == local57 && local65 == local61) {
					local41[local51] = this.anInt3254 * local57 >> 12;
					local45[local51] = this.anInt3253 * local61 >> 12;
					local49[local51] = local65 * this.anInt3255 >> 12;
				} else {
					local41[local51] = this.anInt3254;
					local45[local51] = this.anInt3253;
					local49[local51] = this.anInt3255;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3254 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt3253 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt3255 = arg0.method3698();
		}
	}
}
