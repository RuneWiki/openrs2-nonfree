import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class233_Sub1 extends Class233 {

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "[Lclient!rd;")
	public final Class298[] aClass298Array1;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "([Lclient!rd;)V")
	public Class233_Sub1(@OriginalArg(0) Class298[] arg0) {
		this.aClass298Array1 = arg0;
	}
}
