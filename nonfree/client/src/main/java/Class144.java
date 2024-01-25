import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class144 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!vn;")
	public Class352 aClass352_14 = null;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Lclient!la;")
	public Class96 aClass96_8 = null;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class144(@OriginalArg(0) Class96 arg0) {
		this.aClass96_8 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!la;Lclient!vn;)V")
	public Class144(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class352 arg1) {
		this.aClass352_14 = arg1;
		this.aClass96_8 = arg0;
	}
}
