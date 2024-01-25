import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vha", name = "z", descriptor = "[I")
	protected int[] anIntArray477;

	@OriginalMember(owner = "client!vha", name = "D", descriptor = "I")
	protected int anInt7777;

	@OriginalMember(owner = "client!vha", name = "E", descriptor = "I")
	protected int anInt7778;

	@OriginalMember(owner = "client!vha", name = "B", descriptor = "I")
	private int anInt7775 = -1;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub22() {
		super(0, false);
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(Z)V")
	@Override
	public final void method8605() {
		super.method8605();
		this.anIntArray477 = null;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)I")
	@Override
	public final int method8599() {
		return this.anInt7775;
	}

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "(Z)Z")
	protected final boolean method6745() {
		if (this.anIntArray477 != null) {
			return true;
		} else if (this.anInt7775 >= 0) {
			@Pc(33) Class107 local33 = Static156.anInt5060 >= 0 ? Static645.method2771(Static599.aClass196_126, Static156.anInt5060, this.anInt7775) : Static645.method2762(Static599.aClass196_126, this.anInt7775);
			local33.method2761();
			this.anIntArray477 = local33.method2760();
			this.anInt7777 = local33.anInt3006;
			this.anInt7778 = local33.anInt3008;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public final void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7775 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358 && this.method6745()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(52) int local52 = this.anInt7777 * (this.anInt7778 == Static336.anInt6310 ? arg0 : arg0 * this.anInt7778 / Static336.anInt6310);
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt7777 == Static491.anInt8519) {
				for (local58 = 0; local58 < Static491.anInt8519; local58++) {
					local66 = this.anIntArray477[local52++];
					local36[local58] = (local66 & 0xFF) << 4;
					local32[local58] = local66 >> 4 & 0xFF0;
					local28[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static491.anInt8519; local58++) {
					local66 = this.anInt7777 * local58 / Static491.anInt8519;
					@Pc(114) int local114 = this.anIntArray477[local52 + local66];
					local36[local58] = (local114 & 0xFF) << 4;
					local32[local58] = local114 >> 4 & 0xFF0;
					local28[local58] = local114 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
