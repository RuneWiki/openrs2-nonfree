import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class362 {

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "Lclient!hs;")
	private Class9_Sub1 aClass9_Sub1_10;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Lclient!hs;")
	public final Class9_Sub1 aClass9_Sub1_9 = new Class9_Sub1();

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class362() {
		this.aClass9_Sub1_9.aClass9_Sub1_8 = this.aClass9_Sub1_9;
		this.aClass9_Sub1_9.aClass9_Sub1_7 = this.aClass9_Sub1_9;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Lclient!hs;")
	public Class9_Sub1 method8363() {
		@Pc(11) Class9_Sub1 local11 = this.aClass9_Sub1_10;
		if (this.aClass9_Sub1_9 == local11) {
			this.aClass9_Sub1_10 = null;
			return null;
		} else {
			this.aClass9_Sub1_10 = local11.aClass9_Sub1_7;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)I")
	public int method8364() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class9_Sub1 local16 = this.aClass9_Sub1_9.aClass9_Sub1_7; local16 != this.aClass9_Sub1_9; local16 = local16.aClass9_Sub1_7) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method8365() {
		while (true) {
			@Pc(5) Class9_Sub1 local5 = this.aClass9_Sub1_9.aClass9_Sub1_7;
			if (this.aClass9_Sub1_9 == local5) {
				this.aClass9_Sub1_10 = null;
				return;
			}
			local5.method4383();
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)Lclient!hs;")
	public Class9_Sub1 method8369() {
		@Pc(12) Class9_Sub1 local12 = this.aClass9_Sub1_9.aClass9_Sub1_7;
		if (local12 == this.aClass9_Sub1_9) {
			this.aClass9_Sub1_10 = null;
			return null;
		} else {
			this.aClass9_Sub1_10 = local12.aClass9_Sub1_7;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!hs;I)V")
	public void method8370(@OriginalArg(0) Class9_Sub1 arg0) {
		if (arg0.aClass9_Sub1_8 != null) {
			arg0.method4383();
		}
		arg0.aClass9_Sub1_7 = this.aClass9_Sub1_9;
		arg0.aClass9_Sub1_8 = this.aClass9_Sub1_9.aClass9_Sub1_8;
		arg0.aClass9_Sub1_8.aClass9_Sub1_7 = arg0;
		arg0.aClass9_Sub1_7.aClass9_Sub1_8 = arg0;
	}
}
