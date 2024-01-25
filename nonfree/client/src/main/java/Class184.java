import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class184 {

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public int anInt5587;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt5592;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!jg;I)V")
	private void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub4 arg2) {
		if (arg0 == 1) {
			this.anInt5592 = arg2.method2498();
		} else if (arg0 == 2) {
			this.anInt5587 = arg2.method2501();
		} else if (arg0 == 3) {
			this.aBoolean369 = true;
		} else if (arg0 == 4) {
			this.anInt5592 = -1;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIBLclient!e;)Lclient!gl;")
	public Class2 method4964(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(24) long local24 = (long) ((arg0 ? 262144 : 0) | this.anInt5592 | arg1 << 16 | arg2.anInt5722 << 19);
		@Pc(30) Class2 local30 = (Class2) Static167.aClass11_125.method209(local24);
		if (local30 != null) {
			return local30;
		} else if (Static237.aClass143_88.method3736(this.anInt5592)) {
			@Pc(53) Class207 local53 = Static368.method5811(Static237.aClass143_88, this.anInt5592, 0);
			if (local53 != null) {
				local53.anInt6506 = local53.anInt6507 = local53.anInt6511 = local53.anInt6510 = 0;
				if (arg0) {
					local53.method5812();
				}
				for (@Pc(73) int local73 = 0; local73 < arg1; local73++) {
					local53.method5803();
				}
			}
			local30 = arg2.method5157(local53);
			if (local30 != null) {
				Static167.aClass11_125.method219(local24, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!jg;I)V")
	public void method4967(@OriginalArg(1) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method2548();
			if (local14 == 0) {
				return;
			}
			this.method4963(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
	public boolean method4968() {
		return Static237.aClass143_88.method3736(this.anInt5592);
	}
}
