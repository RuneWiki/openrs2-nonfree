import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class30 {

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Lclient!tg;")
	private Class7_Sub1 aClass7_Sub1_18;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Lclient!tg;")
	private final Class7_Sub1 aClass7_Sub1_17 = new Class7_Sub1();

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class30() {
		this.aClass7_Sub1_17.aClass7_Sub1_62 = this.aClass7_Sub1_17;
		this.aClass7_Sub1_17.aClass7_Sub1_61 = this.aClass7_Sub1_17;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Lclient!tg;")
	public Class7_Sub1 method505() {
		@Pc(7) Class7_Sub1 local7 = this.aClass7_Sub1_17.aClass7_Sub1_61;
		if (this.aClass7_Sub1_17 == local7) {
			this.aClass7_Sub1_18 = null;
			return null;
		} else {
			this.aClass7_Sub1_18 = local7.aClass7_Sub1_61;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
	public int method506() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class7_Sub1 local9 = this.aClass7_Sub1_17.aClass7_Sub1_61;
		while (local9 != this.aClass7_Sub1_17) {
			local9 = local9.aClass7_Sub1_61;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Lclient!tg;")
	public Class7_Sub1 method508() {
		@Pc(6) Class7_Sub1 local6 = this.aClass7_Sub1_18;
		if (local6 == this.aClass7_Sub1_17) {
			this.aClass7_Sub1_18 = null;
			return null;
		} else {
			this.aClass7_Sub1_18 = local6.aClass7_Sub1_61;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public void method509() {
		while (true) {
			@Pc(13) Class7_Sub1 local13 = this.aClass7_Sub1_17.aClass7_Sub1_61;
			if (this.aClass7_Sub1_17 == local13) {
				this.aClass7_Sub1_18 = null;
				return;
			}
			local13.method5509();
		}
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Lclient!tg;")
	public Class7_Sub1 method514() {
		@Pc(12) Class7_Sub1 local12 = this.aClass7_Sub1_17.aClass7_Sub1_61;
		if (this.aClass7_Sub1_17 == local12) {
			return null;
		} else {
			local12.method5509();
			return local12;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!tg;)V")
	public void method515(@OriginalArg(1) Class7_Sub1 arg0) {
		if (arg0.aClass7_Sub1_62 != null) {
			arg0.method5509();
		}
		arg0.aClass7_Sub1_62 = this.aClass7_Sub1_17.aClass7_Sub1_62;
		arg0.aClass7_Sub1_61 = this.aClass7_Sub1_17;
		arg0.aClass7_Sub1_62.aClass7_Sub1_61 = arg0;
		arg0.aClass7_Sub1_61.aClass7_Sub1_62 = arg0;
	}
}
