import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class246 {

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	public int anInt7561;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "Lclient!sha;")
	public Class304 aClass304_3;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	public int anInt7565;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Z")
	public boolean aBoolean507 = false;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!rg;BI)V")
	private void method6522(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7561 = arg0.method8571();
		} else if (arg1 == 2) {
			this.anInt7565 = arg0.method8606();
		} else if (arg1 == 3) {
			this.aBoolean507 = true;
		} else if (arg1 == 4) {
			this.anInt7561 = -1;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
	public boolean method6523() {
		return this.aClass304_3.aClass353_107.method8401(this.anInt7561);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ha;BIZ)Lclient!pga;")
	public Class32 method6524(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(30) long local30 = (long) (arg1 << 16 | this.anInt7561 | (arg2 ? 262144 : 0) | arg0.anInt10378 << 19);
		@Pc(38) Class32 local38 = (Class32) this.aClass304_3.aClass166_49.method4805(local30);
		if (local38 != null) {
			return local38;
		} else if (this.aClass304_3.aClass353_107.method8401(this.anInt7561)) {
			@Pc(60) Class98 local60 = Static651.method2404(this.aClass304_3.aClass353_107, this.anInt7561, 0);
			if (local60 != null) {
				local60.anInt2795 = local60.anInt2797 = local60.anInt2794 = local60.anInt2798 = 0;
				if (arg2) {
					local60.method2402();
				}
				for (@Pc(80) int local80 = 0; local80 < arg1; local80++) {
					local60.method2395();
				}
			}
			local38 = arg0.method8773(local60, true);
			if (local38 != null) {
				this.aClass304_3.aClass166_49.method4803(local38, local30);
			}
			return local38;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!rg;)V")
	public void method6526(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8604();
			if (local15 == 0) {
				return;
			}
			this.method6522(arg0, local15);
		}
	}
}
