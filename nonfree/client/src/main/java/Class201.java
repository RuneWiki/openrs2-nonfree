import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class201 {

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
	public int anInt6106;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
	public int anInt6107;

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
	public int anInt6111;

	@OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
	public int anInt6115;

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
	public int anInt6109 = 8;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
	public int anInt6112 = 16777215;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLclient!dc;)V")
	public void method5280(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5633();
			if (local9 == 0) {
				return;
			}
			this.method5282(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILclient!dc;)V")
	private void method5282(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt6109 = arg1.method5610();
		} else if (arg0 == 2) {
			this.aBoolean445 = true;
		} else if (arg0 == 3) {
			this.anInt6107 = arg1.method5624();
			this.anInt6106 = arg1.method5624();
			this.anInt6115 = arg1.method5624();
		} else if (arg0 == 4) {
			this.anInt6111 = arg1.method5633();
		} else if (arg0 == 5) {
			this.anInt6108 = arg1.method5610();
		} else if (arg0 == 6) {
			this.anInt6112 = arg1.method5604();
			return;
		}
	}
}
