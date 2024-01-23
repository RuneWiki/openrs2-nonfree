import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	public int anInt745 = 12800;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "I")
	public int anInt742 = 0;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "I")
	public int anInt746 = 0;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
	public int anInt751 = 12800;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
	public int anInt753 = -1;

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "Lclient!sc;")
	public Class107 aClass107_252;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "Lclient!sc;")
	public Class107 aClass107_250;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!vb;")
	public Class120 aClass120_3;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!sc;Lclient!sc;IIIZ)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean69 = arg5;
		this.aClass107_252 = arg0;
		this.anInt741 = arg3;
		this.anInt756 = arg2;
		this.aClass107_250 = arg1;
		this.anInt753 = arg4;
		this.aClass120_3 = new Class120();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Z")
	public boolean method695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt751 > arg1 || this.anInt746 < arg1 || arg0 < this.anInt745 || this.anInt742 < arg0) {
			return false;
		}
		for (@Pc(45) Class1_Sub4 local45 = (Class1_Sub4) this.aClass120_3.method3564(); local45 != null; local45 = (Class1_Sub4) this.aClass120_3.method3561()) {
			if (local45.method325(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	public void method696() {
		this.anInt742 = 0;
		this.anInt751 = 12800;
		this.anInt746 = 0;
		this.anInt745 = 12800;
		for (@Pc(23) Class1_Sub4 local23 = (Class1_Sub4) this.aClass120_3.method3564(); local23 != null; local23 = (Class1_Sub4) this.aClass120_3.method3561()) {
			if (local23.anInt313 < this.anInt745) {
				this.anInt745 = local23.anInt313;
			}
			if (this.anInt751 > local23.anInt310) {
				this.anInt751 = local23.anInt310;
			}
			if (local23.anInt312 > this.anInt746) {
				this.anInt746 = local23.anInt312;
			}
			if (this.anInt742 < local23.anInt311) {
				this.anInt742 = local23.anInt311;
			}
		}
	}
}
