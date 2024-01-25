import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!hu", name = "t", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "I")
	private final int anInt3943;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
	private final int anInt3947;

	@OriginalMember(owner = "client!hu", name = "z", descriptor = "I")
	private final int anInt3950;

	@OriginalMember(owner = "client!hu", name = "q", descriptor = "I")
	private final int anInt3946;

	static {
		for (@Pc(7) int local7 = 0; local7 < 26; local7++) {
			aCharArray3[local7] = (char) (local7 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray3[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray3[local39] = (char) (local39 + 48 - 52);
		}
		aCharArray3[63] = '-';
		aCharArray3[62] = '*';
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(IIIIIII)V")
	public Class19_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3943 = arg3;
		this.anInt3947 = arg1;
		this.anInt3950 = arg0;
		this.anInt3946 = arg2;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(III)V")
	@Override
	public void method7064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt3950 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt3946 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt3947 >> 12;
		@Pc(35) int local35 = this.anInt3943 * arg1 >> 12;
		Static395.method5732(super.anInt8860, local35, super.anInt8861, local21, local14, local28, super.anInt8864);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3950 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt3946 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3947 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3943 >> 12;
		Static432.method6151(local10, local31, local17, local24, super.anInt8864);
	}
}
