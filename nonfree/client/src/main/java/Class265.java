import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class265 {

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!gca;")
	private Class111 aClass111_43;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "Lclient!rp;")
	private Class1 aClass1_192;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	public Class265() {
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!gca;)V")
	public Class265(@OriginalArg(0) Class111 arg0) {
		this.aClass111_43 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!gca;Z)V")
	public void method5634(@OriginalArg(0) Class111 arg0) {
		this.aClass111_43 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Lclient!rp;")
	public Class1 method5636() {
		@Pc(13) Class1 local13 = this.aClass1_192;
		if (local13 == this.aClass111_43.aClass1_94) {
			this.aClass1_192 = null;
			return null;
		} else {
			this.aClass1_192 = local13.aClass1_286;
			return local13;
		}
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Lclient!rp;")
	public Class1 method5637() {
		@Pc(15) Class1 local15 = this.aClass111_43.aClass1_94.aClass1_286;
		if (local15 == this.aClass111_43.aClass1_94) {
			this.aClass1_192 = null;
			return null;
		} else {
			this.aClass1_192 = local15.aClass1_286;
			return local15;
		}
	}
}
