import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class140 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Lclient!fha;")
	private Class109 aClass109_29;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Lclient!tq;")
	private Class2 aClass2_108;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class140() {
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!fha;)V")
	public Class140(@OriginalArg(0) Class109 arg0) {
		this.aClass109_29 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!fha;)V")
	public void method2962(@OriginalArg(1) Class109 arg0) {
		this.aClass109_29 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lclient!tq;")
	public Class2 method2964() {
		@Pc(11) Class2 local11 = this.aClass2_108;
		if (this.aClass109_29.aClass2_78 == local11) {
			this.aClass2_108 = null;
			return null;
		} else {
			this.aClass2_108 = local11.aClass2_300;
			return local11;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Lclient!tq;")
	public Class2 method2965() {
		@Pc(8) Class2 local8 = this.aClass109_29.aClass2_78.aClass2_300;
		if (local8 == this.aClass109_29.aClass2_78) {
			this.aClass2_108 = null;
			return null;
		} else {
			this.aClass2_108 = local8.aClass2_300;
			return local8;
		}
	}
}
