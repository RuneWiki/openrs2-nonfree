import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class261 {

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
	public int anInt7629 = 2;

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
	public int anInt7628 = 64;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "Z")
	public boolean aBoolean497 = false;

	@OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
	public int anInt7633 = 1;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public int anInt7637 = 64;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "Z")
	public boolean aBoolean498 = false;

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
	public int anInt7634 = -1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ia;II)V")
	public void method5790(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method1171();
			if (local11 == 0) {
				return;
			}
			this.method5791(local11, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILclient!ia;)V")
	private void method5791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3 arg2) {
		if (arg0 == 1) {
			this.anInt7634 = arg2.method1177();
			if (this.anInt7634 == 65535) {
				this.anInt7634 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt7628 = arg2.method1177() + 1;
			this.anInt7637 = arg2.method1177() + 1;
		} else if (arg0 == 3) {
			arg2.method1212();
		} else if (arg0 == 4) {
			this.anInt7629 = arg2.method1171();
		} else if (arg0 == 5) {
			this.anInt7633 = arg2.method1171();
		} else if (arg0 == 6) {
			this.aBoolean498 = true;
		} else if (arg0 == 7) {
			this.aBoolean497 = true;
		}
	}
}
