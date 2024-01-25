import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class14_Sub55 extends Class14 {

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
	public int anInt10867 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public int anInt10876 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	public int anInt10870 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	public int anInt10873 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	public int anInt10874 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	public int anInt10877 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public int anInt10872 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public int anInt10880 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "Lclient!qp;")
	public final Class14_Sub39 aClass14_Sub39_1;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!qp;)V")
	public Class14_Sub55(@OriginalArg(0) Class14_Sub39 arg0) {
		this.aClass14_Sub39_1 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Z")
	public boolean method9234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt10876 <= arg1 && this.anInt10874 >= arg1 && this.anInt10867 <= arg0 && arg0 <= this.anInt10870) {
			return true;
		} else {
			return this.anInt10872 <= arg1 && arg1 <= this.anInt10880 && this.anInt10877 <= arg0 && this.anInt10873 >= arg0;
		}
	}
}
