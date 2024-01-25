import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class2_Sub11_Sub22 extends Class2_Sub11 {

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
	private int anInt8354 = 1;

	@OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
	private int anInt8353 = 0;

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
	private int anInt8357 = 0;

	static {
		new Class150("game5", "Game 5", 4);
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		Static652.method8957();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt8353 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt8357 = arg1.method8581(-17416);
		} else if (arg0 == 3) {
			this.anInt8354 = arg1.method8581(-17416);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(27) int local27 = Static137.anIntArray170[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static301.anInt10214; local35++) {
				@Pc(41) int local41 = Static523.anIntArray461[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt8353 == 0) {
					local58 = (local41 - local27) * this.anInt8354;
				} else {
					@Pc(70) int local70 = local47 * local47 + local33 * local33 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt8354) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt8357 == 0) {
					local58 = Static611.anIntArray688[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt8357 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local13[local35] = local58;
			}
		}
		return local13;
	}
}
