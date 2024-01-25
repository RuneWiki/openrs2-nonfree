import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!qu", name = "F", descriptor = "I")
	public final int anInt7213;

	@OriginalMember(owner = "client!qu", name = "E", descriptor = "I")
	private final int anInt7212;

	@OriginalMember(owner = "client!qu", name = "G", descriptor = "I")
	public final int anInt7214;

	@OriginalMember(owner = "client!qu", name = "C", descriptor = "I")
	private final int anInt7211;

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
	private final int anInt7196;

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "I")
	public final int anInt7205;

	@OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
	public final int anInt7203;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "I")
	private final int anInt7209;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "I")
	private final int anInt7201;

	static {
		new Class45("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7213 = arg5;
		this.anInt7212 = arg1;
		this.anInt7214 = arg7;
		this.anInt7211 = arg3;
		this.anInt7196 = arg4;
		this.anInt7205 = arg8;
		this.anInt7203 = arg6;
		this.anInt7209 = arg0;
		this.anInt7201 = arg2;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(III)Z")
	public boolean method6485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt7212 <= arg0 && arg0 <= this.anInt7211 && arg1 >= this.anInt7201 && arg1 <= this.anInt7196;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BII[I)V")
	public void method6488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt7209;
		arg2[2] = this.anInt7201 + arg1 - this.anInt7203;
		arg2[1] = this.anInt7212 + arg0 - this.anInt7213;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZII)Z")
	public boolean method6492(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt7209 == arg0 && arg2 >= this.anInt7212 && arg2 <= this.anInt7211 && this.anInt7201 <= arg1 && this.anInt7196 >= arg1;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II[II)V")
	public void method6494(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt7213 + arg2 - this.anInt7212;
		arg1[2] = arg0 + this.anInt7203 - this.anInt7201;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZI)Z")
	public boolean method6495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt7213 <= arg1 && arg1 <= this.anInt7214 && arg0 >= this.anInt7203 && this.anInt7205 >= arg0;
	}
}
