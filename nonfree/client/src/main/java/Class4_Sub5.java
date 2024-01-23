import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public int anInt304;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "[Lclient!ae;")
	public Class5[] aClass5Array1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I[Lclient!ae;)V")
	public Class4_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class5[] arg1) {
		this.anInt304 = arg0;
		this.aClass5Array1 = arg1;
	}
}
