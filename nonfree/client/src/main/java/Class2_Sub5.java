import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!d", name = "z", descriptor = "Lclient!mb;")
	public Class62 aClass62_229;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	public Class2_Sub5() {
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!mb;)V")
	public Class2_Sub5(@OriginalArg(0) Class62 arg0) {
		this.aClass62_229 = arg0;
	}
}
