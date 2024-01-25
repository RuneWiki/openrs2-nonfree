import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class139 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public int anInt3909;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public int anInt3910;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!hi;")
	public Class139 aClass139_2;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	public int anInt3916;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	public int anInt3917;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	public int anInt3918;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public int anInt3919;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	public int anInt3920;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	public int anInt3923;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public final int anInt3913;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
	public final int anInt3912;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
	private final int anInt3915;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public final int anInt3911;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIB)V")
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3913 = arg2;
		this.anInt3912 = arg3;
		this.anInt3915 = arg0;
		this.aByte48 = arg4;
		this.anInt3911 = arg1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIB)Lclient!hi;")
	public Class139 method3252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class139(this.anInt3915, arg1, arg0, arg2, this.aByte48);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)Lclient!ce;")
	public Class51 method3253() {
		return Static496.method6943(this.anInt3915);
	}
}
