import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
	private final int anInt6794;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
	private final int anInt6796;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
	private final int anInt6791;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
	private final int anInt6798;

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
	private final int anInt6793;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
	private final int anInt6789;

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
	private final int anInt6797;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
	private final int anInt6788;

	static {
		new Class242("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6794 = arg1;
		this.anInt6796 = arg0;
		this.anInt6791 = arg3;
		this.anInt6798 = arg4;
		this.anInt6793 = arg5;
		this.anInt6789 = arg7;
		this.anInt6797 = arg6;
		this.anInt6788 = arg2;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
	@Override
	public void method5621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V")
	@Override
	public void method5624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6796 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6794 >> 12;
		@Pc(24) int local24 = this.anInt6788 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt6791 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt6798 * arg0 >> 12;
		@Pc(51) int local51 = arg1 * this.anInt6793 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt6797 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt6789 >> 12;
		Static337.method4616(local17, local51, local24, local31, super.anInt7285, local10, local38, local65, local58);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
