import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
	protected int anInt117;

	@OriginalMember(owner = "client!pr", name = "Q", descriptor = "[I")
	protected int[] anIntArray5;

	@OriginalMember(owner = "client!pr", name = "S", descriptor = "I")
	protected int anInt120;

	@OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
	private int anInt121 = -1;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	@Override
	public final void method6009() {
		super.method6009();
		this.anIntArray5 = null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100 && this.method106()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(53) int local53 = (Static208.anInt4105 == this.anInt120 ? arg0 : this.anInt120 * arg0 / Static208.anInt4105) * this.anInt117;
			@Pc(59) int local59;
			@Pc(68) int local68;
			if (this.anInt117 == Static85.anInt1910) {
				for (local59 = 0; local59 < Static85.anInt1910; local59++) {
					local68 = this.anIntArray5[local53++];
					local37[local59] = (local68 & 0xFF) << 4;
					local33[local59] = local68 >> 4 & 0xFF0;
					local29[local59] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local59 = 0; local59 < Static85.anInt1910; local59++) {
					local68 = local59 * this.anInt117 / Static85.anInt1910;
					@Pc(75) int local75 = this.anIntArray5[local68 + local53];
					local37[local59] = (local75 & 0xFF) << 4;
					local33[local59] = local75 >> 4 & 0xFF0;
					local29[local59] = local75 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)Z")
	protected final boolean method106() {
		if (this.anIntArray5 != null) {
			return true;
		} else if (this.anInt121 >= 0) {
			@Pc(33) Class201 local33 = Static318.anInt6106 < 0 ? Static382.method5435(Static158.aClass30_48, this.anInt121) : Static382.method5432(Static158.aClass30_48, Static318.anInt6106, this.anInt121);
			local33.method5444();
			this.anIntArray5 = local33.method5440();
			this.anInt120 = local33.anInt6042;
			this.anInt117 = local33.anInt6040;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public final void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt121 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)I")
	@Override
	public final int method6003() {
		return this.anInt121;
	}
}
