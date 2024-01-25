import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class10_Sub7 extends Class10 {

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
	private final int anInt3148;

	@OriginalMember(owner = "client!fea", name = "k", descriptor = "Ljava/lang/String;")
	private final String aString59;

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
	private final int anInt3145;

	@OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
	private final int anInt3142;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub7(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt3148 = arg0.method5272();
		this.aString59 = arg0.method5295();
		this.anInt3145 = arg0.method5312();
		this.anInt3142 = arg0.method5272();
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static154.aClass11Array1[this.anInt3148].method295().method6608(this.aString59, this.anInt3145, 0, this.anInt3142);
	}
}
