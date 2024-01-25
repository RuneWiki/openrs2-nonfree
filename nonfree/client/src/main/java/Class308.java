import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class308 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Lclient!d;")
	private Class2 aClass2_233;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Lclient!ae;")
	private Class8 aClass8_58;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class308() {
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class308(@OriginalArg(0) Class8 arg0) {
		this.aClass8_58 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLclient!ae;)V")
	public void method6867(@OriginalArg(1) Class8 arg0) {
		this.aClass8_58 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Lclient!d;")
	public Class2 method6869() {
		@Pc(12) Class2 local12 = this.aClass2_233;
		if (local12 == this.aClass8_58.aClass2_9) {
			this.aClass2_233 = null;
			return null;
		} else {
			this.aClass2_233 = local12.aClass2_286;
			return local12;
		}
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Lclient!d;")
	public Class2 method6870() {
		@Pc(8) Class2 local8 = this.aClass8_58.aClass2_9.aClass2_286;
		if (this.aClass8_58.aClass2_9 == local8) {
			this.aClass2_233 = null;
			return null;
		} else {
			this.aClass2_233 = local8.aClass2_286;
			return local8;
		}
	}
}
