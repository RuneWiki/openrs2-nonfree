import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class21 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Lclient!ps;")
	private Class193 aClass193_4;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "Lclient!ie;")
	private Class3 aClass3_31;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class21() {
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!ps;)V")
	public Class21(@OriginalArg(0) Class193 arg0) {
		this.aClass193_4 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lclient!ie;")
	public Class3 method498() {
		@Pc(6) Class3 local6 = this.aClass3_31;
		if (local6 == this.aClass193_4.aClass3_198) {
			this.aClass3_31 = null;
			return null;
		} else {
			this.aClass3_31 = local6.aClass3_268;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Lclient!ie;")
	public Class3 method499() {
		@Pc(8) Class3 local8 = this.aClass193_4.aClass3_198.aClass3_268;
		if (this.aClass193_4.aClass3_198 == local8) {
			this.aClass3_31 = null;
			return null;
		} else {
			this.aClass3_31 = local8.aClass3_268;
			return local8;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!ps;)V")
	public void method500(@OriginalArg(1) Class193 arg0) {
		this.aClass193_4 = arg0;
	}
}
