import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class214 {

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Lclient!tr;")
	private final Class195 aClass195_12 = new Class195();

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
	private int anInt6756;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	private final int anInt6750;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!bo;")
	private final Class24 aClass24_33;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt6756 = arg0;
		this.anInt6750 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass24_33 = new Class24(local14);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!bc;I)Ljava/lang/Object;")
	public Object method5650(@OriginalArg(0) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method5553();
		for (@Pc(21) Class3_Sub7_Sub7 local21 = (Class3_Sub7_Sub7) this.aClass24_33.method609(local9); local21 != null; local21 = (Class3_Sub7_Sub7) this.aClass24_33.method600()) {
			if (local21.anInterface1_3.method5552(arg0)) {
				@Pc(37) Object local37 = local21.method5389();
				if (local37 != null) {
					if (local21.method5390()) {
						@Pc(63) Class3_Sub7_Sub7_Sub1 local63 = new Class3_Sub7_Sub7_Sub1(arg0, local37);
						this.aClass24_33.method598(local21.aLong211, local63);
						this.aClass195_12.method5213(local63);
						local63.aLong198 = 0L;
						local21.method5717();
						local21.method5385();
					} else {
						this.aClass195_12.method5213(local21);
						local21.aLong198 = 0L;
					}
					return local37;
				}
				local21.method5717();
				local21.method5385();
				this.anInt6756++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(Lclient!bc;I)V")
	private void method5652(@OriginalArg(0) Interface1 arg0) {
		@Pc(9) long local9 = arg0.method5553();
		for (@Pc(16) Class3_Sub7_Sub7 local16 = (Class3_Sub7_Sub7) this.aClass24_33.method609(local9); local16 != null; local16 = (Class3_Sub7_Sub7) this.aClass24_33.method600()) {
			if (local16.anInterface1_3.method5552(arg0)) {
				local16.method5717();
				local16.method5385();
				this.anInt6756++;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)I")
	public int method5653() {
		return this.anInt6750;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public void method5654() {
		this.aClass195_12.method5215();
		this.aClass24_33.method608();
		this.anInt6756 = this.anInt6750;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!bc;BLjava/lang/Object;)V")
	public void method5655(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Object arg1) {
		this.method5652(arg0);
		if (this.anInt6756 == 0) {
			@Pc(18) Class3_Sub7_Sub7 local18 = (Class3_Sub7_Sub7) this.aClass195_12.method5208();
			local18.method5717();
			local18.method5385();
		} else {
			this.anInt6756--;
		}
		@Pc(42) Class3_Sub7_Sub7_Sub1 local42 = new Class3_Sub7_Sub7_Sub1(arg0, arg1);
		this.aClass24_33.method598(arg0.method5553(), local42);
		this.aClass195_12.method5213(local42);
		local42.aLong198 = 0L;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public void method5656() {
		if (Static219.aClass72_1 == null) {
			return;
		}
		for (@Pc(32) Class3_Sub7_Sub7 local32 = (Class3_Sub7_Sub7) this.aClass195_12.method5216(); local32 != null; local32 = (Class3_Sub7_Sub7) this.aClass195_12.method5210()) {
			if (local32.method5390()) {
				if (local32.method5389() == null) {
					local32.method5717();
					local32.method5385();
					this.anInt6756++;
				}
			} else if (++local32.aLong198 > (long) 5) {
				@Pc(58) Class3_Sub7_Sub7 local58 = Static219.aClass72_1.method1733(local32);
				this.aClass24_33.method598(local32.aLong211, local58);
				Static132.method2233(local32, local58);
				local32.method5717();
				local32.method5385();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I")
	public int method5660() {
		return this.anInt6756;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	public void method5661() {
		for (@Pc(11) Class3_Sub7_Sub7 local11 = (Class3_Sub7_Sub7) this.aClass195_12.method5216(); local11 != null; local11 = (Class3_Sub7_Sub7) this.aClass195_12.method5210()) {
			if (local11.method5390()) {
				local11.method5717();
				local11.method5385();
				this.anInt6756++;
			}
		}
	}
}
