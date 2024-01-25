import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class157 {

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!uq;")
	private Class1_Sub3 aClass1_Sub3_34 = new Class1_Sub3();

	@OriginalMember(owner = "client!in", name = "g", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_7 = new Class117();

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	private final int anInt4290;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	private int anInt4289;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "Lclient!wh;")
	private final Class356 aClass356_19;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I)V")
	public Class157(@OriginalArg(0) int arg0) {
		this.anInt4290 = arg0;
		this.anInt4289 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass356_19 = new Class356(local19);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JB)Lclient!uq;")
	public Class1_Sub3 method3684(@OriginalArg(0) long arg0) {
		@Pc(17) Class1_Sub3 local17 = (Class1_Sub3) this.aClass356_19.method7796(arg0);
		if (local17 != null) {
			this.aClass117_7.method2550(local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public void method3685() {
		this.aClass117_7.method2555();
		this.aClass356_19.method7802();
		this.aClass1_Sub3_34 = new Class1_Sub3();
		this.anInt4289 = this.anInt4290;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(JILclient!uq;)V")
	public void method3687(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (this.anInt4289 == 0) {
			@Pc(27) Class1_Sub3 local27 = this.aClass117_7.method2556();
			local27.method7878();
			local27.method7811();
			if (local27 == this.aClass1_Sub3_34) {
				local27 = this.aClass117_7.method2556();
				local27.method7878();
				local27.method7811();
			}
		} else {
			this.anInt4289--;
		}
		this.aClass356_19.method7800(arg0, arg1);
		this.aClass117_7.method2550(arg1);
	}
}
