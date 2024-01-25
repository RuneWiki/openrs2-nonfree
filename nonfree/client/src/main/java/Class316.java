import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class316 implements Interface21 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!da;")
	private Class50 aClass50_11;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!vd;")
	private final Class353 aClass353_108;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!vd;")
	private final Class353 aClass353_109;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "Lclient!lca;")
	private final Class182 aClass182_1;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!vd;Lclient!vd;Lclient!lca;)V")
	public Class316(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass353_108 = arg0;
		this.aClass353_109 = arg1;
		this.aClass182_1 = arg2;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7901() {
		@Pc(5) boolean local5 = true;
		if (!this.aClass353_108.method8401(this.aClass182_1.anInt5935)) {
			local5 = false;
		}
		if (!this.aClass353_109.method8401(this.aClass182_1.anInt5935)) {
			local5 = false;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7903() {
		@Pc(23) int local23 = this.aClass182_1.aClass238_10.method6456(Static507.anInt8741, this.aClass182_1.anInt5937) + this.aClass182_1.anInt5944;
		@Pc(37) int local37 = this.aClass182_1.aClass79_15.method2054(this.aClass182_1.anInt5941, Static106.anInt2101) + this.aClass182_1.anInt5942;
		this.aClass50_11.method5742(0, (int[]) null, local37, this.aClass182_1.anInt5936, this.aClass182_1.anInt5947, (Class1) null, this.aClass182_1.anInt5933, this.aClass182_1.aString73, 0, this.aClass182_1.anInt5938, this.aClass182_1.anInt5941, this.aClass182_1.anInt5937, local23, this.aClass182_1.anInt5934, (Class32[]) null);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	@Override
	public void method7902() {
		@Pc(11) Class133 local11 = Static308.method5208(this.aClass182_1.anInt5935, this.aClass353_109);
		this.aClass50_11 = Static162.aClass100_7.method8808(local11, Static651.method2403(this.aClass353_108, this.aClass182_1.anInt5935));
	}
}
