import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
	public int anInt7787 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
	public int anInt7786 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	public int anInt7788 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
	public int anInt7783 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
	public int anInt7784 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
	public int anInt7789 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
	public int anInt7790 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qw", name = "w", descriptor = "I")
	public int anInt7791 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qw", name = "t", descriptor = "Lclient!wp;")
	public final Class1_Sub51 aClass1_Sub51_1;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!wp;)V")
	public Class1_Sub39(@OriginalArg(0) Class1_Sub51 arg0) {
		this.aClass1_Sub51_1 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)Z")
	public boolean method6213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt7788 && arg0 <= this.anInt7786 && this.anInt7784 <= arg1 && this.anInt7790 >= arg1) {
			return true;
		} else {
			return this.anInt7783 <= arg0 && arg0 <= this.anInt7791 && arg1 >= this.anInt7789 && this.anInt7787 >= arg1;
		}
	}
}
