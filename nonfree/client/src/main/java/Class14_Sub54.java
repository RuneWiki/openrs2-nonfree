import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class14_Sub54 extends Class14 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public int anInt10880 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public int anInt10882 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public int anInt10881 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public int anInt10887 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	public int anInt10888 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	public int anInt10891 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt10889 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	public int anInt10892 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!qe;")
	public final Class14_Sub46 aClass14_Sub46_1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class14_Sub54(@OriginalArg(0) Class14_Sub46 arg0) {
		this.aClass14_Sub46_1 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIB)Z")
	public boolean method9069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= this.anInt10892 && this.anInt10882 >= arg1 && this.anInt10889 <= arg0 && arg0 <= this.anInt10881) {
			return true;
		} else {
			return arg1 >= this.anInt10888 && arg1 <= this.anInt10880 && arg0 >= this.anInt10891 && this.anInt10887 >= arg0;
		}
	}
}
