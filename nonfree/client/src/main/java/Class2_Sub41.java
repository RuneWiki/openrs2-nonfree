import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mla")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!mla", name = "y", descriptor = "I")
	public int anInt6584 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mla", name = "r", descriptor = "I")
	public int anInt6581 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mla", name = "u", descriptor = "I")
	public int anInt6586 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mla", name = "t", descriptor = "I")
	public int anInt6585 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mla", name = "x", descriptor = "I")
	public int anInt6589 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mla", name = "w", descriptor = "I")
	public int anInt6588 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mla", name = "n", descriptor = "I")
	public int anInt6587 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mla", name = "o", descriptor = "I")
	public int anInt6591 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mla", name = "q", descriptor = "Lclient!sh;")
	public final Class2_Sub51 aClass2_Sub51_1;

	@OriginalMember(owner = "client!mla", name = "<init>", descriptor = "(Lclient!sh;)V")
	public Class2_Sub41(@OriginalArg(0) Class2_Sub51 arg0) {
		this.aClass2_Sub51_1 = arg0;
	}

	@OriginalMember(owner = "client!mla", name = "a", descriptor = "(ZII)Z")
	public boolean method5913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6591 <= arg1 && arg1 <= this.anInt6589 && this.anInt6586 <= arg0 && this.anInt6587 >= arg0) {
			return true;
		} else {
			return this.anInt6584 <= arg1 && arg1 <= this.anInt6581 && this.anInt6588 <= arg0 && arg0 <= this.anInt6585;
		}
	}
}
