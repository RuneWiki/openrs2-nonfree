import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class358 {

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "[Lclient!hv;")
	public static final Class156[] aClass156Array1 = new Class156[5];

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Lclient!kh;")
	private Class5_Sub3 aClass5_Sub3_61;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "Lclient!kh;")
	public final Class5_Sub3 aClass5_Sub3_60 = new Class5_Sub3();

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass156Array1.length; local6++) {
			aClass156Array1[local6] = new Class156();
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class358() {
		this.aClass5_Sub3_60.aClass5_Sub3_66 = this.aClass5_Sub3_60;
		this.aClass5_Sub3_60.aClass5_Sub3_67 = this.aClass5_Sub3_60;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Lclient!kh;")
	public Class5_Sub3 method8322() {
		@Pc(11) Class5_Sub3 local11 = this.aClass5_Sub3_60.aClass5_Sub3_66;
		if (local11 == this.aClass5_Sub3_60) {
			this.aClass5_Sub3_61 = null;
			return null;
		} else {
			this.aClass5_Sub3_61 = local11.aClass5_Sub3_66;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)I")
	public int method8324() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class5_Sub3 local18 = this.aClass5_Sub3_60.aClass5_Sub3_66; local18 != this.aClass5_Sub3_60; local18 = local18.aClass5_Sub3_66) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Lclient!kh;")
	public Class5_Sub3 method8326() {
		@Pc(7) Class5_Sub3 local7 = this.aClass5_Sub3_60.aClass5_Sub3_66;
		if (this.aClass5_Sub3_60 == local7) {
			return null;
		} else {
			local7.method8687();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)V")
	public void method8327() {
		while (true) {
			@Pc(3) Class5_Sub3 local3 = this.aClass5_Sub3_60.aClass5_Sub3_66;
			if (local3 == this.aClass5_Sub3_60) {
				this.aClass5_Sub3_61 = null;
				return;
			}
			local3.method8687();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)Lclient!kh;")
	public Class5_Sub3 method8328() {
		@Pc(6) Class5_Sub3 local6 = this.aClass5_Sub3_61;
		if (local6 == this.aClass5_Sub3_60) {
			this.aClass5_Sub3_61 = null;
			return null;
		} else {
			this.aClass5_Sub3_61 = local6.aClass5_Sub3_66;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!kh;Z)V")
	public void method8329(@OriginalArg(0) Class5_Sub3 arg0) {
		if (arg0.aClass5_Sub3_67 != null) {
			arg0.method8687();
		}
		arg0.aClass5_Sub3_66 = this.aClass5_Sub3_60;
		arg0.aClass5_Sub3_67 = this.aClass5_Sub3_60.aClass5_Sub3_67;
		arg0.aClass5_Sub3_67.aClass5_Sub3_66 = arg0;
		arg0.aClass5_Sub3_66.aClass5_Sub3_67 = arg0;
	}
}
