import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class208 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public int anInt6535;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public int anInt6540;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!ji;")
	public Class123 aClass123_2;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "Z")
	public boolean aBoolean454 = false;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!bt;IB)V")
	private void method5142(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6540 = arg0.method6004();
		} else if (arg1 == 2) {
			this.anInt6535 = arg0.method6020();
		} else if (arg1 == 3) {
			this.aBoolean454 = true;
		} else if (arg1 == 4) {
			this.anInt6540 = -1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!bt;)V")
	public void method5143(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method5142(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIZLclient!qa;)Lclient!f;")
	public Class22 method5144(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(22) long local22 = (long) (arg0 << 16 | this.anInt6540 | (arg1 ? 262144 : 0) | arg2.anInt3233 << 19);
		@Pc(38) Class22 local38 = (Class22) this.aClass123_2.aClass5_35.method104(local22);
		if (local38 != null) {
			return local38;
		} else if (this.aClass123_2.aClass56_48.method1365(this.anInt6540)) {
			@Pc(60) Class166 local60 = Static460.method3975(this.aClass123_2.aClass56_48, this.anInt6540, 0);
			if (local60 != null) {
				local60.anInt4972 = local60.anInt4971 = local60.anInt4974 = local60.anInt4970 = 0;
				if (arg1) {
					local60.method3979();
				}
				for (@Pc(80) int local80 = 0; local80 < arg0; local80++) {
					local60.method3989();
				}
			}
			local38 = arg2.method2590(local60);
			if (local38 != null) {
				this.aClass123_2.aClass5_35.method114(local22, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z")
	public boolean method5145() {
		return this.aClass123_2.aClass56_48.method1365(this.anInt6540);
	}
}
