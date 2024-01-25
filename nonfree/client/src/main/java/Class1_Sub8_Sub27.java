import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public class Class1_Sub8_Sub27 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "[I")
	protected int[] anIntArray690;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
	protected int anInt7232;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
	protected int anInt7233;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	private int anInt7230 = -1;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub27() {
		super(0, false);
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	@Override
	public final void method6036() {
		super.method6036();
		this.anIntArray690 = null;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246 && this.method5505()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(51) int local51 = (this.anInt7232 == Static217.anInt4363 ? arg0 : this.anInt7232 * arg0 / Static217.anInt4363) * this.anInt7233;
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (Static18.anInt439 == this.anInt7233) {
				for (local57 = 0; local57 < Static18.anInt439; local57++) {
					local66 = this.anIntArray690[local51++];
					local31[local57] = (local66 & 0xFF) << 4;
					local27[local57] = local66 >> 4 & 0xFF0;
					local23[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static18.anInt439; local57++) {
					local66 = local57 * this.anInt7233 / Static18.anInt439;
					@Pc(73) int local73 = this.anIntArray690[local66 + local51];
					local31[local57] = (local73 & 0xFF) << 4;
					local27[local57] = local73 >> 4 & 0xFF0;
					local23[local57] = local73 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
	@Override
	public final int method6032() {
		return this.anInt7230;
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)Z")
	protected final boolean method5505() {
		if (this.anIntArray690 != null) {
			return true;
		} else if (this.anInt7230 >= 0) {
			@Pc(27) Class266 local27 = Static397.anInt7191 >= 0 ? Static470.method6054(Static169.aClass211_45, Static397.anInt7191, this.anInt7230) : Static470.method6046(Static169.aClass211_45, this.anInt7230);
			local27.method6050();
			this.anIntArray690 = local27.method6057();
			this.anInt7232 = local27.anInt7824;
			this.anInt7233 = local27.anInt7823;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public final void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7230 = arg1.method1177();
		}
	}
}
