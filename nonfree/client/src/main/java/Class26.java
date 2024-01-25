import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class26 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!eq;")
	public Class96 aClass96_2;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
	public int anInt741 = -1;

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Z")
	public boolean aBoolean59 = true;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	public int anInt745 = 127;

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public int anInt743 = 0;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Z")
	public boolean aBoolean60 = true;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public int anInt746 = 1190717;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public int anInt747 = 512;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
	public int anInt750 = 64;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	public int anInt749 = 8;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public int anInt751 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public void method590() {
		this.anInt749 = this.anInt740 | this.anInt749 << 8;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!vj;I)V")
	private void method592(@OriginalArg(1) Class2_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt743 = Static86.method1256(arg0.method8539());
		} else if (arg1 == 2) {
			this.anInt751 = arg0.method8547();
		} else if (arg1 == 3) {
			this.anInt751 = arg0.method8546();
			if (this.anInt751 == 65535) {
				this.anInt751 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean60 = false;
		} else if (arg1 == 7) {
			this.anInt741 = Static86.method1256(arg0.method8539());
		} else if (arg1 == 8) {
			this.aClass96_2.anInt2570 = this.anInt740;
		} else if (arg1 == 9) {
			this.anInt747 = arg0.method8546() << 2;
		} else if (arg1 == 10) {
			this.aBoolean59 = false;
		} else if (arg1 == 11) {
			this.anInt749 = arg0.method8547();
		} else if (arg1 == 12) {
			this.aBoolean61 = true;
		} else if (arg1 == 13) {
			this.anInt746 = arg0.method8539();
		} else if (arg1 == 14) {
			this.anInt750 = arg0.method8547() << 2;
		} else if (arg1 == 16) {
			this.anInt745 = arg0.method8547();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method594(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8547();
			if (local9 == 0) {
				return;
			}
			this.method592(arg0, local9);
		}
	}
}
