import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class3_Sub6_Sub6 extends Class3_Sub6 {

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "[I")
	protected int[] anIntArray341;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	protected int anInt6309;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	protected int anInt6315;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
	private int anInt6313 = -1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306 && this.method5360()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(57) int local57 = (Static522.anInt8394 == this.anInt6309 ? arg0 : this.anInt6309 * arg0 / Static522.anInt8394) * this.anInt6315;
			@Pc(67) int local67;
			@Pc(75) int local75;
			if (this.anInt6315 == Static521.anInt8383) {
				for (local67 = 0; local67 < Static521.anInt8383; local67++) {
					local75 = this.anIntArray341[local57++];
					local37[local67] = (local75 & 0xFF) << 4;
					local33[local67] = local75 >> 4 & 0xFF0;
					local29[local67] = local75 >> 12 & 0xFF0;
				}
			} else {
				for (local67 = 0; local67 < Static521.anInt8383; local67++) {
					local75 = local67 * this.anInt6315 / Static521.anInt8383;
					@Pc(128) int local128 = this.anIntArray341[local57 + local75];
					local37[local67] = (local128 & 0xFF) << 4;
					local33[local67] = local128 >> 4 & 0xFF0;
					local29[local67] = local128 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public final void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6313 = arg0.method5198();
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Z")
	protected final boolean method5360() {
		if (this.anIntArray341 != null) {
			return true;
		} else if (this.anInt6313 >= 0) {
			@Pc(36) Class279 local36 = Static503.anInt8175 >= 0 ? Static604.method6161(Static522.aClass322_142, Static503.anInt8175, this.anInt6313) : Static604.method6152(Static522.aClass322_142, this.anInt6313);
			local36.method6157();
			this.anIntArray341 = local36.method6150();
			this.anInt6309 = local36.anInt7340;
			this.anInt6315 = local36.anInt7341;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7770() {
		super.method7770();
		this.anIntArray341 = null;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
	@Override
	public final int method7772() {
		return this.anInt6313;
	}
}
