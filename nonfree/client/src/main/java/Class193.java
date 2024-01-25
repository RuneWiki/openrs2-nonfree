import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class193 {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Lclient!dv;")
	private Class72_Sub1 aClass72_Sub1_8;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!dv;")
	public final Class72_Sub1 aClass72_Sub1_7 = new Class72_Sub1();

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class193() {
		this.aClass72_Sub1_7.aClass72_Sub1_10 = this.aClass72_Sub1_7;
		this.aClass72_Sub1_7.aClass72_Sub1_9 = this.aClass72_Sub1_7;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)I")
	public int method4755() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class72_Sub1 local17 = this.aClass72_Sub1_7.aClass72_Sub1_10;
		while (local17 != this.aClass72_Sub1_7) {
			local17 = local17.aClass72_Sub1_10;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lclient!dv;")
	public Class72_Sub1 method4757() {
		@Pc(10) Class72_Sub1 local10 = this.aClass72_Sub1_8;
		if (local10 == this.aClass72_Sub1_7) {
			this.aClass72_Sub1_8 = null;
			return null;
		} else {
			this.aClass72_Sub1_8 = local10.aClass72_Sub1_10;
			return local10;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLclient!dv;)V")
	public void method4758(@OriginalArg(1) Class72_Sub1 arg0) {
		if (arg0.aClass72_Sub1_9 != null) {
			arg0.method6723();
		}
		arg0.aClass72_Sub1_10 = this.aClass72_Sub1_7;
		arg0.aClass72_Sub1_9 = this.aClass72_Sub1_7.aClass72_Sub1_9;
		arg0.aClass72_Sub1_9.aClass72_Sub1_10 = arg0;
		arg0.aClass72_Sub1_10.aClass72_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)Lclient!dv;")
	public Class72_Sub1 method4759() {
		@Pc(7) Class72_Sub1 local7 = this.aClass72_Sub1_7.aClass72_Sub1_10;
		if (local7 == this.aClass72_Sub1_7) {
			this.aClass72_Sub1_8 = null;
			return null;
		} else {
			this.aClass72_Sub1_8 = local7.aClass72_Sub1_10;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	public void method4760() {
		while (true) {
			@Pc(9) Class72_Sub1 local9 = this.aClass72_Sub1_7.aClass72_Sub1_10;
			if (this.aClass72_Sub1_7 == local9) {
				this.aClass72_Sub1_8 = null;
				return;
			}
			local9.method6723();
		}
	}
}
