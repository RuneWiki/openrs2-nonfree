import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public class Class14_Sub1_Sub2 extends Class14_Sub1 {

	@OriginalMember(owner = "client!bba", name = "J", descriptor = "I")
	protected int anInt9376;

	@OriginalMember(owner = "client!bba", name = "R", descriptor = "[I")
	protected int[] anIntArray690;

	@OriginalMember(owner = "client!bba", name = "S", descriptor = "I")
	protected int anInt9383;

	@OriginalMember(owner = "client!bba", name = "Q", descriptor = "I")
	private int anInt9382 = -1;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub2() {
		super(0, false);
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(B)Z")
	protected final boolean method7753() {
		if (this.anIntArray690 != null) {
			return true;
		} else if (this.anInt9382 >= 0) {
			@Pc(32) Class356 local32 = Static161.anInt3180 < 0 ? Static688.method8622(Static436.aClass386_97, this.anInt9382) : Static688.method8619(Static436.aClass386_97, Static161.anInt3180, this.anInt9382);
			local32.method8621();
			this.anIntArray690 = local32.method8615();
			this.anInt9383 = local32.anInt10341;
			this.anInt9376 = local32.anInt10343;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(B)V")
	@Override
	public final void method8895() {
		super.method8895();
		this.anIntArray690 = null;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571 && this.method7753()) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			@Pc(53) int local53 = this.anInt9383 * (this.anInt9376 == Static535.anInt9239 ? arg0 : arg0 * this.anInt9376 / Static535.anInt9239);
			@Pc(63) int local63;
			@Pc(72) int local72;
			if (Static371.anInt6835 == this.anInt9383) {
				for (local63 = 0; local63 < Static371.anInt6835; local63++) {
					local72 = this.anIntArray690[local53++];
					local37[local63] = (local72 & 0xFF) << 4;
					local33[local63] = local72 >> 4 & 0xFF0;
					local29[local63] = local72 >> 12 & 0xFF0;
				}
			} else {
				for (local63 = 0; local63 < Static371.anInt6835; local63++) {
					local72 = local63 * this.anInt9383 / Static371.anInt6835;
					@Pc(79) int local79 = this.anIntArray690[local72 + local53];
					local37[local63] = (local79 & 0xFF) << 4;
					local33[local63] = local79 >> 4 & 0xFF0;
					local29[local63] = local79 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public final void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9382 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
	@Override
	public final int method8900() {
		return this.anInt9382;
	}
}
