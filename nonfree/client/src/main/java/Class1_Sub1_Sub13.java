import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!md", name = "M", descriptor = "I")
	public int anInt2683 = -1;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "I")
	public int anInt2682 = 1190717;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "I")
	public int anInt2688 = -1;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
	public int anInt2687 = 0;

	@OriginalMember(owner = "client!md", name = "O", descriptor = "I")
	public int anInt2685 = 16;

	@OriginalMember(owner = "client!md", name = "S", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!nc;III)V")
	private void method2024(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2687 = Static85.method1484(arg0.method920());
		} else if (arg1 == 2) {
			this.anInt2683 = arg0.method895();
		} else if (arg1 == 3) {
			this.anInt2683 = arg0.method946();
			if (this.anInt2683 == 65535) {
				this.anInt2683 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean150 = false;
		} else if (arg1 == 7) {
			this.anInt2688 = Static85.method1484(arg0.method920());
		} else if (arg1 == 8) {
			Static143.anInt3208 = arg2;
		} else if (arg1 == 9) {
			arg0.method946();
		} else if (arg1 != 10) {
			if (arg1 == 11) {
				arg0.method895();
			} else if (arg1 != 12) {
				if (arg1 == 13) {
					this.anInt2682 = arg0.method920();
				} else if (arg1 == 14) {
					this.anInt2685 = arg0.method895();
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IBLclient!nc;)V")
	public void method2025(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method895();
			if (local13 == 0) {
				return;
			}
			this.method2024(arg1, local13, arg0);
		}
	}
}
