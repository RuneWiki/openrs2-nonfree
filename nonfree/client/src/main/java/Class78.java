import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class78 {

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "[Lclient!ri;")
	private static final Class208[] aClass208Array1 = new Class208[32];

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!kh;")
	private Class134 aClass134_17 = new Class134(128);

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "Lclient!kh;")
	public Class134 aClass134_18 = new Class134(64);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Lclient!ul;")
	private final Class246 aClass246_74;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!ul;")
	public final Class246 aClass246_75;

	static {
		@Pc(77) Class208[] local77 = Static25.method550();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass208Array1[local77[local79].anInt5814] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;Lclient!ul;)V")
	public Class78(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_74 = arg2;
		this.aClass246_75 = arg3;
		this.aClass246_74.method5492(36);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Lclient!ql;")
	public Class202 method2110(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_17;
		@Pc(16) Class202 local16;
		synchronized (this.aClass134_17) {
			local16 = (Class202) this.aClass134_17.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class246 local34 = this.aClass246_74;
		@Pc(43) byte[] local43;
		synchronized (this.aClass246_74) {
			local43 = this.aClass246_74.method5477(36, arg0);
		}
		local16 = new Class202();
		local16.aClass78_4 = this;
		local16.anInt5581 = arg0;
		if (local43 != null) {
			local16.method4660(new Class1_Sub5(local43));
		}
		local16.method4650();
		@Pc(74) Class134 local74 = this.aClass134_17;
		synchronized (this.aClass134_17) {
			this.aClass134_17.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V")
	public void method2111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass134_17 = new Class134(arg1);
		this.aClass134_18 = new Class134(arg0);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	public void method2112() {
		@Pc(6) Class134 local6 = this.aClass134_17;
		synchronized (this.aClass134_17) {
			this.aClass134_17.method3267();
		}
		local6 = this.aClass134_18;
		synchronized (this.aClass134_18) {
			this.aClass134_18.method3267();
		}
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)V")
	public void method2114() {
		@Pc(2) Class134 local2 = this.aClass134_17;
		synchronized (this.aClass134_17) {
			this.aClass134_17.method3270(5);
		}
		local2 = this.aClass134_18;
		synchronized (this.aClass134_18) {
			this.aClass134_18.method3270(5);
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	public void method2115() {
		@Pc(6) Class134 local6 = this.aClass134_17;
		synchronized (this.aClass134_17) {
			this.aClass134_17.method3272();
		}
		@Pc(29) Class134 local29 = this.aClass134_18;
		synchronized (this.aClass134_18) {
			this.aClass134_18.method3272();
		}
	}
}
