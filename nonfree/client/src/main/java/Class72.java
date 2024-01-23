import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class72 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "Lclient!kh;")
	private Class1_Sub3 aClass1_Sub3_17;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "Lclient!mg;")
	private Class108 aClass108_8;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!mg;B)V")
	public void method1776(@OriginalArg(0) Class108 arg0) {
		this.aClass108_8 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Lclient!kh;")
	public Class1_Sub3 method1777() {
		@Pc(8) Class1_Sub3 local8 = this.aClass108_8.aClass1_Sub3_38.aClass1_Sub3_74;
		if (this.aClass108_8.aClass1_Sub3_38 == local8) {
			this.aClass1_Sub3_17 = null;
			return null;
		} else {
			this.aClass1_Sub3_17 = local8.aClass1_Sub3_74;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lclient!kh;")
	public Class1_Sub3 method1778() {
		@Pc(11) Class1_Sub3 local11 = this.aClass1_Sub3_17;
		if (local11 == this.aClass108_8.aClass1_Sub3_38) {
			this.aClass1_Sub3_17 = null;
			return null;
		} else {
			this.aClass1_Sub3_17 = local11.aClass1_Sub3_74;
			return local11;
		}
	}
}
