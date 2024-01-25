import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public int anInt1437 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	public int anInt1438 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public int anInt1434 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	public int anInt1440 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	public int anInt1445 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
	public int anInt1448 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public int anInt1443 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	public int anInt1446 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!bd;")
	public final Class3_Sub5 aClass3_Sub5_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class3_Sub14(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aClass3_Sub5_1 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public boolean method1132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt1438 && this.anInt1446 >= arg1 && this.anInt1440 <= arg0 && arg0 <= this.anInt1443) {
			return true;
		} else {
			return this.anInt1434 <= arg1 && this.anInt1448 >= arg1 && arg0 >= this.anInt1437 && arg0 <= this.anInt1445;
		}
	}
}
