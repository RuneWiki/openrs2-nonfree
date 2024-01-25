import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class251 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	public int anInt6597;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!mg;")
	public Class155 aClass155_6;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
	public int anInt6603 = 0;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "Z")
	public boolean aBoolean431 = false;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
	public int anInt6607 = -1;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
	public int anInt6605 = 1190717;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public int anInt6599 = 8;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
	public int anInt6608 = -1;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public int anInt6606 = 127;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
	public int anInt6602 = -1;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
	public int anInt6600 = 128;

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
	public int anInt6613 = 16;

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "Z")
	public boolean aBoolean432 = true;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!gk;)V")
	public void method5218(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3981();
			if (local11 == 0) {
				return;
			}
			this.method5221(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	public void method5219() {
		this.anInt6599 = this.anInt6599 << 8 | this.anInt6597;
		if (this.anInt6602 == -1) {
			this.anInt6602 = this.anInt6608;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt6603 = Static139.method2153(arg1.method3975());
		} else if (arg0 == 2) {
			this.anInt6608 = arg1.method3981();
		} else if (arg0 == 3) {
			this.anInt6608 = arg1.method3943();
			if (this.anInt6608 == 65535) {
				this.anInt6608 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean432 = false;
		} else if (arg0 == 7) {
			this.anInt6607 = Static139.method2153(arg1.method3975());
		} else if (arg0 == 8) {
			this.aClass155_6.anInt4243 = this.anInt6597;
		} else if (arg0 == 9) {
			this.anInt6600 = arg1.method3943() << 0;
		} else if (arg0 == 10) {
			this.aBoolean430 = false;
		} else if (arg0 == 11) {
			this.anInt6599 = arg1.method3981();
		} else if (arg0 == 12) {
			this.aBoolean431 = true;
		} else if (arg0 == 13) {
			this.anInt6605 = arg1.method3975();
		} else if (arg0 == 14) {
			this.anInt6613 = arg1.method3981() << 0;
		} else if (arg0 == 15) {
			this.anInt6602 = arg1.method3943();
			if (this.anInt6602 == 65535) {
				this.anInt6602 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt6606 = arg1.method3981();
		}
	}
}
