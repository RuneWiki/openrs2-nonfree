import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[16384];

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16384];

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "[I")
	protected int[] anIntArray282;

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
	protected int anInt3373;

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
	protected int anInt3377;

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
	private int anInt3372 = -1;

	static {
		@Pc(10) double local10 = 3.834951969714103E-4D;
		for (@Pc(12) int local12 = 0; local12 < 16384; local12++) {
			aFloatArray23[local12] = (float) Math.sin(local10 * (double) local12);
			aFloatArray22[local12] = (float) Math.cos((double) local12 * local10);
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		super(0, false);
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)I")
	@Override
	public final int method8204() {
		return this.anInt3372;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	@Override
	public final void method8195() {
		super.method8195();
		this.anIntArray282 = null;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590 && this.method3149()) {
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[1];
			@Pc(37) int[] local37 = local17[2];
			@Pc(57) int local57 = (Static426.anInt7423 == this.anInt3373 ? arg0 : arg0 * this.anInt3373 / Static426.anInt7423) * this.anInt3377;
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (Static254.anInt4973 == this.anInt3377) {
				for (local63 = 0; local63 < Static254.anInt4973; local63++) {
					local72 = this.anIntArray282[local57++];
					local37[local63] = (local72 & 0xFF) << 4;
					local33[local63] = local72 >> 4 & 0xFF0;
					local29[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static254.anInt4973; local63++) {
					local72 = local63 * this.anInt3377 / Static254.anInt4973;
					@Pc(79) int local79 = this.anIntArray282[local72 + local57];
					local37[local63] = (local79 & 0xFF) << 4;
					local33[local63] = local79 >> 4 & 0xFF0;
					local29[local63] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
	protected final boolean method3149() {
		if (this.anIntArray282 != null) {
			return true;
		} else if (this.anInt3372 >= 0) {
			@Pc(38) Class70 local38 = Static219.anInt4314 < 0 ? Static547.method1921(Static312.aClass69_62, this.anInt3372) : Static547.method1922(Static312.aClass69_62, Static219.anInt4314, this.anInt3372);
			local38.method1915();
			this.anIntArray282 = local38.method1926();
			this.anInt3377 = local38.anInt2013;
			this.anInt3373 = local38.anInt2012;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public final void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3372 = arg1.method4494();
		}
	}
}
