import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
	protected int anInt1085;

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "[I")
	protected int[] anIntArray50;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "I")
	protected int anInt1091;

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
	private int anInt1090 = -1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub3() {
		super(0, false);
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "(B)V")
	@Override
	public final void method5699() {
		super.method5699();
		this.anIntArray50 = null;
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)Z")
	protected final boolean method811() {
		if (this.anIntArray50 != null) {
			return true;
		} else if (this.anInt1090 >= 0) {
			@Pc(33) Class110 local33 = Static7.anInt191 >= 0 ? Static362.method3098(Static176.aClass193_28, Static7.anInt191, this.anInt1090) : Static362.method3090(Static176.aClass193_28, this.anInt1090);
			local33.method3084();
			this.anIntArray50 = local33.method3096();
			this.anInt1085 = local33.anInt3411;
			this.anInt1091 = local33.anInt3409;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)I")
	@Override
	public final int method5695() {
		return this.anInt1090;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public final void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1090 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211 && this.method811()) {
			@Pc(32) int[] local32 = local18[0];
			@Pc(36) int[] local36 = local18[1];
			@Pc(40) int[] local40 = local18[2];
			@Pc(60) int local60 = this.anInt1091 * (Static223.anInt4562 == this.anInt1085 ? arg0 : this.anInt1085 * arg0 / Static223.anInt4562);
			@Pc(70) int local70;
			@Pc(79) int local79;
			if (this.anInt1091 == Static31.anInt797) {
				for (local70 = 0; local70 < Static31.anInt797; local70++) {
					local79 = this.anIntArray50[local60++];
					local40[local70] = (local79 & 0xFF) << 4;
					local36[local70] = local79 >> 4 & 0xFF0;
					local32[local70] = local79 >> 12 & 0xFF0;
				}
			} else {
				for (local70 = 0; local70 < Static31.anInt797; local70++) {
					local79 = local70 * this.anInt1091 / Static31.anInt797;
					@Pc(86) int local86 = this.anIntArray50[local79 + local60];
					local40[local70] = (local86 & 0xFF) << 4;
					local36[local70] = local86 >> 4 & 0xFF0;
					local32[local70] = local86 >> 12 & 0xFF0;
				}
			}
		}
		return local18;
	}
}
