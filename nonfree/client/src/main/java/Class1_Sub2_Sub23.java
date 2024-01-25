import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class1_Sub2_Sub23 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kq", name = "O", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!kq", name = "U", descriptor = "I")
	private int anInt3488;

	@OriginalMember(owner = "client!kq", name = "V", descriptor = "I")
	private int anInt3489;

	@OriginalMember(owner = "client!kq", name = "Q", descriptor = "I")
	private int anInt3484 = -1;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub23() {
		super(0, false);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt3484 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(33) int local33 = this.anInt3488 * (Static91.anInt1665 == this.anInt3489 ? arg0 : arg0 * this.anInt3489 / Static91.anInt1665);
			@Pc(37) int[] local37 = local13[0];
			@Pc(41) int[] local41 = local13[1];
			@Pc(45) int[] local45 = local13[2];
			@Pc(51) int local51;
			@Pc(60) int local60;
			if (this.anInt3488 == Static158.anInt2658) {
				for (local51 = 0; local51 < Static158.anInt2658; local51++) {
					local60 = this.anIntArray407[local33++];
					local45[local51] = (local60 & 0xFF) << 4;
					local41[local51] = local60 >> 4 & 0xFF0;
					local37[local51] = local60 >> 12 & 0xFF0;
				}
			} else {
				for (local51 = 0; local51 < Static158.anInt2658; local51++) {
					local60 = this.anInt3488 * local51 / Static158.anInt2658;
					@Pc(67) int local67 = this.anIntArray407[local60 + local33];
					local45[local51] = (local67 & 0xFF) << 4;
					local41[local51] = local67 >> 4 & 0xFF0;
					local37[local51] = local67 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.anInt3484;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BII)V")
	@Override
	public void method5509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5509(arg0, arg1);
		if (this.anInt3484 >= 0 && Static318.anInterface2_6 != null) {
			@Pc(31) int local31 = Static318.anInterface2_6.method4741(this.anInt3484).aBoolean193 ? 64 : 128;
			this.anIntArray407 = Static318.anInterface2_6.method4742(local31, this.anInt3484, local31, 1.0F, false);
			this.anInt3489 = local31;
			this.anInt3488 = local31;
		}
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)V")
	@Override
	public void method5513() {
		super.method5513();
		this.anIntArray407 = null;
	}
}
