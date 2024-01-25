import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cu", name = "I", descriptor = "I")
	private int anInt1295 = 1;

	@OriginalMember(owner = "client!cu", name = "K", descriptor = "I")
	private int anInt1296 = 0;

	@OriginalMember(owner = "client!cu", name = "S", descriptor = "I")
	private int anInt1304 = 0;

	static {
		new Class84(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1304 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt1296 = arg0.method4130();
		} else if (arg1 == 3) {
			this.anInt1295 = arg0.method4130();
		}
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		Static443.method5895();
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(25) int local25 = Static342.anIntArray469[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static347.anInt5974; local33++) {
				@Pc(39) int local39 = Static384.anIntArray551[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt1304 == 0) {
					local71 = (local39 - local25) * this.anInt1295;
				} else {
					@Pc(61) int local61 = local31 * local31 + local45 * local45 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (local71 * this.anInt1295) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt1296 == 0) {
					local71 = Static12.anIntArray19[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1296 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local11[local33] = local71;
			}
		}
		return local11;
	}
}
