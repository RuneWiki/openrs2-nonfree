import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pka")
public final class Class15_Sub16 extends Class15 {

	@OriginalMember(owner = "client!pka", name = "m", descriptor = "I")
	private final int anInt7897;

	@OriginalMember(owner = "client!pka", name = "k", descriptor = "I")
	private final int anInt7899;

	@OriginalMember(owner = "client!pka", name = "j", descriptor = "I")
	private final int anInt7900;

	@OriginalMember(owner = "client!pka", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub16(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt7897 = arg0.method8575();
		this.anInt7899 = arg0.method8575();
		this.anInt7900 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		@Pc(13) Class61 local13 = Static199.aClass61Array1[this.anInt7897];
		@Pc(18) Class42 local18 = Static566.aClass42Array1[this.anInt7899];
		local18.method755(local13, this.anInt7900);
	}
}
