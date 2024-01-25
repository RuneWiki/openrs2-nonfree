import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class2_Sub52 extends Class2 {

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
	public int anInt10257 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
	public int anInt10262 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
	public int anInt10264 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
	public int anInt10256 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
	public int anInt10255 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
	public int anInt10260 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
	public int anInt10258 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public int anInt10259 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "Lclient!nd;")
	public final Class2_Sub36 aClass2_Sub36_1;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class2_Sub52(@OriginalArg(0) Class2_Sub36 arg0) {
		this.aClass2_Sub36_1 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Z")
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10258 <= arg1 && arg1 <= this.anInt10259 && arg0 >= this.anInt10262 && this.anInt10257 >= arg0) {
			return true;
		} else {
			return this.anInt10260 <= arg1 && arg1 <= this.anInt10264 && arg0 >= this.anInt10256 && this.anInt10255 >= arg0;
		}
	}
}
