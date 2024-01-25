import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class187 {

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "Lclient!wo;")
	private Class361 aClass361_54;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "Lclient!jca;")
	private Class1 aClass1_133;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V")
	public Class187() {
	}

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class187(@OriginalArg(0) Class361 arg0) {
		this.aClass361_54 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Lclient!jca;")
	public Class1 method4201() {
		@Pc(8) Class1 local8 = this.aClass361_54.aClass1_281.aClass1_286;
		if (this.aClass361_54.aClass1_281 == local8) {
			this.aClass1_133 = null;
			return null;
		} else {
			this.aClass1_133 = local8.aClass1_286;
			return local8;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!wo;I)V")
	public void method4202(@OriginalArg(0) Class361 arg0) {
		this.aClass361_54 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)Lclient!jca;")
	public Class1 method4204() {
		@Pc(11) Class1 local11 = this.aClass1_133;
		if (this.aClass361_54.aClass1_281 == local11) {
			this.aClass1_133 = null;
			return null;
		} else {
			this.aClass1_133 = local11.aClass1_286;
			return local11;
		}
	}
}
