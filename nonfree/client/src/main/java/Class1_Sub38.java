import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
	public int anInt6238 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	public int anInt6244 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
	public int anInt6243 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
	public int anInt6239 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
	public int anInt6242 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
	public int anInt6241 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	public int anInt6245 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	public int anInt6237 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "Lclient!ql;")
	public final Class1_Sub36 aClass1_Sub36_1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class1_Sub38(@OriginalArg(0) Class1_Sub36 arg0) {
		this.aClass1_Sub36_1 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZI)Z")
	public boolean method4916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt6239 && this.anInt6245 >= arg0 && this.anInt6241 <= arg1 && arg1 <= this.anInt6242) {
			return true;
		} else {
			return arg0 >= this.anInt6237 && this.anInt6243 >= arg0 && this.anInt6244 <= arg1 && arg1 <= this.anInt6238;
		}
	}
}
