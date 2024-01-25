import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class202 {

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
	public int anInt5498;

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
	public int anInt5500;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
	public int anInt5501;

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
	public int anInt5506;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	public int anInt5508;

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
	public int anInt5505 = 16777215;

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
	public int anInt5504 = 8;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!ee;I)V")
	public void method4949(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8645();
			if (local13 == 0) {
				return;
			}
			this.method4952(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!ee;II)V")
	private void method4952(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5504 = arg0.method8631();
		} else if (arg1 == 2) {
			this.aBoolean468 = true;
		} else if (arg1 == 3) {
			this.anInt5498 = arg0.method8595();
			this.anInt5506 = arg0.method8595();
			this.anInt5501 = arg0.method8595();
		} else if (arg1 == 4) {
			this.anInt5508 = arg0.method8645();
		} else if (arg1 == 5) {
			this.anInt5500 = arg0.method8631();
		} else if (arg1 == 6) {
			this.anInt5505 = arg0.method8657();
		}
	}
}
