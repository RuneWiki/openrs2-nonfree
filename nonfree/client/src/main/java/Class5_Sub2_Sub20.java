import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class5_Sub2_Sub20 extends Class5_Sub2 {

	@OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
	private int anInt3364 = 0;

	@OriginalMember(owner = "client!kn", name = "T", descriptor = "I")
	private int anInt3366 = 1;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
	private int anInt3362 = 0;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(23) int local23 = Static287.anIntArray413[arg0];
			@Pc(29) int local29 = local23 - 2048 >> 1;
			for (@Pc(31) int local31 = 0; local31 < Static15.anInt493; local31++) {
				@Pc(37) int local37 = Static257.anIntArray386[local31];
				@Pc(43) int local43 = local37 - 2048 >> 1;
				@Pc(66) int local66;
				if (this.anInt3362 == 0) {
					local66 = (local37 - local23) * this.anInt3366;
				} else {
					@Pc(56) int local56 = local29 * local29 + local43 * local43 >> 12;
					local66 = (int) (Math.sqrt((double) ((float) local56 / 4096.0F)) * 4096.0D);
					local66 = (int) ((double) (local66 * this.anInt3366) * 3.141592653589793D);
				}
				local66 -= local66 & 0xFFFFF000;
				if (this.anInt3364 == 0) {
					local66 = Static228.anIntArray320[local66 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3364 == 2) {
					local66 -= 2048;
					if (local66 < 0) {
						local66 = -local66;
					}
					local66 = 2048 - local66 << 1;
				}
				local15[local31] = local66;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3362 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt3364 = arg0.method1832();
		} else if (arg1 == 3) {
			this.anInt3366 = arg0.method1832();
		}
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		Static10.method307();
	}
}
