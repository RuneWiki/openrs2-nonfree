import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public int anInt3450 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	public int anInt3446 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public int anInt3447 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
	public int anInt3445 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
	public int anInt3455 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public int anInt3451 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
	public int anInt3453 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	public int anInt3458 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!ir;")
	public final Class4_Sub20 aClass4_Sub20_1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!ir;)V")
	public Class4_Sub25(@OriginalArg(0) Class4_Sub20 arg0) {
		this.aClass4_Sub20_1 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
	public boolean method2987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt3450 && arg1 <= this.anInt3455 && this.anInt3458 <= arg0 && this.anInt3453 >= arg0) {
			return true;
		} else {
			return arg1 >= this.anInt3451 && arg1 <= this.anInt3445 && this.anInt3446 <= arg0 && this.anInt3447 >= arg0;
		}
	}
}
