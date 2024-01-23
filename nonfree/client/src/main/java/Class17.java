import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class17 {

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "Lclient!ia;")
	private Class3_Sub4 aClass3_Sub4_7;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "Lclient!mm;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!mm;)V")
	public void method412(@OriginalArg(1) Class115 arg0) {
		this.aClass115_1 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)Lclient!ia;")
	public Class3_Sub4 method413() {
		@Pc(2) Class3_Sub4 local2 = this.aClass3_Sub4_7;
		if (this.aClass115_1.aClass3_Sub4_48 == local2) {
			this.aClass3_Sub4_7 = null;
			return null;
		} else {
			this.aClass3_Sub4_7 = local2.aClass3_Sub4_75;
			return local2;
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)Lclient!ia;")
	public Class3_Sub4 method415() {
		@Pc(8) Class3_Sub4 local8 = this.aClass115_1.aClass3_Sub4_48.aClass3_Sub4_75;
		if (local8 == this.aClass115_1.aClass3_Sub4_48) {
			this.aClass3_Sub4_7 = null;
			return null;
		} else {
			this.aClass3_Sub4_7 = local8.aClass3_Sub4_75;
			return local8;
		}
	}
}
