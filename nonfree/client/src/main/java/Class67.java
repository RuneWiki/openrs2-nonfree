import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class67 {

	@OriginalMember(owner = "client!dca", name = "l", descriptor = "Lclient!pw;")
	private final Class256 aClass256_1 = new Class256();

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
	private int anInt1492;

	@OriginalMember(owner = "client!dca", name = "m", descriptor = "I")
	private final int anInt1502;

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "Lclient!oj;")
	private final Class234 aClass234_9;

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		this.anInt1492 = arg0;
		this.anInt1502 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass234_9 = new Class234(local16);
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!rd;I)V")
	private void method1375(@OriginalArg(0) Class6_Sub5_Sub5 arg0) {
		if (arg0 != null) {
			arg0.method7948();
			arg0.method7814();
			this.anInt1492 += arg0.anInt3924;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!wea;I)V")
	private void method1376(@OriginalArg(0) Interface23 arg0) {
		@Pc(17) long local17 = arg0.method4951();
		for (@Pc(24) Class6_Sub5_Sub5 local24 = (Class6_Sub5_Sub5) this.aClass234_9.method5464(local17); local24 != null; local24 = (Class6_Sub5_Sub5) this.aClass234_9.method5467()) {
			if (local24.anInterface23_3.method4950(arg0)) {
				this.method1375(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)V")
	public void method1377() {
		if (Static259.aClass284_1 == null) {
			return;
		}
		for (@Pc(9) Class6_Sub5_Sub5 local9 = (Class6_Sub5_Sub5) this.aClass256_1.method5902(); local9 != null; local9 = (Class6_Sub5_Sub5) this.aClass256_1.method5901()) {
			if (local9.method3391()) {
				if (local9.method3392() == null) {
					local9.method7948();
					local9.method7814();
					this.anInt1492 += local9.anInt3924;
				}
			} else if (++local9.aLong242 > (long) 5) {
				@Pc(52) Class6_Sub5_Sub5 local52 = Static259.aClass284_1.method6361(local9);
				this.aClass234_9.method5466(local9.aLong245, local52);
				Static449.method6332(local52, local9);
				local9.method7948();
				local9.method7814();
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
	public void method1378() {
		this.aClass256_1.method5907();
		this.aClass234_9.method5463();
		this.anInt1492 = this.anInt1502;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)I")
	public int method1379() {
		return this.anInt1492;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/Object;IILclient!wea;)V")
	private void method1380(@OriginalArg(0) Object arg0, @OriginalArg(3) Interface23 arg1) {
		if (this.anInt1502 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1376(arg1);
		this.anInt1492--;
		while (this.anInt1492 < 0) {
			@Pc(36) Class6_Sub5_Sub5 local36 = (Class6_Sub5_Sub5) this.aClass256_1.method5904();
			this.method1375(local36);
		}
		@Pc(50) Class6_Sub5_Sub5_Sub2 local50 = new Class6_Sub5_Sub5_Sub2(arg1, arg0, 1);
		this.aClass234_9.method5466(arg1.method4951(), local50);
		this.aClass256_1.method5906(local50);
		local50.aLong242 = 0L;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLclient!wea;)Ljava/lang/Object;")
	public Object method1381(@OriginalArg(1) Interface23 arg0) {
		@Pc(15) long local15 = arg0.method4951();
		for (@Pc(22) Class6_Sub5_Sub5 local22 = (Class6_Sub5_Sub5) this.aClass234_9.method5464(local15); local22 != null; local22 = (Class6_Sub5_Sub5) this.aClass234_9.method5467()) {
			if (local22.anInterface23_3.method4950(arg0)) {
				@Pc(34) Object local34 = local22.method3392();
				if (local34 != null) {
					if (local22.method3391()) {
						@Pc(73) Class6_Sub5_Sub5_Sub2 local73 = new Class6_Sub5_Sub5_Sub2(arg0, local34, local22.anInt3924);
						this.aClass234_9.method5466(local22.aLong245, local73);
						this.aClass256_1.method5906(local73);
						local73.aLong242 = 0L;
						local22.method7948();
						local22.method7814();
					} else {
						this.aClass256_1.method5906(local22);
						local22.aLong242 = 0L;
					}
					return local34;
				}
				local22.method7948();
				local22.method7814();
				this.anInt1492 += local22.anInt3924;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)V")
	public void method1382() {
		for (@Pc(5) Class6_Sub5_Sub5 local5 = (Class6_Sub5_Sub5) this.aClass256_1.method5902(); local5 != null; local5 = (Class6_Sub5_Sub5) this.aClass256_1.method5901()) {
			if (local5.method3391()) {
				local5.method7948();
				local5.method7814();
				this.anInt1492 += local5.anInt3924;
			}
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/Object;BLclient!wea;)V")
	public void method1383(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface23 arg1) {
		this.method1380(arg0, arg1);
	}

	@OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)I")
	public int method1384() {
		return this.anInt1502;
	}
}
