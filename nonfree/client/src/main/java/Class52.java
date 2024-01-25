import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class52 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ol;")
	private Class10_Sub1 aClass10_Sub1_9 = new Class10_Sub1();

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!ju;")
	private final Class136 aClass136_2 = new Class136();

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	private int anInt1465;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	private final int anInt1466;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!mn;")
	private final Class167 aClass167_8;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	public Class52(@OriginalArg(0) int arg0) {
		this.anInt1465 = arg0;
		this.anInt1466 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass167_8 = new Class167(local19);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(JILclient!ol;)V")
	public void method1347(@OriginalArg(0) long arg0, @OriginalArg(2) Class10_Sub1 arg1) {
		if (this.anInt1465 == 0) {
			@Pc(14) Class10_Sub1 local14 = this.aClass136_2.method3198();
			local14.method6033();
			local14.method5897();
			if (this.aClass10_Sub1_9 == local14) {
				local14 = this.aClass136_2.method3198();
				local14.method6033();
				local14.method5897();
			}
		} else {
			this.anInt1465--;
		}
		this.aClass167_8.method3705(arg1, arg0);
		this.aClass136_2.method3197(arg1);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public void method1348() {
		this.aClass136_2.method3204();
		this.aClass167_8.method3701();
		this.aClass10_Sub1_9 = new Class10_Sub1();
		this.anInt1465 = this.anInt1466;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(JB)Lclient!ol;")
	public Class10_Sub1 method1350(@OriginalArg(0) long arg0) {
		@Pc(15) Class10_Sub1 local15 = (Class10_Sub1) this.aClass167_8.method3709(arg0);
		if (local15 != null) {
			this.aClass136_2.method3197(local15);
		}
		return local15;
	}
}
