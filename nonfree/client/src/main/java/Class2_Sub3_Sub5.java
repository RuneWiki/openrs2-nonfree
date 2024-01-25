import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "[I")
	protected int[] anIntArray104;

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
	protected int anInt2302;

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
	protected int anInt2305;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
	private int anInt2306 = -1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub5() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
	protected final boolean method2185() {
		if (this.anIntArray104 != null) {
			return true;
		} else if (this.anInt2306 >= 0) {
			@Pc(35) Class296 local35 = Static200.anInt4609 >= 0 ? Static652.method7583(Static124.aClass157_311, Static200.anInt4609, this.anInt2306) : Static652.method7574(Static124.aClass157_311, this.anInt2306);
			local35.method7586();
			this.anIntArray104 = local35.method7578();
			this.anInt2302 = local35.anInt9028;
			this.anInt2305 = local35.anInt9024;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public final void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2306 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
	@Override
	public final int method9145() {
		return this.anInt2306;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	@Override
	public final void method9154() {
		super.method9154();
		this.anIntArray104 = null;
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11 && this.method2185()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(59) int local59 = this.anInt2302 * (Static101.anInt2845 == this.anInt2305 ? arg0 : this.anInt2305 * arg0 / Static101.anInt2845);
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static222.anInt4971 == this.anInt2302) {
				for (local65 = 0; local65 < Static222.anInt4971; local65++) {
					local73 = this.anIntArray104[local59++];
					local39[local65] = (local73 & 0xFF) << 4;
					local35[local65] = local73 >> 4 & 0xFF0;
					local31[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static222.anInt4971; local65++) {
					local73 = this.anInt2302 * local65 / Static222.anInt4971;
					@Pc(125) int local125 = this.anIntArray104[local73 + local59];
					local39[local65] = (local125 & 0xFF) << 4;
					local35[local65] = local125 >> 4 & 0xFF0;
					local31[local65] = local125 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}
}
