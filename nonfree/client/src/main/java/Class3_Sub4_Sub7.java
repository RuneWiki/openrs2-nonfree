import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public abstract class Class3_Sub4_Sub7 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fha", name = "x", descriptor = "I")
	public final int anInt6457;

	@OriginalMember(owner = "client!fha", name = "B", descriptor = "Lclient!jh;")
	public final Interface13 anInterface13_3;

	@OriginalMember(owner = "client!fha", name = "<init>", descriptor = "(Lclient!jh;I)V")
	protected Class3_Sub4_Sub7(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) int arg1) {
		this.anInt6457 = arg1;
		this.anInterface13_3 = arg0;
	}

	@OriginalMember(owner = "client!fha", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5467();

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5468();
}
