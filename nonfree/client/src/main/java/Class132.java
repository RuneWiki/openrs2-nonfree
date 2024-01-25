import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class132 {

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!sv;")
	public Class315 aClass315_5;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	public int anInt3930;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	public int anInt3928 = 512;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public int anInt3925 = -1;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public int anInt3926 = -1;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	public int anInt3931 = 127;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public int anInt3936 = 0;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public int anInt3927 = 1190717;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Z")
	public boolean aBoolean265 = true;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Z")
	public boolean aBoolean266 = true;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public int anInt3935 = 64;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public int anInt3937 = 8;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!sl;II)V")
	private void method3475(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3936 = Static273.method4469(arg0.method4204());
		} else if (arg1 == 2) {
			this.anInt3925 = arg0.method4225();
		} else if (arg1 == 3) {
			this.anInt3925 = arg0.method4221();
			if (this.anInt3925 == 65535) {
				this.anInt3925 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean265 = false;
		} else if (arg1 == 7) {
			this.anInt3926 = Static273.method4469(arg0.method4204());
		} else if (arg1 == 8) {
			this.aClass315_5.anInt9091 = this.anInt3930;
		} else if (arg1 == 9) {
			this.anInt3928 = arg0.method4221() << 2;
		} else if (arg1 == 10) {
			this.aBoolean266 = false;
		} else if (arg1 == 11) {
			this.anInt3937 = arg0.method4225();
		} else if (arg1 == 12) {
			this.aBoolean263 = true;
		} else if (arg1 == 13) {
			this.anInt3927 = arg0.method4204();
		} else if (arg1 == 14) {
			this.anInt3935 = arg0.method4225() << 2;
		} else if (arg1 == 16) {
			this.anInt3931 = arg0.method4225();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!sl;)V")
	public void method3477(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method4225();
			if (local8 == 0) {
				return;
			}
			this.method3475(arg0, local8);
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public void method3479() {
		this.anInt3937 = this.anInt3937 << 8 | this.anInt3930;
	}
}
