import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!cha", name = "p", descriptor = "I")
	private final int anInt1422;

	@OriginalMember(owner = "client!cha", name = "j", descriptor = "Ljava/lang/String;")
	private final String aString8;

	@OriginalMember(owner = "client!cha", name = "q", descriptor = "I")
	private final int anInt1421;

	@OriginalMember(owner = "client!cha", name = "m", descriptor = "I")
	private final int anInt1424;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub2(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt1422 = arg0.method8575();
		this.aString8 = arg0.method8553();
		this.anInt1421 = arg0.method8555(-9372);
		this.anInt1424 = arg0.method8575();
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static199.aClass61Array1[this.anInt1422].method1238().method2055(this.anInt1424, this.anInt1421, 0, this.aString8);
	}
}
