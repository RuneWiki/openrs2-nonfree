import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class333 {

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!qt;")
	private Class2_Sub6 aClass2_Sub6_10;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!qt;")
	public final Class2_Sub6 aClass2_Sub6_9 = new Class2_Sub6();

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class333() {
		this.aClass2_Sub6_9.aClass2_Sub6_7 = this.aClass2_Sub6_9;
		this.aClass2_Sub6_9.aClass2_Sub6_8 = this.aClass2_Sub6_9;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public void method7901() {
		while (true) {
			@Pc(14) Class2_Sub6 local14 = this.aClass2_Sub6_9.aClass2_Sub6_8;
			if (this.aClass2_Sub6_9 == local14) {
				this.aClass2_Sub6_10 = null;
				return;
			}
			local14.method5184();
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Lclient!qt;")
	public Class2_Sub6 method7902() {
		@Pc(12) Class2_Sub6 local12 = this.aClass2_Sub6_9.aClass2_Sub6_8;
		if (local12 == this.aClass2_Sub6_9) {
			this.aClass2_Sub6_10 = null;
			return null;
		} else {
			this.aClass2_Sub6_10 = local12.aClass2_Sub6_8;
			return local12;
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Lclient!qt;")
	public Class2_Sub6 method7903() {
		@Pc(12) Class2_Sub6 local12 = this.aClass2_Sub6_10;
		if (this.aClass2_Sub6_9 == local12) {
			this.aClass2_Sub6_10 = null;
			return null;
		} else {
			this.aClass2_Sub6_10 = local12.aClass2_Sub6_8;
			return local12;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!qt;)V")
	public void method7904(@OriginalArg(1) Class2_Sub6 arg0) {
		if (arg0.aClass2_Sub6_7 != null) {
			arg0.method5184();
		}
		arg0.aClass2_Sub6_7 = this.aClass2_Sub6_9.aClass2_Sub6_7;
		arg0.aClass2_Sub6_8 = this.aClass2_Sub6_9;
		arg0.aClass2_Sub6_7.aClass2_Sub6_8 = arg0;
		arg0.aClass2_Sub6_8.aClass2_Sub6_7 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
	public int method7905() {
		@Pc(15) int local15 = 0;
		@Pc(19) Class2_Sub6 local19 = this.aClass2_Sub6_9.aClass2_Sub6_8;
		while (this.aClass2_Sub6_9 != local19) {
			local19 = local19.aClass2_Sub6_8;
			local15++;
		}
		return local15;
	}
}
