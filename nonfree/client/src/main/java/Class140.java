import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class140 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public int anInt4591 = 128;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Z")
	public boolean aBoolean369 = true;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	public int anInt4593 = 8;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
	public int anInt4595 = 1190717;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public int anInt4597 = -1;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Z")
	public boolean aBoolean370 = false;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "Z")
	public boolean aBoolean371 = true;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
	public int anInt4598 = -1;

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
	public int anInt4603 = 16;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public int anInt4601 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!aj;)V")
	public void method3493(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2334();
			if (local9 == 0) {
				return;
			}
			this.method3499(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!aj;II)V")
	private void method3499(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt4601 = Static127.method2067(arg1.method2323());
		} else if (arg2 == 2) {
			this.anInt4598 = arg1.method2334();
		} else if (arg2 == 3) {
			this.anInt4598 = arg1.method2375();
			if (this.anInt4598 == 65535) {
				this.anInt4598 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean371 = false;
		} else if (arg2 == 7) {
			this.anInt4597 = Static127.method2067(arg1.method2323());
		} else if (arg2 == 8) {
			Static191.anInt3845 = arg0;
		} else if (arg2 == 9) {
			this.anInt4591 = arg1.method2375();
		} else if (arg2 == 10) {
			this.aBoolean369 = false;
		} else if (arg2 == 11) {
			this.anInt4593 = arg1.method2334();
		} else if (arg2 == 12) {
			this.aBoolean370 = true;
		} else if (arg2 == 13) {
			this.anInt4595 = arg1.method2323();
		} else if (arg2 == 14) {
			this.anInt4603 = arg1.method2334();
		}
	}
}
