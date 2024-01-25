import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class127 {

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
	public int anInt3073;

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "Lclient!lk;")
	public Class217 aClass217_5;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
	public int anInt3062 = 127;

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
	public int anInt3063 = -1;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
	public int anInt3066 = 0;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
	public int anInt3069 = 64;

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "Z")
	public boolean aBoolean229 = false;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
	public int anInt3065 = -1;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
	public int anInt3071 = 8;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
	public int anInt3070 = 1190717;

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "Z")
	public boolean aBoolean231 = true;

	@OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
	public int anInt3074 = 512;

	@OriginalMember(owner = "client!fw", name = "q", descriptor = "Z")
	public boolean aBoolean232 = true;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public void method2862() {
		this.anInt3071 = this.anInt3073 | this.anInt3071 << 8;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IBLclient!es;)V")
	private void method2863(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3066 = Static85.method1763(arg1.method8827());
		} else if (arg0 == 2) {
			this.anInt3065 = arg1.method8865();
		} else if (arg0 == 3) {
			this.anInt3065 = arg1.method8859();
			if (this.anInt3065 == 65535) {
				this.anInt3065 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean232 = false;
		} else if (arg0 == 7) {
			this.anInt3063 = Static85.method1763(arg1.method8827());
		} else if (arg0 == 8) {
			this.aClass217_5.anInt5291 = this.anInt3073;
		} else if (arg0 == 9) {
			this.anInt3074 = arg1.method8859() << 2;
		} else if (arg0 == 10) {
			this.aBoolean231 = false;
		} else if (arg0 == 11) {
			this.anInt3071 = arg1.method8865();
		} else if (arg0 == 12) {
			this.aBoolean229 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt3070 = arg1.method8827();
			return;
		} else if (arg0 == 14) {
			this.anInt3069 = arg1.method8865() << 2;
			return;
		} else if (arg0 == 16) {
			this.anInt3062 = arg1.method8865();
			return;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BLclient!es;)V")
	public void method2865(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8865();
			if (local5 == 0) {
				return;
			}
			this.method2863(local5, arg0);
		}
	}
}
