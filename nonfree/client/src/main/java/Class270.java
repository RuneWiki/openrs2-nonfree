import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class270 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public int anInt7601 = 1;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
	public int anInt7607 = 2;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	public int anInt7609 = 64;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Z")
	public boolean aBoolean548 = false;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Z")
	public boolean aBoolean549 = false;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public int anInt7611 = -1;

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
	public int anInt7610 = 64;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBILclient!dc;)V")
	private void method6625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub9 arg2) {
		if (arg1 == 1) {
			this.anInt7611 = arg2.method5610();
			if (this.anInt7611 == 65535) {
				this.anInt7611 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt7610 = arg2.method5610() + 1;
			this.anInt7609 = arg2.method5610() + 1;
		} else if (arg1 == 3) {
			arg2.method5619();
		} else if (arg1 == 4) {
			this.anInt7607 = arg2.method5633();
		} else if (arg1 == 5) {
			this.anInt7601 = arg2.method5633();
		} else if (arg1 == 6) {
			this.aBoolean549 = true;
			return;
		} else if (arg1 == 7) {
			this.aBoolean548 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILclient!dc;)V")
	public void method6627(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5633();
			if (local5 == 0) {
				return;
			}
			this.method6625(arg0, local5, arg1);
		}
	}
}
