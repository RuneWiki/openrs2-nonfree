import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public class Class4_Sub2_Sub16 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
	protected int anInt5962;

	@OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
	protected int anInt5965;

	@OriginalMember(owner = "client!pu", name = "P", descriptor = "[I")
	protected int[] anIntArray324;

	@OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
	private int anInt5964 = -1;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub16() {
		super(0, false);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	@Override
	public final void method8209() {
		super.method8209();
		this.anIntArray324 = null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)I")
	@Override
	public final int method8205() {
		return this.anInt5964;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154 && this.method4711()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = this.anInt5962 * (Static38.anInt1239 == this.anInt5965 ? arg0 : arg0 * this.anInt5965 / Static38.anInt1239);
			@Pc(62) int local62;
			@Pc(70) int local70;
			if (this.anInt5962 == Static417.anInt5248) {
				for (local62 = 0; local62 < Static417.anInt5248; local62++) {
					local70 = this.anIntArray324[local56++];
					local36[local62] = (local70 & 0xFF) << 4;
					local32[local62] = local70 >> 4 & 0xFF0;
					local28[local62] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static417.anInt5248; local62++) {
					local70 = this.anInt5962 * local62 / Static417.anInt5248;
					@Pc(122) int local122 = this.anIntArray324[local70 + local56];
					local36[local62] = (local122 & 0xFF) << 4;
					local32[local62] = local122 >> 4 & 0xFF0;
					local28[local62] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)Z")
	protected final boolean method4711() {
		if (this.anIntArray324 != null) {
			return true;
		} else if (this.anInt5964 >= 0) {
			@Pc(24) Class103 local24 = Static33.anInt1199 >= 0 ? Static598.method2462(Static585.aClass348_135, Static33.anInt1199, this.anInt5964) : Static598.method2449(Static585.aClass348_135, this.anInt5964);
			local24.method2448();
			this.anIntArray324 = local24.method2458();
			this.anInt5965 = local24.anInt3041;
			this.anInt5962 = local24.anInt3039;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public final void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5964 = arg0.method7054();
		}
	}
}
