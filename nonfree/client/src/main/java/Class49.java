import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class49 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!uf;")
	private final Class326 aClass326_6 = new Class326(64);

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!ga;")
	private final Class111 aClass111_13;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_14;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ILclient!ga;Lclient!ga;)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_13 = arg2;
		this.aClass111_14 = arg1;
		if (this.aClass111_14 != null) {
			this.aClass111_14.method2442(0);
		}
		if (this.aClass111_13 != null) {
			this.aClass111_13.method2442(0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lclient!co;")
	public Class1_Sub3_Sub7 method1439(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub3_Sub7 local11 = (Class1_Sub3_Sub7) this.aClass326_6.method7238((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass111_13.method2441(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass111_14.method2441(arg0, 0);
		}
		local11 = new Class1_Sub3_Sub7();
		if (local27 != null) {
			local11.method1608(new Class1_Sub20(local27));
		}
		if (arg0 >= 32768) {
			local11.method1607();
		}
		this.aClass326_6.method7236(local11, (long) arg0);
		return local11;
	}
}
