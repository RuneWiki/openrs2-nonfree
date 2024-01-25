import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class134 {

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Lclient!re;")
	private Class286 aClass286_2;

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!we;")
	private Class6_Sub2 aClass6_Sub2_29;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	private Class134() {
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class134(@OriginalArg(0) Class286 arg0) {
		this.aClass286_2 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lclient!we;")
	public Class6_Sub2 method3649() {
		@Pc(14) Class6_Sub2 local14 = this.aClass6_Sub2_29;
		if (this.aClass286_2.aClass6_Sub2_56 == local14) {
			this.aClass6_Sub2_29 = null;
			return null;
		} else {
			this.aClass6_Sub2_29 = local14.aClass6_Sub2_66;
			return local14;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)Lclient!we;")
	public Class6_Sub2 method3651() {
		@Pc(8) Class6_Sub2 local8 = this.aClass286_2.aClass6_Sub2_56.aClass6_Sub2_66;
		if (this.aClass286_2.aClass6_Sub2_56 == local8) {
			this.aClass6_Sub2_29 = null;
			return null;
		} else {
			this.aClass6_Sub2_29 = local8.aClass6_Sub2_66;
			return local8;
		}
	}
}
