import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class379 {

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!ig;")
	private Class6_Sub2 aClass6_Sub2_67 = new Class6_Sub2();

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!dp;")
	private final Class82 aClass82_13 = new Class82();

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
	private int anInt10047;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
	private final int anInt10046;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "Lclient!dfa;")
	private final Class74 aClass74_73;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V")
	public Class379(@OriginalArg(0) int arg0) {
		this.anInt10047 = arg0;
		this.anInt10046 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass74_73 = new Class74(local19);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZJ)Lclient!ig;")
	public Class6_Sub2 method8729(@OriginalArg(1) long arg0) {
		@Pc(20) Class6_Sub2 local20 = (Class6_Sub2) this.aClass74_73.method1401(arg0);
		if (local20 != null) {
			this.aClass82_13.method2076(local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public void method8730() {
		this.aClass82_13.method2075();
		this.aClass74_73.method1398();
		this.aClass6_Sub2_67 = new Class6_Sub2();
		this.anInt10047 = this.anInt10046;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(ZJ)V")
	public void method8731(@OriginalArg(1) long arg0) {
		@Pc(10) Class6_Sub2 local10 = (Class6_Sub2) this.aClass74_73.method1401(arg0);
		if (local10 != null) {
			local10.method9051();
			local10.method8464();
			this.anInt10047++;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(JILclient!ig;)V")
	public void method8733(@OriginalArg(0) long arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (this.anInt10047 == 0) {
			@Pc(10) Class6_Sub2 local10 = this.aClass82_13.method2077();
			local10.method9051();
			local10.method8464();
			if (this.aClass6_Sub2_67 == local10) {
				local10 = this.aClass82_13.method2077();
				local10.method9051();
				local10.method8464();
			}
		} else {
			this.anInt10047--;
		}
		this.aClass74_73.method1399(arg1, arg0);
		this.aClass82_13.method2076(arg1);
	}
}
