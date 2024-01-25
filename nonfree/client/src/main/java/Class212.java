import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class212 {

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!sk;")
	private Class5_Sub1 aClass5_Sub1_58;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!sk;")
	private final Class5_Sub1 aClass5_Sub1_57 = new Class5_Sub1();

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class212() {
		this.aClass5_Sub1_57.aClass5_Sub1_61 = this.aClass5_Sub1_57;
		this.aClass5_Sub1_57.aClass5_Sub1_62 = this.aClass5_Sub1_57;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!sk;Z)V")
	public void method5936(@OriginalArg(0) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub1_61 != null) {
			arg0.method5970();
		}
		arg0.aClass5_Sub1_61 = this.aClass5_Sub1_57.aClass5_Sub1_61;
		arg0.aClass5_Sub1_62 = this.aClass5_Sub1_57;
		arg0.aClass5_Sub1_61.aClass5_Sub1_62 = arg0;
		arg0.aClass5_Sub1_62.aClass5_Sub1_61 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)Lclient!sk;")
	public Class5_Sub1 method5937() {
		@Pc(12) Class5_Sub1 local12 = this.aClass5_Sub1_57.aClass5_Sub1_62;
		if (local12 == this.aClass5_Sub1_57) {
			return null;
		} else {
			local12.method5970();
			return local12;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Lclient!sk;")
	public Class5_Sub1 method5939() {
		@Pc(11) Class5_Sub1 local11 = this.aClass5_Sub1_58;
		if (this.aClass5_Sub1_57 == local11) {
			this.aClass5_Sub1_58 = null;
			return null;
		} else {
			this.aClass5_Sub1_58 = local11.aClass5_Sub1_62;
			return local11;
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)I")
	public int method5940() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class5_Sub1 local16 = this.aClass5_Sub1_57.aClass5_Sub1_62;
		while (local16 != this.aClass5_Sub1_57) {
			local16 = local16.aClass5_Sub1_62;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public void method5942() {
		while (true) {
			@Pc(7) Class5_Sub1 local7 = this.aClass5_Sub1_57.aClass5_Sub1_62;
			if (local7 == this.aClass5_Sub1_57) {
				this.aClass5_Sub1_58 = null;
				return;
			}
			local7.method5970();
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Lclient!sk;")
	public Class5_Sub1 method5943() {
		@Pc(7) Class5_Sub1 local7 = this.aClass5_Sub1_57.aClass5_Sub1_62;
		if (local7 == this.aClass5_Sub1_57) {
			this.aClass5_Sub1_58 = null;
			return null;
		} else {
			this.aClass5_Sub1_58 = local7.aClass5_Sub1_62;
			return local7;
		}
	}
}
