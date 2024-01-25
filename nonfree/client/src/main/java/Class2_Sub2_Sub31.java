import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!rs", name = "G", descriptor = "[I")
	private int[] anIntArray521;

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "[I")
	private int[] anIntArray522;

	@OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
	private int anInt6022 = 2048;

	@OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
	private int anInt6024 = 10;

	@OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
	private int anInt6021 = 0;

	static {
		new Class134("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(25) int local25 = Static405.anIntArray555[arg0];
			@Pc(35) int local35;
			if (this.anInt6021 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt6024; local35++) {
					if (this.anIntArray521[local35] <= local25 && this.anIntArray521[local35 + 1] > local25) {
						if (local25 < this.anIntArray522[local35]) {
							local33 = 4096;
						}
						break;
					}
				}
				Static464.method1962(local11, 0, Static217.anInt3574, local33);
			} else {
				for (@Pc(91) int local91 = 0; local91 < Static217.anInt3574; local91++) {
					local35 = 0;
					@Pc(97) short local97 = 0;
					@Pc(101) int local101 = Static145.anIntArray199[local91];
					@Pc(104) int local104 = this.anInt6021;
					if (local104 == 1) {
						local35 = local101;
					} else if (local104 == 2) {
						local35 = (local101 + local25 - 4096 >> 1) + 2048;
					} else if (local104 == 3) {
						local35 = (local101 - local25 >> 1) + 2048;
					}
					for (local104 = 0; local104 < this.anInt6024; local104++) {
						if (local35 >= this.anIntArray521[local104] && this.anIntArray521[local104 + 1] > local35) {
							if (this.anIntArray522[local104] > local35) {
								local97 = 4096;
							}
							break;
						}
					}
					local11[local91] = local97;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6024 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt6022 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt6021 = arg0.method3580();
		}
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		this.method4704();
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)V")
	private void method4704() {
		this.anIntArray522 = new int[this.anInt6024 + 1];
		@Pc(22) int local22 = 0;
		this.anIntArray521 = new int[this.anInt6024 + 1];
		@Pc(34) int local34 = 4096 / this.anInt6024;
		@Pc(41) int local41 = this.anInt6022 * local34 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt6024; local43++) {
			this.anIntArray521[local43] = local22;
			this.anIntArray522[local43] = local22 + local41;
			local22 += local34;
		}
		this.anIntArray521[this.anInt6024] = 4096;
		this.anIntArray522[this.anInt6024] = this.anIntArray522[0] + 4096;
	}
}
