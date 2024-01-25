import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class2_Sub10_Sub20 extends Class2_Sub10 {

	@OriginalMember(owner = "client!nea", name = "F", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!nea", name = "O", descriptor = "I")
	private int anInt6649;

	@OriginalMember(owner = "client!nea", name = "Q", descriptor = "I")
	private int anInt6651;

	@OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
	private int anInt6640 = -1;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub20() {
		super(0, false);
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Z)V")
	@Override
	public void method8404() {
		super.method8404();
		this.anIntArray445 = null;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(III)V")
	@Override
	public void method8400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method8400(arg0, arg1);
		if (this.anInt6640 >= 0 && Static150.anInterface6_5 != null) {
			@Pc(27) int local27 = Static150.anInterface6_5.method6357(this.anInt6640).aBoolean428 ? 64 : 128;
			this.anIntArray445 = Static150.anInterface6_5.method6354(1.0F, local27, false, this.anInt6640, local27);
			this.anInt6651 = local27;
			this.anInt6649 = local27;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)I")
	@Override
	public int method8405() {
		return this.anInt6640;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6640 = arg0.method6884();
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(31) int local31 = this.anInt6651 * (this.anInt6649 == Static512.anInt8591 ? arg0 : this.anInt6649 * arg0 / Static512.anInt8591);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (Static93.anInt1862 == this.anInt6651) {
				for (local53 = 0; local53 < Static93.anInt1862; local53++) {
					local62 = this.anIntArray445[local31++];
					local43[local53] = (local62 & 0xFF) << 4;
					local39[local53] = local62 >> 4 & 0xFF0;
					local35[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static93.anInt1862; local53++) {
					local62 = local53 * this.anInt6651 / Static93.anInt1862;
					@Pc(69) int local69 = this.anIntArray445[local62 + local31];
					local43[local53] = (local69 & 0xFF) << 4;
					local39[local53] = local69 >> 4 & 0xFF0;
					local35[local53] = local69 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}
}
