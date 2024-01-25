import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class115 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public int anInt3440;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public int anInt3441;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public int anInt3443;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	public int anInt3444;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public int anInt3445;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public int anInt3446;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
	public int anInt3448;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	public int anInt3454;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "Lclient!kh;")
	public Class115 aClass115_2;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
	public int anInt3459;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	public final int anInt3449;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "B")
	public final byte aByte28;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
	public final int anInt3461;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public final int anInt3439;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
	public final int anInt3462;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIB)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt3449 = arg3;
		this.aByte28 = arg4;
		this.anInt3461 = arg0;
		this.anInt3439 = arg2;
		this.anInt3462 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!kh;I)V")
	public Class115(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1) {
		this.aClass115_2 = arg0;
		this.anInt3449 = this.aClass115_2.anInt3449 + arg1;
		this.anInt3461 = this.aClass115_2.anInt3461;
		this.anInt3439 = this.aClass115_2.anInt3439 + arg1;
		this.anInt3462 = arg1 + this.aClass115_2.anInt3462;
		this.aByte28 = this.aClass115_2.aByte28;
	}
}
