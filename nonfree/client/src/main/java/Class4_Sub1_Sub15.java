import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public class Class4_Sub1_Sub15 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
	protected int anInt5524;

	@OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
	protected int anInt5528;

	@OriginalMember(owner = "client!ij", name = "S", descriptor = "[I")
	protected int[] anIntArray437;

	@OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
	private int anInt5529 = -1;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub15() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
	@Override
	public final void method4547() {
		super.method4547();
		this.anIntArray437 = null;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)I")
	@Override
	public final int method4548() {
		return this.anInt5529;
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)Z")
	protected final boolean method4403() {
		if (this.anIntArray437 != null) {
			return true;
		} else if (this.anInt5529 < 0) {
			return false;
		} else {
			@Pc(33) Class4_Sub2_Sub4_Sub2 local33 = Static115.anInt2344 < 0 ? Static183.method2964(this.anInt5529, Static255.aClass22_85) : Static12.method234(Static255.aClass22_85, Static115.anInt2344, this.anInt5529);
			local33.method4149();
			this.anInt5528 = local33.anInt5193;
			this.anIntArray437 = local33.anIntArray409;
			this.anInt5524 = local33.anInt5191;
			return true;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public final void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt5529 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232 && this.method4403()) {
			@Pc(27) int[] local27 = local11[0];
			@Pc(31) int[] local31 = local11[1];
			@Pc(35) int[] local35 = local11[2];
			@Pc(51) int local51 = this.anInt5528 * (Static33.anInt660 == this.anInt5524 ? arg0 : this.anInt5524 * arg0 / Static33.anInt660);
			@Pc(61) int local61;
			@Pc(74) int local74;
			if (Static68.anInt1753 == this.anInt5528) {
				for (local61 = 0; local61 < Static68.anInt1753; local61++) {
					local74 = this.anIntArray437[local51++];
					local35[local61] = (local74 & 0xFF) << 4;
					local31[local61] = local74 >> 4 & 0xFF0;
					local27[local61] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static68.anInt1753; local61++) {
					local74 = this.anInt5528 * local61 / Static68.anInt1753;
					@Pc(122) int local122 = this.anIntArray437[local51 + local74];
					local35[local61] = (local122 & 0xFF) << 4;
					local31[local61] = local122 >> 4 & 0xFF0;
					local27[local61] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
