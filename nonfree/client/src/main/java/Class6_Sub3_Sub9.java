import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public class Class6_Sub3_Sub9 extends Class6_Sub3 {

	@OriginalMember(owner = "client!dp", name = "F", descriptor = "I")
	protected int anInt3983;

	@OriginalMember(owner = "client!dp", name = "N", descriptor = "[I")
	protected int[] anIntArray344;

	@OriginalMember(owner = "client!dp", name = "Q", descriptor = "I")
	protected int anInt3991;

	@OriginalMember(owner = "client!dp", name = "M", descriptor = "I")
	private int anInt3988 = -1;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "(I)V")
	@Override
	public final void method7953() {
		super.method7953();
		this.anIntArray344 = null;
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505 && this.method3433()) {
			@Pc(31) int[] local31 = local17[0];
			@Pc(35) int[] local35 = local17[1];
			@Pc(39) int[] local39 = local17[2];
			@Pc(59) int local59 = (this.anInt3991 == Static170.anInt3133 ? arg0 : arg0 * this.anInt3991 / Static170.anInt3133) * this.anInt3983;
			@Pc(69) int local69;
			@Pc(78) int local78;
			if (Static35.anInt670 == this.anInt3983) {
				for (local69 = 0; local69 < Static35.anInt670; local69++) {
					local78 = this.anIntArray344[local59++];
					local39[local69] = (local78 & 0xFF) << 4;
					local35[local69] = local78 >> 4 & 0xFF0;
					local31[local69] = local78 >> 12 & 0xFF0;
				}
			} else {
				for (local69 = 0; local69 < Static35.anInt670; local69++) {
					local78 = this.anInt3983 * local69 / Static35.anInt670;
					@Pc(86) int local86 = this.anIntArray344[local59 + local78];
					local39[local69] = (local86 & 0xFF) << 4;
					local35[local69] = local86 >> 4 & 0xFF0;
					local31[local69] = local86 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)I")
	@Override
	public final int method7951() {
		return this.anInt3988;
	}

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "(I)Z")
	protected final boolean method3433() {
		if (this.anIntArray344 != null) {
			return true;
		} else if (this.anInt3988 >= 0) {
			@Pc(34) Class177 local34 = Static10.anInt133 < 0 ? Static593.method4139(Static334.aClass248_55, this.anInt3988) : Static593.method4148(Static334.aClass248_55, Static10.anInt133, this.anInt3988);
			local34.method4152();
			this.anIntArray344 = local34.method4149();
			this.anInt3991 = local34.anInt4884;
			this.anInt3983 = local34.anInt4887;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public final void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt3988 = arg1.method6044();
		}
	}
}
