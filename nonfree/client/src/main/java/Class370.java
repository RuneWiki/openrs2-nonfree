import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class370 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "Lclient!fh;")
	private Class114 aClass114_62;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "Lclient!dfa;")
	private Class2 aClass2_282;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class370() {
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!fh;)V")
	public Class370(@OriginalArg(0) Class114 arg0) {
		this.aClass114_62 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)Lclient!dfa;")
	public Class2 method8625() {
		@Pc(11) Class2 local11 = this.aClass2_282;
		if (this.aClass114_62.aClass2_90 == local11) {
			this.aClass2_282 = null;
			return null;
		} else {
			this.aClass2_282 = local11.aClass2_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!fh;)V")
	public void method8627(@OriginalArg(1) Class114 arg0) {
		this.aClass114_62 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)Lclient!dfa;")
	public Class2 method8628() {
		@Pc(8) Class2 local8 = this.aClass114_62.aClass2_90.aClass2_300;
		if (local8 == this.aClass114_62.aClass2_90) {
			this.aClass2_282 = null;
			return null;
		} else {
			this.aClass2_282 = local8.aClass2_300;
			return local8;
		}
	}
}
