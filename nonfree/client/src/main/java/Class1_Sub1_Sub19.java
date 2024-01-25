import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
	private int anInt3796 = 4096;

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
	private int anInt3795 = 0;

	static {
		new Class106(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
		new Class106("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3795 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt3796 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(21) int[] local21 = this.method6013(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static85.anInt1910; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt3795 <= local29 && local29 <= this.anInt3796 ? 4096 : 0;
			}
		}
		return local11;
	}
}
