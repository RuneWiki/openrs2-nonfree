import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class154 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public int anInt4686;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public int anInt4688;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Z")
	public boolean aBoolean268 = false;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!fb;)V")
	public void method3994(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		while (true) {
			@Pc(19) int local19 = arg1.method3643();
			if (local19 == 0) {
				return;
			}
			this.method3996(local19, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Z")
	public boolean method3995() {
		return Static15.aClass100_10.method2289(this.anInt4686);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILclient!fb;)V")
	private void method3996(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4 arg2) {
		if (arg0 == 1) {
			this.anInt4686 = arg2.method3649();
		} else if (arg0 == 2) {
			this.anInt4688 = arg2.method3659();
		} else if (arg0 == 3) {
			this.aBoolean268 = true;
		} else if (arg0 == 4) {
			this.anInt4686 = -1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!tj;IIZ)Lclient!l;")
	public Class57 method3999(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(29) long local29 = (long) (arg0.anInt5595 << 19 | (arg2 ? 262144 : 0) | this.anInt4686 | arg1 << 16);
		@Pc(35) Class57 local35 = (Class57) Static15.aClass198_6.method5242(local29);
		if (local35 != null) {
			return local35;
		} else if (Static15.aClass100_10.method2289(this.anInt4686)) {
			@Pc(53) Class149 local53 = Static366.method3895(Static15.aClass100_10, this.anInt4686, 0);
			if (local53 != null) {
				local53.anInt4568 = local53.anInt4571 = local53.anInt4570 = local53.anInt4573 = 0;
				if (arg2) {
					local53.method3890();
				}
				for (@Pc(73) int local73 = 0; local73 < arg1; local73++) {
					local53.method3884();
				}
			}
			local35 = arg0.method4757(local53);
			if (local35 != null) {
				Static15.aClass198_6.method5231(local29, local35);
			}
			return local35;
		} else {
			return null;
		}
	}
}
