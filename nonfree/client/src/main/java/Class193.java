import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class193 {

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
	public int anInt5026;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "Lclient!ew;")
	public Class90 aClass90_4;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
	public int anInt5021 = 64;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	public int anInt5023 = 0;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	public int anInt5019 = -1;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
	public int anInt5028 = 512;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Z")
	public boolean aBoolean380 = true;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
	public int anInt5029 = 127;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
	public int anInt5031 = 1190717;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
	public int anInt5024 = 8;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
	public int anInt5032 = -1;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "Z")
	public boolean aBoolean382 = true;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!ac;B)V")
	private void method4008(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt5023 = Static101.method1478(arg1.method7919());
		} else if (arg0 == 2) {
			this.anInt5019 = arg1.method7974();
		} else if (arg0 == 3) {
			this.anInt5019 = arg1.method7945();
			if (this.anInt5019 == 65535) {
				this.anInt5019 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean382 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt5032 = Static101.method1478(arg1.method7919());
		} else if (arg0 == 8) {
			this.aClass90_4.anInt2574 = this.anInt5026;
			return;
		} else if (arg0 == 9) {
			this.anInt5028 = arg1.method7945() << 2;
			return;
		} else if (arg0 == 10) {
			this.aBoolean380 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt5024 = arg1.method7974();
			return;
		} else if (arg0 == 12) {
			this.aBoolean381 = true;
			return;
		} else {
			if (arg0 == 13) {
				this.anInt5031 = arg1.method7919();
			} else if (arg0 == 14) {
				this.anInt5021 = arg1.method7974() << 2;
				return;
			} else if (arg0 == 16) {
				this.anInt5029 = arg1.method7974();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method4009() {
		this.anInt5024 = this.anInt5026 | this.anInt5024 << 8;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method4014(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7974();
			if (local12 == 0) {
				return;
			}
			this.method4008(local12, arg0);
		}
	}
}
