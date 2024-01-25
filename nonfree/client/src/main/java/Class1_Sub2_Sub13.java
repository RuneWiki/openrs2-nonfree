import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	public int anInt5423;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	public int anInt5424;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	public int anInt5426;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
	public int anInt5427;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
	public int anInt5431;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "Lclient!it;")
	public final Class122 aClass122_2;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "Lclient!e;")
	public final Class61 aClass61_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!it;Lclient!vc;)V")
	public Class1_Sub2_Sub13(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class39_Sub8 arg1) {
		this.aClass122_2 = arg0;
		this.aClass61_1 = this.aClass122_2.method2819();
		this.method4369();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public void method4369() {
		this.anInt5423 = this.aClass122_2.anInt3362;
		this.anInt5427 = this.aClass122_2.anInt3357;
		this.anInt5431 = this.aClass122_2.anInt3356;
		if (this.aClass122_2.aClass18_4 != null) {
			this.aClass122_2.aClass18_4.E(this.aClass61_1.anInt1620, this.aClass61_1.anInt1613, this.aClass61_1.anInt1626, Static340.anIntArray468);
		}
		this.anInt5424 = Static340.anIntArray468[0];
		this.anInt5426 = Static340.anIntArray468[2];
	}
}
