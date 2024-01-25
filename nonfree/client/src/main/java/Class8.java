import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public final class Class8 {

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "Lclient!we;")
	public Class389 aClass389_1;

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
	public int anInt70;

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
	public int anInt68 = 0;

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
	public int anInt62 = 64;

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
	public int anInt61 = 512;

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
	public int anInt66 = -1;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
	public int anInt69 = 8;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "Z")
	public boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "I")
	public int anInt59 = -1;

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
	public int anInt64 = 127;

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
	public int anInt71 = 1190717;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IILclient!jc;)V")
	private void method92(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt68 = Static68.method1082(arg1.method7719());
		} else if (arg0 == 2) {
			this.anInt59 = arg1.method7695(101);
		} else if (arg0 == 3) {
			this.anInt59 = arg1.method7717(-1978450544);
			if (this.anInt59 == 65535) {
				this.anInt59 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean6 = false;
		} else if (arg0 == 7) {
			this.anInt66 = Static68.method1082(arg1.method7719());
		} else if (arg0 == 8) {
			this.aClass389_1.anInt10948 = this.anInt70;
		} else if (arg0 == 9) {
			this.anInt61 = arg1.method7717(-1978450544) << 2;
		} else if (arg0 == 10) {
			this.aBoolean7 = false;
		} else if (arg0 == 11) {
			this.anInt69 = arg1.method7695(115);
		} else if (arg0 == 12) {
			this.aBoolean8 = true;
		} else if (arg0 == 13) {
			this.anInt71 = arg1.method7719();
		} else if (arg0 == 14) {
			this.anInt62 = arg1.method7695(112) << 2;
		} else if (arg0 == 16) {
			this.anInt64 = arg1.method7695(108);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!jc;)V")
	public void method94(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7695(95);
			if (local7 == 0) {
				return;
			}
			this.method92(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
	public void method95() {
		this.anInt69 = this.anInt70 | this.anInt69 << 8;
	}
}
