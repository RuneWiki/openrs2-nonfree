import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class1_Sub4_Sub38 extends Class1_Sub4 {

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
	private int anInt5381 = 0;

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
	private int anInt5388 = 1;

	@OriginalMember(owner = "client!vn", name = "P", descriptor = "I")
	private int anInt5389 = 0;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
		Static17.method243();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(18) int local18 = Static250.anIntArray398[arg0];
			@Pc(24) int local24 = local18 - 2048 >> 1;
			for (@Pc(26) int local26 = 0; local26 < Static182.anInt3492; local26++) {
				@Pc(37) int local37 = Static279.anIntArray454[local26];
				@Pc(43) int local43 = local37 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt5389 == 0) {
					local55 = this.anInt5388 * (local37 - local18);
				} else {
					@Pc(67) int local67 = local24 * local24 + local43 * local43 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (local55 * this.anInt5388) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt5381 == 0) {
					local55 = Static21.anIntArray21[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5381 == 2) {
					local55 -= 2048;
					if (local55 < 0) {
						local55 = -local55;
					}
					local55 = 2048 - local55 << 1;
				}
				local9[local26] = local55;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5389 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt5381 = arg0.method1378();
		} else if (arg1 == 3) {
			this.anInt5388 = arg0.method1378();
		}
	}
}
