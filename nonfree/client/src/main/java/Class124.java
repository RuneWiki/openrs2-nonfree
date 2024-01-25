import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class124 implements Interface24 {

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
	public final int anInt4041;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
	public Class124(@OriginalArg(0) int arg0) {
		this.anInt4041 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static614.aClass152_12;
	}
}
