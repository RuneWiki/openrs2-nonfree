import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class1_Sub4_Sub16 extends Class1_Sub4 {

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
	private int anInt2127;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
	private int anInt2131;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
	private int anInt2124 = -1;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub16() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(37) int local37 = this.anInt2131 * (this.anInt2127 == Static186.anInt3223 ? arg0 : arg0 * this.anInt2127 / Static186.anInt3223);
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (Static395.anInt6592 == this.anInt2131) {
				for (local59 = 0; local59 < Static395.anInt6592; local59++) {
					local68 = this.anIntArray143[local37++];
					local49[local59] = (local68 & 0xFF) << 4;
					local45[local59] = local68 >> 4 & 0xFF0;
					local41[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static395.anInt6592; local59++) {
					local68 = local59 * this.anInt2131 / Static395.anInt6592;
					@Pc(75) int local75 = this.anIntArray143[local68 + local37];
					local49[local59] = (local75 & 0xFF) << 4;
					local45[local59] = local75 >> 4 & 0xFF0;
					local41[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2124 = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)I")
	@Override
	public int method5687() {
		return this.anInt2124;
	}

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V")
	@Override
	public void method5688() {
		super.method5688();
		this.anIntArray143 = null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5698(arg0, arg1);
		if (this.anInt2124 >= 0 && Static46.anInterface6_1 != null) {
			@Pc(24) int local24 = Static46.anInterface6_1.method3937(this.anInt2124).aBoolean339 ? 64 : 128;
			this.anIntArray143 = Static46.anInterface6_1.method3933(1.0F, false, this.anInt2124, local24, local24);
			this.anInt2127 = local24;
			this.anInt2131 = local24;
		}
	}
}
