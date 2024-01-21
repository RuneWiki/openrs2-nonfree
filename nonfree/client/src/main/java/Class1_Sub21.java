import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Lclient!dj;")
	public Class24 aClass24_971;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class1_Sub21() {
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!dj;)V")
	public Class1_Sub21(@OriginalArg(0) Class24 arg0) {
		this.aClass24_971 = arg0;
	}
}
