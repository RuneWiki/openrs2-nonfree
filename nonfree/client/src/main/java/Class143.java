import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class143 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	public int anInt3596;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	public int anInt3600;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public int anInt3601;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public int anInt3603;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public int anInt3604;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
	public int anInt3606;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	public int anInt3608;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
	public int anInt3610;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "Lclient!hr;")
	public Class143 aClass143_1;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	public final int anInt3594;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
	private final int anInt3609;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public final int anInt3598;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	public final int anInt3607;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(IIIIB)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.aByte40 = arg4;
		this.anInt3594 = arg2;
		this.anInt3609 = arg0;
		this.anInt3598 = arg3;
		this.anInt3607 = arg1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)Lclient!ou;")
	public Class259 method3021() {
		return Static485.method6788(this.anInt3609);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBII)Lclient!hr;")
	public Class143 method3022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class143(this.anInt3609, arg0, arg1, arg2, this.aByte40);
	}
}
