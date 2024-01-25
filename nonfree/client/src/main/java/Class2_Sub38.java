import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
	public int anInt5871 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
	public int anInt5873 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
	public int anInt5872 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
	public int anInt5877 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	public int anInt5875 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
	public int anInt5881 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
	public int anInt5874 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
	public int anInt5880 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "Lclient!nd;")
	public final Class2_Sub31 aClass2_Sub31_1;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class2_Sub38(@OriginalArg(0) Class2_Sub31 arg0) {
		this.aClass2_Sub31_1 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
	public boolean method5162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5871 <= arg1 && arg1 <= this.anInt5880 && this.anInt5873 <= arg0 && arg0 <= this.anInt5872) {
			return true;
		} else {
			return arg1 >= this.anInt5875 && arg1 <= this.anInt5877 && arg0 >= this.anInt5874 && arg0 <= this.anInt5881;
		}
	}
}
