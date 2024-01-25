import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class303 {

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
	public int anInt8304;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "Lclient!lp;")
	public Class206 aClass206_6;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
	public int anInt8298 = 0;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
	public int anInt8303 = -1;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Z")
	public boolean aBoolean600 = true;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	public int anInt8302 = 127;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
	public int anInt8308 = 512;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "Z")
	public boolean aBoolean601 = false;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
	public int anInt8305 = 64;

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
	public int anInt8309 = -1;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "Z")
	public boolean aBoolean602 = true;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	public int anInt8313 = 8;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	public int anInt8311 = 1190717;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!io;I)V")
	private void method6913(@OriginalArg(1) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8298 = Static248.method3989(arg0.method4396());
		} else if (arg1 == 2) {
			this.anInt8309 = arg0.method4393();
		} else if (arg1 == 3) {
			this.anInt8309 = arg0.method4426();
			if (this.anInt8309 == 65535) {
				this.anInt8309 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean602 = false;
		} else if (arg1 == 7) {
			this.anInt8303 = Static248.method3989(arg0.method4396());
		} else if (arg1 == 8) {
			this.aClass206_6.anInt5535 = this.anInt8304;
		} else if (arg1 == 9) {
			this.anInt8308 = arg0.method4426() << 2;
		} else if (arg1 == 10) {
			this.aBoolean600 = false;
		} else if (arg1 == 11) {
			this.anInt8313 = arg0.method4393();
		} else if (arg1 == 12) {
			this.aBoolean601 = true;
		} else if (arg1 == 13) {
			this.anInt8311 = arg0.method4396();
		} else if (arg1 == 14) {
			this.anInt8305 = arg0.method4393() << 2;
		} else if (arg1 == 16) {
			this.anInt8302 = arg0.method4393();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLclient!io;)V")
	public void method6914(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4393();
			if (local9 == 0) {
				return;
			}
			this.method6913(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V")
	public void method6915() {
		this.anInt8313 = this.anInt8304 | this.anInt8313 << 8;
	}
}
