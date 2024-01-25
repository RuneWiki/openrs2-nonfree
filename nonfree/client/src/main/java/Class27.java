import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class27 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "Lclient!bj;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Z")
	public boolean aBoolean29 = true;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	public int anInt541 = -1;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public int anInt546 = 8;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public int anInt543 = 1190717;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public int anInt542 = 0;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public int anInt547 = 127;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Z")
	public boolean aBoolean30 = true;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	public int anInt551 = 64;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "I")
	public int anInt550 = -1;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public int anInt544 = 512;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public void method499() {
		this.anInt546 = this.anInt540 | this.anInt546 << 8;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!dc;)V")
	public void method500(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5633();
			if (local9 == 0) {
				return;
			}
			this.method504(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!dc;B)V")
	private void method504(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt542 = Static129.method2280(arg1.method5604());
		} else if (arg0 == 2) {
			this.anInt550 = arg1.method5633();
		} else if (arg0 == 3) {
			this.anInt550 = arg1.method5610();
			if (this.anInt550 == 65535) {
				this.anInt550 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean30 = false;
		} else if (arg0 == 7) {
			this.anInt541 = Static129.method2280(arg1.method5604());
		} else if (arg0 == 8) {
			this.aClass32_1.anInt777 = this.anInt540;
		} else if (arg0 == 9) {
			this.anInt544 = arg1.method5610() << 2;
		} else if (arg0 == 10) {
			this.aBoolean29 = false;
		} else if (arg0 == 11) {
			this.anInt546 = arg1.method5633();
		} else if (arg0 == 12) {
			this.aBoolean28 = true;
		} else if (arg0 == 13) {
			this.anInt543 = arg1.method5604();
		} else if (arg0 == 14) {
			this.anInt551 = arg1.method5633() << 2;
		} else if (arg0 == 16) {
			this.anInt547 = arg1.method5633();
		}
	}
}
