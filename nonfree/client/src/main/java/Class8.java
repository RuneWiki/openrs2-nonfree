import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class8 {

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Lclient!rf;")
	private final Class2_Sub1 aClass2_Sub1_9 = new Class2_Sub1();

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Lclient!tc;")
	private final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	private final int anInt258;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Lclient!jb;")
	private final Class40 aClass40_4;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
	public Class8(@OriginalArg(0) int arg0) {
		this.anInt258 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt257 = arg0;
		while (arg0 > local16 + local16) {
			local16 += local16;
		}
		this.aClass40_4 = new Class40(local16);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method171() {
		while (true) {
			@Pc(6) Class2_Sub1 local6 = this.aClass74_1.method1824();
			if (local6 == null) {
				this.anInt257 = this.anInt258;
				return;
			}
			local6.method2053();
			local6.method2057();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BJ)Lclient!rf;")
	public Class2_Sub1 method172(@OriginalArg(1) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass40_4.method851(arg0);
		if (local10 != null) {
			this.aClass74_1.method1827(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(JBLclient!rf;)V")
	public void method176(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		if (this.anInt257 == 0) {
			@Pc(19) Class2_Sub1 local19 = this.aClass74_1.method1824();
			local19.method2053();
			local19.method2057();
			if (this.aClass2_Sub1_9 == local19) {
				local19 = this.aClass74_1.method1824();
				local19.method2053();
				local19.method2057();
			}
		} else {
			this.anInt257--;
		}
		this.aClass40_4.method849(arg1, arg0);
		this.aClass74_1.method1827(arg1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(JI)V")
	public void method177(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass40_4.method851(arg0);
		if (local10 != null) {
			local10.method2053();
			local10.method2057();
			this.anInt257++;
		}
	}
}
