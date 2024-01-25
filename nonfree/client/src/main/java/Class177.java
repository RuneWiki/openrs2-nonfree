import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class177 {

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!qt;")
	private Class2_Sub4 aClass2_Sub4_8;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!qt;")
	public final Class2_Sub4 aClass2_Sub4_7 = new Class2_Sub4();

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class177() {
		this.aClass2_Sub4_7.aClass2_Sub4_10 = this.aClass2_Sub4_7;
		this.aClass2_Sub4_7.aClass2_Sub4_9 = this.aClass2_Sub4_7;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	public int method4990() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class2_Sub4 local16 = this.aClass2_Sub4_7.aClass2_Sub4_10;
		while (this.aClass2_Sub4_7 != local16) {
			local16 = local16.aClass2_Sub4_10;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lclient!qt;")
	public Class2_Sub4 method4991() {
		@Pc(7) Class2_Sub4 local7 = this.aClass2_Sub4_7.aClass2_Sub4_10;
		if (local7 == this.aClass2_Sub4_7) {
			this.aClass2_Sub4_8 = null;
			return null;
		} else {
			this.aClass2_Sub4_8 = local7.aClass2_Sub4_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!qt;)V")
	public void method4994(@OriginalArg(1) Class2_Sub4 arg0) {
		if (arg0.aClass2_Sub4_9 != null) {
			arg0.method7028();
		}
		arg0.aClass2_Sub4_9 = this.aClass2_Sub4_7.aClass2_Sub4_9;
		arg0.aClass2_Sub4_10 = this.aClass2_Sub4_7;
		arg0.aClass2_Sub4_9.aClass2_Sub4_10 = arg0;
		arg0.aClass2_Sub4_10.aClass2_Sub4_9 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Lclient!qt;")
	public Class2_Sub4 method4995() {
		@Pc(6) Class2_Sub4 local6 = this.aClass2_Sub4_8;
		if (this.aClass2_Sub4_7 == local6) {
			this.aClass2_Sub4_8 = null;
			return null;
		} else {
			this.aClass2_Sub4_8 = local6.aClass2_Sub4_10;
			return local6;
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public void method4996() {
		while (true) {
			@Pc(5) Class2_Sub4 local5 = this.aClass2_Sub4_7.aClass2_Sub4_10;
			if (local5 == this.aClass2_Sub4_7) {
				this.aClass2_Sub4_8 = null;
				return;
			}
			local5.method7028();
		}
	}
}
