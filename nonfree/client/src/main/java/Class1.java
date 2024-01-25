import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
	public boolean aBoolean1 = true;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public int anInt3 = 128;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Z")
	public boolean aBoolean3 = false;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "I")
	public int anInt1 = 1190717;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public int anInt5 = 8;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	public int anInt11 = 0;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	public int anInt13 = -1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	public int anInt4 = 16;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "I")
	public int anInt15 = -1;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	public int anInt14 = -1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fb;III)V")
	private void method2(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt11 = Static127.method2206(arg0.method3659());
		} else if (arg1 == 2) {
			this.anInt15 = arg0.method3643();
		} else if (arg1 == 3) {
			this.anInt15 = arg0.method3649();
			if (this.anInt15 == 65535) {
				this.anInt15 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean1 = false;
		} else if (arg1 == 7) {
			this.anInt14 = Static127.method2206(arg0.method3659());
		} else if (arg1 == 8) {
			Static303.anInt5606 = arg2;
		} else if (arg1 == 9) {
			this.anInt3 = arg0.method3649();
		} else if (arg1 == 10) {
			this.aBoolean2 = false;
		} else if (arg1 == 11) {
			this.anInt5 = arg0.method3643();
		} else if (arg1 == 12) {
			this.aBoolean3 = true;
		} else if (arg1 == 13) {
			this.anInt1 = arg0.method3659();
		} else if (arg1 == 14) {
			this.anInt4 = arg0.method3643();
		} else if (arg1 == 15) {
			this.anInt13 = arg0.method3649();
			if (this.anInt13 == 65535) {
				this.anInt13 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(BI)V")
	public void method5(@OriginalArg(1) int arg0) {
		if (this.anInt13 == -1) {
			this.anInt13 = this.anInt15;
		}
		this.anInt5 = this.anInt5 << 8 | arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLclient!fb;)V")
	public void method7(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3643();
			if (local5 == 0) {
				return;
			}
			this.method2(arg1, local5, arg0);
		}
	}
}
