import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class21 {

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Lclient!qga;")
	public Class290 aClass290_1;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public int anInt357;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
	public int anInt349 = 127;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	public int anInt351 = 8;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	public int anInt355 = 0;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
	public int anInt348 = 64;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
	public int anInt350 = 1190717;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public int anInt356 = -1;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Z")
	public boolean aBoolean37 = true;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public int anInt358 = -1;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "Z")
	public boolean aBoolean38 = true;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	public int anInt359 = 512;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ib;II)V")
	private void method348(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt355 = Static472.method6892(arg0.method8510());
		} else if (arg1 == 2) {
			this.anInt358 = arg0.method8529();
		} else if (arg1 == 3) {
			this.anInt358 = arg0.method8519();
			if (this.anInt358 == 65535) {
				this.anInt358 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean38 = false;
		} else if (arg1 == 7) {
			this.anInt356 = Static472.method6892(arg0.method8510());
			return;
		} else if (arg1 == 8) {
			this.aClass290_1.anInt8103 = this.anInt357;
			return;
		} else if (arg1 == 9) {
			this.anInt359 = arg0.method8519() << 2;
			return;
		} else if (arg1 == 10) {
			this.aBoolean37 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt351 = arg0.method8529();
			return;
		} else if (arg1 == 12) {
			this.aBoolean39 = true;
			return;
		} else if (arg1 == 13) {
			this.anInt350 = arg0.method8510();
			return;
		} else {
			if (arg1 == 14) {
				this.anInt348 = arg0.method8529() << 2;
			} else if (arg1 == 16) {
				this.anInt349 = arg0.method8529();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
	public void method349() {
		this.anInt351 = this.anInt357 | this.anInt351 << 8;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ib;Z)V")
	public void method350(@OriginalArg(0) Class5_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 == 0) {
				return;
			}
			this.method348(arg0, local5);
		}
	}
}
