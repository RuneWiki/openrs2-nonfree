import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class191 {

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "[I")
	public static final int[] anIntArray486 = new int[4096];

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!vn;")
	private Class211 aClass211_34;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!qs;")
	private Class5 aClass5_222;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray486[local4] = Static9.method278(local4);
		}
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class191() {
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!vn;)V")
	public Class191(@OriginalArg(0) Class211 arg0) {
		this.aClass211_34 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!vn;)V")
	public void method5234(@OriginalArg(1) Class211 arg0) {
		this.aClass211_34 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lclient!qs;")
	public Class5 method5235() {
		@Pc(6) Class5 local6 = this.aClass5_222;
		if (this.aClass211_34.aClass5_235 == local6) {
			this.aClass5_222 = null;
			return null;
		} else {
			this.aClass5_222 = local6.aClass5_247;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Lclient!qs;")
	public Class5 method5238() {
		@Pc(14) Class5 local14 = this.aClass211_34.aClass5_235.aClass5_247;
		if (this.aClass211_34.aClass5_235 == local14) {
			this.aClass5_222 = null;
			return null;
		} else {
			this.aClass5_222 = local14.aClass5_247;
			return local14;
		}
	}
}
