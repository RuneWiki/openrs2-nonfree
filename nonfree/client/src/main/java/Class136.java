import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class136 {

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Lclient!jt;")
	private final Class166 aClass166_22 = new Class166(64);

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	public int anInt4231 = 0;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!vd;")
	private final Class353 aClass353_40;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
	public final int anInt4229;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class136(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_40 = arg2;
		this.anInt4229 = this.aClass353_40.method8422(4);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public void method3664() {
		@Pc(10) Class166 local10 = this.aClass166_22;
		synchronized (this.aClass166_22) {
			this.aClass166_22.method4811();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Lclient!rca;")
	public Class283 method3665(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_22;
		@Pc(21) Class283 local21;
		synchronized (this.aClass166_22) {
			local21 = (Class283) this.aClass166_22.method4805((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class353 local34 = this.aClass353_40;
		@Pc(43) byte[] local43;
		synchronized (this.aClass353_40) {
			local43 = this.aClass353_40.method8404(4, arg0);
		}
		local21 = new Class283();
		local21.aClass136_5 = this;
		local21.anInt8369 = arg0;
		if (local43 != null) {
			local21.method7217(new Class6_Sub40(local43));
		}
		local21.method7213();
		@Pc(76) Class166 local76 = this.aClass166_22;
		synchronized (this.aClass166_22) {
			this.aClass166_22.method4803(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V")
	public void method3669() {
		@Pc(2) Class166 local2 = this.aClass166_22;
		synchronized (this.aClass166_22) {
			this.aClass166_22.method4802();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
	public void method3670() {
		@Pc(2) Class166 local2 = this.aClass166_22;
		synchronized (this.aClass166_22) {
			this.aClass166_22.method4809(5);
		}
	}
}
