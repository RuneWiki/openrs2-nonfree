import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class199 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public int anInt4767;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public int anInt4769;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!rf;")
	public Class206 aClass206_89;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
	public boolean aBoolean356 = false;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!kk;IB)V")
	private void method4207(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4767 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt4769 = arg0.method5356();
		} else if (arg1 == 3) {
			this.aBoolean356 = true;
		} else if (arg1 == 4) {
			this.anInt4767 = -1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!vc;ZIB)Lclient!rn;")
	public Class18 method4208(@OriginalArg(0) Class63 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(30) long local30 = (long) ((arg1 ? 262144 : 0) | this.anInt4767 | arg2 << 16 | arg0.anInt2081 << 19);
		@Pc(38) Class18 local38 = (Class18) this.aClass206_89.aClass160_44.method3599(local30);
		if (local38 != null) {
			return local38;
		} else if (this.aClass206_89.aClass171_77.method3739(this.anInt4767)) {
			@Pc(60) Class86 local60 = Static397.method2330(this.aClass206_89.aClass171_77, this.anInt4767, 0);
			if (local60 != null) {
				local60.anInt2412 = local60.anInt2408 = local60.anInt2409 = local60.anInt2407 = 0;
				if (arg1) {
					local60.method2338();
				}
				for (@Pc(80) int local80 = 0; local80 < arg2; local80++) {
					local60.method2334();
				}
			}
			local38 = arg0.method2000(local60);
			if (local38 != null) {
				this.aClass206_89.aClass160_44.method3602(local30, local38);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!kk;)V")
	public void method4210(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5350();
			if (local9 == 0) {
				return;
			}
			this.method4207(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z")
	public boolean method4211() {
		return this.aClass206_89.aClass171_77.method3739(this.anInt4767);
	}
}
