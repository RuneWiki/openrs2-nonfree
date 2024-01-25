import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class3_Sub12_Sub7 extends Class3_Sub12 {

	@OriginalMember(owner = "client!nr", name = "B", descriptor = "Ljava/lang/String;")
	private String aString62;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.aString48 = this.aString62;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.aString62 = arg0.method8613();
		arg0.method8618();
	}
}
