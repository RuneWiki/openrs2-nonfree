import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class54 {

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
	public int anInt1915;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "Lclient!uk;")
	public Class245 aClass245_4;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Z")
	public boolean aBoolean171 = true;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
	public int anInt1919 = 0;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
	public int anInt1910 = -1;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
	public int anInt1912 = 128;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
	public int anInt1920 = 8;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
	public int anInt1909 = 16;

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "Z")
	public boolean aBoolean172 = true;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	public int anInt1923 = 1190717;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
	public int anInt1918 = -1;

	@OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
	public int anInt1925 = 127;

	@OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
	public int anInt1926 = -1;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public void method1391() {
		if (this.anInt1926 == -1) {
			this.anInt1926 = this.anInt1910;
		}
		this.anInt1920 = this.anInt1920 << 8 | this.anInt1915;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!md;B)V")
	public void method1392(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3737();
			if (local16 == 0) {
				return;
			}
			this.method1394(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILclient!md;)V")
	private void method1394(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt1919 = Static224.method3458(arg1.method3748());
		} else if (arg0 == 2) {
			this.anInt1910 = arg1.method3737();
		} else if (arg0 == 3) {
			this.anInt1910 = arg1.method3711();
			if (this.anInt1910 == 65535) {
				this.anInt1910 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean172 = false;
		} else if (arg0 == 7) {
			this.anInt1918 = Static224.method3458(arg1.method3748());
		} else if (arg0 == 8) {
			this.aClass245_4.anInt7044 = this.anInt1915;
		} else if (arg0 == 9) {
			this.anInt1912 = arg1.method3711() << 0;
		} else if (arg0 == 10) {
			this.aBoolean171 = false;
		} else if (arg0 == 11) {
			this.anInt1920 = arg1.method3737();
		} else if (arg0 == 12) {
			this.aBoolean173 = true;
		} else if (arg0 == 13) {
			this.anInt1923 = arg1.method3748();
		} else if (arg0 == 14) {
			this.anInt1909 = arg1.method3737();
		} else if (arg0 == 15) {
			this.anInt1926 = arg1.method3711();
			if (this.anInt1926 == 65535) {
				this.anInt1926 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt1925 = arg1.method3737();
		}
	}
}
