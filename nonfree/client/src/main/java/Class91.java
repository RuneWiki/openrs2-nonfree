import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class91 {

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!pm;")
	private Class41_Sub7 aClass41_Sub7_2;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Lclient!pm;")
	public final Class41_Sub7 aClass41_Sub7_1 = new Class41_Sub7();

	static {
		new Class242(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class91() {
		this.aClass41_Sub7_1.aClass41_Sub7_8 = this.aClass41_Sub7_1;
		this.aClass41_Sub7_1.aClass41_Sub7_7 = this.aClass41_Sub7_1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
	public int method1936() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class41_Sub7 local16 = this.aClass41_Sub7_1.aClass41_Sub7_8; local16 != this.aClass41_Sub7_1; local16 = local16.aClass41_Sub7_8) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!pm;)V")
	public void method1940(@OriginalArg(1) Class41_Sub7 arg0) {
		if (arg0.aClass41_Sub7_7 != null) {
			arg0.method5821();
		}
		arg0.aClass41_Sub7_8 = this.aClass41_Sub7_1;
		arg0.aClass41_Sub7_7 = this.aClass41_Sub7_1.aClass41_Sub7_7;
		arg0.aClass41_Sub7_7.aClass41_Sub7_8 = arg0;
		arg0.aClass41_Sub7_8.aClass41_Sub7_7 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Lclient!pm;")
	public Class41_Sub7 method1941() {
		@Pc(7) Class41_Sub7 local7 = this.aClass41_Sub7_1.aClass41_Sub7_8;
		if (local7 == this.aClass41_Sub7_1) {
			this.aClass41_Sub7_2 = null;
			return null;
		} else {
			this.aClass41_Sub7_2 = local7.aClass41_Sub7_8;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Lclient!pm;")
	public Class41_Sub7 method1942() {
		@Pc(14) Class41_Sub7 local14 = this.aClass41_Sub7_2;
		if (local14 == this.aClass41_Sub7_1) {
			this.aClass41_Sub7_2 = null;
			return null;
		} else {
			this.aClass41_Sub7_2 = local14.aClass41_Sub7_8;
			return local14;
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	public void method1943() {
		while (true) {
			@Pc(15) Class41_Sub7 local15 = this.aClass41_Sub7_1.aClass41_Sub7_8;
			if (local15 == this.aClass41_Sub7_1) {
				this.aClass41_Sub7_2 = null;
				return;
			}
			local15.method5821();
		}
	}
}
