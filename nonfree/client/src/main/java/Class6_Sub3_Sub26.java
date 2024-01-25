import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class6_Sub3_Sub26 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
	private int anInt6337 = 0;

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
	private int anInt6338 = 1;

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
	private int anInt6343 = 0;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(27) int local27 = Static564.anIntArray703[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static447.anInt8568; local35++) {
				@Pc(41) int local41 = Static157.anIntArray321[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt6343 == 0) {
					local57 = (local41 - local27) * this.anInt6338;
				} else {
					@Pc(70) int local70 = local47 * local47 + local33 * local33 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (this.anInt6338 * local57) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt6337 == 0) {
					local57 = Static35.anIntArray47[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6337 == 2) {
					local57 -= 2048;
					if (local57 < 0) {
						local57 = -local57;
					}
					local57 = 2048 - local57 << 1;
				}
				local19[local35] = local57;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt6343 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt6337 = arg1.method6041();
		} else if (arg0 == 3) {
			this.anInt6338 = arg1.method6041();
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		Static369.method5426();
	}
}
