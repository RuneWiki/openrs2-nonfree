import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class185 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public int anInt5463;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public int anInt5464;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Z")
	public boolean aBoolean469 = false;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
	public boolean method4853() {
		return Static220.aClass165_66.method4486(this.anInt5464);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!eb;III)V")
	private void method4854(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5464 = arg0.method3115();
		} else if (arg1 == 2) {
			this.anInt5463 = arg0.method3137();
		} else if (arg1 == 3) {
			this.aBoolean469 = true;
		} else if (arg1 == 4) {
			this.anInt5464 = -1;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!aa;IZ)Lclient!lf;")
	public Class90 method4855(@OriginalArg(1) Class2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(24) long local24 = (long) ((arg2 ? 262144 : 0) | this.anInt5464 | arg1 << 16 | arg0.anInt3495 << 19);
		@Pc(30) Class90 local30 = (Class90) Static112.aClass140_103.method3816(local24);
		if (local30 != null) {
			return local30;
		} else if (Static220.aClass165_66.method4486(this.anInt5464)) {
			@Pc(48) Class138 local48 = Static363.method3785(Static220.aClass165_66, this.anInt5464, 0);
			if (local48 != null) {
				local48.anInt4101 = local48.anInt4098 = local48.anInt4096 = local48.anInt4099 = 0;
				if (arg2) {
					local48.method3782();
				}
				for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
					local48.method3780();
				}
			}
			local30 = arg0.method3322(local48);
			if (local30 != null) {
				Static112.aClass140_103.method3817(local24, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!eb;II)V")
	public void method4856(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method3141();
			if (local15 == 0) {
				return;
			}
			this.method4854(arg0, local15, arg1);
		}
	}
}
