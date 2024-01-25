import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public class Class3_Sub6_Sub28 extends Class3_Sub6 {

	@OriginalMember(owner = "client!so", name = "O", descriptor = "I")
	protected int anInt8289;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "[I")
	protected int[] anIntArray487;

	@OriginalMember(owner = "client!so", name = "ab", descriptor = "I")
	protected int anInt8298;

	@OriginalMember(owner = "client!so", name = "X", descriptor = "I")
	private int anInt8295 = -1;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub28() {
		super(0, false);
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(I)Z")
	protected final boolean method6508() {
		if (this.anIntArray487 != null) {
			return true;
		} else if (this.anInt8295 >= 0) {
			@Pc(35) Class365 local35 = Static290.anInt5403 < 0 ? Static607.method8165(Static188.aClass284_56, this.anInt8295) : Static607.method8163(Static188.aClass284_56, Static290.anInt5403, this.anInt8295);
			local35.method8153();
			this.anIntArray487 = local35.method8166();
			this.anInt8298 = local35.anInt10318;
			this.anInt8289 = local35.anInt10320;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)I")
	@Override
	public final int method8008() {
		return this.anInt8295;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647 && this.method6508()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(59) int local59 = (Static465.anInt8091 == this.anInt8289 ? arg0 : arg0 * this.anInt8289 / Static465.anInt8091) * this.anInt8298;
			@Pc(69) int local69;
			@Pc(77) int local77;
			if (this.anInt8298 == Static481.anInt8358) {
				for (local69 = 0; local69 < Static481.anInt8358; local69++) {
					local77 = this.anIntArray487[local59++];
					local39[local69] = (local77 & 0xFF) << 4;
					local35[local69] = local77 >> 4 & 0xFF0;
					local31[local69] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static481.anInt8358; local69++) {
					local77 = this.anInt8298 * local69 / Static481.anInt8358;
					@Pc(130) int local130 = this.anIntArray487[local59 + local77];
					local39[local69] = (local130 & 0xFF) << 4;
					local35[local69] = local130 >> 4 & 0xFF0;
					local31[local69] = local130 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public final void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8295 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
	@Override
	public final void method8002() {
		super.method8002();
		this.anIntArray487 = null;
	}
}
