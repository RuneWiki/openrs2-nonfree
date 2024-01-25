import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
	private int anInt5257 = 1;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
	private int anInt5253 = 0;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
	private int anInt5255 = 0;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		Static3.method41();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5255 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt5253 = arg0.method5633();
		} else if (arg1 == 3) {
			this.anInt5257 = arg0.method5633();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(27) int local27 = Static376.anIntArray665[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static201.anInt3738; local35++) {
				@Pc(41) int local41 = Static57.anIntArray536[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(74) int local74;
				if (this.anInt5255 == 0) {
					local74 = this.anInt5257 * (local41 - local27);
				} else {
					@Pc(64) int local64 = local47 * local47 + local33 * local33 >> 12;
					local74 = (int) (Math.sqrt((double) ((float) local64 / 4096.0F)) * 4096.0D);
					local74 = (int) ((double) (local74 * this.anInt5257) * 3.141592653589793D);
				}
				local74 -= local74 & 0xFFFFF000;
				if (this.anInt5253 == 0) {
					local74 = Static44.anIntArray55[local74 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5253 == 2) {
					local74 -= 2048;
					if (local74 < 0) {
						local74 = -local74;
					}
					local74 = 2048 - local74 << 1;
				}
				local11[local35] = local74;
			}
		}
		return local11;
	}
}
