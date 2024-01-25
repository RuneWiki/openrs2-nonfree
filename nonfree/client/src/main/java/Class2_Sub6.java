import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
	public int anInt581 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
	public int anInt577 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
	public int anInt578 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
	public int anInt589 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
	public int anInt579 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
	public int anInt587 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
	public int anInt586 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
	public int anInt585 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "Lclient!fg;")
	public final Class2_Sub10 aClass2_Sub10_1;

	static {
		new Class62("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!fg;)V")
	public Class2_Sub6(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aClass2_Sub10_1 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
	public boolean method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt578 && this.anInt579 >= arg1 && arg0 >= this.anInt589 && arg0 <= this.anInt581) {
			return true;
		} else {
			return arg1 >= this.anInt587 && arg1 <= this.anInt586 && this.anInt577 <= arg0 && arg0 <= this.anInt585;
		}
	}
}
