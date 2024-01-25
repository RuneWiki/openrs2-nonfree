import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class237 {

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!wi;")
	private final Class268 aClass268_54 = new Class268(64);

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
	public int anInt6575 = 0;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!uu;")
	private final Class250 aClass250_93;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	public final int anInt6573;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!iv;ILclient!uu;)V")
	public Class237(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_93 = arg2;
		this.anInt6573 = this.aClass250_93.method5815(4);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lclient!av;")
	public Class16 method5431(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_54;
		@Pc(16) Class16 local16;
		synchronized (this.aClass268_54) {
			local16 = (Class16) this.aClass268_54.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_93;
		@Pc(38) byte[] local38;
		synchronized (this.aClass250_93) {
			local38 = this.aClass250_93.method5806(4, arg0);
		}
		local16 = new Class16();
		local16.anInt300 = arg0;
		local16.aClass237_3 = this;
		if (local38 != null) {
			local16.method332(new Class3_Sub25(local38));
		}
		local16.method331();
		@Pc(71) Class268 local71 = this.aClass268_54;
		synchronized (this.aClass268_54) {
			this.aClass268_54.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)V")
	public void method5433() {
		@Pc(12) Class268 local12 = this.aClass268_54;
		synchronized (this.aClass268_54) {
			this.aClass268_54.method6173(5);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public void method5434() {
		@Pc(6) Class268 local6 = this.aClass268_54;
		synchronized (this.aClass268_54) {
			this.aClass268_54.method6168();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public void method5435() {
		@Pc(7) Class268 local7 = this.aClass268_54;
		synchronized (this.aClass268_54) {
			this.aClass268_54.method6160();
		}
	}
}
