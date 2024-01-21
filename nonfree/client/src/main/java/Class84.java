import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class84 {

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!na;")
	private Class2 aClass2_202;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!na;")
	public final Class2 aClass2_201 = new Class2();

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class84() {
		this.aClass2_201.aClass2_210 = this.aClass2_201;
		this.aClass2_201.aClass2_209 = this.aClass2_201;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lclient!na;")
	public Class2 method2690() {
		@Pc(7) Class2 local7 = this.aClass2_201.aClass2_210;
		if (this.aClass2_201 == local7) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local7.aClass2_210;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lclient!na;")
	public Class2 method2692() {
		@Pc(11) Class2 local11 = this.aClass2_202;
		if (this.aClass2_201 == local11) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local11.aClass2_210;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!na;Lclient!na;)V")
	public void method2693(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_210 != null) {
			arg1.method2808();
		}
		arg1.aClass2_209 = arg0;
		arg1.aClass2_210 = arg0.aClass2_210;
		arg1.aClass2_210.aClass2_209 = arg1;
		arg1.aClass2_209.aClass2_210 = arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)Lclient!na;")
	public Class2 method2694() {
		@Pc(3) Class2 local3 = this.aClass2_201.aClass2_209;
		if (local3 == this.aClass2_201) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local3.aClass2_209;
			return local3;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	public void method2695() {
		while (true) {
			@Pc(14) Class2 local14 = this.aClass2_201.aClass2_209;
			if (local14 == this.aClass2_201) {
				return;
			}
			local14.method2808();
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Lclient!na;")
	public Class2 method2697() {
		@Pc(6) Class2 local6 = this.aClass2_202;
		if (this.aClass2_201 == local6) {
			this.aClass2_202 = null;
			return null;
		} else {
			this.aClass2_202 = local6.aClass2_209;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!na;Z)V")
	public void method2701(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method2808();
		}
		arg0.aClass2_210 = this.aClass2_201.aClass2_210;
		arg0.aClass2_209 = this.aClass2_201;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!na;)V")
	public void method2702(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_210 != null) {
			arg0.method2808();
		}
		arg0.aClass2_209 = this.aClass2_201.aClass2_209;
		arg0.aClass2_210 = this.aClass2_201;
		arg0.aClass2_210.aClass2_209 = arg0;
		arg0.aClass2_209.aClass2_210 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)Lclient!na;")
	public Class2 method2703() {
		@Pc(12) Class2 local12 = this.aClass2_201.aClass2_209;
		if (this.aClass2_201 == local12) {
			return null;
		} else {
			local12.method2808();
			return local12;
		}
	}
}
