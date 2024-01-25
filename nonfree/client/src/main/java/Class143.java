import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class143 {

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "Lclient!m;")
	private Class6_Sub2 aClass6_Sub2_37;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!m;")
	private final Class6_Sub2 aClass6_Sub2_36 = new Class6_Sub2();

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	public Class143() {
		this.aClass6_Sub2_36.aClass6_Sub2_61 = this.aClass6_Sub2_36;
		this.aClass6_Sub2_36.aClass6_Sub2_62 = this.aClass6_Sub2_36;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method3758() {
		while (true) {
			@Pc(14) Class6_Sub2 local14 = this.aClass6_Sub2_36.aClass6_Sub2_61;
			if (local14 == this.aClass6_Sub2_36) {
				this.aClass6_Sub2_37 = null;
				return;
			}
			local14.method5761();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Lclient!m;")
	public Class6_Sub2 method3759() {
		@Pc(12) Class6_Sub2 local12 = this.aClass6_Sub2_36.aClass6_Sub2_61;
		if (local12 == this.aClass6_Sub2_36) {
			return null;
		} else {
			local12.method5761();
			return local12;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I")
	public int method3760() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class6_Sub2 local16 = this.aClass6_Sub2_36.aClass6_Sub2_61;
		while (local16 != this.aClass6_Sub2_36) {
			local16 = local16.aClass6_Sub2_61;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)Lclient!m;")
	public Class6_Sub2 method3763() {
		@Pc(11) Class6_Sub2 local11 = this.aClass6_Sub2_37;
		if (local11 == this.aClass6_Sub2_36) {
			this.aClass6_Sub2_37 = null;
			return null;
		} else {
			this.aClass6_Sub2_37 = local11.aClass6_Sub2_61;
			return local11;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLclient!m;)V")
	public void method3765(@OriginalArg(1) Class6_Sub2 arg0) {
		if (arg0.aClass6_Sub2_62 != null) {
			arg0.method5761();
		}
		arg0.aClass6_Sub2_62 = this.aClass6_Sub2_36.aClass6_Sub2_62;
		arg0.aClass6_Sub2_61 = this.aClass6_Sub2_36;
		arg0.aClass6_Sub2_62.aClass6_Sub2_61 = arg0;
		arg0.aClass6_Sub2_61.aClass6_Sub2_62 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)Lclient!m;")
	public Class6_Sub2 method3766() {
		@Pc(13) Class6_Sub2 local13 = this.aClass6_Sub2_36.aClass6_Sub2_61;
		if (this.aClass6_Sub2_36 == local13) {
			this.aClass6_Sub2_37 = null;
			return null;
		} else {
			this.aClass6_Sub2_37 = local13.aClass6_Sub2_61;
			return local13;
		}
	}
}
