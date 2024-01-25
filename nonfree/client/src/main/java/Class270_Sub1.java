import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class270_Sub1 extends Class270 {

	@OriginalMember(owner = "client!su", name = "h", descriptor = "[Lclient!dia;")
	public final Class63[] aClass63Array1;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "([Lclient!dia;)V")
	public Class270_Sub1(@OriginalArg(0) Class63[] arg0) {
		this.aClass63Array1 = arg0;
	}
}
