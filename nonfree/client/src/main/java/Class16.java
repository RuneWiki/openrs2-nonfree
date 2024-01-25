import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class16 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!im;")
	public Class120 aClass120_3;

	@OriginalMember(owner = "client!at", name = "f", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "I")
	public int anInt356;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!ya;IZ)Lclient!l;")
	public Class17 method321(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(29) long local29 = (long) (arg1.anInt5543 << 19 | (arg2 ? 262144 : 0) | arg0 << 16 | this.anInt355);
		@Pc(37) Class17 local37 = (Class17) this.aClass120_3.aClass171_25.method3941(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass120_3.aClass160_26.method3716(this.anInt355)) {
			@Pc(59) Class85 local59 = Static459.method2069(this.aClass120_3.aClass160_26, this.anInt355, 0);
			if (local59 != null) {
				local59.anInt2648 = local59.anInt2650 = local59.anInt2651 = local59.anInt2647 = 0;
				if (arg2) {
					local59.method2075();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method2062();
				}
			}
			local37 = arg1.method4435(local59);
			if (local37 != null) {
				this.aClass120_3.aClass171_25.method3940(local29, local37);
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!si;I)V")
	public void method322(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5495();
			if (local11 == 0) {
				return;
			}
			this.method323(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!si;BI)V")
	private void method323(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt355 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt356 = arg0.method5485();
		} else if (arg1 == 3) {
			this.aBoolean13 = true;
			return;
		} else if (arg1 == 4) {
			this.anInt355 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)Z")
	public boolean method325() {
		return this.aClass120_3.aClass160_26.method3716(this.anInt355);
	}
}
