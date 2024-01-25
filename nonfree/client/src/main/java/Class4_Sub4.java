import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
	public int anInt1190 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public int anInt1194 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
	public int anInt1192 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public int anInt1195 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public int anInt1196 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public int anInt1193 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
	public int anInt1191 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	public int anInt1200 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "Lclient!fu;")
	public final Class4_Sub20 aClass4_Sub20_1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class4_Sub4(@OriginalArg(0) Class4_Sub20 arg0) {
		this.aClass4_Sub20_1 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
	public boolean method1010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1193 <= arg1 && arg1 <= this.anInt1190 && arg0 >= this.anInt1200 && arg0 <= this.anInt1194) {
			return true;
		} else {
			return arg1 >= this.anInt1191 && this.anInt1195 >= arg1 && this.anInt1196 <= arg0 && arg0 <= this.anInt1192;
		}
	}
}
