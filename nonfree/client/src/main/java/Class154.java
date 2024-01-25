import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class154 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Lclient!gba;")
	private final Class104 aClass104_6 = new Class104();

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	private int anInt4581;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	private final int anInt4591;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "Lclient!ba;")
	private final Class17 aClass17_18;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
	public Class154(@OriginalArg(0) int arg0) {
		this.anInt4581 = arg0;
		this.anInt4591 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass17_18 = new Class17(local16);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
	public int method3985() {
		return this.anInt4581;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!maa;)Ljava/lang/Object;")
	public Object method3986(@OriginalArg(1) Interface6 arg0) {
		@Pc(9) long local9 = arg0.method3904();
		for (@Pc(24) Class1_Sub1_Sub1 local24 = (Class1_Sub1_Sub1) this.aClass17_18.method738(local9); local24 != null; local24 = (Class1_Sub1_Sub1) this.aClass17_18.method743()) {
			if (local24.anInterface6_3.method3903(arg0)) {
				@Pc(36) Object local36 = local24.method4835();
				if (local36 != null) {
					if (local24.method4834()) {
						@Pc(65) Class1_Sub1_Sub1_Sub1 local65 = new Class1_Sub1_Sub1_Sub1(arg0, local36, local24.anInt5669);
						this.aClass17_18.method737(local65, local24.aLong392);
						this.aClass104_6.method2420(local65);
						local65.aLong394 = 0L;
						local24.method7525();
						local24.method7528();
					} else {
						this.aClass104_6.method2420(local24);
						local24.aLong394 = 0L;
					}
					return local36;
				}
				local24.method7525();
				local24.method7528();
				this.anInt4581 += local24.anInt5669;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)I")
	public int method3987() {
		return this.anInt4591;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)V")
	public void method3988() {
		this.aClass104_6.method2419();
		this.aClass17_18.method734();
		this.anInt4581 = this.anInt4591;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public void method3989() {
		if (Static76.aClass111_1 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub1_Sub1 local9 = (Class1_Sub1_Sub1) this.aClass104_6.method2414(); local9 != null; local9 = (Class1_Sub1_Sub1) this.aClass104_6.method2417()) {
			if (local9.method4834()) {
				if (local9.method4835() == null) {
					local9.method7525();
					local9.method7528();
					this.anInt4581 += local9.anInt5669;
				}
			} else if ((long) 5 < ++local9.aLong394) {
				@Pc(54) Class1_Sub1_Sub1 local54 = Static76.aClass111_1.method3555(local9);
				this.aClass17_18.method737(local54, local9.aLong392);
				Static101.method6349(local9, local54);
				local9.method7525();
				local9.method7528();
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!maa;I)V")
	private void method3990(@OriginalArg(0) Interface6 arg0) {
		@Pc(9) long local9 = arg0.method3904();
		for (@Pc(21) Class1_Sub1_Sub1 local21 = (Class1_Sub1_Sub1) this.aClass17_18.method738(local9); local21 != null; local21 = (Class1_Sub1_Sub1) this.aClass17_18.method743()) {
			if (local21.anInterface6_3.method3903(arg0)) {
				this.method3994(local21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public void method3991() {
		for (@Pc(14) Class1_Sub1_Sub1 local14 = (Class1_Sub1_Sub1) this.aClass104_6.method2414(); local14 != null; local14 = (Class1_Sub1_Sub1) this.aClass104_6.method2417()) {
			if (local14.method4834()) {
				local14.method7525();
				local14.method7528();
				this.anInt4581 += local14.anInt5669;
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILclient!maa;Ljava/lang/Object;)V")
	private void method3993(@OriginalArg(2) Interface6 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4591 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3990(arg0);
		this.anInt4581--;
		while (this.anInt4581 < 0) {
			@Pc(36) Class1_Sub1_Sub1 local36 = (Class1_Sub1_Sub1) this.aClass104_6.method2418();
			this.method3994(local36);
		}
		@Pc(50) Class1_Sub1_Sub1_Sub1 local50 = new Class1_Sub1_Sub1_Sub1(arg0, arg1, 1);
		this.aClass17_18.method737(local50, arg0.method3904());
		this.aClass104_6.method2420(local50);
		local50.aLong394 = 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLclient!aa;)V")
	private void method3994(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		if (arg0 != null) {
			arg0.method7525();
			arg0.method7528();
			this.anInt4581 += arg0.anInt5669;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!maa;ILjava/lang/Object;)V")
	public void method3995(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) Object arg1) {
		this.method3993(arg0, arg1);
	}
}
