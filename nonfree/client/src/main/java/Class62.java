import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class62 {

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!cka;")
	public Class63 aClass63_1;

	@OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
	public int anInt1411;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public int anInt1406 = 512;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
	public int anInt1409 = -1;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
	public int anInt1413 = 64;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public int anInt1405 = 127;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	public int anInt1415 = 0;

	@OriginalMember(owner = "client!ck", name = "q", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public int anInt1418 = 8;

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
	public int anInt1416 = 1190717;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
	public int anInt1417 = -1;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!jp;)V")
	public void method1427(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method8632();
			if (local16 == 0) {
				return;
			}
			this.method1432(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	public void method1431() {
		this.anInt1418 = this.anInt1411 | this.anInt1418 << 8;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method1432(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1415 = Static378.method5469(arg0.method8607());
		} else if (arg1 == 2) {
			this.anInt1409 = arg0.method8632();
		} else if (arg1 == 3) {
			this.anInt1409 = arg0.method8593();
			if (this.anInt1409 == 65535) {
				this.anInt1409 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean100 = false;
		} else if (arg1 == 7) {
			this.anInt1417 = Static378.method5469(arg0.method8607());
			return;
		} else if (arg1 == 8) {
			this.aClass63_1.anInt1430 = this.anInt1411;
			return;
		} else if (arg1 == 9) {
			this.anInt1406 = arg0.method8593() << 2;
			return;
		} else if (arg1 == 10) {
			this.aBoolean101 = false;
			return;
		} else if (arg1 == 11) {
			this.anInt1418 = arg0.method8632();
			return;
		} else if (arg1 == 12) {
			this.aBoolean103 = true;
			return;
		} else {
			if (arg1 == 13) {
				this.anInt1416 = arg0.method8607();
			} else if (arg1 == 14) {
				this.anInt1413 = arg0.method8632() << 2;
				return;
			} else if (arg1 == 16) {
				this.anInt1405 = arg0.method8632();
				return;
			}
			return;
		}
	}
}
