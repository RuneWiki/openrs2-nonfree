import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
	protected int anInt3408;

	@OriginalMember(owner = "client!ig", name = "Z", descriptor = "[I")
	protected int[] anIntArray289;

	@OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
	protected int anInt3414;

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
	private int anInt3410 = -1;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public final void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3410 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)Z")
	protected final boolean method2621() {
		if (this.anIntArray289 != null) {
			return true;
		} else if (this.anInt3410 >= 0) {
			@Pc(28) Class1_Sub2_Sub8_Sub3 local28 = Static29.method573(Static110.aClass69_24, this.anInt3410);
			local28.method2351();
			this.anInt3414 = local28.anInt3017;
			this.anIntArray289 = local28.anIntArray246;
			this.anInt3408 = local28.anInt3022;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)I")
	@Override
	public final int method3572() {
		return this.anInt3410;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
	@Override
	public final void method3574() {
		super.method3574();
		this.anIntArray289 = null;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80 && this.method2621()) {
			@Pc(25) int[] local25 = local13[0];
			@Pc(29) int[] local29 = local13[1];
			@Pc(33) int[] local33 = local13[2];
			@Pc(49) int local49 = (this.anInt3414 == Static31.anInt857 ? arg0 : this.anInt3414 * arg0 / Static31.anInt857) * this.anInt3408;
			@Pc(55) int local55;
			@Pc(63) int local63;
			if (Static115.anInt2578 == this.anInt3408) {
				for (local55 = 0; local55 < Static115.anInt2578; local55++) {
					local63 = this.anIntArray289[local49++];
					local33[local55] = (local63 & 0xFF) << 4;
					local29[local55] = local63 >> 4 & 0xFF0;
					local25[local55] = local63 >> 12 & 0xFF0;
				}
			} else {
				for (local55 = 0; local55 < Static115.anInt2578; local55++) {
					local63 = local55 * this.anInt3408 / Static115.anInt2578;
					@Pc(111) int local111 = this.anIntArray289[local63 + local49];
					local33[local55] = (local111 & 0xFF) << 4;
					local29[local55] = local111 >> 4 & 0xFF0;
					local25[local55] = local111 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}
}
