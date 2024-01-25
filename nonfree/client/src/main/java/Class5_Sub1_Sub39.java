import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class5_Sub1_Sub39 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vs", name = "H", descriptor = "I")
	private int anInt8851 = 32768;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub39() {
		super(3, false);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(29) int[] local29 = this.method7160(1, arg0);
			@Pc(35) int[] local35 = this.method7160(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static147.anInt3075; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt8851 >> 12;
				@Pc(64) int local64 = local56 * Static20.anIntArray25[local47] >> 12;
				@Pc(72) int local72 = Static480.anIntArray648[local47] * local56 >> 12;
				@Pc(80) int local80 = Static497.anInt9138 & (local64 >> 12) + local37;
				@Pc(89) int local89 = arg0 + (local72 >> 12) & Static160.anInt3274;
				@Pc(95) int[] local95 = this.method7160(0, local89);
				local11[local37] = local95[local80];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt8851 = arg1.method4227() << 4;
		} else if (arg0 == 1) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[] local29 = this.method7160(1, arg0);
			@Pc(35) int[] local35 = this.method7160(2, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static147.anInt3075; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt8851 >> 12;
				@Pc(78) int local78 = Static20.anIntArray25[local61] * local70 >> 12;
				@Pc(86) int local86 = Static480.anIntArray648[local61] * local70 >> 12;
				@Pc(95) int local95 = local49 + (local78 >> 12) & Static497.anInt9138;
				@Pc(104) int local104 = Static160.anInt3274 & arg0 + (local86 >> 12);
				@Pc(110) int[][] local110 = this.method7154(0, local104);
				local39[local49] = local110[0][local95];
				local43[local49] = local110[1][local95];
				local47[local49] = local110[2][local95];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		Static340.method5294();
	}
}
