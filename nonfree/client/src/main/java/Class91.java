import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class91 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!da;")
	public Class62 aClass62_6 = null;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!oq;")
	public Class256 aClass256_4 = null;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class91(@OriginalArg(0) Class62 arg0) {
		this.aClass62_6 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!da;Lclient!oq;)V")
	public Class91(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class256 arg1) {
		this.aClass256_4 = arg1;
		this.aClass62_6 = arg0;
	}
}
