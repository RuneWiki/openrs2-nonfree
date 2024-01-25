import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public int anInt49;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Z")
	public boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!vq;ZB)Lclient!vj;")
	public Class58 method45(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(30) long local30 = (long) (arg1.anInt3056 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt50);
		@Pc(36) Class58 local36 = (Class58) Static105.aClass198_90.method5210(local30);
		if (local36 != null) {
			return local36;
		} else if (Static15.aClass193_12.method5064(this.anInt50)) {
			@Pc(54) Class110 local54 = Static362.method3098(Static15.aClass193_12, this.anInt50, 0);
			if (local54 != null) {
				local54.anInt3407 = local54.anInt3408 = local54.anInt3410 = local54.anInt3406 = 0;
				if (arg2) {
					local54.method3092();
				}
				for (@Pc(74) int local74 = 0; local74 < arg0; local74++) {
					local54.method3094();
				}
			}
			local36 = arg1.method2677(local54);
			if (local36 != null) {
				Static105.aClass198_90.method5201(local36, local30);
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Z")
	public boolean method46() {
		return Static15.aClass193_12.method5064(this.anInt50);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lf;IBI)V")
	private void method48(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt50 = arg0.method3401();
		} else if (arg2 == 2) {
			this.anInt49 = arg0.method3442();
		} else if (arg2 == 3) {
			this.aBoolean6 = true;
		} else if (arg2 == 4) {
			this.anInt50 = -1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lf;IB)V")
	public void method49(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method3440();
			if (local17 == 0) {
				return;
			}
			this.method48(arg0, arg1, local17);
		}
	}
}
