import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class55 {

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!du", name = "y", descriptor = "Lclient!af;")
	public Class5 aClass5_2;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "I")
	public int anInt1284 = 8;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	public int anInt1288 = -1;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "I")
	public int anInt1281 = 1190717;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
	public boolean aBoolean93 = true;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	public int anInt1283 = -1;

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	public int anInt1292 = 128;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public int anInt1293 = 16;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public int anInt1294 = 0;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	public int anInt1289 = -1;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "I")
	public int anInt1295 = 127;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BILclient!kk;)V")
	private void method1056(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt1294 = Static21.method352(arg1.method5356());
		} else if (arg0 == 2) {
			this.anInt1288 = arg1.method5350();
		} else if (arg0 == 3) {
			this.anInt1288 = arg1.method5312();
			if (this.anInt1288 == 65535) {
				this.anInt1288 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean95 = false;
		} else if (arg0 == 7) {
			this.anInt1283 = Static21.method352(arg1.method5356());
		} else if (arg0 == 8) {
			this.aClass5_2.anInt146 = this.anInt1287;
		} else if (arg0 == 9) {
			this.anInt1292 = arg1.method5312();
		} else if (arg0 == 10) {
			this.aBoolean93 = false;
		} else if (arg0 == 11) {
			this.anInt1284 = arg1.method5350();
		} else if (arg0 == 12) {
			this.aBoolean94 = true;
		} else if (arg0 == 13) {
			this.anInt1281 = arg1.method5356();
		} else if (arg0 == 14) {
			this.anInt1293 = arg1.method5350();
		} else if (arg0 == 15) {
			this.anInt1289 = arg1.method5312();
			if (this.anInt1289 == 65535) {
				this.anInt1289 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt1295 = arg1.method5350();
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!kk;B)V")
	public void method1058(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5350();
			if (local14 == 0) {
				return;
			}
			this.method1056(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public void method1060() {
		this.anInt1284 = this.anInt1287 | this.anInt1284 << 8;
		if (this.anInt1289 == -1) {
			this.anInt1289 = this.anInt1288;
		}
	}
}
