import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bma")
public final class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!bma", name = "n", descriptor = "I")
	private int anInt905;

	@OriginalMember(owner = "client!bma", name = "p", descriptor = "I")
	private int anInt910;

	@OriginalMember(owner = "client!bma", name = "o", descriptor = "I")
	private int anInt911;

	@OriginalMember(owner = "client!bma", name = "q", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(Lclient!rba;I)V")
	@Override
	public void method8782(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt910 = arg0.method5312();
		this.anInt911 = arg0.method5312();
		this.anInt905 = arg0.method5322(-39);
		this.anInt912 = arg0.method5322(-112);
	}

	@OriginalMember(owner = "client!bma", name = "a", descriptor = "(Lclient!mea;B)V")
	@Override
	public void method8783(@OriginalArg(0) Class237 arg0) {
		arg0.method5839(this.anInt905, this.anInt911, this.anInt912, this.anInt910);
	}
}
