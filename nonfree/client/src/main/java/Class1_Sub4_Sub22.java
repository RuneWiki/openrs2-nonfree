import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public class Class1_Sub4_Sub22 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
	protected int anInt5152;

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "[I")
	protected int[] anIntArray445;

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
	protected int anInt5159;

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
	private int anInt5153 = -1;

	static {
		new Class7(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub22() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	@Override
	public final void method5953() {
		super.method5953();
		this.anIntArray445 = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public final void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt5153 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "(I)Z")
	protected final boolean method4275() {
		if (this.anIntArray445 != null) {
			return true;
		} else if (this.anInt5153 >= 0) {
			@Pc(33) Class51 local33 = Static68.anInt1557 >= 0 ? Static461.method1450(Static301.aClass246_162, Static68.anInt1557, this.anInt5153) : Static461.method1442(Static301.aClass246_162, this.anInt5153);
			local33.method1454();
			this.anIntArray445 = local33.method1449();
			this.anInt5159 = local33.anInt1638;
			this.anInt5152 = local33.anInt1635;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5951(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass34_41.method823(arg0);
		if (super.aClass34_41.aBoolean47 && this.method4275()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(59) int local59 = this.anInt5152 * (this.anInt5159 == Static61.anInt1456 ? arg0 : this.anInt5159 * arg0 / Static61.anInt1456);
			@Pc(69) int local69;
			@Pc(77) int local77;
			if (Static66.anInt1511 == this.anInt5152) {
				for (local69 = 0; local69 < Static66.anInt1511; local69++) {
					local77 = this.anIntArray445[local59++];
					local39[local69] = (local77 & 0xFF) << 4;
					local35[local69] = local77 >> 4 & 0xFF0;
					local31[local69] = local77 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static66.anInt1511; local69++) {
					local77 = this.anInt5152 * local69 / Static66.anInt1511;
					@Pc(129) int local129 = this.anIntArray445[local77 + local59];
					local39[local69] = (local129 & 0xFF) << 4;
					local35[local69] = local129 >> 4 & 0xFF0;
					local31[local69] = local129 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)I")
	@Override
	public final int method5955() {
		return this.anInt5153;
	}
}
