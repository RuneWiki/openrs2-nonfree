import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class152 {

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!kp;")
	private final Class180 aClass180_5 = new Class180();

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	private final int anInt4621;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private int anInt4612;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "Lclient!hd;")
	private final Class128 aClass128_22;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
	public Class152(@OriginalArg(0) int arg0) {
		this.anInt4621 = arg0;
		this.anInt4612 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass128_22 = new Class128(local16);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILclient!sea;Ljava/lang/Object;)V")
	private void method3990(@OriginalArg(2) Interface21 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4621 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method3998(arg0);
		this.anInt4612--;
		while (this.anInt4612 < 0) {
			@Pc(32) Class6_Sub2_Sub9 local32 = (Class6_Sub2_Sub9) this.aClass180_5.method4471();
			this.method3997(local32);
		}
		@Pc(54) Class6_Sub2_Sub9_Sub2 local54 = new Class6_Sub2_Sub9_Sub2(arg0, arg1, 1);
		this.aClass128_22.method3267(local54, arg0.method1446());
		this.aClass180_5.method4468(local54);
		local54.aLong247 = 0L;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!sea;)Ljava/lang/Object;")
	public Object method3991(@OriginalArg(1) Interface21 arg0) {
		@Pc(9) long local9 = arg0.method1446();
		for (@Pc(16) Class6_Sub2_Sub9 local16 = (Class6_Sub2_Sub9) this.aClass128_22.method3263(local9); local16 != null; local16 = (Class6_Sub2_Sub9) this.aClass128_22.method3264()) {
			if (local16.anInterface21_3.method1445(arg0)) {
				@Pc(28) Object local28 = local16.method4703();
				if (local28 != null) {
					if (local16.method4705()) {
						@Pc(57) Class6_Sub2_Sub9_Sub2 local57 = new Class6_Sub2_Sub9_Sub2(arg0, local28, local16.anInt5462);
						this.aClass128_22.method3267(local57, local16.aLong263);
						this.aClass180_5.method4468(local57);
						local57.aLong247 = 0L;
						local16.method7804();
						local16.method7405();
					} else {
						this.aClass180_5.method4468(local16);
						local16.aLong247 = 0L;
					}
					return local28;
				}
				local16.method7804();
				local16.method7405();
				this.anInt4612 += local16.anInt5462;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	public int method3992() {
		return this.anInt4612;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)I")
	public int method3993() {
		return this.anInt4621;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public void method3994() {
		this.aClass180_5.method4465();
		this.aClass128_22.method3274();
		this.anInt4612 = this.anInt4621;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!sea;ILjava/lang/Object;)V")
	public void method3995(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) Object arg1) {
		this.method3990(arg0, arg1);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
	public void method3996() {
		if (Static471.aClass29_5 == null) {
			return;
		}
		for (@Pc(13) Class6_Sub2_Sub9 local13 = (Class6_Sub2_Sub9) this.aClass180_5.method4466(); local13 != null; local13 = (Class6_Sub2_Sub9) this.aClass180_5.method4473()) {
			if (local13.method4705()) {
				if (local13.method4703() == null) {
					local13.method7804();
					local13.method7405();
					this.anInt4612 += local13.anInt5462;
				}
			} else if ((long) 5 < ++local13.aLong247) {
				@Pc(39) Class6_Sub2_Sub9 local39 = Static471.aClass29_5.method990(local13);
				this.aClass128_22.method3267(local39, local13.aLong263);
				Static344.method5313(local39, local13);
				local13.method7804();
				local13.method7405();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kb;B)V")
	private void method3997(@OriginalArg(0) Class6_Sub2_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method7804();
			arg0.method7405();
			this.anInt4612 += arg0.anInt5462;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!sea;I)V")
	private void method3998(@OriginalArg(0) Interface21 arg0) {
		@Pc(9) long local9 = arg0.method1446();
		for (@Pc(16) Class6_Sub2_Sub9 local16 = (Class6_Sub2_Sub9) this.aClass128_22.method3263(local9); local16 != null; local16 = (Class6_Sub2_Sub9) this.aClass128_22.method3264()) {
			if (local16.anInterface21_3.method1445(arg0)) {
				this.method3997(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public void method3999() {
		for (@Pc(19) Class6_Sub2_Sub9 local19 = (Class6_Sub2_Sub9) this.aClass180_5.method4466(); local19 != null; local19 = (Class6_Sub2_Sub9) this.aClass180_5.method4473()) {
			if (local19.method4705()) {
				local19.method7804();
				local19.method7405();
				this.anInt4612 += local19.anInt5462;
			}
		}
	}
}
