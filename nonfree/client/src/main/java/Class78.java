import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class78 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!rp;")
	private final Class259 aClass259_3 = new Class259();

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	private final int anInt2097;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	private int anInt2094;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!pt;")
	private final Class230 aClass230_17;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I)V")
	public Class78(@OriginalArg(0) int arg0) {
		this.anInt2097 = arg0;
		this.anInt2094 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass230_17 = new Class230(local16);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/lang/Object;ILclient!ada;)V")
	private void method2013(@OriginalArg(1) Object arg0, @OriginalArg(3) Interface2 arg1) {
		if (this.anInt2097 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2022(arg1);
		this.anInt2094--;
		while (this.anInt2094 < 0) {
			@Pc(32) Class1_Sub2_Sub4 local32 = (Class1_Sub2_Sub4) this.aClass259_3.method6658();
			this.method2017(local32);
		}
		@Pc(53) Class1_Sub2_Sub4_Sub1 local53 = new Class1_Sub2_Sub4_Sub1(arg1, arg0, 1);
		this.aClass230_17.method6139(arg1.method7746(), local53);
		this.aClass259_3.method6656(local53);
		local53.aLong228 = 0L;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
	public int method2014() {
		return this.anInt2097;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!pk;I)V")
	private void method2017(@OriginalArg(0) Class1_Sub2_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method8239();
			arg0.method7390();
			this.anInt2094 += arg0.anInt8463;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)I")
	public int method2018() {
		return this.anInt2094;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	public void method2019() {
		this.aClass259_3.method6653();
		this.aClass230_17.method6141();
		this.anInt2094 = this.anInt2097;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
	public void method2020() {
		if (Static229.aClass13_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub2_Sub4 local13 = (Class1_Sub2_Sub4) this.aClass259_3.method6652(); local13 != null; local13 = (Class1_Sub2_Sub4) this.aClass259_3.method6654()) {
			if (local13.method7396()) {
				if (local13.method7397() == null) {
					local13.method8239();
					local13.method7390();
					this.anInt2094 += local13.anInt8463;
				}
			} else if ((long) 5 < ++local13.aLong228) {
				@Pc(54) Class1_Sub2_Sub4 local54 = Static229.aClass13_1.method546(local13);
				this.aClass230_17.method6139(local13.aLong251, local54);
				Static400.method6152(local13, local54);
				local13.method8239();
				local13.method7390();
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Object;Lclient!ada;I)V")
	public void method2021(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface2 arg1) {
		this.method2013(arg0, arg1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ada;I)V")
	private void method2022(@OriginalArg(0) Interface2 arg0) {
		@Pc(9) long local9 = arg0.method7746();
		for (@Pc(24) Class1_Sub2_Sub4 local24 = (Class1_Sub2_Sub4) this.aClass230_17.method6144(local9); local24 != null; local24 = (Class1_Sub2_Sub4) this.aClass230_17.method6145()) {
			if (local24.anInterface2_3.method7747(arg0)) {
				this.method2017(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public void method2024() {
		for (@Pc(19) Class1_Sub2_Sub4 local19 = (Class1_Sub2_Sub4) this.aClass259_3.method6652(); local19 != null; local19 = (Class1_Sub2_Sub4) this.aClass259_3.method6654()) {
			if (local19.method7396()) {
				local19.method8239();
				local19.method7390();
				this.anInt2094 += local19.anInt8463;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!ada;)Ljava/lang/Object;")
	public Object method2025(@OriginalArg(1) Interface2 arg0) {
		@Pc(17) long local17 = arg0.method7746();
		for (@Pc(24) Class1_Sub2_Sub4 local24 = (Class1_Sub2_Sub4) this.aClass230_17.method6144(local17); local24 != null; local24 = (Class1_Sub2_Sub4) this.aClass230_17.method6145()) {
			if (local24.anInterface2_3.method7747(arg0)) {
				@Pc(36) Object local36 = local24.method7397();
				if (local36 != null) {
					if (local24.method7396()) {
						@Pc(75) Class1_Sub2_Sub4_Sub1 local75 = new Class1_Sub2_Sub4_Sub1(arg0, local36, local24.anInt8463);
						this.aClass230_17.method6139(local24.aLong251, local75);
						this.aClass259_3.method6656(local75);
						local75.aLong228 = 0L;
						local24.method8239();
						local24.method7390();
					} else {
						this.aClass259_3.method6656(local24);
						local24.aLong228 = 0L;
					}
					return local36;
				}
				local24.method8239();
				local24.method7390();
				this.anInt2094 += local24.anInt8463;
			}
		}
		return null;
	}
}
