import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public int anInt1369 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public int anInt1372 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public int anInt1370 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public int anInt1367 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	public int anInt1371 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	public int anInt1374 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	public int anInt1373 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	public int anInt1375 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "Lclient!vb;")
	public final Class2_Sub46 aClass2_Sub46_1;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!vb;)V")
	public Class2_Sub8(@OriginalArg(0) Class2_Sub46 arg0) {
		this.aClass2_Sub46_1 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)Z")
	public boolean method960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt1371 && this.anInt1370 >= arg0 && this.anInt1374 <= arg1 && arg1 <= this.anInt1372) {
			return true;
		} else {
			return this.anInt1369 <= arg0 && this.anInt1375 >= arg0 && this.anInt1367 <= arg1 && this.anInt1373 >= arg1;
		}
	}
}
