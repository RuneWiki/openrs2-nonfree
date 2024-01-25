import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class63 {

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!je;")
	private final Class170 aClass170_2 = new Class170();

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	private int anInt1673;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	private final int anInt1671;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!faa;")
	private final Class91 aClass91_4;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class63(@OriginalArg(0) int arg0) {
		this.anInt1673 = arg0;
		this.anInt1671 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass91_4 = new Class91(local16);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!up;I)V")
	private void method1402(@OriginalArg(0) Class1_Sub8_Sub2 arg0) {
		if (arg0 != null) {
			arg0.method7908();
			arg0.method7712();
			this.anInt1673 += arg0.anInt7656;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)I")
	public int method1404() {
		return this.anInt1671;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/Object;BLclient!oga;)V")
	public void method1405(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface18 arg1) {
		this.method1413(arg1, arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!oga;)V")
	private void method1406(@OriginalArg(1) Interface18 arg0) {
		@Pc(13) long local13 = arg0.method6226();
		for (@Pc(20) Class1_Sub8_Sub2 local20 = (Class1_Sub8_Sub2) this.aClass91_4.method2271(local13); local20 != null; local20 = (Class1_Sub8_Sub2) this.aClass91_4.method2277()) {
			if (local20.anInterface18_3.method6227(arg0)) {
				this.method1402(local20);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
	public void method1407() {
		for (@Pc(12) Class1_Sub8_Sub2 local12 = (Class1_Sub8_Sub2) this.aClass170_2.method3553(); local12 != null; local12 = (Class1_Sub8_Sub2) this.aClass170_2.method3544()) {
			if (local12.method6118()) {
				local12.method7908();
				local12.method7712();
				this.anInt1673 += local12.anInt7656;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!oga;B)Ljava/lang/Object;")
	public Object method1408(@OriginalArg(0) Interface18 arg0) {
		@Pc(9) long local9 = arg0.method6226();
		for (@Pc(24) Class1_Sub8_Sub2 local24 = (Class1_Sub8_Sub2) this.aClass91_4.method2271(local9); local24 != null; local24 = (Class1_Sub8_Sub2) this.aClass91_4.method2277()) {
			if (local24.anInterface18_3.method6227(arg0)) {
				@Pc(36) Object local36 = local24.method6115();
				if (local36 != null) {
					if (local24.method6118()) {
						@Pc(65) Class1_Sub8_Sub2_Sub1 local65 = new Class1_Sub8_Sub2_Sub1(arg0, local36, local24.anInt7656);
						this.aClass91_4.method2269(local24.aLong268, local65);
						this.aClass170_2.method3550(local65);
						local65.aLong263 = 0L;
						local24.method7908();
						local24.method7712();
					} else {
						this.aClass170_2.method3550(local24);
						local24.aLong263 = 0L;
					}
					return local36;
				}
				local24.method7908();
				local24.method7712();
				this.anInt1673 += local24.anInt7656;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	public int method1411() {
		return this.anInt1673;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!oga;Ljava/lang/Object;II)V")
	private void method1413(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt1671 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method1406(arg0);
		this.anInt1673--;
		while (this.anInt1673 < 0) {
			@Pc(36) Class1_Sub8_Sub2 local36 = (Class1_Sub8_Sub2) this.aClass170_2.method3543();
			this.method1402(local36);
		}
		@Pc(53) Class1_Sub8_Sub2_Sub1 local53 = new Class1_Sub8_Sub2_Sub1(arg0, arg1, 1);
		this.aClass91_4.method2269(arg0.method6226(), local53);
		this.aClass170_2.method3550(local53);
		local53.aLong263 = 0L;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
	public void method1414() {
		if (Static447.aClass293_1 == null) {
			return;
		}
		for (@Pc(19) Class1_Sub8_Sub2 local19 = (Class1_Sub8_Sub2) this.aClass170_2.method3553(); local19 != null; local19 = (Class1_Sub8_Sub2) this.aClass170_2.method3544()) {
			if (local19.method6118()) {
				if (local19.method6115() == null) {
					local19.method7908();
					local19.method7712();
					this.anInt1673 += local19.anInt7656;
				}
			} else if ((long) 5 < ++local19.aLong263) {
				@Pc(64) Class1_Sub8_Sub2 local64 = Static447.aClass293_1.method6996(local19);
				this.aClass91_4.method2269(local19.aLong268, local64);
				Static336.method5002(local19, local64);
				local19.method7908();
				local19.method7712();
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
	public void method1415() {
		this.aClass170_2.method3546();
		this.aClass91_4.method2275();
		this.anInt1673 = this.anInt1671;
	}
}
