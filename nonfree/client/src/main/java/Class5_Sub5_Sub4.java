import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public final class Class5_Sub5_Sub4 extends Class5_Sub5 {

	@OriginalMember(owner = "client!gfa", name = "p", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!mia;)V")
	@Override
	public void method8345(@OriginalArg(1) Class233 arg0) {
		arg0.aString64 = this.aString29;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lclient!rv;I)V")
	@Override
	public void method8349(@OriginalArg(0) Class5_Sub15 arg0) {
		this.aString29 = arg0.method3661();
	}
}
