import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public class Class7_Sub4_Sub6 extends Class7_Sub4 {

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
	protected int anInt1950;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
	protected int anInt1956;

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "[I")
	protected int[] anIntArray279;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
	private int anInt1957 = -1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public final void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1957 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)Z")
	protected final boolean method1569() {
		if (this.anIntArray279 != null) {
			return true;
		} else if (this.anInt1957 >= 0) {
			@Pc(38) Class56 local38 = Static255.anInt3696 >= 0 ? Static358.method1307(Static92.aClass180_28, Static255.anInt3696, this.anInt1957) : Static358.method1304(Static92.aClass180_28, this.anInt1957);
			local38.method1305();
			this.anIntArray279 = local38.method1306();
			this.anInt1956 = local38.anInt1622;
			this.anInt1950 = local38.anInt1621;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109 && this.method1569()) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			@Pc(47) int local47 = (this.anInt1956 == Static216.anInt4322 ? arg0 : this.anInt1956 * arg0 / Static216.anInt4322) * this.anInt1950;
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (this.anInt1950 == Static201.anInt4174) {
				for (local53 = 0; local53 < Static201.anInt4174; local53++) {
					local61 = this.anIntArray279[local47++];
					local31[local53] = (local61 & 0xFF) << 4;
					local27[local53] = local61 >> 4 & 0xFF0;
					local23[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static201.anInt4174; local53++) {
					local61 = local53 * this.anInt1950 / Static201.anInt4174;
					@Pc(109) int local109 = this.anIntArray279[local47 + local61];
					local31[local53] = (local109 & 0xFF) << 4;
					local27[local53] = local109 >> 4 & 0xFF0;
					local23[local53] = local109 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
	@Override
	public final void method5633() {
		super.method5633();
		this.anIntArray279 = null;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
	@Override
	public final int method5637() {
		return this.anInt1957;
	}
}
