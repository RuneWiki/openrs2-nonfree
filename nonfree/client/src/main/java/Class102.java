import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class102 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Lclient!mc;")
	private final Class185 aClass185_7 = new Class185();

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	private final int anInt2936;

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	private int anInt2938;

	@OriginalMember(owner = "client!gm", name = "p", descriptor = "Lclient!ica;")
	private final Class127 aClass127_25;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
	public Class102(@OriginalArg(0) int arg0) {
		this.anInt2936 = arg0;
		this.anInt2938 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass127_25 = new Class127(local16);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)I")
	public int method2736() {
		return this.anInt2936;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V")
	public void method2738() {
		if (Static20.aClass46_1 == null) {
			return;
		}
		for (@Pc(18) Class2_Sub13_Sub3 local18 = (Class2_Sub13_Sub3) this.aClass185_7.method4623(); local18 != null; local18 = (Class2_Sub13_Sub3) this.aClass185_7.method4617()) {
			if (local18.method3362()) {
				if (local18.method3363() == null) {
					local18.method7802();
					local18.method7527();
					this.anInt2938 += local18.anInt3806;
				}
			} else if (++local18.aLong230 > (long) 5) {
				@Pc(42) Class2_Sub13_Sub3 local42 = Static20.aClass46_1.method1469(local18);
				this.aClass127_25.method3213(local42, local18.aLong241);
				Static313.method5812(local18, local42);
				local18.method7802();
				local18.method7527();
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
	public void method2739() {
		this.aClass185_7.method4624();
		this.aClass127_25.method3204();
		this.anInt2938 = this.anInt2936;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/Object;Lclient!ws;I)V")
	public void method2740(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface20 arg1) {
		this.method2746(arg0, arg1);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public void method2741() {
		for (@Pc(7) Class2_Sub13_Sub3 local7 = (Class2_Sub13_Sub3) this.aClass185_7.method4623(); local7 != null; local7 = (Class2_Sub13_Sub3) this.aClass185_7.method4617()) {
			if (local7.method3362()) {
				local7.method7802();
				local7.method7527();
				this.anInt2938 += local7.anInt3806;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ws;)V")
	private void method2742(@OriginalArg(1) Interface20 arg0) {
		@Pc(9) long local9 = arg0.method4662();
		for (@Pc(16) Class2_Sub13_Sub3 local16 = (Class2_Sub13_Sub3) this.aClass127_25.method3205(local9); local16 != null; local16 = (Class2_Sub13_Sub3) this.aClass127_25.method3210()) {
			if (local16.anInterface20_3.method4663(arg0)) {
				this.method2743(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!vn;Z)V")
	private void method2743(@OriginalArg(0) Class2_Sub13_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method7802();
			arg0.method7527();
			this.anInt2938 += arg0.anInt3806;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ws;I)Ljava/lang/Object;")
	public Object method2744(@OriginalArg(0) Interface20 arg0) {
		@Pc(11) long local11 = arg0.method4662();
		for (@Pc(24) Class2_Sub13_Sub3 local24 = (Class2_Sub13_Sub3) this.aClass127_25.method3205(local11); local24 != null; local24 = (Class2_Sub13_Sub3) this.aClass127_25.method3210()) {
			if (local24.anInterface20_3.method4663(arg0)) {
				@Pc(36) Object local36 = local24.method3363();
				if (local36 != null) {
					if (local24.method3362()) {
						@Pc(77) Class2_Sub13_Sub3_Sub1 local77 = new Class2_Sub13_Sub3_Sub1(arg0, local36, local24.anInt3806);
						this.aClass127_25.method3213(local77, local24.aLong241);
						this.aClass185_7.method4621(local77);
						local77.aLong230 = 0L;
						local24.method7802();
						local24.method7527();
					} else {
						this.aClass185_7.method4621(local24);
						local24.aLong230 = 0L;
					}
					return local36;
				}
				local24.method7802();
				local24.method7527();
				this.anInt2938 += local24.anInt3806;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ws;Z)V")
	private void method2746(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface20 arg1) {
		if (this.anInt2936 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method2742(arg1);
		this.anInt2938--;
		while (this.anInt2938 < 0) {
			@Pc(36) Class2_Sub13_Sub3 local36 = (Class2_Sub13_Sub3) this.aClass185_7.method4622();
			this.method2743(local36);
		}
		@Pc(50) Class2_Sub13_Sub3_Sub1 local50 = new Class2_Sub13_Sub3_Sub1(arg1, arg0, 1);
		this.aClass127_25.method3213(local50, arg1.method4662());
		this.aClass185_7.method4621(local50);
		local50.aLong230 = 0L;
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)I")
	public int method2748() {
		return this.anInt2938;
	}
}
