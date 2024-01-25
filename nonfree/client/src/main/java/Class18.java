import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class18 {

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!p;")
	private final Class159 aClass159_1 = new Class159();

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
	private final int anInt839;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Lclient!tm;")
	private final Class197 aClass197_3;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
	public Class18(@OriginalArg(0) int arg0) {
		this.anInt839 = arg0;
		this.anInt833 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass197_3 = new Class197(local14);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	public void method567() {
		if (Static260.aClass112_3 == null) {
			return;
		}
		for (@Pc(15) Class1_Sub4_Sub13 local15 = (Class1_Sub4_Sub13) this.aClass159_1.method4261(); local15 != null; local15 = (Class1_Sub4_Sub13) this.aClass159_1.method4257()) {
			if (local15.method5355()) {
				if (local15.method5357() == null) {
					local15.method5628();
					local15.method5632();
					this.anInt833++;
				}
			} else if (++local15.aLong214 > (long) 5) {
				@Pc(41) Class1_Sub4_Sub13 local41 = Static260.aClass112_3.method4091(local15);
				this.aClass197_3.method5166(local41, local15.aLong213);
				Static58.method1503(local15, local41);
				local15.method5628();
				local15.method5632();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public void method568() {
		this.aClass159_1.method4255();
		this.aClass197_3.method5155();
		this.anInt833 = this.anInt839;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/Object;Lclient!uk;B)V")
	public void method569(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface7 arg1) {
		this.method573(arg1);
		if (this.anInt833 == 0) {
			@Pc(27) Class1_Sub4_Sub13 local27 = (Class1_Sub4_Sub13) this.aClass159_1.method4258();
			local27.method5628();
			local27.method5632();
		} else {
			this.anInt833--;
		}
		@Pc(39) Class1_Sub4_Sub13_Sub1 local39 = new Class1_Sub4_Sub13_Sub1(arg1, arg0);
		this.aClass197_3.method5166(local39, arg1.method3358());
		this.aClass159_1.method4262(local39);
		local39.aLong214 = 0L;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!uk;)Ljava/lang/Object;")
	public Object method570(@OriginalArg(1) Interface7 arg0) {
		@Pc(9) long local9 = arg0.method3358();
		for (@Pc(16) Class1_Sub4_Sub13 local16 = (Class1_Sub4_Sub13) this.aClass197_3.method5157(local9); local16 != null; local16 = (Class1_Sub4_Sub13) this.aClass197_3.method5160()) {
			if (local16.anInterface7_3.method3359(arg0)) {
				@Pc(36) Object local36 = local16.method5357();
				if (local36 != null) {
					if (local16.method5355()) {
						@Pc(72) Class1_Sub4_Sub13_Sub1 local72 = new Class1_Sub4_Sub13_Sub1(arg0, local36);
						this.aClass197_3.method5166(local72, local16.aLong213);
						this.aClass159_1.method4262(local72);
						local72.aLong214 = 0L;
						local16.method5628();
						local16.method5632();
					} else {
						this.aClass159_1.method4262(local16);
						local16.aLong214 = 0L;
					}
					return local36;
				}
				local16.method5628();
				local16.method5632();
				this.anInt833++;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
	public int method572() {
		return this.anInt833;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!uk;)V")
	private void method573(@OriginalArg(1) Interface7 arg0) {
		@Pc(17) long local17 = arg0.method3358();
		for (@Pc(24) Class1_Sub4_Sub13 local24 = (Class1_Sub4_Sub13) this.aClass197_3.method5157(local17); local24 != null; local24 = (Class1_Sub4_Sub13) this.aClass197_3.method5160()) {
			if (local24.anInterface7_3.method3359(arg0)) {
				local24.method5628();
				local24.method5632();
				this.anInt833++;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)I")
	public int method575() {
		return this.anInt839;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
	public void method576() {
		for (@Pc(11) Class1_Sub4_Sub13 local11 = (Class1_Sub4_Sub13) this.aClass159_1.method4261(); local11 != null; local11 = (Class1_Sub4_Sub13) this.aClass159_1.method4257()) {
			if (local11.method5355()) {
				local11.method5628();
				local11.method5632();
				this.anInt833++;
			}
		}
	}
}
