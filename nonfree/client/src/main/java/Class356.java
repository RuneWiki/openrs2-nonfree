import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class356 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!vg;")
	private final Class342 aClass342_198 = new Class342(64);

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!ri;")
	public final Class284 aClass284_168;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!ri;")
	private final Class284 aClass284_169;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;Lclient!ri;)V")
	public Class356(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Class284 arg3) {
		this.aClass284_168 = arg3;
		this.aClass284_169 = arg2;
		this.aClass284_169.method6354(3);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public void method7911() {
		@Pc(8) Class342 local8 = this.aClass342_198;
		synchronized (this.aClass342_198) {
			this.aClass342_198.method7693();
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public void method7912() {
		@Pc(2) Class342 local2 = this.aClass342_198;
		synchronized (this.aClass342_198) {
			this.aClass342_198.method7687();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public void method7914() {
		@Pc(6) Class342 local6 = this.aClass342_198;
		synchronized (this.aClass342_198) {
			this.aClass342_198.method7697(5);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lclient!sh;")
	public Class303 method7917(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_198;
		@Pc(16) Class303 local16;
		synchronized (this.aClass342_198) {
			local16 = (Class303) this.aClass342_198.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_169;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_169) {
			local38 = this.aClass284_169.method6331(3, arg0);
		}
		local16 = new Class303();
		local16.aClass356_2 = this;
		if (local38 != null) {
			local16.method6596(new Class3_Sub26(local38));
		}
		@Pc(63) Class342 local63 = this.aClass342_198;
		synchronized (this.aClass342_198) {
			this.aClass342_198.method7683(local16, (long) arg0);
			return local16;
		}
	}
}
