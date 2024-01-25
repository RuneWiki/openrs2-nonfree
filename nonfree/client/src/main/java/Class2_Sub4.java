import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
	public int anInt411 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	public int anInt409 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
	public int anInt416 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
	public int anInt413 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
	public int anInt414 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
	public int anInt410 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	public int anInt415 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
	public int anInt417 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ar", name = "F", descriptor = "Lclient!lga;")
	public final Class2_Sub32 aClass2_Sub32_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!lga;)V")
	public Class2_Sub4(@OriginalArg(0) Class2_Sub32 arg0) {
		this.aClass2_Sub32_1 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)Z")
	public boolean method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt415 <= arg1 && this.anInt416 >= arg1 && arg0 >= this.anInt414 && this.anInt409 >= arg0) {
			return true;
		} else {
			return this.anInt413 <= arg1 && this.anInt410 >= arg1 && this.anInt417 <= arg0 && this.anInt411 >= arg0;
		}
	}
}
