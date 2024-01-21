import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class25 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "B")
	private byte aByte25 = 69;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	private int anInt484 = 845;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!cb;")
	private Class1_Sub3 aClass1_Sub3_17 = new Class1_Sub3();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(B)V")
	public Class25(@OriginalArg(0) byte arg0) {
		this.aClass1_Sub3_17.aClass1_Sub3_15 = this.aClass1_Sub3_17;
		this.aClass1_Sub3_17.aClass1_Sub3_16 = this.aClass1_Sub3_17;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!cb;)V")
	public void method357(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_16 != null) {
			arg0.method321();
		}
		arg0.aClass1_Sub3_16 = this.aClass1_Sub3_17.aClass1_Sub3_16;
		arg0.aClass1_Sub3_15 = this.aClass1_Sub3_17;
		arg0.aClass1_Sub3_16.aClass1_Sub3_15 = arg0;
		arg0.aClass1_Sub3_15.aClass1_Sub3_16 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!cb;")
	public Class1_Sub3 method358() {
		@Pc(3) Class1_Sub3 local3 = this.aClass1_Sub3_17.aClass1_Sub3_15;
		if (local3 == this.aClass1_Sub3_17) {
			return null;
		} else {
			local3.method321();
			return local3;
		}
	}
}
