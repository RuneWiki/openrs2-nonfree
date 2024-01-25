import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public int anInt5134 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
	public int anInt5138 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
	public int anInt5139 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public int anInt5135 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	public int anInt5140 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	public int anInt5137 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
	public int anInt5143 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public int anInt5141 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!uea;")
	public final Class3_Sub49 aClass3_Sub49_1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!uea;)V")
	public Class3_Sub33(@OriginalArg(0) Class3_Sub49 arg0) {
		this.aClass3_Sub49_1 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)Z")
	public boolean method4612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5139 <= arg0 && this.anInt5134 >= arg0 && this.anInt5140 <= arg1 && arg1 <= this.anInt5138) {
			return true;
		} else {
			return arg0 >= this.anInt5141 && this.anInt5137 >= arg0 && arg1 >= this.anInt5135 && this.anInt5143 >= arg1;
		}
	}
}
