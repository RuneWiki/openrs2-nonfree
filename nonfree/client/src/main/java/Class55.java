import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class55 {

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!ea;")
	private final Class2_Sub1 aClass2_Sub1_39 = new Class2_Sub1();

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "Lclient!p;")
	private final Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	private final int anInt2095;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!uf;")
	private final Class77 aClass77_8;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class55(@OriginalArg(0) int arg0) {
		this.anInt2095 = arg0;
		this.anInt2096 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass77_8 = new Class77(local19);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JI)Lclient!ea;")
	public Class2_Sub1 method1410(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass77_8.method2034(arg0);
		if (local10 != null) {
			this.aClass56_2.method1584(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JLclient!ea;B)V")
	public void method1411(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (this.anInt2096 == 0) {
			@Pc(11) Class2_Sub1 local11 = this.aClass56_2.method1583();
			local11.method2209();
			local11.method2211();
			if (local11 == this.aClass2_Sub1_39) {
				local11 = this.aClass56_2.method1583();
				local11.method2209();
				local11.method2211();
			}
		} else {
			this.anInt2096--;
		}
		this.aClass77_8.method2030(arg0, arg1);
		this.aClass56_2.method1584(arg1);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method1413() {
		while (true) {
			@Pc(10) Class2_Sub1 local10 = this.aClass56_2.method1583();
			if (local10 == null) {
				this.anInt2096 = this.anInt2095;
				return;
			}
			local10.method2209();
			local10.method2211();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZJ)V")
	public void method1416(@OriginalArg(1) long arg0) {
		@Pc(14) Class2_Sub1 local14 = (Class2_Sub1) this.aClass77_8.method2034(arg0);
		if (local14 != null) {
			local14.method2209();
			local14.method2211();
			this.anInt2096++;
		}
	}
}
