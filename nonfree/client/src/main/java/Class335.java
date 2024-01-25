import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class335 {

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Lclient!qk;")
	private final Class290 aClass290_12 = new Class290();

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	private int anInt9210;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	private final int anInt9204;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "Lclient!tba;")
	private final Class323 aClass323_35;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V")
	public Class335(@OriginalArg(0) int arg0) {
		this.anInt9210 = arg0;
		this.anInt9204 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass323_35 = new Class323(local16);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	public int method7839() {
		return this.anInt9204;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I")
	public int method7840() {
		return this.anInt9210;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
	public void method7841() {
		this.aClass290_12.method6675();
		this.aClass323_35.method7485();
		this.anInt9210 = this.anInt9204;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!hh;I)V")
	private void method7843(@OriginalArg(0) Interface9 arg0) {
		@Pc(12) long local12 = arg0.method4166();
		for (@Pc(21) Class2_Sub7_Sub7 local21 = (Class2_Sub7_Sub7) this.aClass323_35.method7484(local12); local21 != null; local21 = (Class2_Sub7_Sub7) this.aClass323_35.method7486()) {
			if (local21.anInterface9_3.method4165(arg0)) {
				this.method7849(local21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjava/lang/Object;Lclient!hh;)V")
	private void method7844(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface9 arg1) {
		if (this.anInt9204 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7843(arg1);
		this.anInt9210--;
		while (this.anInt9210 < 0) {
			@Pc(33) Class2_Sub7_Sub7 local33 = (Class2_Sub7_Sub7) this.aClass290_12.method6676();
			this.method7849(local33);
		}
		@Pc(50) Class2_Sub7_Sub7_Sub2 local50 = new Class2_Sub7_Sub7_Sub2(arg1, arg0, 1);
		this.aClass323_35.method7477(local50, arg1.method4166());
		this.aClass290_12.method6678(local50);
		local50.aLong260 = 0L;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!hh;I)Ljava/lang/Object;")
	public Object method7845(@OriginalArg(0) Interface9 arg0) {
		@Pc(7) long local7 = arg0.method4166();
		for (@Pc(14) Class2_Sub7_Sub7 local14 = (Class2_Sub7_Sub7) this.aClass323_35.method7484(local7); local14 != null; local14 = (Class2_Sub7_Sub7) this.aClass323_35.method7486()) {
			if (local14.anInterface9_3.method4165(arg0)) {
				@Pc(33) Object local33 = local14.method4728();
				if (local33 != null) {
					if (local14.method4730()) {
						@Pc(70) Class2_Sub7_Sub7_Sub2 local70 = new Class2_Sub7_Sub7_Sub2(arg0, local33, local14.anInt5394);
						this.aClass323_35.method7477(local70, local14.aLong278);
						this.aClass290_12.method6678(local70);
						local70.aLong260 = 0L;
						local14.method8920();
						local14.method8504();
					} else {
						this.aClass290_12.method6678(local14);
						local14.aLong260 = 0L;
					}
					return local33;
				}
				local14.method8920();
				local14.method8504();
				this.anInt9210 += local14.anInt5394;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!hh;Ljava/lang/Object;)V")
	public void method7846(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Object arg1) {
		this.method7844(arg1, arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	public void method7847() {
		if (Static426.aClass73_1 == null) {
			return;
		}
		for (@Pc(11) Class2_Sub7_Sub7 local11 = (Class2_Sub7_Sub7) this.aClass290_12.method6680(); local11 != null; local11 = (Class2_Sub7_Sub7) this.aClass290_12.method6673()) {
			if (local11.method4730()) {
				if (local11.method4728() == null) {
					local11.method8920();
					local11.method8504();
					this.anInt9210 += local11.anInt5394;
				}
			} else if ((long) 5 < ++local11.aLong260) {
				@Pc(56) Class2_Sub7_Sub7 local56 = Static426.aClass73_1.method1946(local11);
				this.aClass323_35.method7477(local56, local11.aLong278);
				Static562.method7871(local11, local56);
				local11.method8920();
				local11.method8504();
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
	public void method7848() {
		for (@Pc(15) Class2_Sub7_Sub7 local15 = (Class2_Sub7_Sub7) this.aClass290_12.method6680(); local15 != null; local15 = (Class2_Sub7_Sub7) this.aClass290_12.method6673()) {
			if (local15.method4730()) {
				local15.method8920();
				local15.method8504();
				this.anInt9210 += local15.anInt5394;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ni;)V")
	private void method7849(@OriginalArg(1) Class2_Sub7_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method8920();
			arg0.method8504();
			this.anInt9210 += arg0.anInt5394;
		}
	}
}
