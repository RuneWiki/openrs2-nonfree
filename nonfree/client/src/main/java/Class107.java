import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class107 {

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "[Lclient!oq;")
	private Class152_Sub1[] aClass152_Sub1Array2;

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "Lclient!fb;")
	private Class3_Sub4 aClass3_Sub4_3;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!ha;")
	private final Class78 aClass78_1;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!pq;")
	private final Class163 aClass163_2;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!qn;")
	private Class3_Sub7_Sub17_Sub2 aClass3_Sub7_Sub17_Sub2_1;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!pq;Lclient!ha;)V")
	public Class107(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class78 arg1) {
		this.aClass78_1 = arg1;
		this.aClass163_2 = arg0;
		if (!this.aClass163_2.method4168()) {
			this.aClass3_Sub7_Sub17_Sub2_1 = this.aClass163_2.method4167((byte) 0, 255, true, 255);
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)Z")
	public boolean method2383() {
		if (this.aClass3_Sub4_3 != null) {
			return true;
		}
		if (this.aClass3_Sub7_Sub17_Sub2_1 == null) {
			if (this.aClass163_2.method4168()) {
				return false;
			}
			this.aClass3_Sub7_Sub17_Sub2_1 = this.aClass163_2.method4167((byte) 0, 255, true, 255);
		}
		if (this.aClass3_Sub7_Sub17_Sub2_1.aBoolean300) {
			return false;
		} else {
			this.aClass3_Sub4_3 = new Class3_Sub4(this.aClass3_Sub7_Sub17_Sub2_1.method4374());
			this.aClass152_Sub1Array2 = new Class152_Sub1[(this.aClass3_Sub4_3.aByteArray70.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public void method2384() {
		if (this.aClass152_Sub1Array2 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.aClass152_Sub1Array2.length; local19++) {
			if (this.aClass152_Sub1Array2[local19] != null) {
				this.aClass152_Sub1Array2[local19].method3968();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass152_Sub1Array2.length; local40++) {
			if (this.aClass152_Sub1Array2[local40] != null) {
				this.aClass152_Sub1Array2[local40].method3974();
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBZLclient!eg;Lclient!eg;)Lclient!oq;")
	private Class152_Sub1 method2385(@OriginalArg(0) int arg0, @OriginalArg(3) Class55 arg1, @OriginalArg(4) Class55 arg2) {
		if (this.aClass3_Sub4_3 == null) {
			throw new RuntimeException();
		}
		this.aClass3_Sub4_3.anInt4268 = arg0 * 8 + 5;
		if (this.aClass3_Sub4_3.anInt4268 >= this.aClass3_Sub4_3.aByteArray70.length) {
			throw new RuntimeException();
		} else if (this.aClass152_Sub1Array2[arg0] == null) {
			@Pc(55) int local55 = this.aClass3_Sub4_3.method3642();
			@Pc(60) int local60 = this.aClass3_Sub4_3.method3642();
			@Pc(74) Class152_Sub1 local74 = new Class152_Sub1(arg0, arg1, arg2, this.aClass163_2, this.aClass78_1, local55, local60, true);
			this.aClass152_Sub1Array2[arg0] = local74;
			return local74;
		} else {
			return this.aClass152_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLclient!eg;Lclient!eg;)Lclient!oq;")
	public Class152_Sub1 method2386(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class55 arg2) {
		return this.method2385(arg0, arg2, arg1);
	}
}
