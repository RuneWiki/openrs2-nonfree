import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class302 {

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!lha;")
	private Class8_Sub5 aClass8_Sub5_53;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!lha;")
	public final Class8_Sub5 aClass8_Sub5_52 = new Class8_Sub5();

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class302() {
		this.aClass8_Sub5_52.aClass8_Sub5_66 = this.aClass8_Sub5_52;
		this.aClass8_Sub5_52.aClass8_Sub5_67 = this.aClass8_Sub5_52;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public void method7322() {
		while (true) {
			@Pc(5) Class8_Sub5 local5 = this.aClass8_Sub5_52.aClass8_Sub5_66;
			if (this.aClass8_Sub5_52 == local5) {
				this.aClass8_Sub5_53 = null;
				return;
			}
			local5.method8381();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!lha;")
	public Class8_Sub5 method7326() {
		@Pc(10) Class8_Sub5 local10 = this.aClass8_Sub5_53;
		if (this.aClass8_Sub5_52 == local10) {
			this.aClass8_Sub5_53 = null;
			return null;
		} else {
			this.aClass8_Sub5_53 = local10.aClass8_Sub5_66;
			return local10;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Lclient!lha;")
	public Class8_Sub5 method7327() {
		@Pc(12) Class8_Sub5 local12 = this.aClass8_Sub5_52.aClass8_Sub5_66;
		if (this.aClass8_Sub5_52 == local12) {
			this.aClass8_Sub5_53 = null;
			return null;
		} else {
			this.aClass8_Sub5_53 = local12.aClass8_Sub5_66;
			return local12;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!lha;)V")
	public void method7328(@OriginalArg(1) Class8_Sub5 arg0) {
		if (arg0.aClass8_Sub5_67 != null) {
			arg0.method8381();
		}
		arg0.aClass8_Sub5_66 = this.aClass8_Sub5_52;
		arg0.aClass8_Sub5_67 = this.aClass8_Sub5_52.aClass8_Sub5_67;
		arg0.aClass8_Sub5_67.aClass8_Sub5_66 = arg0;
		arg0.aClass8_Sub5_66.aClass8_Sub5_67 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)I")
	public int method7329() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class8_Sub5 local16 = this.aClass8_Sub5_52.aClass8_Sub5_66; local16 != this.aClass8_Sub5_52; local16 = local16.aClass8_Sub5_66) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lclient!lha;")
	public Class8_Sub5 method7330() {
		@Pc(13) Class8_Sub5 local13 = this.aClass8_Sub5_52.aClass8_Sub5_66;
		if (this.aClass8_Sub5_52 == local13) {
			return null;
		} else {
			local13.method8381();
			return local13;
		}
	}
}
