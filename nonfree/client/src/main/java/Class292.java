import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pka")
public final class Class292 {

	@OriginalMember(owner = "client!pka", name = "C", descriptor = "Lclient!sfa;")
	public Class338 aClass338_6;

	@OriginalMember(owner = "client!pka", name = "v", descriptor = "Lclient!fja;")
	public Class118 aClass118_2;

	@OriginalMember(owner = "client!pka", name = "o", descriptor = "Lclient!eca;")
	public Class88 aClass88_2;

	@OriginalMember(owner = "client!pka", name = "F", descriptor = "I")
	private int anInt8013;

	@OriginalMember(owner = "client!pka", name = "m", descriptor = "Lclient!wc;")
	public Class397 aClass397_130;

	@OriginalMember(owner = "client!pka", name = "b", descriptor = "Lclient!wc;")
	public Class397 aClass397_132;

	@OriginalMember(owner = "client!pka", name = "t", descriptor = "I")
	public int anInt8014;

	@OriginalMember(owner = "client!pka", name = "g", descriptor = "Lclient!wc;")
	public Class397 aClass397_133;

	@OriginalMember(owner = "client!pka", name = "n", descriptor = "I")
	public int anInt8016;

	@OriginalMember(owner = "client!pka", name = "z", descriptor = "I")
	public int anInt8017;

	@OriginalMember(owner = "client!pka", name = "c", descriptor = "Lclient!sja;")
	private final Class342 aClass342_62 = new Class342();

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "I")
	private int anInt8010 = 0;

	@OriginalMember(owner = "client!pka", name = "x", descriptor = "Lclient!ika;")
	private final Class3_Sub2 aClass3_Sub2_5 = new Class3_Sub2(1350);

	@OriginalMember(owner = "client!pka", name = "E", descriptor = "Lclient!aba;")
	public final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_2 = new Class3_Sub2_Sub1(15000);

	@OriginalMember(owner = "client!pka", name = "D", descriptor = "I")
	public int anInt8011 = 0;

	@OriginalMember(owner = "client!pka", name = "d", descriptor = "I")
	public int anInt8012 = 0;

	@OriginalMember(owner = "client!pka", name = "u", descriptor = "Lclient!wc;")
	public Class397 aClass397_131 = null;

	@OriginalMember(owner = "client!pka", name = "s", descriptor = "I")
	public int anInt8015 = 0;

	@OriginalMember(owner = "client!pka", name = "q", descriptor = "Z")
	public boolean aBoolean535 = false;

	@OriginalMember(owner = "client!pka", name = "w", descriptor = "Z")
	public boolean aBoolean536 = true;

	@OriginalMember(owner = "client!pka", name = "b", descriptor = "(B)V")
	public void method6851() throws IOException {
		if (this.aClass118_2 == null || this.anInt8010 <= 0) {
			return;
		}
		this.aClass3_Sub2_5.anInt2178 = 0;
		while (true) {
			@Pc(35) Class3_Sub29 local35 = (Class3_Sub29) this.aClass342_62.method7644();
			if (local35 == null || this.aClass3_Sub2_5.aByteArray20.length - this.aClass3_Sub2_5.anInt2178 < local35.anInt4151) {
				this.aClass118_2.method7798(this.aClass3_Sub2_5.aByteArray20, this.aClass3_Sub2_5.anInt2178);
				this.anInt8013 += this.aClass3_Sub2_5.anInt2178;
				this.anInt8015 = 0;
				return;
			}
			this.aClass3_Sub2_5.method2068(0, local35.anInt4151, local35.aClass3_Sub2_Sub1_1.aByteArray20);
			this.anInt8010 -= local35.anInt4151;
			local35.method9596();
			local35.aClass3_Sub2_Sub1_1.method2046();
			local35.method3815();
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(I)V")
	public void method6852() {
		if (this.aClass118_2 != null) {
			this.aClass118_2.method7800();
			this.aClass118_2 = null;
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(Lclient!id;I)V")
	public void method6855(@OriginalArg(0) Class3_Sub29 arg0) {
		this.aClass342_62.method7654(arg0);
		arg0.anInt4151 = arg0.aClass3_Sub2_Sub1_1.anInt2178;
		arg0.aClass3_Sub2_Sub1_1.anInt2178 = 0;
		this.anInt8010 += arg0.anInt4151;
	}

	@OriginalMember(owner = "client!pka", name = "c", descriptor = "(B)V")
	public void method6856() {
		this.aClass342_62.method7655();
		this.anInt8010 = 0;
	}

	@OriginalMember(owner = "client!pka", name = "d", descriptor = "(B)V")
	public void method6859() {
		if (Static716.anInt11157 % 50 == 0) {
			this.anInt8014 = this.anInt8013;
			this.anInt8013 = 0;
			this.anInt8016 = this.anInt8017;
			this.anInt8017 = 0;
		}
	}
}
