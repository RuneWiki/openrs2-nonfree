import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kn", name = "Q", descriptor = "I")
	private int anInt3399 = 4096;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
	private int anInt3396 = 4096;

	@OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
	private int anInt3398 = 4096;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3399 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt3398 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt3396 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(27) int[][] local27 = this.method4715(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local7[0];
			@Pc(47) int[] local47 = local7[1];
			@Pc(51) int[] local51 = local7[2];
			for (@Pc(53) int local53 = 0; local53 < Static62.anInt1350; local53++) {
				@Pc(60) int local60 = local31[local53];
				@Pc(64) int local64 = local39[local53];
				@Pc(68) int local68 = local35[local53];
				if (local64 == local60 && local68 == local64) {
					local43[local53] = local60 * this.anInt3399 >> 12;
					local47[local53] = local64 * this.anInt3398 >> 12;
					local51[local53] = local68 * this.anInt3396 >> 12;
				} else {
					local43[local53] = this.anInt3399;
					local47[local53] = this.anInt3398;
					local51[local53] = this.anInt3396;
				}
			}
		}
		return local7;
	}
}
