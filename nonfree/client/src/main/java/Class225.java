import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class225 {

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!uq;")
	private final Class247 aClass247_10 = new Class247();

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	private final int anInt6828;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	private int anInt6834;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "Lclient!cv;")
	private final Class51 aClass51_32;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V")
	public Class225(@OriginalArg(0) int arg0) {
		this.anInt6828 = arg0;
		this.anInt6834 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass51_32 = new Class51(local16);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!qo;I)V")
	private void method5353(@OriginalArg(0) Interface9 arg0) {
		@Pc(9) long local9 = arg0.method5718();
		for (@Pc(24) Class1_Sub1_Sub2 local24 = (Class1_Sub1_Sub2) this.aClass51_32.method930(local9); local24 != null; local24 = (Class1_Sub1_Sub2) this.aClass51_32.method925()) {
			if (local24.anInterface9_3.method5717(arg0)) {
				this.method5354(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ae;I)V")
	private void method5354(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method5965();
			arg0.method5893();
			this.anInt6834 += arg0.anInt6704;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/Object;Lclient!qo;)V")
	public void method5355(@OriginalArg(1) Object arg0, @OriginalArg(2) Interface9 arg1) {
		this.method5360(arg1, arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method5357() {
		this.aClass247_10.method5586();
		this.aClass51_32.method921();
		this.anInt6834 = this.anInt6828;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	public int method5358() {
		return this.anInt6834;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)I")
	public int method5359() {
		return this.anInt6828;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!qo;Ljava/lang/Object;II)V")
	private void method5360(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt6828 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5353(arg0);
		this.anInt6834--;
		while (this.anInt6834 < 0) {
			@Pc(36) Class1_Sub1_Sub2 local36 = (Class1_Sub1_Sub2) this.aClass247_10.method5585();
			this.method5354(local36);
		}
		@Pc(50) Class1_Sub1_Sub2_Sub1 local50 = new Class1_Sub1_Sub2_Sub1(arg0, arg1, 1);
		this.aClass51_32.method931(local50, arg0.method5718());
		this.aClass247_10.method5590(local50);
		local50.aLong231 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lclient!qo;I)Ljava/lang/Object;")
	public Object method5362(@OriginalArg(0) Interface9 arg0) {
		@Pc(9) long local9 = arg0.method5718();
		for (@Pc(16) Class1_Sub1_Sub2 local16 = (Class1_Sub1_Sub2) this.aClass51_32.method930(local9); local16 != null; local16 = (Class1_Sub1_Sub2) this.aClass51_32.method925()) {
			if (local16.anInterface9_3.method5717(arg0)) {
				@Pc(28) Object local28 = local16.method5252();
				if (local28 != null) {
					if (local16.method5251()) {
						@Pc(57) Class1_Sub1_Sub2_Sub1 local57 = new Class1_Sub1_Sub2_Sub1(arg0, local28, local16.anInt6704);
						this.aClass51_32.method931(local57, local16.aLong237);
						this.aClass247_10.method5590(local57);
						local57.aLong231 = 0L;
						local16.method5965();
						local16.method5893();
					} else {
						this.aClass247_10.method5590(local16);
						local16.aLong231 = 0L;
					}
					return local28;
				}
				local16.method5965();
				local16.method5893();
				this.anInt6834 += local16.anInt6704;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public void method5363() {
		for (@Pc(7) Class1_Sub1_Sub2 local7 = (Class1_Sub1_Sub2) this.aClass247_10.method5591(); local7 != null; local7 = (Class1_Sub1_Sub2) this.aClass247_10.method5587()) {
			if (local7.method5251()) {
				local7.method5965();
				local7.method5893();
				this.anInt6834 += local7.anInt6704;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	public void method5364() {
		if (Static298.aClass194_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub1_Sub2 local13 = (Class1_Sub1_Sub2) this.aClass247_10.method5591(); local13 != null; local13 = (Class1_Sub1_Sub2) this.aClass247_10.method5587()) {
			if (local13.method5251()) {
				if (local13.method5252() == null) {
					local13.method5965();
					local13.method5893();
					this.anInt6834 += local13.anInt6704;
				}
			} else if ((long) 5 < ++local13.aLong231) {
				@Pc(54) Class1_Sub1_Sub2 local54 = Static298.aClass194_1.method5114(local13);
				this.aClass51_32.method931(local54, local13.aLong237);
				Static344.method4956(local54, local13);
				local13.method5965();
				local13.method5893();
			}
		}
	}
}
