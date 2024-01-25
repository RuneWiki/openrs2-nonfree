import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class3_Sub12_Sub10 extends Class3_Sub12 {

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
	private int anInt7976;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method8885(@OriginalArg(0) Class185 arg0) {
		arg0.method4642(this.aString89, this.anInt7976);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!jp;)V")
	@Override
	public void method8886(@OriginalArg(1) Class3_Sub25 arg0) {
		this.anInt7976 = arg0.method8618();
		this.aString89 = arg0.method8613();
	}
}
