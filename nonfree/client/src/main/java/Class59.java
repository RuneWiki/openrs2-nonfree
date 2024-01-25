import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class59 {

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!ed;")
	private Class20_Sub1 aClass20_Sub1_8;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!ed;")
	public final Class20_Sub1 aClass20_Sub1_7 = new Class20_Sub1();

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class59() {
		this.aClass20_Sub1_7.aClass20_Sub1_6 = this.aClass20_Sub1_7;
		this.aClass20_Sub1_7.aClass20_Sub1_5 = this.aClass20_Sub1_7;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Lclient!ed;")
	public Class20_Sub1 method1262() {
		@Pc(7) Class20_Sub1 local7 = this.aClass20_Sub1_7.aClass20_Sub1_5;
		if (local7 == this.aClass20_Sub1_7) {
			this.aClass20_Sub1_8 = null;
			return null;
		} else {
			this.aClass20_Sub1_8 = local7.aClass20_Sub1_5;
			return local7;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public void method1263() {
		while (true) {
			@Pc(17) Class20_Sub1 local17 = this.aClass20_Sub1_7.aClass20_Sub1_5;
			if (this.aClass20_Sub1_7 == local17) {
				this.aClass20_Sub1_8 = null;
				return;
			}
			local17.method418();
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Lclient!ed;")
	public Class20_Sub1 method1266() {
		@Pc(13) Class20_Sub1 local13 = this.aClass20_Sub1_8;
		if (this.aClass20_Sub1_7 == local13) {
			this.aClass20_Sub1_8 = null;
			return null;
		} else {
			this.aClass20_Sub1_8 = local13.aClass20_Sub1_5;
			return local13;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!ed;)V")
	public void method1268(@OriginalArg(1) Class20_Sub1 arg0) {
		if (arg0.aClass20_Sub1_6 != null) {
			arg0.method418();
		}
		arg0.aClass20_Sub1_6 = this.aClass20_Sub1_7.aClass20_Sub1_6;
		arg0.aClass20_Sub1_5 = this.aClass20_Sub1_7;
		arg0.aClass20_Sub1_6.aClass20_Sub1_5 = arg0;
		arg0.aClass20_Sub1_5.aClass20_Sub1_6 = arg0;
	}
}
