import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class15_Sub17 extends Class15 {

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	private final int anInt7936;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub17(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt7936 = arg0.method8575();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static486.aClass398Array1[this.anInt7936].method9454();
	}
}
