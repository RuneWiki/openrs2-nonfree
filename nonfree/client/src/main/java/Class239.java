import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class239 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!fr;")
	private final Class91 aClass91_91 = new Class91(64);

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "Lclient!fr;")
	private final Class91 aClass91_92 = new Class91(100);

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!qs;")
	private final Class211 aClass211_81;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!wv;ILclient!qs;Lclient!qs;Lclient!qs;)V")
	public Class239(@OriginalArg(0) Class272 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2, @OriginalArg(3) Class211 arg3, @OriginalArg(4) Class211 arg4) {
		this.aClass211_81 = arg2;
		if (this.aClass211_81 != null) {
			@Pc(26) int local26 = this.aClass211_81.method4751() - 1;
			this.aClass211_81.method4772(local26);
		}
		Static129.method2124(arg3, arg4);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public void method5418() {
		@Pc(2) Class91 local2 = this.aClass91_91;
		synchronized (this.aClass91_91) {
			this.aClass91_91.method1998(5);
		}
		local2 = this.aClass91_92;
		synchronized (this.aClass91_92) {
			this.aClass91_92.method1998(5);
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)Lclient!sq;")
	public Class235 method5420(@OriginalArg(1) int arg0) {
		@Pc(6) Class91 local6 = this.aClass91_91;
		@Pc(16) Class235 local16;
		synchronized (this.aClass91_91) {
			local16 = (Class235) this.aClass91_91.method1988((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class211 local37 = this.aClass211_81;
		@Pc(52) byte[] local52;
		synchronized (this.aClass211_81) {
			local52 = this.aClass211_81.method4758(Static443.method6126(arg0), Static370.method5160(arg0));
		}
		local16 = new Class235();
		local16.aClass239_2 = this;
		local16.anInt6847 = arg0;
		if (local52 != null) {
			local16.method5210(new Class1_Sub3(local52));
		}
		local16.method5211();
		@Pc(83) Class91 local83 = this.aClass91_91;
		synchronized (this.aClass91_91) {
			this.aClass91_91.method1990(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public void method5421() {
		@Pc(6) Class91 local6 = this.aClass91_91;
		synchronized (this.aClass91_91) {
			this.aClass91_91.method1999();
		}
		local6 = this.aClass91_92;
		synchronized (this.aClass91_92) {
			this.aClass91_92.method1999();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public void method5422() {
		@Pc(6) Class91 local6 = this.aClass91_91;
		synchronized (this.aClass91_91) {
			this.aClass91_91.method1993();
		}
		local6 = this.aClass91_92;
		synchronized (this.aClass91_92) {
			this.aClass91_92.method1993();
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)Lclient!dl;")
	public Class1_Sub1_Sub8 method5423(@OriginalArg(0) int arg0) {
		@Pc(11) Class91 local11 = this.aClass91_92;
		@Pc(21) Class1_Sub1_Sub8 local21;
		synchronized (this.aClass91_92) {
			local21 = (Class1_Sub1_Sub8) this.aClass91_92.method1988((long) arg0);
			if (local21 == null) {
				local21 = new Class1_Sub1_Sub8(arg0);
				this.aClass91_92.method1990(local21, (long) arg0);
			}
		}
		synchronized (local21) {
			return local21.method1442() ? local21 : null;
		}
	}
}
