import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class308 {

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Lclient!bh;")
	private final Class32 aClass32_73 = new Class32(64);

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!bh;")
	public final Class32 aClass32_74 = new Class32(2);

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!wu;")
	public final Class380 aClass380_111;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_112;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;Lclient!wu;)V")
	public Class308(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Class380 arg3) {
		this.aClass380_111 = arg3;
		this.aClass380_112 = arg2;
		this.aClass380_112.method8631(33);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Lclient!nh;")
	public Class234 method6908(@OriginalArg(1) int arg0) {
		@Pc(13) Class32 local13 = this.aClass32_73;
		@Pc(23) Class234 local23;
		synchronized (this.aClass32_73) {
			local23 = (Class234) this.aClass32_73.method630((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class380 local36 = this.aClass380_112;
		@Pc(45) byte[] local45;
		synchronized (this.aClass380_112) {
			local45 = this.aClass380_112.method8620(33, arg0);
		}
		local23 = new Class234();
		local23.aClass308_1 = this;
		if (local45 != null) {
			local23.method5058(new Class2_Sub22(local45));
		}
		@Pc(70) Class32 local70 = this.aClass32_73;
		synchronized (this.aClass32_73) {
			this.aClass32_73.method629(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)V")
	public void method6910() {
		@Pc(2) Class32 local2 = this.aClass32_73;
		synchronized (this.aClass32_73) {
			this.aClass32_73.method634(5);
		}
		local2 = this.aClass32_74;
		synchronized (this.aClass32_74) {
			this.aClass32_74.method634(5);
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V")
	public void method6912() {
		@Pc(2) Class32 local2 = this.aClass32_73;
		synchronized (this.aClass32_73) {
			this.aClass32_73.method632();
		}
		local2 = this.aClass32_74;
		synchronized (this.aClass32_74) {
			this.aClass32_74.method632();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public void method6913() {
		@Pc(2) Class32 local2 = this.aClass32_73;
		synchronized (this.aClass32_73) {
			this.aClass32_73.method640();
		}
		local2 = this.aClass32_74;
		synchronized (this.aClass32_74) {
			this.aClass32_74.method640();
		}
	}
}
