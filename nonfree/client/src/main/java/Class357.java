import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class357 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "I")
	public int anInt9999;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "I")
	public int anInt10001;

	@OriginalMember(owner = "client!us", name = "f", descriptor = "I")
	public int anInt10004;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILclient!mc;)V")
	private void method8319(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub41 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static144.method2600(arg1.method7861());
		} else if (arg0 == 2) {
			this.anInt10001 = arg1.method7860();
			this.anInt9999 = arg1.method7816();
			this.anInt10004 = arg1.method7816();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!mc;I)V")
	public void method8321(@OriginalArg(0) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method8319(local3, arg0);
		}
	}
}
