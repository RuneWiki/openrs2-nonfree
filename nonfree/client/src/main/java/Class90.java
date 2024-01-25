import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class90 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!ut;")
	private Class1_Sub2 aClass1_Sub2_19 = new Class1_Sub2();

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!cs;")
	private final Class42 aClass42_3 = new Class42();

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private final int anInt2239;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	private int anInt2238;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!bj;")
	private final Class27 aClass27_17;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V")
	public Class90(@OriginalArg(0) int arg0) {
		this.anInt2239 = arg0;
		this.anInt2238 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass27_17 = new Class27(local19);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JI)Lclient!ut;")
	public Class1_Sub2 method1862(@OriginalArg(0) long arg0) {
		@Pc(15) Class1_Sub2 local15 = (Class1_Sub2) this.aClass27_17.method553(arg0);
		if (local15 != null) {
			this.aClass42_3.method1068(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public void method1864() {
		this.aClass42_3.method1066();
		this.aClass27_17.method566();
		this.aClass1_Sub2_19 = new Class1_Sub2();
		this.anInt2238 = this.anInt2239;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(JILclient!ut;)V")
	public void method1865(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (this.anInt2238 == 0) {
			@Pc(21) Class1_Sub2 local21 = this.aClass42_3.method1067();
			local21.method6071();
			local21.method5883();
			if (this.aClass1_Sub2_19 == local21) {
				local21 = this.aClass42_3.method1067();
				local21.method6071();
				local21.method5883();
			}
		} else {
			this.anInt2238--;
		}
		this.aClass27_17.method564(arg0, arg1);
		this.aClass42_3.method1068(arg1);
	}
}
