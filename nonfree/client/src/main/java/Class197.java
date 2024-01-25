import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class197 {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!bh;")
	private Class32 aClass32_49 = new Class32(128);

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!bh;")
	public Class32 aClass32_50 = new Class32(64);

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!wu;")
	public final Class380 aClass380_72;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!wu;")
	private final Class380 aClass380_73;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;Lclient!wu;)V")
	public Class197(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(3) Class380 arg3) {
		this.aClass380_72 = arg3;
		this.aClass380_73 = arg2;
		this.aClass380_73.method8631(36);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lclient!jk;")
	public Class172 method4161(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_49;
		@Pc(18) Class172 local18;
		synchronized (this.aClass32_49) {
			local18 = (Class172) this.aClass32_49.method630((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class380 local31 = this.aClass380_73;
		@Pc(40) byte[] local40;
		synchronized (this.aClass380_73) {
			local40 = this.aClass380_73.method8620(36, arg0);
		}
		local18 = new Class172();
		local18.anInt4318 = arg0;
		local18.aClass197_3 = this;
		if (local40 != null) {
			local18.method3774(new Class2_Sub22(local40));
		}
		local18.method3768();
		@Pc(77) Class32 local77 = this.aClass32_49;
		synchronized (this.aClass32_49) {
			this.aClass32_49.method629(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
	public void method4162() {
		@Pc(2) Class32 local2 = this.aClass32_49;
		synchronized (this.aClass32_49) {
			this.aClass32_49.method632();
		}
		local2 = this.aClass32_50;
		synchronized (this.aClass32_50) {
			this.aClass32_50.method632();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)V")
	public void method4163() {
		@Pc(6) Class32 local6 = this.aClass32_49;
		synchronized (this.aClass32_49) {
			this.aClass32_49.method634(5);
		}
		local6 = this.aClass32_50;
		synchronized (this.aClass32_50) {
			this.aClass32_50.method634(5);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public void method4164() {
		@Pc(2) Class32 local2 = this.aClass32_49;
		synchronized (this.aClass32_49) {
			this.aClass32_49.method640();
		}
		local2 = this.aClass32_50;
		synchronized (this.aClass32_50) {
			this.aClass32_50.method640();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)V")
	public void method4165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass32_49 = new Class32(arg0);
		this.aClass32_50 = new Class32(arg1);
	}
}
