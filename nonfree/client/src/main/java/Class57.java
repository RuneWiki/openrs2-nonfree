import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class57 {

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Lclient!al;")
	private Class14_Sub3 aClass14_Sub3_17 = new Class14_Sub3();

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Lclient!dha;")
	private final Class73 aClass73_2 = new Class73();

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	private int anInt1647;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	private final int anInt1648;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Lclient!jo;")
	private final Class187 aClass187_12;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(I)V")
	public Class57(@OriginalArg(0) int arg0) {
		this.anInt1647 = arg0;
		this.anInt1648 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass187_12 = new Class187(local19);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(JB)V")
	public void method1420(@OriginalArg(0) long arg0) {
		@Pc(10) Class14_Sub3 local10 = (Class14_Sub3) this.aClass187_12.method4078(arg0);
		if (local10 != null) {
			local10.method9315();
			local10.method9253();
			this.anInt1647++;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!al;JZ)V")
	public void method1422(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt1647 == 0) {
			@Pc(25) Class14_Sub3 local25 = this.aClass73_2.method1823();
			local25.method9315();
			local25.method9253();
			if (local25 == this.aClass14_Sub3_17) {
				local25 = this.aClass73_2.method1823();
				local25.method9315();
				local25.method9253();
			}
		} else {
			this.anInt1647--;
		}
		this.aClass187_12.method4077(arg1, arg0);
		this.aClass73_2.method1816(arg0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public void method1423() {
		this.aClass73_2.method1819();
		this.aClass187_12.method4076();
		this.aClass14_Sub3_17 = new Class14_Sub3();
		this.anInt1647 = this.anInt1648;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IJ)Lclient!al;")
	public Class14_Sub3 method1424(@OriginalArg(1) long arg0) {
		@Pc(14) Class14_Sub3 local14 = (Class14_Sub3) this.aClass187_12.method4078(arg0);
		if (local14 != null) {
			this.aClass73_2.method1816(local14);
		}
		return local14;
	}
}
