import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class103 {

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	public int anInt3643;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!fk;")
	public Class103 aClass103_1;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public int anInt3645;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public int anInt3648;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public int anInt3649;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	public int anInt3650;

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public int anInt3653;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	public int anInt3655;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
	public int anInt3656;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public int anInt3657;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
	public final int anInt3647;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	private final int anInt3658;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "B")
	public final byte aByte29;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
	public final int anInt3660;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
	public final int anInt3652;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IIIIB)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3647 = arg2;
		this.anInt3658 = arg0;
		this.aByte29 = arg4;
		this.anInt3660 = arg3;
		this.anInt3652 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lclient!fp;")
	public Class108 method3125() {
		return Static548.method7724(this.anInt3658);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZII)Lclient!fk;")
	public Class103 method3126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class103(this.anInt3658, arg0, arg2, arg1, this.aByte29);
	}
}
