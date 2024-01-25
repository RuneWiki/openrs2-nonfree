import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class88 {

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
	public int anInt2810;

	@OriginalMember(owner = "client!ega", name = "s", descriptor = "Lclient!kca;")
	public Class171 aClass171_4;

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
	public int anInt2812 = 0;

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
	public int anInt2813 = 127;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "Z")
	public boolean aBoolean192 = true;

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
	public int anInt2815 = -1;

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
	public int anInt2807 = -1;

	@OriginalMember(owner = "client!ega", name = "l", descriptor = "I")
	public int anInt2816 = 8;

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "Z")
	public boolean aBoolean193 = true;

	@OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
	public int anInt2819 = 1190717;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
	public int anInt2818 = 512;

	@OriginalMember(owner = "client!ega", name = "t", descriptor = "I")
	public int anInt2820 = 64;

	@OriginalMember(owner = "client!ega", name = "r", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!ie;)V")
	public void method2332(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6814();
			if (local16 == 0) {
				return;
			}
			this.method2338(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
	public void method2336() {
		this.anInt2816 = this.anInt2810 | this.anInt2816 << 8;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IILclient!ie;)V")
	private void method2338(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt2812 = Static534.method7316(arg1.method6830());
		} else if (arg0 == 2) {
			this.anInt2807 = arg1.method6814();
		} else if (arg0 == 3) {
			this.anInt2807 = arg1.method6811();
			if (this.anInt2807 == 65535) {
				this.anInt2807 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean193 = false;
		} else if (arg0 == 7) {
			this.anInt2815 = Static534.method7316(arg1.method6830());
		} else if (arg0 == 8) {
			this.aClass171_4.anInt5200 = this.anInt2810;
		} else if (arg0 == 9) {
			this.anInt2818 = arg1.method6811() << 2;
		} else if (arg0 == 10) {
			this.aBoolean192 = false;
		} else if (arg0 == 11) {
			this.anInt2816 = arg1.method6814();
		} else if (arg0 == 12) {
			this.aBoolean194 = true;
		} else if (arg0 == 13) {
			this.anInt2819 = arg1.method6830();
		} else if (arg0 == 14) {
			this.anInt2820 = arg1.method6814() << 2;
		} else if (arg0 == 16) {
			this.anInt2813 = arg1.method6814();
		}
	}
}
