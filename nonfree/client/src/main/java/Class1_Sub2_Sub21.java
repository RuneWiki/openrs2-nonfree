import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vt", name = "L", descriptor = "[I")
	protected int[] anIntArray373;

	@OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
	protected int anInt4988;

	@OriginalMember(owner = "client!vt", name = "Q", descriptor = "I")
	protected int anInt4991;

	@OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
	private int anInt4985 = -1;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public final void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4985 = arg0.method2896();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228 && this.method3976()) {
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(59) int local59 = (this.anInt4991 == Static54.anInt778 ? arg0 : arg0 * this.anInt4991 / Static54.anInt778) * this.anInt4988;
			@Pc(69) int local69;
			@Pc(78) int local78;
			if (Static218.anInt3990 == this.anInt4988) {
				for (local69 = 0; local69 < Static218.anInt3990; local69++) {
					local78 = this.anIntArray373[local59++];
					local39[local69] = (local78 & 0xFF) << 4;
					local35[local69] = local78 >> 4 & 0xFF0;
					local31[local69] = local78 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static218.anInt3990; local69++) {
					local78 = this.anInt4988 * local69 / Static218.anInt3990;
					@Pc(85) int local85 = this.anIntArray373[local59 + local78];
					local39[local69] = (local85 & 0xFF) << 4;
					local35[local69] = local85 >> 4 & 0xFF0;
					local31[local69] = local85 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	@Override
	public final void method5958() {
		super.method5958();
		this.anIntArray373 = null;
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)I")
	@Override
	public final int method5959() {
		return this.anInt4985;
	}

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)Z")
	protected final boolean method3976() {
		if (this.anIntArray373 != null) {
			return true;
		} else if (this.anInt4985 >= 0) {
			@Pc(35) Class52 local35 = Static68.anInt1014 >= 0 ? Static467.method891(Static420.aClass185_113, Static68.anInt1014, this.anInt4985) : Static467.method893(Static420.aClass185_113, this.anInt4985);
			local35.method887();
			this.anIntArray373 = local35.method890();
			this.anInt4988 = local35.anInt1019;
			this.anInt4991 = local35.anInt1015;
			return true;
		} else {
			return false;
		}
	}
}
