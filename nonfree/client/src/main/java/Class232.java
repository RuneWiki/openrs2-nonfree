import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class232 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!ju;")
	private final Class136 aClass136_10 = new Class136();

	@OriginalMember(owner = "client!td", name = "d", descriptor = "I")
	private int anInt6576;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	private final int anInt6583;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!mn;")
	private final Class167 aClass167_29;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
	public Class232(@OriginalArg(0) int arg0) {
		this.anInt6576 = arg0;
		this.anInt6583 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass167_29 = new Class167(local16);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ws;I)V")
	private void method5157(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface12 arg1) {
		if (this.anInt6583 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5163(arg1);
		this.anInt6576--;
		while (this.anInt6576 < 0) {
			@Pc(37) Class10_Sub1_Sub5 local37 = (Class10_Sub1_Sub5) this.aClass136_10.method3198();
			this.method5158(local37);
		}
		@Pc(51) Class10_Sub1_Sub5_Sub1 local51 = new Class10_Sub1_Sub5_Sub1(arg1, arg0, 1);
		this.aClass167_29.method3705(local51, arg1.method1040());
		this.aClass136_10.method3197(local51);
		local51.aLong254 = 0L;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!ls;B)V")
	private void method5158(@OriginalArg(0) Class10_Sub1_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method6033();
			arg0.method5897();
			this.anInt6576 += arg0.anInt4234;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
	public void method5159() {
		if (Static301.aClass46_1 == null) {
			return;
		}
		for (@Pc(18) Class10_Sub1_Sub5 local18 = (Class10_Sub1_Sub5) this.aClass136_10.method3200(); local18 != null; local18 = (Class10_Sub1_Sub5) this.aClass136_10.method3201()) {
			if (local18.method3395()) {
				if (local18.method3394() == null) {
					local18.method6033();
					local18.method5897();
					this.anInt6576 += local18.anInt4234;
				}
			} else if (++local18.aLong254 > (long) 5) {
				@Pc(59) Class10_Sub1_Sub5 local59 = Static301.aClass46_1.method1070(local18);
				this.aClass167_29.method3705(local59, local18.aLong264);
				Static31.method447(local59, local18);
				local18.method6033();
				local18.method5897();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!ws;)Ljava/lang/Object;")
	public Object method5160(@OriginalArg(1) Interface12 arg0) {
		@Pc(9) long local9 = arg0.method1040();
		for (@Pc(22) Class10_Sub1_Sub5 local22 = (Class10_Sub1_Sub5) this.aClass167_29.method3709(local9); local22 != null; local22 = (Class10_Sub1_Sub5) this.aClass167_29.method3707()) {
			if (local22.anInterface12_3.method1041(arg0)) {
				@Pc(34) Object local34 = local22.method3394();
				if (local34 != null) {
					if (local22.method3395()) {
						@Pc(63) Class10_Sub1_Sub5_Sub1 local63 = new Class10_Sub1_Sub5_Sub1(arg0, local34, local22.anInt4234);
						this.aClass167_29.method3705(local63, local22.aLong264);
						this.aClass136_10.method3197(local63);
						local63.aLong254 = 0L;
						local22.method6033();
						local22.method5897();
					} else {
						this.aClass136_10.method3197(local22);
						local22.aLong254 = 0L;
					}
					return local34;
				}
				local22.method6033();
				local22.method5897();
				this.anInt6576 += local22.anInt4234;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ws;)V")
	public void method5161(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface12 arg1) {
		this.method5157(arg0, arg1);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ILclient!ws;)V")
	private void method5163(@OriginalArg(1) Interface12 arg0) {
		@Pc(9) long local9 = arg0.method1040();
		for (@Pc(21) Class10_Sub1_Sub5 local21 = (Class10_Sub1_Sub5) this.aClass167_29.method3709(local9); local21 != null; local21 = (Class10_Sub1_Sub5) this.aClass167_29.method3707()) {
			if (local21.anInterface12_3.method1041(arg0)) {
				this.method5158(local21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
	public int method5164() {
		return this.anInt6583;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	public void method5165() {
		for (@Pc(11) Class10_Sub1_Sub5 local11 = (Class10_Sub1_Sub5) this.aClass136_10.method3200(); local11 != null; local11 = (Class10_Sub1_Sub5) this.aClass136_10.method3201()) {
			if (local11.method3395()) {
				local11.method6033();
				local11.method5897();
				this.anInt6576 += local11.anInt4234;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
	public int method5167() {
		return this.anInt6576;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	public void method5168() {
		this.aClass136_10.method3204();
		this.aClass167_29.method3701();
		this.anInt6576 = this.anInt6583;
	}
}
