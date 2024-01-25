import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public class Class241 implements Interface9 {

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Lclient!f;")
	protected Class88 aClass88_20;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Lclient!a;")
	protected final Class1 aClass1_2;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Lclient!vo;")
	private final Class348 aClass348_79;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!vo;Lclient!a;)V")
	public Class241(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class1 arg1) {
		this.aClass1_2 = arg1;
		this.aClass348_79 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8147() {
		@Pc(16) int local16 = this.aClass1_2.aClass347_6.method7949(Static370.anInt7124, this.aClass88_20.A()) + this.aClass1_2.anInt5016;
		@Pc(31) int local31 = this.aClass1_2.aClass214_8.method5005(Static324.anInt6378, this.aClass88_20.ca()) + this.aClass1_2.anInt5010;
		this.aClass88_20.method8051(local16, local31);
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method8149() {
		return this.aClass348_79.method7960(this.aClass1_2.anInt5012);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	@Override
	public final void method8148() {
		this.aClass88_20 = Static402.method6120(this.aClass1_2.anInt5012, this.aClass348_79);
	}
}
