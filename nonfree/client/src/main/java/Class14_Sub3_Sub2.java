import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public class Class14_Sub3_Sub2 extends Class14_Sub3 {

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	protected int anInt1364;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	protected int anInt1366;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
	protected int[] anIntArray91;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	private int anInt1373 = -1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	@Override
	public final void method5999() {
		super.method5999();
		this.anIntArray91 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126 && this.method1292()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(57) int local57 = (Static65.anInt5731 == this.anInt1364 ? arg0 : this.anInt1364 * arg0 / Static65.anInt5731) * this.anInt1366;
			@Pc(67) int local67;
			@Pc(76) int local76;
			if (Static294.anInt5657 == this.anInt1366) {
				for (local67 = 0; local67 < Static294.anInt5657; local67++) {
					local76 = this.anIntArray91[local57++];
					local37[local67] = (local76 & 0xFF) << 4;
					local33[local67] = local76 >> 4 & 0xFF0;
					local29[local67] = local76 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static294.anInt5657; local67++) {
					local76 = this.anInt1366 * local67 / Static294.anInt5657;
					@Pc(83) int local83 = this.anIntArray91[local57 + local76];
					local37[local67] = (local83 & 0xFF) << 4;
					local33[local67] = local83 >> 4 & 0xFF0;
					local29[local67] = local83 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)I")
	@Override
	public final int method5995() {
		return this.anInt1373;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)Z")
	protected final boolean method1292() {
		if (this.anIntArray91 != null) {
			return true;
		} else if (this.anInt1373 >= 0) {
			@Pc(27) Class207 local27 = Static113.anInt2512 < 0 ? Static368.method5810(Static165.aClass143_95, this.anInt1373) : Static368.method5811(Static165.aClass143_95, Static113.anInt2512, this.anInt1373);
			local27.method5804();
			this.anIntArray91 = local27.method5809();
			this.anInt1364 = local27.anInt6508;
			this.anInt1366 = local27.anInt6509;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public final void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1373 = arg0.method2498();
		}
	}
}
