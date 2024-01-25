import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class295 {

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient!bj;")
	private final Class30 aClass30_10 = new Class30();

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	private final int anInt8796;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
	private int anInt8803;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "Lclient!sga;")
	private final Class307 aClass307_48;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(I)V")
	public Class295(@OriginalArg(0) int arg0) {
		this.anInt8796 = arg0;
		this.anInt8803 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass307_48 = new Class307(local16);
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public void method7258() {
		for (@Pc(11) Class3_Sub1_Sub7 local11 = (Class3_Sub1_Sub7) this.aClass30_10.method780(); local11 != null; local11 = (Class3_Sub1_Sub7) this.aClass30_10.method783()) {
			if (local11.method7563()) {
				local11.method8671();
				local11.method8621();
				this.anInt8803 += local11.anInt9170;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V")
	public void method7259() {
		if (Static289.aClass38_1 == null) {
			return;
		}
		for (@Pc(9) Class3_Sub1_Sub7 local9 = (Class3_Sub1_Sub7) this.aClass30_10.method780(); local9 != null; local9 = (Class3_Sub1_Sub7) this.aClass30_10.method783()) {
			if (local9.method7563()) {
				if (local9.method7560() == null) {
					local9.method8671();
					local9.method8621();
					this.anInt8803 += local9.anInt9170;
				}
			} else if ((long) 5 < ++local9.aLong275) {
				@Pc(31) Class3_Sub1_Sub7 local31 = Static289.aClass38_1.method3964(local9);
				this.aClass307_48.method7425(local9.aLong277, local31);
				Static445.method6741(local31, local9);
				local9.method8671();
				local9.method8621();
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!rba;)V")
	private void method7260(@OriginalArg(1) Class3_Sub1_Sub7 arg0) {
		if (arg0 != null) {
			arg0.method8671();
			arg0.method8621();
			this.anInt8803 += arg0.anInt9170;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZLclient!qq;)V")
	private void method7261(@OriginalArg(1) Interface20 arg0) {
		@Pc(9) long local9 = arg0.method3802();
		for (@Pc(24) Class3_Sub1_Sub7 local24 = (Class3_Sub1_Sub7) this.aClass307_48.method7424(local9); local24 != null; local24 = (Class3_Sub1_Sub7) this.aClass307_48.method7422()) {
			if (local24.anInterface20_3.method3801(arg0)) {
				this.method7260(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBLclient!qq;Ljava/lang/Object;)V")
	private void method7263(@OriginalArg(2) Interface20 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt8796 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7261(arg0);
		this.anInt8803--;
		while (this.anInt8803 < 0) {
			@Pc(36) Class3_Sub1_Sub7 local36 = (Class3_Sub1_Sub7) this.aClass30_10.method781();
			this.method7260(local36);
		}
		@Pc(58) Class3_Sub1_Sub7_Sub1 local58 = new Class3_Sub1_Sub7_Sub1(arg0, arg1, 1);
		this.aClass307_48.method7425(arg0.method3802(), local58);
		this.aClass30_10.method779(local58);
		local58.aLong275 = 0L;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)I")
	public int method7264() {
		return this.anInt8796;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
	public int method7265() {
		return this.anInt8803;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
	public void method7266() {
		this.aClass30_10.method778();
		this.aClass307_48.method7427();
		this.anInt8803 = this.anInt8796;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!qq;)Ljava/lang/Object;")
	public Object method7267(@OriginalArg(1) Interface20 arg0) {
		@Pc(14) long local14 = arg0.method3802();
		for (@Pc(21) Class3_Sub1_Sub7 local21 = (Class3_Sub1_Sub7) this.aClass307_48.method7424(local14); local21 != null; local21 = (Class3_Sub1_Sub7) this.aClass307_48.method7422()) {
			if (local21.anInterface20_3.method3801(arg0)) {
				@Pc(33) Object local33 = local21.method7560();
				if (local33 != null) {
					if (local21.method7563()) {
						@Pc(72) Class3_Sub1_Sub7_Sub1 local72 = new Class3_Sub1_Sub7_Sub1(arg0, local33, local21.anInt9170);
						this.aClass307_48.method7425(local21.aLong277, local72);
						this.aClass30_10.method779(local72);
						local72.aLong275 = 0L;
						local21.method8671();
						local21.method8621();
					} else {
						this.aClass30_10.method779(local21);
						local21.aLong275 = 0L;
					}
					return local33;
				}
				local21.method8671();
				local21.method8621();
				this.anInt8803 += local21.anInt9170;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/Object;Lclient!qq;B)V")
	public void method7269(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface20 arg1) {
		this.method7263(arg1, arg0);
	}
}
