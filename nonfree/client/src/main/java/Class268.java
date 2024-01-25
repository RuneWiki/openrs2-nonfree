import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class268 {

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "Lclient!ro;")
	private Class306 aClass306_41;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Lclient!pb;")
	private Class5 aClass5_202;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	public Class268() {
	}

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!ro;)V")
	public Class268(@OriginalArg(0) Class306 arg0) {
		this.aClass306_41 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!ro;)V")
	public void method6391(@OriginalArg(1) Class306 arg0) {
		this.aClass306_41 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)Lclient!pb;")
	public Class5 method6394() {
		@Pc(14) Class5 local14 = this.aClass306_41.aClass5_235.aClass5_299;
		if (this.aClass306_41.aClass5_235 == local14) {
			this.aClass5_202 = null;
			return null;
		} else {
			this.aClass5_202 = local14.aClass5_299;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)Lclient!pb;")
	public Class5 method6395() {
		@Pc(13) Class5 local13 = this.aClass5_202;
		if (local13 == this.aClass306_41.aClass5_235) {
			this.aClass5_202 = null;
			return null;
		} else {
			this.aClass5_202 = local13.aClass5_299;
			return local13;
		}
	}
}
