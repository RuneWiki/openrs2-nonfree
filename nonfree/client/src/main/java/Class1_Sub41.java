import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	public int anInt6013 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public int anInt6012 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	public int anInt6014 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public int anInt6011 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	public int anInt6016 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
	public int anInt6015 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	public int anInt6019 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	public int anInt6017 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "Lclient!fp;")
	public final Class1_Sub15 aClass1_Sub15_1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!fp;)V")
	public Class1_Sub41(@OriginalArg(0) Class1_Sub15 arg0) {
		this.aClass1_Sub15_1 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Z")
	public boolean method4844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt6013 && this.anInt6014 >= arg1 && arg0 >= this.anInt6011 && arg0 <= this.anInt6019) {
			return true;
		} else {
			return arg1 >= this.anInt6012 && this.anInt6016 >= arg1 && arg0 >= this.anInt6015 && arg0 <= this.anInt6017;
		}
	}
}
