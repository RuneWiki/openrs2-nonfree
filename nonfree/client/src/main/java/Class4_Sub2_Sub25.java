import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class4_Sub2_Sub25 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
	private int anInt8491 = 2048;

	@OriginalMember(owner = "client!qw", name = "W", descriptor = "I")
	private int anInt8501 = 1024;

	@OriginalMember(owner = "client!qw", name = "L", descriptor = "I")
	private int anInt8492 = 3072;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		this.anInt8491 = this.anInt8492 - this.anInt8501;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8501 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt8492 = arg0.method7054();
		} else if (arg1 == 2) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(27) int[] local27 = this.method8208(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static417.anInt5248; local29++) {
				local17[local29] = (this.anInt8491 * local27[local29] >> 12) + this.anInt8501;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(29) int[][] local29 = this.method8202(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			for (@Pc(55) int local55 = 0; local55 < Static417.anInt5248; local55++) {
				local45[local55] = this.anInt8501 + (this.anInt8491 * local33[local55] >> 12);
				local49[local55] = (this.anInt8491 * local37[local55] >> 12) + this.anInt8501;
				local53[local55] = (this.anInt8491 * local41[local55] >> 12) + this.anInt8501;
			}
		}
		return local17;
	}
}
