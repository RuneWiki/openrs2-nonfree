import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class382 {

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "Lclient!sa;")
	private Class41_Sub4 aClass41_Sub4_10;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "Lclient!sa;")
	public final Class41_Sub4 aClass41_Sub4_9 = new Class41_Sub4();

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class382() {
		this.aClass41_Sub4_9.aClass41_Sub4_8 = this.aClass41_Sub4_9;
		this.aClass41_Sub4_9.aClass41_Sub4_7 = this.aClass41_Sub4_9;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!sa;)V")
	public void method8468(@OriginalArg(1) Class41_Sub4 arg0) {
		if (arg0.aClass41_Sub4_8 != null) {
			arg0.method6500();
		}
		arg0.aClass41_Sub4_8 = this.aClass41_Sub4_9.aClass41_Sub4_8;
		arg0.aClass41_Sub4_7 = this.aClass41_Sub4_9;
		arg0.aClass41_Sub4_8.aClass41_Sub4_7 = arg0;
		arg0.aClass41_Sub4_7.aClass41_Sub4_8 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Lclient!sa;")
	public Class41_Sub4 method8469() {
		@Pc(6) Class41_Sub4 local6 = this.aClass41_Sub4_10;
		if (local6 == this.aClass41_Sub4_9) {
			this.aClass41_Sub4_10 = null;
			return null;
		} else {
			this.aClass41_Sub4_10 = local6.aClass41_Sub4_7;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V")
	public void method8471() {
		while (true) {
			@Pc(3) Class41_Sub4 local3 = this.aClass41_Sub4_9.aClass41_Sub4_7;
			if (local3 == this.aClass41_Sub4_9) {
				this.aClass41_Sub4_10 = null;
				return;
			}
			local3.method6500();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lclient!sa;")
	public Class41_Sub4 method8472() {
		@Pc(19) Class41_Sub4 local19 = this.aClass41_Sub4_9.aClass41_Sub4_7;
		if (this.aClass41_Sub4_9 == local19) {
			this.aClass41_Sub4_10 = null;
			return null;
		} else {
			this.aClass41_Sub4_10 = local19.aClass41_Sub4_7;
			return local19;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)I")
	public int method8473() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class41_Sub4 local16 = this.aClass41_Sub4_9.aClass41_Sub4_7;
		while (local16 != this.aClass41_Sub4_9) {
			local16 = local16.aClass41_Sub4_7;
			local12++;
		}
		return local12;
	}
}
