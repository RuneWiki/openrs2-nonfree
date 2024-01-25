import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dj", name = "K", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!dj", name = "N", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
	private int anInt1338 = 2048;

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
	private int anInt1342 = 0;

	@OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
	private int anInt1340 = 10;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(27) int local27 = Static394.anIntArray751[arg0];
			@Pc(39) int local39;
			if (this.anInt1342 == 0) {
				@Pc(141) short local141 = 0;
				for (local39 = 0; local39 < this.anInt1340; local39++) {
					if (this.anIntArray180[local39] <= local27 && this.anIntArray180[local39 + 1] > local27) {
						if (this.anIntArray179[local39] > local27) {
							local141 = 4096;
						}
						break;
					}
				}
				Static404.method4340(local11, 0, Static158.anInt2658, local141);
			} else {
				for (@Pc(35) int local35 = 0; local35 < Static158.anInt2658; local35++) {
					local39 = 0;
					@Pc(41) short local41 = 0;
					@Pc(45) int local45 = Static87.anIntArray211[local35];
					@Pc(48) int local48 = this.anInt1342;
					if (local48 == 1) {
						local39 = local45;
					} else if (local48 == 2) {
						local39 = (local27 + local45 - 4096 >> 1) + 2048;
					} else if (local48 == 3) {
						local39 = (local45 - local27 >> 1) + 2048;
					}
					for (local48 = 0; local48 < this.anInt1340; local48++) {
						if (local39 >= this.anIntArray180[local48] && this.anIntArray180[local48 + 1] > local39) {
							if (local39 < this.anIntArray179[local48]) {
								local41 = 4096;
							}
							break;
						}
					}
					local11[local35] = local41;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt1340 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt1338 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt1342 = arg1.method5174();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		this.method1107();
	}

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
	private void method1107() {
		this.anIntArray179 = new int[this.anInt1340 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray180 = new int[this.anInt1340 + 1];
		@Pc(26) int local26 = 4096 / this.anInt1340;
		@Pc(33) int local33 = this.anInt1338 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1340; local35++) {
			this.anIntArray180[local35] = local14;
			this.anIntArray179[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray180[this.anInt1340] = 4096;
		this.anIntArray179[this.anInt1340] = this.anIntArray179[0] + 4096;
	}
}
