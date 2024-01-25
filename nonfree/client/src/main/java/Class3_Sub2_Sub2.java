import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!ai", name = "R", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
	private int anInt217 = 2048;

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
	private int anInt214 = 10;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
	private int anInt212 = 0;

	static {
		new Class189("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
	private void method134() {
		this.anIntArray6 = new int[this.anInt214 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray5 = new int[this.anInt214 + 1];
		@Pc(26) int local26 = 4096 / this.anInt214;
		@Pc(33) int local33 = this.anInt217 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt214; local35++) {
			this.anIntArray6[local35] = local14;
			this.anIntArray5[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray6[this.anInt214] = 4096;
		this.anIntArray5[this.anInt214] = this.anIntArray5[0] + 4096;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt214 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt217 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt212 = arg0.method2582();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(23) int local23 = Static441.anIntArray522[arg0];
			@Pc(35) int local35;
			if (this.anInt212 == 0) {
				@Pc(131) short local131 = 0;
				for (local35 = 0; local35 < this.anInt214; local35++) {
					if (local23 >= this.anIntArray6[local35] && this.anIntArray6[local35 + 1] > local23) {
						if (local23 < this.anIntArray5[local35]) {
							local131 = 4096;
						}
						break;
					}
				}
				Static462.method4617(local15, 0, Static406.anInt6694, local131);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static406.anInt6694; local31++) {
					local35 = 0;
					@Pc(37) short local37 = 0;
					@Pc(41) int local41 = Static86.anIntArray125[local31];
					@Pc(44) int local44 = this.anInt212;
					if (local44 == 1) {
						local35 = local41;
					} else if (local44 == 2) {
						local35 = (local41 + local23 - 4096 >> 1) + 2048;
					} else if (local44 == 3) {
						local35 = (local41 - local23 >> 1) + 2048;
					}
					for (local44 = 0; local44 < this.anInt214; local44++) {
						if (local35 >= this.anIntArray6[local44] && local35 < this.anIntArray6[local44 + 1]) {
							if (local35 < this.anIntArray5[local44]) {
								local37 = 4096;
							}
							break;
						}
					}
					local15[local31] = local37;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		this.method134();
	}
}
