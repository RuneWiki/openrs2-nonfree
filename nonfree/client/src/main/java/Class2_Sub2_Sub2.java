import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!af", name = "L", descriptor = "I")
	public int anInt311 = 1190717;

	@OriginalMember(owner = "client!af", name = "M", descriptor = "I")
	public int anInt312 = -1;

	@OriginalMember(owner = "client!af", name = "W", descriptor = "I")
	public int anInt317 = 16;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "I")
	public int anInt308 = -1;

	@OriginalMember(owner = "client!af", name = "X", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!af", name = "V", descriptor = "I")
	public int anInt316 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!ea;I)V")
	public void method239(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method209();
			if (local5 == 0) {
				return;
			}
			this.method242(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILclient!ea;)V")
	private void method242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub3 arg2) {
		if (arg1 == 1) {
			this.anInt316 = Static116.method1957(arg2.method166());
		} else if (arg1 == 2) {
			this.anInt308 = arg2.method209();
		} else if (arg1 == 3) {
			this.anInt308 = arg2.method163();
			if (this.anInt308 == 65535) {
				this.anInt308 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean14 = false;
		} else if (arg1 == 7) {
			this.anInt312 = Static116.method1957(arg2.method166());
		} else if (arg1 == 8) {
			Static118.anInt2860 = arg0;
		} else if (arg1 == 9) {
			arg2.method163();
		} else if (arg1 != 10) {
			if (arg1 == 11) {
				arg2.method209();
			} else if (arg1 != 12) {
				if (arg1 == 13) {
					this.anInt311 = arg2.method166();
				} else if (arg1 == 14) {
					this.anInt317 = arg2.method209();
				}
			}
		}
	}
}
