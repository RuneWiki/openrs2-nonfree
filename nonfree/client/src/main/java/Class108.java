import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class108 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public int anInt3150 = -1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
	public int anInt3148 = 8;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Z")
	public boolean aBoolean301 = true;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public int anInt3153 = 0;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
	public int anInt3157 = 1190717;

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
	public int anInt3158 = -1;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Z")
	public boolean aBoolean303 = true;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
	public int anInt3156 = 128;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	public int anInt3149 = 16;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
	public int anInt3155 = -1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!bg;I)V")
	public void method2879(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method4532();
			if (local14 == 0) {
				return;
			}
			this.method2883(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!bg;II)V")
	private void method2883(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt3153 = Static62.method1537(arg1.method4514());
		} else if (arg0 == 2) {
			this.anInt3150 = arg1.method4532();
		} else if (arg0 == 3) {
			this.anInt3150 = arg1.method4556();
			if (this.anInt3150 == 65535) {
				this.anInt3150 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean301 = false;
		} else if (arg0 == 7) {
			this.anInt3155 = Static62.method1537(arg1.method4514());
		} else if (arg0 == 8) {
			Static238.anInt4927 = arg2;
		} else if (arg0 == 9) {
			this.anInt3156 = arg1.method4556();
		} else if (arg0 == 10) {
			this.aBoolean303 = false;
		} else if (arg0 == 11) {
			this.anInt3148 = arg1.method4532();
		} else if (arg0 == 12) {
			this.aBoolean300 = true;
		} else if (arg0 == 13) {
			this.anInt3157 = arg1.method4514();
		} else if (arg0 == 14) {
			this.anInt3149 = arg1.method4532();
		} else if (arg0 == 15) {
			this.anInt3158 = arg1.method4556();
			if (this.anInt3158 == 65535) {
				this.anInt3158 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V")
	public void method2884(@OriginalArg(1) int arg0) {
		if (this.anInt3158 == -1) {
			this.anInt3158 = this.anInt3150;
		}
		this.anInt3148 = this.anInt3148 << 8 | arg0;
	}
}
