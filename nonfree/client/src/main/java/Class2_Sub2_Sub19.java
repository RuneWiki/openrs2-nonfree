import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
	private int anInt3806 = 4;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
	private int anInt3807 = 4;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3807 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt3806 = arg0.method5495();
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(25) int local25 = Static429.anInt6518 / this.anInt3807;
			@Pc(30) int local30 = Static51.anInt1129 / this.anInt3806;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method5839(local36 * Static51.anInt1129 / local30, 0);
			} else {
				local46 = this.method5839(0, 0);
			}
			for (local36 = 0; local36 < Static429.anInt6518; local36++) {
				if (local25 > 0) {
					@Pc(64) int local64 = local36 % local25;
					local16[local36] = local46[local64 * Static429.anInt6518 / local25];
				} else {
					local16[local36] = local46[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(28) int local28 = Static429.anInt6518 / this.anInt3807;
			@Pc(33) int local33 = Static51.anInt1129 / this.anInt3806;
			@Pc(44) int[][] local44;
			if (local33 <= 0) {
				local44 = this.method5840(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local33;
				local44 = this.method5840(Static51.anInt1129 * local50 / local33, 0);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local44[2];
			@Pc(76) int[] local76 = local19[0];
			@Pc(80) int[] local80 = local19[1];
			@Pc(84) int[] local84 = local19[2];
			for (@Pc(86) int local86 = 0; local86 < Static429.anInt6518; local86++) {
				@Pc(95) int local95;
				if (local28 <= 0) {
					local95 = 0;
				} else {
					@Pc(101) int local101 = local86 % local28;
					local95 = Static429.anInt6518 * local101 / local28;
				}
				local76[local86] = local64[local95];
				local80[local86] = local68[local95];
				local84[local86] = local72[local95];
			}
		}
		return local19;
	}
}
