import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
	protected int anInt3170;

	@OriginalMember(owner = "client!ai", name = "fb", descriptor = "[I")
	protected int[] anIntArray281;

	@OriginalMember(owner = "client!ai", name = "pb", descriptor = "I")
	protected int anInt3176;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
	private int anInt3171 = -1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public final void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3171 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
	@Override
	public final void method3391() {
		super.method3391();
		this.anIntArray281 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166 && this.method2346()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[2];
			@Pc(37) int[] local37 = local17[1];
			@Pc(53) int local53 = (this.anInt3170 == Static123.anInt2607 ? arg0 : this.anInt3170 * arg0 / Static123.anInt2607) * this.anInt3176;
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (this.anInt3176 == Static107.anInt2321) {
				for (local63 = 0; local63 < Static107.anInt2321; local63++) {
					local72 = this.anIntArray281[local53++];
					local33[local63] = (local72 & 0xFF) << 4;
					local37[local63] = local72 >> 4 & 0xFF0;
					local29[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static107.anInt2321; local63++) {
					local72 = local63 * this.anInt3176 / Static107.anInt2321;
					@Pc(80) int local80 = this.anIntArray281[local53 + local72];
					local33[local63] = (local80 & 0xFF) << 4;
					local37[local63] = local80 >> 4 & 0xFF0;
					local29[local63] = local80 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)I")
	@Override
	public final int method3395() {
		return this.anInt3171;
	}

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)Z")
	protected final boolean method2346() {
		if (this.anIntArray281 != null) {
			return true;
		} else if (this.anInt3171 >= 0) {
			@Pc(27) Class1_Sub3_Sub1_Sub1 local27 = Static200.method3295(Static127.aClass3_23, this.anInt3171);
			local27.method357();
			this.anIntArray281 = local27.anIntArray44;
			this.anInt3170 = local27.anInt450;
			this.anInt3176 = local27.anInt452;
			return true;
		} else {
			return false;
		}
	}
}
