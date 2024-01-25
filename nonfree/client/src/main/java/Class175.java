import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class175 implements Interface24 {

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public final int anInt5786;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
	public Class175(@OriginalArg(0) int arg0) {
		this.anInt5786 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static552.aClass152_11;
	}
}
