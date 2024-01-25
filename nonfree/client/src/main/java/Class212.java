import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kja")
public final class Class212 {

	@OriginalMember(owner = "client!kja", name = "r", descriptor = "Z")
	public boolean aBoolean359;

	@OriginalMember(owner = "client!kja", name = "g", descriptor = "I")
	public int anInt5548;

	@OriginalMember(owner = "client!kja", name = "c", descriptor = "I")
	public int anInt5549;

	@OriginalMember(owner = "client!kja", name = "j", descriptor = "I")
	public int anInt5550;

	@OriginalMember(owner = "client!kja", name = "d", descriptor = "I")
	public int anInt5551;

	@OriginalMember(owner = "client!kja", name = "o", descriptor = "I")
	public int anInt5554;

	@OriginalMember(owner = "client!kja", name = "q", descriptor = "I")
	public int anInt5555;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "I")
	public int anInt5556;

	@OriginalMember(owner = "client!kja", name = "p", descriptor = "I")
	public int anInt5558;

	@OriginalMember(owner = "client!kja", name = "i", descriptor = "I")
	public int anInt5545 = 8;

	@OriginalMember(owner = "client!kja", name = "m", descriptor = "I")
	public int anInt5557 = 16777215;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(ILclient!ika;I)V")
	private void method4913(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5545 = arg0.method2028(-14795);
		} else if (arg1 == 2) {
			this.aBoolean359 = true;
		} else if (arg1 == 3) {
			this.anInt5548 = arg0.method2017();
			this.anInt5550 = arg0.method2017();
			this.anInt5558 = arg0.method2017();
		} else if (arg1 == 4) {
			this.anInt5554 = arg0.method2048(255);
		} else if (arg1 == 5) {
			this.anInt5551 = arg0.method2028(-14795);
		} else if (arg1 == 6) {
			this.anInt5557 = arg0.method2061();
		} else if (arg1 == 7) {
			this.anInt5555 = arg0.method2017();
			this.anInt5549 = arg0.method2017();
			this.anInt5556 = arg0.method2017();
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method4916(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2048(255);
			if (local17 == 0) {
				return;
			}
			this.method4913(arg0, local17);
		}
	}
}
