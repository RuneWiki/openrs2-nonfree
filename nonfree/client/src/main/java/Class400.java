import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class400 {

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "[I")
	public int[] anIntArray604;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "[I")
	public int[] anIntArray605;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
	public int anInt11167 = -1;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
	public int anInt11169 = -1;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class400(@OriginalArg(0) Class310 arg0) {
		@Pc(12) byte[] local12 = arg0.method7795(6);
		this.method9469(new Class14_Sub21(local12));
		if (this.anIntArray603 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	private Class400() {
		this.anIntArray603 = new int[0];
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!jc;I)V")
	private void method9469(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7695(104);
			if (local17 == 0) {
				return;
			}
			@Pc(30) int local30;
			if (local17 == 1) {
				local30 = arg0.method7695(118);
				this.anIntArray603 = new int[local30];
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray603.length; local36++) {
					this.anIntArray603[local36] = arg0.method7695(96);
				}
			} else if (local17 == 3) {
				this.anInt11169 = arg0.method7695(124);
			} else if (local17 == 4) {
				this.anInt11167 = arg0.method7695(114);
			} else if (local17 == 5) {
				this.anIntArray605 = new int[arg0.method7695(102)];
				for (local30 = 0; local30 < this.anIntArray605.length; local30++) {
					this.anIntArray605[local30] = arg0.method7695(126);
				}
			} else if (local17 == 6) {
				this.anIntArray604 = new int[arg0.method7695(117)];
				for (local30 = 0; local30 < this.anIntArray604.length; local30++) {
					this.anIntArray604[local30] = arg0.method7695(106);
				}
			}
		}
	}
}
