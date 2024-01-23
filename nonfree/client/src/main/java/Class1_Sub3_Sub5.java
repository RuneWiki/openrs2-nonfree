import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
	protected int anInt1175;

	@OriginalMember(owner = "client!qk", name = "U", descriptor = "[I")
	protected int[] anIntArray92;

	@OriginalMember(owner = "client!qk", name = "W", descriptor = "I")
	protected int anInt1181;

	@OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
	private int anInt1184 = -1;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		super(0, false);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48 && this.method787()) {
			@Pc(31) int[] local31 = local15[0];
			@Pc(35) int[] local35 = local15[2];
			@Pc(39) int[] local39 = local15[1];
			@Pc(55) int local55 = (Static166.anInt3882 == this.anInt1181 ? arg0 : arg0 * this.anInt1181 / Static166.anInt3882) * this.anInt1175;
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (this.anInt1175 == Static110.anInt2934) {
				for (local61 = 0; local61 < Static110.anInt2934; local61++) {
					local69 = this.anIntArray92[local55++];
					local35[local61] = (local69 & 0xFF) << 4;
					local39[local61] = local69 >> 4 & 0xFF0;
					local31[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static110.anInt2934; local61++) {
					local69 = this.anInt1175 * local61 / Static110.anInt2934;
					@Pc(121) int local121 = this.anIntArray92[local69 + local55];
					local35[local61] = (local121 & 0xFF) << 4;
					local39[local61] = local121 >> 4 & 0xFF0;
					local31[local61] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "(B)Z")
	protected final boolean method787() {
		if (this.anIntArray92 != null) {
			return true;
		} else if (this.anInt1184 >= 0) {
			@Pc(34) Class1_Sub2_Sub4_Sub1 local34 = Static264.anInt5541 >= 0 ? Static234.method3890(Static264.anInt5541, Static115.aClass51_38, this.anInt1184) : Static240.method3945(this.anInt1184, Static115.aClass51_38);
			local34.method912();
			this.anInt1175 = local34.anInt1292;
			this.anIntArray92 = local34.anIntArray94;
			this.anInt1181 = local34.anInt1291;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)V")
	@Override
	public final void method4128() {
		super.method4128();
		this.anIntArray92 = null;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)I")
	@Override
	public final int method4122() {
		return this.anInt1184;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public final void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1184 = arg0.method1764();
		}
	}
}
