import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class2_Sub6_Sub32 extends Class2_Sub6 {

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "[I")
	private int[] anIntArray710;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
	private int anInt5859;

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
	private int anInt5866;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
	private int anInt5862 = -1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub32() {
		super(0, false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(40) int local40 = this.anInt5866 * (this.anInt5859 == Static372.anInt6520 ? arg0 : this.anInt5859 * arg0 / Static372.anInt6520);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (this.anInt5866 == Static151.anInt2711) {
				for (local58 = 0; local58 < Static151.anInt2711; local58++) {
					local67 = this.anIntArray710[local40++];
					local52[local58] = (local67 & 0xFF) << 4;
					local48[local58] = local67 >> 4 & 0xFF0;
					local44[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static151.anInt2711; local58++) {
					local67 = this.anInt5866 * local58 / Static151.anInt2711;
					@Pc(74) int local74 = this.anIntArray710[local67 + local40];
					local52[local58] = (local74 & 0xFF) << 4;
					local48[local58] = local74 >> 4 & 0xFF0;
					local44[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5862 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)I")
	@Override
	public int method5634() {
		return this.anInt5862;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5633() {
		super.method5633();
		this.anIntArray710 = null;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V")
	@Override
	public void method5636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method5636(arg0, arg1);
		if (this.anInt5862 >= 0 && Static307.anInterface1_5 != null) {
			@Pc(24) int local24 = Static307.anInterface1_5.method2849(this.anInt5862).aBoolean361 ? 64 : 128;
			this.anIntArray710 = Static307.anInterface1_5.method2850(false, local24, 1.0F, this.anInt5862, local24);
			this.anInt5866 = local24;
			this.anInt5859 = local24;
		}
	}
}
