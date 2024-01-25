import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	public int anInt8321 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
	public int anInt8320 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
	public int anInt8322 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	public int anInt8323 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
	public int anInt8327 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	public int anInt8326 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public int anInt8325 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	public int anInt8324 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Lclient!bi;")
	public final Class3_Sub8 aClass3_Sub8_1;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class3_Sub45(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aClass3_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IBI)Z")
	public boolean method7038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt8320 && arg1 <= this.anInt8326 && arg0 >= this.anInt8325 && arg0 <= this.anInt8321) {
			return true;
		} else {
			return arg1 >= this.anInt8323 && this.anInt8324 >= arg1 && this.anInt8327 <= arg0 && this.anInt8322 >= arg0;
		}
	}
}
