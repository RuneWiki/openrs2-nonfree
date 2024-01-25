import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class186 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!pb;")
	private Class252 aClass252_1;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!eq;")
	private final Class97 aClass97_72;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!eq;")
	private final Class97 aClass97_71;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!eq;Lclient!eq;)V")
	public Class186(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class97 arg1) {
		this.aClass97_72 = arg0;
		this.aClass97_71 = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Lclient!pb;")
	private Class252 method4470() {
		if (this.aClass252_1 == null) {
			this.aClass252_1 = new Class252();
		}
		return this.aClass252_1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ci;)Lclient!ql;")
	public Interface20 method4474(@OriginalArg(1) Interface4 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(19) Class184 local19 = arg0.method7078();
		if (local19 == Static19.aClass184_5) {
			return new Class346((Class297) arg0);
		} else if (Static374.aClass184_8 == local19) {
			return new Class307(this.method4470(), (Class126) arg0);
		} else if (Static25.aClass184_2 == local19) {
			return new Class67(this.aClass97_72, (Class138) arg0);
		} else if (local19 == Static352.aClass184_7) {
			return new Class67_Sub1(this.aClass97_72, (Class138_Sub1) arg0);
		} else if (Static545.aClass184_11 == local19) {
			return new Class122_Sub3(this.aClass97_72, this.aClass97_71, (Class8_Sub3) arg0);
		} else if (Static62.aClass184_4 == local19) {
			return new Class122_Sub1(this.aClass97_72, this.aClass97_71, (Class8_Sub1) arg0);
		} else if (Static390.aClass184_9 == local19) {
			return new Class122_Sub2(this.aClass97_72, this.aClass97_71, (Class8_Sub2) arg0);
		} else if (Static445.aClass184_10 == local19) {
			return new Class102(this.aClass97_72, this.aClass97_71, (Class57) arg0);
		} else if (Static28.aClass184_6 == local19) {
			return new Class336(this.aClass97_72, (Class299) arg0);
		} else if (local19 == Static610.aClass184_12) {
			return new Class122_Sub2_Sub1(this.aClass97_72, this.aClass97_71, (Class8_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}
}
