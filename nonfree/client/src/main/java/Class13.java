import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class13 {

	@OriginalMember(owner = "client!an", name = "m", descriptor = "[I")
	public static final int[] anIntArray20 = new int[16384];

	@OriginalMember(owner = "client!an", name = "s", descriptor = "[I")
	public static final int[] anIntArray21 = new int[16384];

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!mo;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "I")
	public int anInt201;

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	public int anInt191 = -1;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public int anInt192 = -1;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public int anInt193 = 8;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
	public boolean aBoolean14 = true;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public int anInt196 = 16;

	@OriginalMember(owner = "client!an", name = "n", descriptor = "I")
	public int anInt199 = 1190717;

	@OriginalMember(owner = "client!an", name = "k", descriptor = "I")
	public int anInt197 = -1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	public int anInt190 = 128;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Z")
	public boolean aBoolean15 = true;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "I")
	public int anInt203 = 127;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	public int anInt202 = 0;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
	public boolean aBoolean16 = false;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray20[local9] = (int) (Math.sin((double) local9 * local7) * 32768.0D);
			anIntArray21[local9] = (int) (Math.cos(local7 * (double) local9) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!re;I)V")
	private void method111(@OriginalArg(1) Class1_Sub33 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt202 = Static126.method1841(arg0.method5159());
		} else if (arg1 == 2) {
			this.anInt192 = arg0.method5174();
		} else if (arg1 == 3) {
			this.anInt192 = arg0.method5177();
			if (this.anInt192 == 65535) {
				this.anInt192 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean14 = false;
		} else if (arg1 == 7) {
			this.anInt197 = Static126.method1841(arg0.method5159());
		} else if (arg1 == 8) {
			this.aClass158_1.anInt3831 = this.anInt201;
		} else if (arg1 == 9) {
			this.anInt190 = arg0.method5177();
		} else if (arg1 == 10) {
			this.aBoolean15 = false;
		} else if (arg1 == 11) {
			this.anInt193 = arg0.method5174();
		} else if (arg1 == 12) {
			this.aBoolean16 = true;
		} else if (arg1 == 13) {
			this.anInt199 = arg0.method5159();
		} else if (arg1 == 14) {
			this.anInt196 = arg0.method5174();
		} else if (arg1 == 15) {
			this.anInt191 = arg0.method5177();
			if (this.anInt191 == 65535) {
				this.anInt191 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt203 = arg0.method5174();
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public void method113() {
		if (this.anInt191 == -1) {
			this.anInt191 = this.anInt192;
		}
		this.anInt193 = this.anInt201 | this.anInt193 << 8;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!re;B)V")
	public void method115(@OriginalArg(0) Class1_Sub33 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5174();
			if (local5 == 0) {
				return;
			}
			this.method111(arg0, local5);
		}
	}
}
