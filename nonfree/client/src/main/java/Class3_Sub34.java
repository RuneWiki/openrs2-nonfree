import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
	private final int anInt6031;

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
	public final int anInt6022;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	private final int anInt6021;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	private final int anInt6020;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
	private final int anInt6023;

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "I")
	private final int anInt6028;

	@OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
	public final int anInt6032;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
	public final int anInt6024;

	@OriginalMember(owner = "client!qr", name = "E", descriptor = "I")
	public final int anInt6033;

	static {
		new Class175(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		new Class175("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6031 = arg3;
		this.anInt6022 = arg8;
		this.anInt6021 = arg4;
		this.anInt6020 = arg1;
		this.anInt6023 = arg0;
		this.anInt6028 = arg2;
		this.anInt6032 = arg7;
		this.anInt6024 = arg6;
		this.anInt6033 = arg5;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z")
	public boolean method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt6020 && this.anInt6031 >= arg0 && this.anInt6028 <= arg1 && this.anInt6021 >= arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[III)V")
	public void method4807(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt6023;
		arg1[1] = this.anInt6020 + arg0 - this.anInt6033;
		arg1[2] = arg2 + this.anInt6028 - this.anInt6024;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z")
	public boolean method4808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt6033 && this.anInt6032 >= arg0 && this.anInt6024 <= arg1 && arg1 <= this.anInt6022;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BII[I)V")
	public void method4809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = 0;
		arg2[1] = this.anInt6033 + arg1 - this.anInt6020;
		arg2[2] = this.anInt6024 + arg0 - this.anInt6028;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)Z")
	public boolean method4810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt6023 && this.anInt6020 <= arg0 && arg0 <= this.anInt6031 && arg1 >= this.anInt6028 && arg1 <= this.anInt6021;
	}
}
