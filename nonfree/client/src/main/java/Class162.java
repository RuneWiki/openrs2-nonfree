import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class162 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!cf;")
	private Class1 aClass1_153;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Lclient!oe;")
	private Class181 aClass181_44;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class162() {
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class162(@OriginalArg(0) Class181 arg0) {
		this.aClass181_44 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lclient!cf;")
	public Class1 method3754() {
		@Pc(8) Class1 local8 = this.aClass181_44.aClass1_179.aClass1_261;
		if (this.aClass181_44.aClass1_179 == local8) {
			this.aClass1_153 = null;
			return null;
		} else {
			this.aClass1_153 = local8.aClass1_261;
			return local8;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLclient!oe;)V")
	public void method3756(@OriginalArg(1) Class181 arg0) {
		this.aClass181_44 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lclient!cf;")
	public Class1 method3757() {
		@Pc(11) Class1 local11 = this.aClass1_153;
		if (this.aClass181_44.aClass1_179 == local11) {
			this.aClass1_153 = null;
			return null;
		} else {
			this.aClass1_153 = local11.aClass1_261;
			return local11;
		}
	}
}
