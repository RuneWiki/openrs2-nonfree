import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub1_Sub21 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	private int anInt4051 = 0;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt4052 = 4096;

	static {
		new Class62("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4051 = arg1.method5753();
		} else if (arg0 == 1) {
			this.anInt4052 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(21) int[] local21 = this.method6069(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static391.anInt7118; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt4051 && local29 <= this.anInt4052 ? 4096 : 0;
			}
		}
		return local11;
	}
}
