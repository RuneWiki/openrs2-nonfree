import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public class Class2_Sub10_Sub6 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ega", name = "B", descriptor = "I")
	protected int anInt5450;

	@OriginalMember(owner = "client!ega", name = "E", descriptor = "I")
	protected int anInt5453;

	@OriginalMember(owner = "client!ega", name = "L", descriptor = "[I")
	protected int[] anIntArray370;

	@OriginalMember(owner = "client!ega", name = "H", descriptor = "I")
	private int anInt5455 = -1;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub6() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8404() {
		super.method8404();
		this.anIntArray370 = null;
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(Z)I")
	@Override
	public final int method8409() {
		return this.anInt5455;
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)Z")
	protected final boolean method4542() {
		if (this.anIntArray370 != null) {
			return true;
		} else if (this.anInt5455 >= 0) {
			@Pc(31) Class120 local31 = Static255.anInt5049 >= 0 ? Static647.method3070(Static240.aClass97_62, Static255.anInt5049, this.anInt5455) : Static647.method3064(Static240.aClass97_62, this.anInt5455);
			local31.method3074();
			this.anIntArray370 = local31.method3067();
			this.anInt5450 = local31.anInt3707;
			this.anInt5453 = local31.anInt3710;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573 && this.method4542()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = this.anInt5453 * (Static512.anInt8591 == this.anInt5450 ? arg0 : this.anInt5450 * arg0 / Static512.anInt8591);
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (this.anInt5453 == Static93.anInt1862) {
				for (local58 = 0; local58 < Static93.anInt1862; local58++) {
					local67 = this.anIntArray370[local52++];
					local36[local58] = (local67 & 0xFF) << 4;
					local32[local58] = local67 >> 4 & 0xFF0;
					local28[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static93.anInt1862; local58++) {
					local67 = this.anInt5453 * local58 / Static93.anInt1862;
					@Pc(74) int local74 = this.anIntArray370[local67 + local52];
					local36[local58] = (local74 & 0xFF) << 4;
					local32[local58] = local74 >> 4 & 0xFF0;
					local28[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public final void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5455 = arg0.method6884();
		}
	}
}
