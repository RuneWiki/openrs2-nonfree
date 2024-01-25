import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class185_Sub1 extends Class185 {

	@OriginalMember(owner = "client!kda", name = "i", descriptor = "[Lclient!th;")
	public final Class318[] aClass318Array1;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "([Lclient!th;)V")
	public Class185_Sub1(@OriginalArg(0) Class318[] arg0) {
		this.aClass318Array1 = arg0;
	}
}
