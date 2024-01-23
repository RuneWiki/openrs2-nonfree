import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class29 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	public int anInt952 = 0;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Z")
	public boolean aBoolean90 = true;

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public int anInt955 = -1;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
	public int anInt956 = -1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!vf;)V")
	public void method858(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2945();
			if (local9 == 0) {
				return;
			}
			this.method862(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLclient!vf;II)V")
	private void method862(@OriginalArg(1) Class1_Sub26 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt952 = Static99.method845(arg0.method2937());
		} else if (arg2 == 2) {
			this.anInt956 = arg0.method2945();
		} else if (arg2 == 3) {
			this.anInt956 = arg0.method2964();
			if (this.anInt956 == 65535) {
				this.anInt956 = -1;
				return;
			}
		} else if (arg2 == 5) {
			this.aBoolean90 = false;
			return;
		} else if (arg2 == 7) {
			this.anInt955 = Static99.method845(arg0.method2937());
			return;
		} else if (arg2 == 8) {
			Static51.anInt3027 = arg1;
			return;
		} else {
			if (arg2 == 9) {
				arg0.method2964();
			} else if (arg2 != 10) {
				if (arg2 == 11) {
					arg0.method2945();
				} else if (arg2 != 12) {
					if (arg2 == 13) {
						arg0.method2937();
						return;
					}
					if (arg2 == 14) {
						arg0.method2945();
						return;
					}
				}
				return;
			}
			return;
		}
	}
}
