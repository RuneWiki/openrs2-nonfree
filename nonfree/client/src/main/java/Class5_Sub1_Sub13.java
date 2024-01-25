import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public class Class5_Sub1_Sub13 extends Class5_Sub1 {

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "[I")
	protected int[] anIntArray558;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
	protected int anInt7202;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
	protected int anInt7204;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
	private int anInt7197 = -1;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub13() {
		super(0, false);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public final void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7197 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)I")
	@Override
	public final int method7158() {
		return this.anInt7197;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520 && this.method5836()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(55) int local55 = this.anInt7202 * (this.anInt7204 == Static250.anInt5057 ? arg0 : this.anInt7204 * arg0 / Static250.anInt5057);
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (this.anInt7202 == Static147.anInt3075) {
				for (local65 = 0; local65 < Static147.anInt3075; local65++) {
					local73 = this.anIntArray558[local55++];
					local39[local65] = (local73 & 0xFF) << 4;
					local35[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static147.anInt3075; local65++) {
					local73 = this.anInt7202 * local65 / Static147.anInt3075;
					@Pc(121) int local121 = this.anIntArray558[local73 + local55];
					local39[local65] = (local121 & 0xFF) << 4;
					local35[local65] = local121 >> 4 & 0xFF0;
					local31[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)Z")
	protected final boolean method5836() {
		if (this.anIntArray558 != null) {
			return true;
		} else if (this.anInt7197 >= 0) {
			@Pc(35) Class96 local35 = Static225.anInt4189 >= 0 ? Static551.method2427(Static308.aClass117_138, Static225.anInt4189, this.anInt7197) : Static551.method2422(Static308.aClass117_138, this.anInt7197);
			local35.method2430();
			this.anIntArray558 = local35.method2426();
			this.anInt7202 = local35.anInt2722;
			this.anInt7204 = local35.anInt2718;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	@Override
	public final void method7162() {
		super.method7162();
		this.anIntArray558 = null;
	}
}
