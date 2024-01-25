import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class81 {

	@OriginalMember(owner = "client!daa", name = "i", descriptor = "Lclient!lq;")
	public Class224 aClass224_2 = null;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "Lclient!da;")
	public Class80 aClass80_4 = null;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class81(@OriginalArg(0) Class80 arg0) {
		this.aClass80_4 = arg0;
	}

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!da;Lclient!lq;)V")
	public Class81(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class224 arg1) {
		this.aClass80_4 = arg0;
		this.aClass224_2 = arg1;
	}
}
