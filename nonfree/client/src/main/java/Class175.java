import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class175 {

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "Lclient!rda;")
	private final Class286 aClass286_6 = new Class286();

	@OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
	private final int anInt4797;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
	private int anInt4791;

	@OriginalMember(owner = "client!jea", name = "t", descriptor = "Lclient!jw;")
	private final Class183 aClass183_19;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(I)V")
	public Class175(@OriginalArg(0) int arg0) {
		this.anInt4797 = arg0;
		this.anInt4791 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass183_19 = new Class183(local16);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)V")
	public void method4085() {
		if (Static520.aClass72_1 == null) {
			return;
		}
		for (@Pc(18) Class4_Sub7_Sub8 local18 = (Class4_Sub7_Sub8) this.aClass286_6.method6403(); local18 != null; local18 = (Class4_Sub7_Sub8) this.aClass286_6.method6414()) {
			if (local18.method3886()) {
				if (local18.method3887() == null) {
					local18.method8013();
					local18.method7963();
					this.anInt4791 += local18.anInt4615;
				}
			} else if ((long) 5 < ++local18.aLong303) {
				@Pc(42) Class4_Sub7_Sub8 local42 = Static520.aClass72_1.method2155(local18);
				this.aClass183_19.method4282(local18.aLong307, local42);
				Static59.method864(local18, local42);
				local18.method8013();
				local18.method7963();
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILjava/lang/Object;Lclient!hg;)V")
	public void method4088(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface11 arg1) {
		this.method4093(arg1, arg0);
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
	public void method4089() {
		for (@Pc(11) Class4_Sub7_Sub8 local11 = (Class4_Sub7_Sub8) this.aClass286_6.method6403(); local11 != null; local11 = (Class4_Sub7_Sub8) this.aClass286_6.method6414()) {
			if (local11.method3886()) {
				local11.method8013();
				local11.method7963();
				this.anInt4791 += local11.anInt4615;
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!vs;Z)V")
	private void method4090(@OriginalArg(0) Class4_Sub7_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method8013();
			arg0.method7963();
			this.anInt4791 += arg0.anInt4615;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V")
	public void method4091() {
		this.aClass286_6.method6411();
		this.aClass183_19.method4287();
		this.anInt4791 = this.anInt4797;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!hg;BLjava/lang/Object;)V")
	private void method4093(@OriginalArg(1) Interface11 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4797 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4097(arg0);
		this.anInt4791--;
		while (this.anInt4791 < 0) {
			@Pc(43) Class4_Sub7_Sub8 local43 = (Class4_Sub7_Sub8) this.aClass286_6.method6405();
			this.method4090(local43);
		}
		@Pc(60) Class4_Sub7_Sub8_Sub2 local60 = new Class4_Sub7_Sub8_Sub2(arg0, arg1, 1);
		this.aClass183_19.method4282(arg0.method6430(), local60);
		this.aClass286_6.method6409(local60);
		local60.aLong303 = 0L;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)I")
	public int method4094() {
		return this.anInt4797;
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)I")
	public int method4096() {
		return this.anInt4791;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BLclient!hg;)V")
	private void method4097(@OriginalArg(1) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method6430();
		for (@Pc(16) Class4_Sub7_Sub8 local16 = (Class4_Sub7_Sub8) this.aClass183_19.method4289(local9); local16 != null; local16 = (Class4_Sub7_Sub8) this.aClass183_19.method4290()) {
			if (local16.anInterface11_3.method6429(arg0)) {
				this.method4090(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!hg;I)Ljava/lang/Object;")
	public Object method4098(@OriginalArg(0) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method6430();
		for (@Pc(16) Class4_Sub7_Sub8 local16 = (Class4_Sub7_Sub8) this.aClass183_19.method4289(local9); local16 != null; local16 = (Class4_Sub7_Sub8) this.aClass183_19.method4290()) {
			if (local16.anInterface11_3.method6429(arg0)) {
				@Pc(28) Object local28 = local16.method3887();
				if (local28 != null) {
					if (local16.method3886()) {
						@Pc(57) Class4_Sub7_Sub8_Sub2 local57 = new Class4_Sub7_Sub8_Sub2(arg0, local28, local16.anInt4615);
						this.aClass183_19.method4282(local16.aLong307, local57);
						this.aClass286_6.method6409(local57);
						local57.aLong303 = 0L;
						local16.method8013();
						local16.method7963();
					} else {
						this.aClass286_6.method6409(local16);
						local16.aLong303 = 0L;
					}
					return local28;
				}
				local16.method8013();
				local16.method7963();
				this.anInt4791 += local16.anInt4615;
			}
		}
		return null;
	}
}
