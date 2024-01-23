import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class66 {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Z")
	public boolean aBoolean161 = true;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public int anInt2938 = -1;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	public int anInt2948 = -1;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "I")
	public int anInt2949 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!ql;III)V")
	private void method2248(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt2949 = Static65.method1286(arg0.method1773());
		} else if (arg1 == 2) {
			this.anInt2938 = arg0.method1772();
		} else if (arg1 == 3) {
			this.anInt2938 = arg0.method1764();
			if (this.anInt2938 == 65535) {
				this.anInt2938 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean161 = false;
		} else if (arg1 == 7) {
			this.anInt2948 = Static65.method1286(arg0.method1773());
		} else if (arg1 == 8) {
			Static77.anInt2098 = arg2;
		} else if (arg1 == 9) {
			arg0.method1764();
		} else if (arg1 != 10) {
			if (arg1 == 11) {
				arg0.method1772();
			} else if (arg1 != 12) {
				if (arg1 == 13) {
					arg0.method1773();
				} else if (arg1 == 14) {
					arg0.method1772();
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ql;I)V")
	public void method2256(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method1772();
			if (local13 == 0) {
				return;
			}
			this.method2248(arg0, local13, arg1);
		}
	}
}
