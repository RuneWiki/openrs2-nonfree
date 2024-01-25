import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class30 {

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "Lclient!lda;")
	private Class3_Sub6 aClass3_Sub6_7 = new Class3_Sub6();

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_1 = new Class258();

	@OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
	private int anInt1085;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
	private final int anInt1084;

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "Lclient!cja;")
	private final Class62 aClass62_2;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V")
	public Class30(@OriginalArg(0) int arg0) {
		this.anInt1085 = arg0;
		this.anInt1084 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass62_2 = new Class62(local19);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BJ)V")
	public void method1090(@OriginalArg(1) long arg0) {
		@Pc(10) Class3_Sub6 local10 = (Class3_Sub6) this.aClass62_2.method1682(arg0);
		if (local10 != null) {
			local10.method8770();
			local10.method8342();
			this.anInt1085++;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(JB)Lclient!lda;")
	public Class3_Sub6 method1092(@OriginalArg(0) long arg0) {
		@Pc(15) Class3_Sub6 local15 = (Class3_Sub6) this.aClass62_2.method1682(arg0);
		if (local15 != null) {
			this.aClass258_1.method5936(local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!lda;JB)V")
	public void method1094(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt1085 == 0) {
			@Pc(11) Class3_Sub6 local11 = this.aClass258_1.method5931();
			local11.method8770();
			local11.method8342();
			if (local11 == this.aClass3_Sub6_7) {
				local11 = this.aClass258_1.method5931();
				local11.method8770();
				local11.method8342();
			}
		} else {
			this.anInt1085--;
		}
		this.aClass62_2.method1686(arg1, arg0);
		this.aClass258_1.method5936(arg0);
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
	public void method1095() {
		this.aClass258_1.method5933();
		this.aClass62_2.method1683();
		this.aClass3_Sub6_7 = new Class3_Sub6();
		this.anInt1085 = this.anInt1084;
	}
}
