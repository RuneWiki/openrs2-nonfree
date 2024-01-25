import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class46 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!nh;")
	private Class13_Sub1 aClass13_Sub1_6;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!nh;")
	public final Class13_Sub1 aClass13_Sub1_5 = new Class13_Sub1();

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class46() {
		this.aClass13_Sub1_5.aClass13_Sub1_8 = this.aClass13_Sub1_5;
		this.aClass13_Sub1_5.aClass13_Sub1_7 = this.aClass13_Sub1_5;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	public int method984() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class13_Sub1 local16 = this.aClass13_Sub1_5.aClass13_Sub1_7; local16 != this.aClass13_Sub1_5; local16 = local16.aClass13_Sub1_7) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lclient!nh;")
	public Class13_Sub1 method985() {
		@Pc(11) Class13_Sub1 local11 = this.aClass13_Sub1_6;
		if (this.aClass13_Sub1_5 == local11) {
			this.aClass13_Sub1_6 = null;
			return null;
		} else {
			this.aClass13_Sub1_6 = local11.aClass13_Sub1_7;
			return local11;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lclient!nh;")
	public Class13_Sub1 method986() {
		@Pc(7) Class13_Sub1 local7 = this.aClass13_Sub1_5.aClass13_Sub1_7;
		if (local7 == this.aClass13_Sub1_5) {
			this.aClass13_Sub1_6 = null;
			return null;
		} else {
			this.aClass13_Sub1_6 = local7.aClass13_Sub1_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public void method987() {
		while (true) {
			@Pc(13) Class13_Sub1 local13 = this.aClass13_Sub1_5.aClass13_Sub1_7;
			if (this.aClass13_Sub1_5 == local13) {
				this.aClass13_Sub1_6 = null;
				return;
			}
			local13.method2724();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!nh;Z)V")
	public void method989(@OriginalArg(0) Class13_Sub1 arg0) {
		if (arg0.aClass13_Sub1_8 != null) {
			arg0.method2724();
		}
		arg0.aClass13_Sub1_7 = this.aClass13_Sub1_5;
		arg0.aClass13_Sub1_8 = this.aClass13_Sub1_5.aClass13_Sub1_8;
		arg0.aClass13_Sub1_8.aClass13_Sub1_7 = arg0;
		arg0.aClass13_Sub1_7.aClass13_Sub1_8 = arg0;
	}
}
