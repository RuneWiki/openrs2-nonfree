import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!dd", name = "S", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
	private int anInt1319 = 0;

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
	private int anInt1322 = 2048;

	@OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
	private int anInt1327 = 10;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
	private void method1169() {
		this.anIntArray61 = new int[this.anInt1327 + 1];
		this.anIntArray60 = new int[this.anInt1327 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt1327;
		@Pc(33) int local33 = this.anInt1322 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1327; local35++) {
			this.anIntArray61[local35] = local21;
			this.anIntArray60[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray61[this.anInt1327] = 4096;
		this.anIntArray60[this.anInt1327] = this.anIntArray60[0] + 4096;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(32) int[] local32 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(40) int local40 = Static287.anIntArray413[arg0];
			@Pc(50) int local50;
			if (this.anInt1319 == 0) {
				@Pc(48) short local48 = 0;
				for (local50 = 0; local50 < this.anInt1327; local50++) {
					if (this.anIntArray61[local50] <= local40 && this.anIntArray61[local50 + 1] > local40) {
						if (this.anIntArray60[local50] > local40) {
							local48 = 4096;
						}
						break;
					}
				}
				Static359.method754(local32, 0, Static15.anInt493, local48);
			} else {
				for (@Pc(98) int local98 = 0; local98 < Static15.anInt493; local98++) {
					local50 = 0;
					@Pc(104) short local104 = 0;
					@Pc(108) int local108 = Static257.anIntArray386[local98];
					@Pc(111) int local111 = this.anInt1319;
					if (local111 == 1) {
						local50 = local108;
					} else if (local111 == 2) {
						local50 = (local40 + local108 - 4096 >> 1) + 2048;
					} else if (local111 == 3) {
						local50 = (local108 - local40 >> 1) + 2048;
					}
					for (local111 = 0; local111 < this.anInt1327; local111++) {
						if (this.anIntArray61[local111] <= local50 && this.anIntArray61[local111 + 1] > local50) {
							if (this.anIntArray60[local111] > local50) {
								local104 = 4096;
							}
							break;
						}
					}
					local32[local98] = local104;
				}
			}
		}
		return local32;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		this.method1169();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1327 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt1322 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt1319 = arg0.method1832();
		}
	}
}
