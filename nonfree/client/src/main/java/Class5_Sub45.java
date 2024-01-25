import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class5_Sub45 extends Class5 {

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
	public int anInt8796 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
	public int anInt8795 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
	public int anInt8797 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
	public int anInt8801 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
	public int anInt8799 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
	public int anInt8802 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
	public int anInt8803 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
	public int anInt8804 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sea", name = "s", descriptor = "Lclient!oga;")
	public final Class5_Sub40 aClass5_Sub40_1;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!oga;)V")
	public Class5_Sub45(@OriginalArg(0) Class5_Sub40 arg0) {
		this.aClass5_Sub40_1 = arg0;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IBI)Z")
	public boolean method7423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt8803 && this.anInt8804 >= arg0 && this.anInt8802 <= arg1 && this.anInt8796 >= arg1) {
			return true;
		} else {
			return this.anInt8801 <= arg0 && this.anInt8797 >= arg0 && this.anInt8799 <= arg1 && this.anInt8795 >= arg1;
		}
	}
}
