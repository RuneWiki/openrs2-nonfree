import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
	public int anInt3224 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	public int anInt3220 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
	public int anInt3225 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public int anInt3219 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
	public int anInt3229 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	public int anInt3227 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	public int anInt3218 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
	public int anInt3228 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Lclient!jj;")
	public final Class1_Sub25 aClass1_Sub25_1;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class1_Sub18(@OriginalArg(0) Class1_Sub25 arg0) {
		this.aClass1_Sub25_1 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z")
	public boolean method2920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= this.anInt3229 && arg0 <= this.anInt3225 && this.anInt3218 <= arg1 && arg1 <= this.anInt3224) {
			return true;
		} else {
			return this.anInt3228 <= arg0 && this.anInt3220 >= arg0 && arg1 >= this.anInt3227 && this.anInt3219 >= arg1;
		}
	}
}
