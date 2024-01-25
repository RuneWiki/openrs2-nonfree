import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class400 {

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Lclient!pd;")
	public Class286 aClass286_6;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	public int anInt11055;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public int anInt11054 = 8;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public int anInt11052 = -1;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public int anInt11060 = 127;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public int anInt11050 = 512;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public int anInt11051 = -1;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public int anInt11062 = 64;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public int anInt11056 = 1190717;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
	public boolean aBoolean748 = true;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Z")
	public boolean aBoolean749 = false;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
	public boolean aBoolean750 = true;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "I")
	public int anInt11057 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public void method9426() {
		this.anInt11054 = this.anInt11055 | this.anInt11054 << 8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ika;B)V")
	public void method9427(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2048(255);
			if (local10 == 0) {
				return;
			}
			this.method9428(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLclient!ika;I)V")
	private void method9428(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt11057 = Static33.method1092(arg0.method2061());
		} else if (arg1 == 2) {
			this.anInt11052 = arg0.method2048(255);
		} else if (arg1 == 3) {
			this.anInt11052 = arg0.method2028(-14795);
			if (this.anInt11052 == 65535) {
				this.anInt11052 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean750 = false;
		} else if (arg1 == 7) {
			this.anInt11051 = Static33.method1092(arg0.method2061());
		} else if (arg1 == 8) {
			this.aClass286_6.anInt7692 = this.anInt11055;
		} else if (arg1 == 9) {
			this.anInt11050 = arg0.method2028(-14795) << 2;
		} else if (arg1 == 10) {
			this.aBoolean748 = false;
		} else if (arg1 == 11) {
			this.anInt11054 = arg0.method2048(255);
		} else if (arg1 == 12) {
			this.aBoolean749 = true;
		} else if (arg1 == 13) {
			this.anInt11056 = arg0.method2061();
		} else if (arg1 == 14) {
			this.anInt11062 = arg0.method2048(255) << 2;
		} else if (arg1 == 16) {
			this.anInt11060 = arg0.method2048(255);
		}
	}
}
