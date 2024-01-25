import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class111 {

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
	public int anInt2677;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Lclient!pg;")
	public Class245 aClass245_2;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
	public int anInt2680;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
	public boolean aBoolean181 = false;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
	public boolean method2215() {
		return this.aClass245_2.aClass251_112.method5859(this.anInt2677);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZLclient!oa;I)Lclient!xa;")
	public Class4 method2216(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (arg1.anInt8715 << 19 | (arg0 ? 262144 : 0) | this.anInt2677 | arg2 << 16);
		@Pc(38) Class4 local38 = (Class4) this.aClass245_2.aClass332_159.method7502(local24);
		if (local38 != null) {
			return local38;
		} else if (this.aClass245_2.aClass251_112.method5859(this.anInt2677)) {
			@Pc(60) Class196 local60 = Static589.method4745(this.aClass245_2.aClass251_112, this.anInt2677, 0);
			if (local60 != null) {
				local60.anInt5513 = local60.anInt5514 = local60.anInt5518 = local60.anInt5515 = 0;
				if (arg0) {
					local60.method4746();
				}
				for (@Pc(80) int local80 = 0; local80 < arg2; local80++) {
					local60.method4750();
				}
			}
			local38 = arg1.method7157(local60);
			if (local38 != null) {
				this.aClass245_2.aClass332_159.method7498(local24, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!dga;)V")
	private void method2217(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt2677 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt2680 = arg1.method5988();
			return;
		} else if (arg0 == 3) {
			this.aBoolean181 = true;
			return;
		} else if (arg0 == 4) {
			this.anInt2677 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLclient!dga;)V")
	public void method2218(@OriginalArg(1) Class6_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6041();
			if (local5 == 0) {
				return;
			}
			this.method2217(local5, arg0);
		}
	}
}
