import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public int anInt3372 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public int anInt3373 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	public int anInt3377 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public int anInt3370 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public int anInt3380 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public int anInt3379 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public int anInt3378 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "I")
	public int anInt3381 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!ni;")
	public final Class1_Sub29 aClass1_Sub29_1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!ni;)V")
	public Class1_Sub22(@OriginalArg(0) Class1_Sub29 arg0) {
		this.aClass1_Sub29_1 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)Z")
	public boolean method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3372 <= arg1 && this.anInt3373 >= arg1 && arg0 >= this.anInt3370 && this.anInt3377 >= arg0) {
			return true;
		} else {
			return this.anInt3381 <= arg1 && this.anInt3379 >= arg1 && arg0 >= this.anInt3380 && this.anInt3378 >= arg0;
		}
	}
}
