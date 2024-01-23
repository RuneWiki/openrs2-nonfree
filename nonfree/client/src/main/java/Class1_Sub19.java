import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Lclient!hh;")
	public Class50 aClass50_951;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!hh;I)V")
	public Class1_Sub19(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		this.aClass50_951 = arg0;
	}
}
