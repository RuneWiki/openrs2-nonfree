import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class3_Sub4_Sub18 extends Class3_Sub4 {

	@OriginalMember(owner = "client!kp", name = "N", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!kp", name = "O", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
	private int anInt4249 = 2048;

	@OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
	private int anInt4255 = 0;

	@OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
	private int anInt4253 = 10;

	static {
		new Class175("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
		new Class175(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(B)V")
	private void method3469() {
		this.anIntArray320 = new int[this.anInt4253 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray321 = new int[this.anInt4253 + 1];
		@Pc(26) int local26 = 4096 / this.anInt4253;
		@Pc(33) int local33 = this.anInt4249 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4253; local35++) {
			this.anIntArray321[local35] = local14;
			this.anIntArray320[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray321[this.anInt4253] = 4096;
		this.anIntArray320[this.anInt4253] = this.anIntArray320[0] + 4096;
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(24) int local24 = Static285.anIntArray401[arg0];
			@Pc(34) int local34;
			if (this.anInt4255 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt4253; local34++) {
					if (local24 >= this.anIntArray321[local34] && this.anIntArray321[local34 + 1] > local24) {
						if (local24 < this.anIntArray320[local34]) {
							local32 = 4096;
						}
						break;
					}
				}
				Static464.method5795(local16, 0, Static106.anInt2356, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static106.anInt2356; local78++) {
					local34 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static382.anIntArray476[local78];
					@Pc(91) int local91 = this.anInt4255;
					if (local91 == 1) {
						local34 = local88;
					} else if (local91 == 2) {
						local34 = (local88 + local24 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local34 = (local88 - local24 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt4253; local91++) {
						if (this.anIntArray321[local91] <= local34 && this.anIntArray321[local91 + 1] > local34) {
							if (local34 < this.anIntArray320[local91]) {
								local84 = 4096;
							}
							break;
						}
					}
					local16[local78] = local84;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt4253 = arg1.method6053();
		} else if (arg0 == 1) {
			this.anInt4249 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt4255 = arg1.method6053();
		}
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		this.method3469();
	}
}
