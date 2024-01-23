import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class183 {

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	public boolean aBoolean412 = true;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public int anInt5777 = 0;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Z")
	public boolean aBoolean413 = false;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	public int anInt5780 = -1;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public int anInt5775 = 8;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	public int anInt5776 = -1;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
	public boolean aBoolean415 = true;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	public int anInt5782 = 1190717;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	public int anInt5781 = 16;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	public int anInt5786 = 128;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!ug;I)V")
	private void method4752(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5777 = Static288.method4747(arg1.method3899());
		} else if (arg2 == 2) {
			this.anInt5780 = arg1.method3915();
		} else if (arg2 == 3) {
			this.anInt5780 = arg1.method3948();
			if (this.anInt5780 == 65535) {
				this.anInt5780 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean415 = false;
		} else if (arg2 == 7) {
			this.anInt5776 = Static288.method4747(arg1.method3899());
		} else if (arg2 == 8) {
			Static85.anInt1598 = arg0;
		} else if (arg2 == 9) {
			this.anInt5786 = arg1.method3948();
		} else if (arg2 == 10) {
			this.aBoolean412 = false;
		} else if (arg2 == 11) {
			this.anInt5775 = arg1.method3915();
		} else if (arg2 == 12) {
			this.aBoolean413 = true;
		} else if (arg2 == 13) {
			this.anInt5782 = arg1.method3899();
		} else if (arg2 == 14) {
			this.anInt5781 = arg1.method3915();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!ug;)V")
	public void method4755(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		while (true) {
			@Pc(10) int local10 = arg1.method3915();
			if (local10 == 0) {
				return;
			}
			this.method4752(arg0, arg1, local10);
		}
	}
}
