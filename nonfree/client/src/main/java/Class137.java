import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class137 {

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "Lclient!oo;")
	public Class266 aClass266_2;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
	public int anInt4442;

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
	public int anInt4435 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
	public int anInt4432 = -1;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
	public int anInt4434 = -1;

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
	public int anInt4438 = 512;

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
	public int anInt4437 = 8;

	@OriginalMember(owner = "client!hca", name = "k", descriptor = "Z")
	public boolean aBoolean346 = true;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "I")
	public int anInt4441 = 127;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "Z")
	public boolean aBoolean345 = true;

	@OriginalMember(owner = "client!hca", name = "p", descriptor = "I")
	public int anInt4443 = 64;

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Z")
	public boolean aBoolean348 = false;

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
	public int anInt4444 = 1190717;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILclient!ol;)V")
	private void method4020(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt4435 = Static61.method1154(arg1.method5161());
		} else if (arg0 == 2) {
			this.anInt4432 = arg1.method5203();
		} else if (arg0 == 3) {
			this.anInt4432 = arg1.method5211();
			if (this.anInt4432 == 65535) {
				this.anInt4432 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean346 = false;
		} else if (arg0 == 7) {
			this.anInt4434 = Static61.method1154(arg1.method5161());
		} else if (arg0 == 8) {
			this.aClass266_2.anInt7956 = this.anInt4442;
		} else if (arg0 == 9) {
			this.anInt4438 = arg1.method5211() << 2;
		} else if (arg0 == 10) {
			this.aBoolean345 = false;
		} else if (arg0 == 11) {
			this.anInt4437 = arg1.method5203();
		} else if (arg0 == 12) {
			this.aBoolean348 = true;
		} else if (arg0 == 13) {
			this.anInt4444 = arg1.method5161();
		} else if (arg0 == 14) {
			this.anInt4443 = arg1.method5203() << 2;
		} else if (arg0 == 16) {
			this.anInt4441 = arg1.method5203();
			return;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!ol;B)V")
	public void method4021(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5203();
			if (local16 == 0) {
				return;
			}
			this.method4020(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
	public void method4022() {
		this.anInt4437 = this.anInt4442 | this.anInt4437 << 8;
	}
}
