import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class146 {

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Lclient!pea;")
	private Class6_Sub5 aClass6_Sub5_26 = new Class6_Sub5();

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Lclient!pw;")
	private final Class256 aClass256_2 = new Class256();

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	private int anInt4126;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	private final int anInt4127;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "Lclient!oj;")
	private final Class234 aClass234_28;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V")
	public Class146(@OriginalArg(0) int arg0) {
		this.anInt4126 = arg0;
		this.anInt4127 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass234_28 = new Class234(local19);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method3533() {
		this.aClass256_2.method5907();
		this.aClass234_28.method5463();
		this.aClass6_Sub5_26 = new Class6_Sub5();
		this.anInt4126 = this.anInt4127;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZJLclient!pea;)V")
	public void method3534(@OriginalArg(1) long arg0, @OriginalArg(2) Class6_Sub5 arg1) {
		if (this.anInt4126 == 0) {
			@Pc(15) Class6_Sub5 local15 = this.aClass256_2.method5904();
			local15.method7948();
			local15.method7814();
			if (this.aClass6_Sub5_26 == local15) {
				local15 = this.aClass256_2.method5904();
				local15.method7948();
				local15.method7814();
			}
		} else {
			this.anInt4126--;
		}
		this.aClass234_28.method5466(arg0, arg1);
		this.aClass256_2.method5906(arg1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BJ)Lclient!pea;")
	public Class6_Sub5 method3536(@OriginalArg(1) long arg0) {
		@Pc(18) Class6_Sub5 local18 = (Class6_Sub5) this.aClass234_28.method5464(arg0);
		if (local18 != null) {
			this.aClass256_2.method5906(local18);
		}
		return local18;
	}
}
