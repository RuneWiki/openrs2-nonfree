import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class84 {

	@OriginalMember(owner = "client!dia", name = "j", descriptor = "Lclient!ut;")
	private final Class358 aClass358_1 = new Class358();

	@OriginalMember(owner = "client!dia", name = "k", descriptor = "I")
	private int anInt2340;

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
	private final int anInt2334;

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "Lclient!rda;")
	private final Class300 aClass300_9;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(I)V")
	public Class84(@OriginalArg(0) int arg0) {
		this.anInt2340 = arg0;
		this.anInt2334 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass300_9 = new Class300(local16);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Ljava/lang/Object;Lclient!ofa;Z)V")
	public void method2083(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface20 arg1) {
		this.method2091(arg0, arg1);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)I")
	public int method2084() {
		return this.anInt2334;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!ofa;I)Ljava/lang/Object;")
	public Object method2087(@OriginalArg(0) Interface20 arg0) {
		@Pc(17) long local17 = arg0.method8655();
		for (@Pc(24) Class5_Sub3_Sub6 local24 = (Class5_Sub3_Sub6) this.aClass300_9.method7188(local17); local24 != null; local24 = (Class5_Sub3_Sub6) this.aClass300_9.method7187()) {
			if (local24.anInterface20_3.method8656(arg0)) {
				@Pc(36) Object local36 = local24.method8111();
				if (local36 != null) {
					if (local24.method8109()) {
						@Pc(65) Class5_Sub3_Sub6_Sub2 local65 = new Class5_Sub3_Sub6_Sub2(arg0, local36, local24.anInt9703);
						this.aClass300_9.method7191(local65, local24.aLong307);
						this.aClass358_1.method8329(local65);
						local65.aLong297 = 0L;
						local24.method9052();
						local24.method8687();
					} else {
						this.aClass358_1.method8329(local24);
						local24.aLong297 = 0L;
					}
					return local36;
				}
				local24.method9052();
				local24.method8687();
				this.anInt2340 += local24.anInt9703;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!hfa;)V")
	private void method2089(@OriginalArg(1) Class5_Sub3_Sub6 arg0) {
		if (arg0 != null) {
			arg0.method9052();
			arg0.method8687();
			this.anInt2340 += arg0.anInt9703;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!ofa;B)V")
	private void method2090(@OriginalArg(0) Interface20 arg0) {
		@Pc(17) long local17 = arg0.method8655();
		for (@Pc(24) Class5_Sub3_Sub6 local24 = (Class5_Sub3_Sub6) this.aClass300_9.method7188(local17); local24 != null; local24 = (Class5_Sub3_Sub6) this.aClass300_9.method7187()) {
			if (local24.anInterface20_3.method8656(arg0)) {
				this.method2089(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IILjava/lang/Object;Lclient!ofa;)V")
	private void method2091(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface20 arg1) {
		if (this.anInt2334 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2090(arg1);
		this.anInt2340--;
		while (this.anInt2340 < 0) {
			@Pc(36) Class5_Sub3_Sub6 local36 = (Class5_Sub3_Sub6) this.aClass358_1.method8326();
			this.method2089(local36);
		}
		@Pc(50) Class5_Sub3_Sub6_Sub2 local50 = new Class5_Sub3_Sub6_Sub2(arg1, arg0, 1);
		this.aClass300_9.method7191(local50, arg1.method8655());
		this.aClass358_1.method8329(local50);
		local50.aLong297 = 0L;
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
	public void method2094() {
		this.aClass358_1.method8327();
		this.aClass300_9.method7189();
		this.anInt2340 = this.anInt2334;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)I")
	public int method2095() {
		return this.anInt2340;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BI)V")
	public void method2096() {
		if (Static680.aClass54_4 == null) {
			return;
		}
		for (@Pc(20) Class5_Sub3_Sub6 local20 = (Class5_Sub3_Sub6) this.aClass358_1.method8322(); local20 != null; local20 = (Class5_Sub3_Sub6) this.aClass358_1.method8328()) {
			if (local20.method8109()) {
				if (local20.method8111() == null) {
					local20.method9052();
					local20.method8687();
					this.anInt2340 += local20.anInt9703;
				}
			} else if ((long) 5 < ++local20.aLong297) {
				@Pc(61) Class5_Sub3_Sub6 local61 = Static680.aClass54_4.method5372(local20);
				this.aClass300_9.method7191(local61, local20.aLong307);
				Static245.method705(local61, local20);
				local20.method9052();
				local20.method8687();
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(Z)V")
	public void method2097() {
		for (@Pc(16) Class5_Sub3_Sub6 local16 = (Class5_Sub3_Sub6) this.aClass358_1.method8322(); local16 != null; local16 = (Class5_Sub3_Sub6) this.aClass358_1.method8328()) {
			if (local16.method8109()) {
				local16.method9052();
				local16.method8687();
				this.anInt2340 += local16.anInt9703;
			}
		}
	}
}
