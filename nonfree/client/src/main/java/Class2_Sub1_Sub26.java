import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!om", name = "S", descriptor = "I")
	private int anInt4037;

	@OriginalMember(owner = "client!om", name = "X", descriptor = "I")
	private int anInt4042;

	@OriginalMember(owner = "client!om", name = "bb", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!om", name = "T", descriptor = "I")
	private int anInt4038 = -1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		super(0, false);
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)Z")
	private boolean method3278() {
		if (this.anIntArray329 != null) {
			return true;
		} else if (this.anInt4038 >= 0) {
			@Pc(20) int local20 = Static114.anInt1359;
			@Pc(22) int local22 = Static199.anInt4143;
			@Pc(33) int local33 = Static155.anInterface1_113.method3487(this.anInt4038).aBoolean173 ? 64 : 128;
			this.anIntArray329 = Static155.anInterface1_113.method3485(1.0F, local33, local33, this.anInt4038);
			this.anInt4042 = local33;
			this.anInt4037 = local33;
			Static155.method4925(local20, local22);
			return this.anIntArray329 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)I")
	@Override
	public int method4942() {
		return this.anInt4038;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	@Override
	public void method4936() {
		super.method4936();
		this.anIntArray329 = null;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405 && this.method3278()) {
			@Pc(38) int local38 = (this.anInt4037 == Static199.anInt4143 ? arg0 : this.anInt4037 * arg0 / Static199.anInt4143) * this.anInt4042;
			@Pc(42) int[] local42 = local13[0];
			@Pc(46) int[] local46 = local13[1];
			@Pc(50) int[] local50 = local13[2];
			@Pc(60) int local60;
			@Pc(73) int local73;
			if (this.anInt4042 == Static114.anInt1359) {
				for (local60 = 0; local60 < Static114.anInt1359; local60++) {
					local73 = this.anIntArray329[local38++];
					local50[local60] = (local73 & 0xFF) << 4;
					local46[local60] = local73 >> 4 & 0xFF0;
					local42[local60] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static114.anInt1359; local60++) {
					local73 = this.anInt4042 * local60 / Static114.anInt1359;
					@Pc(125) int local125 = this.anIntArray329[local38 + local73];
					local50[local60] = (local125 & 0xFF) << 4;
					local46[local60] = local125 >> 4 & 0xFF0;
					local42[local60] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4038 = arg0.method4242();
		}
	}
}
