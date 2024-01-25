import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class64 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!oa;")
	private final Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	private int anInt1504;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	private final int anInt1502;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Lclient!fa;")
	private final Class77 aClass77_10;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
	public Class64(@OriginalArg(0) int arg0) {
		this.anInt1504 = arg0;
		this.anInt1502 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass77_10 = new Class77(local16);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	public void method1196() {
		for (@Pc(18) Class1_Sub6_Sub2 local18 = (Class1_Sub6_Sub2) this.aClass170_1.method3685(); local18 != null; local18 = (Class1_Sub6_Sub2) this.aClass170_1.method3688()) {
			if (local18.method3184()) {
				local18.method5577();
				local18.method5580();
				this.anInt1504 += local18.anInt3855;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	public int method1197() {
		return this.anInt1502;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vk;BILjava/lang/Object;)V")
	private void method1199(@OriginalArg(0) Interface11 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt1502 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1200(arg0);
		this.anInt1504--;
		while (this.anInt1504 < 0) {
			@Pc(36) Class1_Sub6_Sub2 local36 = (Class1_Sub6_Sub2) this.aClass170_1.method3684();
			this.method1206(local36);
		}
		@Pc(61) Class1_Sub6_Sub2_Sub2 local61 = new Class1_Sub6_Sub2_Sub2(arg0, arg1, 1);
		this.aClass77_10.method1370(arg0.method3898(), local61);
		this.aClass170_1.method3690(local61);
		local61.aLong208 = 0L;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vk;I)V")
	private void method1200(@OriginalArg(0) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method3898();
		for (@Pc(16) Class1_Sub6_Sub2 local16 = (Class1_Sub6_Sub2) this.aClass77_10.method1368(local9); local16 != null; local16 = (Class1_Sub6_Sub2) this.aClass77_10.method1369()) {
			if (local16.anInterface11_3.method3899(arg0)) {
				this.method1206(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
	public void method1201() {
		if (Static181.aClass20_2 == null) {
			return;
		}
		for (@Pc(9) Class1_Sub6_Sub2 local9 = (Class1_Sub6_Sub2) this.aClass170_1.method3685(); local9 != null; local9 = (Class1_Sub6_Sub2) this.aClass170_1.method3688()) {
			if (local9.method3184()) {
				if (local9.method3188() == null) {
					local9.method5577();
					local9.method5580();
					this.anInt1504 += local9.anInt3855;
				}
			} else if (++local9.aLong208 > (long) 5) {
				@Pc(31) Class1_Sub6_Sub2 local31 = Static181.aClass20_2.method3212(local9);
				this.aClass77_10.method1370(local9.aLong207, local31);
				Static158.method2158(local9, local31);
				local9.method5577();
				local9.method5580();
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	public void method1202() {
		this.aClass170_1.method3686();
		this.aClass77_10.method1362();
		this.anInt1504 = this.anInt1502;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vk;Ljava/lang/Object;I)V")
	public void method1204(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1) {
		this.method1199(arg0, arg1);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!vk;I)Ljava/lang/Object;")
	public Object method1205(@OriginalArg(0) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method3898();
		for (@Pc(21) Class1_Sub6_Sub2 local21 = (Class1_Sub6_Sub2) this.aClass77_10.method1368(local9); local21 != null; local21 = (Class1_Sub6_Sub2) this.aClass77_10.method1369()) {
			if (local21.anInterface11_3.method3899(arg0)) {
				@Pc(33) Object local33 = local21.method3188();
				if (local33 != null) {
					if (local21.method3184()) {
						@Pc(62) Class1_Sub6_Sub2_Sub2 local62 = new Class1_Sub6_Sub2_Sub2(arg0, local33, local21.anInt3855);
						this.aClass77_10.method1370(local21.aLong207, local62);
						this.aClass170_1.method3690(local62);
						local62.aLong208 = 0L;
						local21.method5577();
						local21.method5580();
					} else {
						this.aClass170_1.method3690(local21);
						local21.aLong208 = 0L;
					}
					return local33;
				}
				local21.method5577();
				local21.method5580();
				this.anInt1504 += local21.anInt3855;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!mn;Z)V")
	private void method1206(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method5577();
			arg0.method5580();
			this.anInt1504 += arg0.anInt3855;
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)I")
	public int method1207() {
		return this.anInt1504;
	}
}
