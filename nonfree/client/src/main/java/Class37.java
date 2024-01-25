import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class37 {

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "Lclient!ul;")
	public Class286 aClass286_3;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
	public int anInt1218;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public int anInt1207 = 128;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public int anInt1208 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public int anInt1205 = 16;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	public int anInt1212 = -1;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
	public int anInt1213 = 8;

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Z")
	public boolean aBoolean71 = true;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	public int anInt1214 = -1;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	public int anInt1216 = 1190717;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public int anInt1219 = -1;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public int anInt1206 = 127;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
	public boolean aBoolean73 = true;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!ps;)V")
	public void method1152(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method1153(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!ps;B)V")
	private void method1153(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt1208 = Static33.method675(arg1.method5210());
		} else if (arg0 == 2) {
			this.anInt1219 = arg1.method5170();
		} else if (arg0 == 3) {
			this.anInt1219 = arg1.method5229();
			if (this.anInt1219 == 65535) {
				this.anInt1219 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean73 = false;
		} else if (arg0 == 7) {
			this.anInt1214 = Static33.method675(arg1.method5210());
		} else if (arg0 == 8) {
			this.aClass286_3.anInt8619 = this.anInt1218;
		} else if (arg0 == 9) {
			this.anInt1207 = arg1.method5229() << 0;
		} else if (arg0 == 10) {
			this.aBoolean71 = false;
		} else if (arg0 == 11) {
			this.anInt1213 = arg1.method5170();
		} else if (arg0 == 12) {
			this.aBoolean72 = true;
		} else if (arg0 == 13) {
			this.anInt1216 = arg1.method5210();
		} else if (arg0 == 14) {
			this.anInt1205 = arg1.method5170() << 0;
		} else if (arg0 == 15) {
			this.anInt1212 = arg1.method5229();
			if (this.anInt1212 == 65535) {
				this.anInt1212 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt1206 = arg1.method5170();
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	public void method1156() {
		this.anInt1213 = this.anInt1213 << 8 | this.anInt1218;
		if (this.anInt1212 == -1) {
			this.anInt1212 = this.anInt1219;
		}
	}
}
