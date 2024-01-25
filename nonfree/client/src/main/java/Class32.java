import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class32 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!gda;")
	public Class114 aClass114_1 = null;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!la;")
	public Class58 aClass58_2 = null;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class32(@OriginalArg(0) Class58 arg0) {
		this.aClass58_2 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!la;Lclient!gda;)V")
	public Class32(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class114 arg1) {
		this.aClass58_2 = arg0;
		this.aClass114_1 = arg1;
	}
}
