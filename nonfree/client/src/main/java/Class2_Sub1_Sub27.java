import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
	private int anInt4896;

	@OriginalMember(owner = "client!ot", name = "S", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
	private int anInt4899;

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
	private int anInt4897 = -1;

	static {
		new Class62("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)V")
	@Override
	public void method6068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method6068(arg0, arg1);
		if (this.anInt4897 >= 0 && Static266.anInterface3_6 != null) {
			@Pc(35) int local35 = Static266.anInterface3_6.method1278(this.anInt4897).aBoolean346 ? 64 : 128;
			this.anIntArray401 = Static266.anInterface3_6.method1279(false, this.anInt4897, local35, 1.0F, local35);
			this.anInt4896 = local35;
			this.anInt4899 = local35;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4897 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(Z)V")
	@Override
	public void method6065() {
		super.method6065();
		this.anIntArray401 = null;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)I")
	@Override
	public int method6058() {
		return this.anInt4897;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(36) int local36 = (this.anInt4899 == Static299.anInt5583 ? arg0 : this.anInt4899 * arg0 / Static299.anInt5583) * this.anInt4896;
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[2];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt4896 == Static391.anInt7118) {
				for (local58 = 0; local58 < Static391.anInt7118; local58++) {
					local66 = this.anIntArray401[local36++];
					local48[local58] = (local66 & 0xFF) << 4;
					local44[local58] = local66 >> 4 & 0xFF0;
					local40[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static391.anInt7118; local58++) {
					local66 = local58 * this.anInt4896 / Static391.anInt7118;
					@Pc(114) int local114 = this.anIntArray401[local66 + local36];
					local48[local58] = (local114 & 0xFF) << 4;
					local44[local58] = local114 >> 4 & 0xFF0;
					local40[local58] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
