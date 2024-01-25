import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!be", name = "C", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "I")
	private int anInt983 = -1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(III)V")
	@Override
	public void method7891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7891(arg0, arg1);
		if (this.anInt983 >= 0 && Static264.anInterface5_5 != null) {
			@Pc(27) int local27 = Static264.anInterface5_5.method4043(this.anInt983).aBoolean124 ? 64 : 128;
			this.anIntArray38 = Static264.anInterface5_5.method4048(this.anInt983, local27, false, 1.0F, local27);
			this.anInt984 = local27;
			this.anInt989 = local27;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	@Override
	public void method7890() {
		super.method7890();
		this.anIntArray38 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt983 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
	@Override
	public int method7884() {
		return this.anInt983;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(41) int local41 = this.anInt984 * (this.anInt989 == Static4.anInt81 ? arg0 : arg0 * this.anInt989 / Static4.anInt81);
			@Pc(45) int[] local45 = local17[0];
			@Pc(49) int[] local49 = local17[1];
			@Pc(53) int[] local53 = local17[2];
			@Pc(59) int local59;
			@Pc(67) int local67;
			if (this.anInt984 == Static87.anInt1964) {
				for (local59 = 0; local59 < Static87.anInt1964; local59++) {
					local67 = this.anIntArray38[local41++];
					local53[local59] = (local67 & 0xFF) << 4;
					local49[local59] = local67 >> 4 & 0xFF0;
					local45[local59] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static87.anInt1964; local59++) {
					local67 = local59 * this.anInt984 / Static87.anInt1964;
					@Pc(115) int local115 = this.anIntArray38[local41 + local67];
					local53[local59] = (local115 & 0xFF) << 4;
					local49[local59] = local115 >> 4 & 0xFF0;
					local45[local59] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}
}
