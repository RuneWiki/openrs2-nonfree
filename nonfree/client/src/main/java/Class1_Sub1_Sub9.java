import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
	private int anInt1294 = 0;

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
	private int anInt1296 = 0;

	@OriginalMember(owner = "client!eh", name = "mb", descriptor = "I")
	private int anInt1299 = 1365;

	@OriginalMember(owner = "client!eh", name = "nb", descriptor = "I")
	private int anInt1300 = 20;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1299 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt1300 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt1296 = arg1.method1753();
		} else if (arg0 == 3) {
			this.anInt1294 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			for (@Pc(22) int local22 = 0; local22 < Static176.anInt3921; local22++) {
				@Pc(37) int local37 = (Static171.anIntArray439[local22] << 12) / this.anInt1299 + this.anInt1296;
				@Pc(49) int local49 = (Static22.anIntArray68[arg0] << 12) / this.anInt1299 + this.anInt1294;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && this.anInt1300 > local71) {
					local71++;
					local57 = (local55 * local57 >> 12) * 2 + local49;
					local55 = local37 + local63 - local69;
					local69 = local57 * local57 >> 12;
					local63 = local55 * local55 >> 12;
				}
				local7[local22] = local71 >= this.anInt1300 - 1 ? 0 : (local71 << 12) / this.anInt1300;
			}
		}
		return local7;
	}
}
