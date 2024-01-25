import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	public int anInt4932;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
	public int anInt4933;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
	public int anInt4934;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
	public int anInt4935;

	@OriginalMember(owner = "client!pn", name = "K", descriptor = "Lclient!ta;")
	public final Class218 aClass218_1;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Lclient!bp;")
	public final Class24 aClass24_1;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!ta;Lclient!m;)V")
	public Class2_Sub1_Sub13(@OriginalArg(0) Class218 arg0, @OriginalArg(1) Class22_Sub6 arg1) {
		this.aClass218_1 = arg0;
		this.aClass24_1 = Static165.method2707(arg0.anInt5832);
		this.method4310();
	}

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)V")
	public void method4310() {
		this.anInt4934 = this.aClass218_1.anInt5827;
		this.anInt4932 = this.aClass218_1.anInt5826;
		this.anInt4933 = this.aClass218_1.anInt5831;
		if (this.aClass218_1.aClass54_4 != null) {
			this.aClass218_1.aClass54_4.method4787(this.aClass24_1.anInt578, this.aClass24_1.anInt571, this.aClass24_1.anInt579, Static150.anIntArray312);
		}
		this.anInt4935 = Static150.anIntArray312[2];
		this.anInt4931 = Static150.anIntArray312[0];
	}
}
