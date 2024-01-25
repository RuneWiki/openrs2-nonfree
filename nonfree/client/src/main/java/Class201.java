import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class201 {

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!gm;")
	private Class120 aClass120_2;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!oh;")
	private final Class237 aClass237_92;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!oh;")
	private final Class237 aClass237_91;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;)V")
	public Class201(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1) {
		this.aClass237_92 = arg0;
		this.aClass237_91 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!uha;B)Lclient!mp;")
	public Interface16 method5391(@OriginalArg(0) Interface24 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(13) Class138 local13 = arg0.method8348();
		if (local13 == Static336.aClass138_3) {
			return new Class378((Class334) arg0);
		} else if (local13 == Static124.aClass138_2) {
			return new Class76(this.method5392(), (Class361) arg0);
		} else if (local13 == Static81.aClass138_1) {
			return new Class41(this.aClass237_92, (Class196) arg0);
		} else if (Static619.aClass138_8 == local13) {
			return new Class41_Sub1(this.aClass237_92, (Class196_Sub1) arg0);
		} else if (Static520.aClass138_6 == local13) {
			return new Class106_Sub1(this.aClass237_92, this.aClass237_91, (Class6_Sub1) arg0);
		} else if (Static641.aClass138_10 == local13) {
			return new Class106_Sub3(this.aClass237_92, this.aClass237_91, (Class6_Sub3) arg0);
		} else if (Static346.aClass138_4 == local13) {
			return new Class106_Sub2(this.aClass237_92, this.aClass237_91, (Class6_Sub2) arg0);
		} else if (Static540.aClass138_7 == local13) {
			return new Class176(this.aClass237_92, this.aClass237_91, (Class168) arg0);
		} else if (Static490.aClass138_5 == local13) {
			return new Class339(this.aClass237_92, (Class180) arg0);
		} else if (Static619.aClass138_9 == local13) {
			return new Class106_Sub2_Sub1(this.aClass237_92, this.aClass237_91, (Class6_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lclient!gm;")
	private Class120 method5392() {
		if (this.aClass120_2 == null) {
			this.aClass120_2 = new Class120();
		}
		return this.aClass120_2;
	}
}
