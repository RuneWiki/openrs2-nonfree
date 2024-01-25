import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class281 {

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
	public int anInt7676;

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
	public int anInt7677;

	@OriginalMember(owner = "client!raa", name = "j", descriptor = "Lclient!pf;")
	public Class257 aClass257_3;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "Z")
	public boolean aBoolean592 = false;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)Z")
	public boolean method6110() {
		return this.aClass257_3.aClass270_79.method5694(this.anInt7676);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!mo;I)V")
	private void method6113(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7676 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt7677 = arg0.method5797();
		} else if (arg1 == 3) {
			this.aBoolean592 = true;
		} else if (arg1 == 4) {
			this.anInt7676 = -1;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIZLclient!r;)Lclient!f;")
	public Class22 method6114(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class134 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt8508 << 19 | (arg1 ? 262144 : 0) | this.anInt7676 | arg0 << 16);
		@Pc(34) Class22 local34 = (Class22) this.aClass257_3.aClass222_44.method4430(local24);
		if (local34 != null) {
			return local34;
		} else if (this.aClass257_3.aClass270_79.method5694(this.anInt7676)) {
			@Pc(61) Class102 local61 = Static601.method2070(this.aClass257_3.aClass270_79, this.anInt7676, 0);
			if (local61 != null) {
				local61.anInt2621 = local61.anInt2622 = local61.anInt2623 = local61.anInt2625 = 0;
				if (arg1) {
					local61.method2078();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local61.method2080();
				}
			}
			local34 = arg2.method6896(local61, true);
			if (local34 != null) {
				this.aClass257_3.aClass222_44.method4434(local34, local24);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!mo;)V")
	public void method6115(@OriginalArg(1) Class1_Sub35 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5750();
			if (local17 == 0) {
				return;
			}
			this.method6113(arg0, local17);
		}
	}
}
