import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class49 {

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	public int anInt1000;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "Lclient!pv;")
	public Class204 aClass204_2;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public int anInt997 = 127;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public int anInt1001 = 0;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public int anInt1002 = 1190717;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public int anInt1008 = 128;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Z")
	public boolean aBoolean123 = true;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public int anInt999 = -1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public int anInt998 = 8;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public int anInt1003 = -1;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Z")
	public boolean aBoolean124 = true;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	public int anInt1007 = -1;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "I")
	public int anInt1009 = 16;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
	public void method874() {
		if (this.anInt999 == -1) {
			this.anInt999 = this.anInt1007;
		}
		this.anInt998 = this.anInt1000 | this.anInt998 << 8;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!wm;)V")
	public void method875(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2915();
			if (local5 == 0) {
				return;
			}
			this.method876(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!wm;BI)V")
	private void method876(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1001 = Static288.method3826(arg0.method2881());
		} else if (arg1 == 2) {
			this.anInt1007 = arg0.method2915();
		} else if (arg1 == 3) {
			this.anInt1007 = arg0.method2896();
			if (this.anInt1007 == 65535) {
				this.anInt1007 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean123 = false;
		} else if (arg1 == 7) {
			this.anInt1003 = Static288.method3826(arg0.method2881());
		} else if (arg1 == 8) {
			this.aClass204_2.anInt5439 = this.anInt1000;
		} else if (arg1 == 9) {
			this.anInt1008 = arg0.method2896() << 0;
		} else if (arg1 == 10) {
			this.aBoolean124 = false;
		} else if (arg1 == 11) {
			this.anInt998 = arg0.method2915();
		} else if (arg1 == 12) {
			this.aBoolean122 = true;
		} else if (arg1 == 13) {
			this.anInt1002 = arg0.method2881();
		} else if (arg1 == 14) {
			this.anInt1009 = arg0.method2915() << 0;
		} else if (arg1 == 15) {
			this.anInt999 = arg0.method2896();
			if (this.anInt999 == 65535) {
				this.anInt999 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt997 = arg0.method2915();
		}
	}
}
