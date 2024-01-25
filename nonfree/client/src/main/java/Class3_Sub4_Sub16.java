import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public class Class3_Sub4_Sub16 extends Class3_Sub4 {

	@OriginalMember(owner = "client!tp", name = "K", descriptor = "[I")
	protected int[] anIntArray151;

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
	protected int anInt2864;

	@OriginalMember(owner = "client!tp", name = "V", descriptor = "I")
	protected int anInt2870;

	@OriginalMember(owner = "client!tp", name = "W", descriptor = "I")
	private int anInt2871 = -1;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub16() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)I")
	@Override
	public final int method6136() {
		return this.anInt2871;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309 && this.method2445()) {
			@Pc(31) int[] local31 = local19[0];
			@Pc(35) int[] local35 = local19[1];
			@Pc(39) int[] local39 = local19[2];
			@Pc(55) int local55 = this.anInt2864 * (Static140.anInt2503 == this.anInt2870 ? arg0 : this.anInt2870 * arg0 / Static140.anInt2503);
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (Static148.anInt2687 == this.anInt2864) {
				for (local61 = 0; local61 < Static148.anInt2687; local61++) {
					local69 = this.anIntArray151[local55++];
					local39[local61] = (local69 & 0xFF) << 4;
					local35[local61] = local69 >> 4 & 0xFF0;
					local31[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static148.anInt2687; local61++) {
					local69 = local61 * this.anInt2864 / Static148.anInt2687;
					@Pc(117) int local117 = this.anIntArray151[local55 + local69];
					local39[local61] = (local117 & 0xFF) << 4;
					local35[local61] = local117 >> 4 & 0xFF0;
					local31[local61] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public final void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2871 = arg0.method4083();
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)Z")
	protected final boolean method2445() {
		if (this.anIntArray151 != null) {
			return true;
		} else if (this.anInt2871 >= 0) {
			@Pc(35) Class154 local35 = Static54.anInt1060 >= 0 ? Static467.method3619(Static213.aClass250_60, Static54.anInt1060, this.anInt2871) : Static467.method3620(Static213.aClass250_60, this.anInt2871);
			local35.method3631();
			this.anIntArray151 = local35.method3625();
			this.anInt2870 = local35.anInt4359;
			this.anInt2864 = local35.anInt4358;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	@Override
	public final void method6137() {
		super.method6137();
		this.anIntArray151 = null;
	}
}
