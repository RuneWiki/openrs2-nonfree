import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class268 {

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "Lclient!mn;")
	private final Class211 aClass211_6 = new Class211();

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
	private int anInt8108;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	private final int anInt8118;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!eq;")
	private final Class99 aClass99_60;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V")
	public Class268(@OriginalArg(0) int arg0) {
		this.anInt8108 = arg0;
		this.anInt8118 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass99_60 = new Class99(local16);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!we;)V")
	private void method6916(@OriginalArg(1) Interface26 arg0) {
		@Pc(9) long local9 = arg0.method6252();
		for (@Pc(16) Class2_Sub6_Sub2 local16 = (Class2_Sub6_Sub2) this.aClass99_60.method3056(local9); local16 != null; local16 = (Class2_Sub6_Sub2) this.aClass99_60.method3052()) {
			if (local16.anInterface26_3.method6253(arg0)) {
				this.method6920(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	public int method6917() {
		return this.anInt8118;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILclient!we;)Ljava/lang/Object;")
	public Object method6918(@OriginalArg(1) Interface26 arg0) {
		@Pc(9) long local9 = arg0.method6252();
		for (@Pc(16) Class2_Sub6_Sub2 local16 = (Class2_Sub6_Sub2) this.aClass99_60.method3056(local9); local16 != null; local16 = (Class2_Sub6_Sub2) this.aClass99_60.method3052()) {
			if (local16.anInterface26_3.method6253(arg0)) {
				@Pc(28) Object local28 = local16.method5984();
				if (local28 != null) {
					if (local16.method5985()) {
						@Pc(57) Class2_Sub6_Sub2_Sub1 local57 = new Class2_Sub6_Sub2_Sub1(arg0, local28, local16.anInt7009);
						this.aClass99_60.method3059(local16.aLong278, local57);
						this.aClass211_6.method6002(local57);
						local57.aLong267 = 0L;
						local16.method9253();
						local16.method8933();
					} else {
						this.aClass211_6.method6002(local16);
						local16.aLong267 = 0L;
					}
					return local28;
				}
				local16.method9253();
				local16.method8933();
				this.anInt8108 += local16.anInt7009;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/Object;Lclient!we;II)V")
	private void method6919(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface26 arg1) {
		if (this.anInt8118 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6916(arg1);
		this.anInt8108--;
		while (this.anInt8108 < 0) {
			@Pc(40) Class2_Sub6_Sub2 local40 = (Class2_Sub6_Sub2) this.aClass211_6.method6005();
			this.method6920(local40);
		}
		@Pc(54) Class2_Sub6_Sub2_Sub1 local54 = new Class2_Sub6_Sub2_Sub1(arg1, arg0, 1);
		this.aClass99_60.method3059(arg1.method6252(), local54);
		this.aClass211_6.method6002(local54);
		local54.aLong267 = 0L;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!rd;B)V")
	private void method6920(@OriginalArg(0) Class2_Sub6_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method9253();
			arg0.method8933();
			this.anInt8108 += arg0.anInt7009;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	public void method6922() {
		for (@Pc(11) Class2_Sub6_Sub2 local11 = (Class2_Sub6_Sub2) this.aClass211_6.method6008(); local11 != null; local11 = (Class2_Sub6_Sub2) this.aClass211_6.method6000()) {
			if (local11.method5985()) {
				local11.method9253();
				local11.method8933();
				this.anInt8108 += local11.anInt7009;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	public void method6923() {
		this.aClass211_6.method6006();
		this.aClass99_60.method3057();
		this.anInt8108 = this.anInt8118;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public void method6924() {
		if (Static347.aClass89_1 == null) {
			return;
		}
		for (@Pc(13) Class2_Sub6_Sub2 local13 = (Class2_Sub6_Sub2) this.aClass211_6.method6008(); local13 != null; local13 = (Class2_Sub6_Sub2) this.aClass211_6.method6000()) {
			if (local13.method5985()) {
				if (local13.method5984() == null) {
					local13.method9253();
					local13.method8933();
					this.anInt8108 += local13.anInt7009;
				}
			} else if ((long) 5 < ++local13.aLong267) {
				@Pc(60) Class2_Sub6_Sub2 local60 = Static347.aClass89_1.method7990(local13);
				this.aClass99_60.method3059(local13.aLong278, local60);
				Static621.method9057(local60, local13);
				local13.method9253();
				local13.method8933();
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/Object;Lclient!we;)V")
	public void method6926(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface26 arg1) {
		this.method6919(arg0, arg1);
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)I")
	public int method6928() {
		return this.anInt8108;
	}
}
