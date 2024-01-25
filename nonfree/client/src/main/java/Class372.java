import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class372 {

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "Lclient!lga;")
	private Class19_Sub4 aClass19_Sub4_10;

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "Lclient!lga;")
	public final Class19_Sub4 aClass19_Sub4_9 = new Class19_Sub4();

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "()V")
	public Class372() {
		this.aClass19_Sub4_9.aClass19_Sub4_7 = this.aClass19_Sub4_9;
		this.aClass19_Sub4_9.aClass19_Sub4_8 = this.aClass19_Sub4_9;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(B)Lclient!lga;")
	public Class19_Sub4 method8736() {
		@Pc(6) Class19_Sub4 local6 = this.aClass19_Sub4_10;
		if (local6 == this.aClass19_Sub4_9) {
			this.aClass19_Sub4_10 = null;
			return null;
		} else {
			this.aClass19_Sub4_10 = local6.aClass19_Sub4_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)Lclient!lga;")
	public Class19_Sub4 method8737() {
		@Pc(7) Class19_Sub4 local7 = this.aClass19_Sub4_9.aClass19_Sub4_7;
		if (this.aClass19_Sub4_9 == local7) {
			this.aClass19_Sub4_10 = null;
			return null;
		} else {
			this.aClass19_Sub4_10 = local7.aClass19_Sub4_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "(I)I")
	public int method8738() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class19_Sub4 local19 = this.aClass19_Sub4_9.aClass19_Sub4_7; local19 != this.aClass19_Sub4_9; local19 = local19.aClass19_Sub4_7) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(I)V")
	public void method8739() {
		while (true) {
			@Pc(14) Class19_Sub4 local14 = this.aClass19_Sub4_9.aClass19_Sub4_7;
			if (this.aClass19_Sub4_9 == local14) {
				this.aClass19_Sub4_10 = null;
				return;
			}
			local14.method7253();
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILclient!lga;)V")
	public void method8742(@OriginalArg(1) Class19_Sub4 arg0) {
		if (arg0.aClass19_Sub4_8 != null) {
			arg0.method7253();
		}
		arg0.aClass19_Sub4_7 = this.aClass19_Sub4_9;
		arg0.aClass19_Sub4_8 = this.aClass19_Sub4_9.aClass19_Sub4_8;
		arg0.aClass19_Sub4_8.aClass19_Sub4_7 = arg0;
		arg0.aClass19_Sub4_7.aClass19_Sub4_8 = arg0;
	}
}
