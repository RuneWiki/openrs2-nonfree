import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wla")
public final class Class407 {

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "I")
	public int anInt11160;

	@OriginalMember(owner = "client!wla", name = "d", descriptor = "I")
	public int anInt11161;

	@OriginalMember(owner = "client!wla", name = "i", descriptor = "I")
	public int anInt11163;

	@OriginalMember(owner = "client!wla", name = "e", descriptor = "I")
	public int anInt11162 = -1;

	@OriginalMember(owner = "client!wla", name = "f", descriptor = "Lclient!rf;")
	public final Class45 aClass45_11;

	@OriginalMember(owner = "client!wla", name = "<init>", descriptor = "(Lclient!kt;)V")
	public Class407(@OriginalArg(0) Class9_Sub1_Sub1_Sub2 arg0) {
		this.aClass45_11 = new Class45_Sub2(arg0, false);
	}
}
