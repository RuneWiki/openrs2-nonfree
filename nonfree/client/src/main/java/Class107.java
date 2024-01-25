import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class107 {

	@OriginalMember(owner = "client!ffa", name = "s", descriptor = "I")
	public int anInt2763;

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "Lclient!bh;")
	private final Class32 aClass32_24 = new Class32(64);

	@OriginalMember(owner = "client!ffa", name = "p", descriptor = "Lclient!bh;")
	public final Class32 aClass32_25 = new Class32(50);

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "Lclient!bh;")
	public final Class32 aClass32_26 = new Class32(5);

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "Lclient!wu;")
	private final Class380 aClass380_43;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lclient!wu;")
	public final Class380 aClass380_44;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "Z")
	public boolean aBoolean208;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "Lclient!wj;")
	public final Class375 aClass375_4;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lclient!wj;IZLclient!wu;Lclient!wu;)V")
	public Class107(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class380 arg3, @OriginalArg(4) Class380 arg4) {
		this.aClass380_43 = arg3;
		this.aClass380_44 = arg4;
		this.aBoolean208 = arg2;
		this.aClass375_4 = arg0;
		if (this.aClass380_43 != null) {
			@Pc(41) int local41 = this.aClass380_43.method8639() - 1;
			this.aClass380_43.method8631(local41);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	public void method2284() {
		@Pc(2) Class32 local2 = this.aClass32_25;
		synchronized (this.aClass32_25) {
			this.aClass32_25.method640();
		}
		local2 = this.aClass32_26;
		synchronized (this.aClass32_26) {
			this.aClass32_26.method640();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)V")
	public void method2287() {
		@Pc(6) Class32 local6 = this.aClass32_24;
		synchronized (this.aClass32_24) {
			this.aClass32_24.method634(5);
		}
		local6 = this.aClass32_25;
		synchronized (this.aClass32_25) {
			this.aClass32_25.method634(5);
		}
		local6 = this.aClass32_26;
		synchronized (this.aClass32_26) {
			this.aClass32_26.method634(5);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	public void method2288() {
		@Pc(2) Class32 local2 = this.aClass32_24;
		synchronized (this.aClass32_24) {
			this.aClass32_24.method640();
		}
		local2 = this.aClass32_25;
		synchronized (this.aClass32_25) {
			this.aClass32_25.method640();
		}
		local2 = this.aClass32_26;
		synchronized (this.aClass32_26) {
			this.aClass32_26.method640();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	public void method2289() {
		@Pc(12) Class32 local12 = this.aClass32_24;
		synchronized (this.aClass32_24) {
			this.aClass32_24.method632();
		}
		local12 = this.aClass32_25;
		synchronized (this.aClass32_25) {
			this.aClass32_25.method632();
		}
		local12 = this.aClass32_26;
		synchronized (this.aClass32_26) {
			this.aClass32_26.method632();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)Lclient!iea;")
	public Class150 method2291(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_24;
		@Pc(16) Class150 local16;
		synchronized (this.aClass32_24) {
			local16 = (Class150) this.aClass32_24.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_43;
		@Pc(50) byte[] local50;
		synchronized (this.aClass380_43) {
			local50 = this.aClass380_43.method8620(Static459.method6252(arg0), Static344.method4624(arg0));
		}
		local16 = new Class150();
		local16.aClass107_1 = this;
		local16.anInt3816 = arg0;
		if (local50 != null) {
			local16.method3193(new Class2_Sub22(local50));
		}
		local16.method3201();
		@Pc(81) Class32 local81 = this.aClass32_24;
		synchronized (this.aClass32_24) {
			this.aClass32_24.method629(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)V")
	public void method2292(@OriginalArg(0) int arg0) {
		this.anInt2763 = arg0;
		@Pc(13) Class32 local13 = this.aClass32_25;
		synchronized (this.aClass32_25) {
			this.aClass32_25.method640();
		}
		local13 = this.aClass32_26;
		synchronized (this.aClass32_26) {
			this.aClass32_26.method640();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V")
	public void method2293(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean208) {
			this.aBoolean208 = arg0;
			this.method2288();
		}
	}
}
