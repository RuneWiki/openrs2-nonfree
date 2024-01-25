import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class316 {

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!cba;")
	private final Class38 aClass38_5 = new Class38();

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private final int anInt7917;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	private int anInt7927;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Lclient!sl;")
	private final Class310 aClass310_32;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
	public Class316(@OriginalArg(0) int arg0) {
		this.anInt7917 = arg0;
		this.anInt7927 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass310_32 = new Class310(local16);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public void method6709() {
		this.aClass38_5.method1067();
		this.aClass310_32.method6605();
		this.anInt7927 = this.anInt7917;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
	public void method6710() {
		for (@Pc(11) Class3_Sub3_Sub11 local11 = (Class3_Sub3_Sub11) this.aClass38_5.method1070(); local11 != null; local11 = (Class3_Sub3_Sub11) this.aClass38_5.method1072()) {
			if (local11.method6453()) {
				local11.method7812();
				local11.method7720();
				this.anInt7927 += local11.anInt7643;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
	public int method6711() {
		return this.anInt7917;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bga;Ljava/lang/Object;II)V")
	private void method6712(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt7917 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6718(arg0);
		this.anInt7927--;
		while (this.anInt7927 < 0) {
			@Pc(32) Class3_Sub3_Sub11 local32 = (Class3_Sub3_Sub11) this.aClass38_5.method1073();
			this.method6719(local32);
		}
		@Pc(46) Class3_Sub3_Sub11_Sub2 local46 = new Class3_Sub3_Sub11_Sub2(arg0, arg1, 1);
		this.aClass310_32.method6603(local46, arg0.method3667());
		this.aClass38_5.method1069(local46);
		local46.aLong265 = 0L;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)V")
	public void method6713() {
		if (Static173.aClass59_1 == null) {
			return;
		}
		for (@Pc(19) Class3_Sub3_Sub11 local19 = (Class3_Sub3_Sub11) this.aClass38_5.method1070(); local19 != null; local19 = (Class3_Sub3_Sub11) this.aClass38_5.method1072()) {
			if (local19.method6453()) {
				if (local19.method6452() == null) {
					local19.method7812();
					local19.method7720();
					this.anInt7927 += local19.anInt7643;
				}
			} else if ((long) 5 < ++local19.aLong265) {
				@Pc(45) Class3_Sub3_Sub11 local45 = Static173.aClass59_1.method1800(local19);
				this.aClass310_32.method6603(local45, local19.aLong273);
				Static217.method3781(local45, local19);
				local19.method7812();
				local19.method7720();
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bga;I)Ljava/lang/Object;")
	public Object method6715(@OriginalArg(0) Interface3 arg0) {
		@Pc(17) long local17 = arg0.method3667();
		for (@Pc(24) Class3_Sub3_Sub11 local24 = (Class3_Sub3_Sub11) this.aClass310_32.method6601(local17); local24 != null; local24 = (Class3_Sub3_Sub11) this.aClass310_32.method6600()) {
			if (local24.anInterface3_3.method3668(arg0)) {
				@Pc(36) Object local36 = local24.method6452();
				if (local36 != null) {
					if (local24.method6453()) {
						@Pc(75) Class3_Sub3_Sub11_Sub2 local75 = new Class3_Sub3_Sub11_Sub2(arg0, local36, local24.anInt7643);
						this.aClass310_32.method6603(local75, local24.aLong273);
						this.aClass38_5.method1069(local75);
						local75.aLong265 = 0L;
						local24.method7812();
						local24.method7720();
					} else {
						this.aClass38_5.method1069(local24);
						local24.aLong265 = 0L;
					}
					return local36;
				}
				local24.method7812();
				local24.method7720();
				this.anInt7927 += local24.anInt7643;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bga;BLjava/lang/Object;)V")
	public void method6716(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Object arg1) {
		this.method6712(arg0, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I")
	public int method6717() {
		return this.anInt7927;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bga;B)V")
	private void method6718(@OriginalArg(0) Interface3 arg0) {
		@Pc(17) long local17 = arg0.method3667();
		for (@Pc(24) Class3_Sub3_Sub11 local24 = (Class3_Sub3_Sub11) this.aClass310_32.method6601(local17); local24 != null; local24 = (Class3_Sub3_Sub11) this.aClass310_32.method6600()) {
			if (local24.anInterface3_3.method3668(arg0)) {
				this.method6719(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!vaa;I)V")
	private void method6719(@OriginalArg(0) Class3_Sub3_Sub11 arg0) {
		if (arg0 != null) {
			arg0.method7812();
			arg0.method7720();
			this.anInt7927 += arg0.anInt7643;
		}
	}
}
