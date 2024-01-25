import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	public int anInt1234;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "I")
	public int anInt1235;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "I")
	public int anInt1236;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public int anInt1230 = 0;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!wd;")
	private Class210 aClass210_4 = new Class210();

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	private int anInt1231 = 0;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!aq;")
	public Class16 aClass16_12 = new Class16();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "I")
	private int anInt1233 = 0;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!mr;")
	public final Class136 aClass136_1 = new Class136();

	@OriginalMember(owner = "client!e", name = "o", descriptor = "[Lclient!hd;")
	public Class10_Sub3_Sub1_Sub1[] aClass10_Sub3_Sub1_Sub1Array1 = new Class10_Sub3_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!e", name = "j", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(I)V")
	public Class10_Sub2(@OriginalArg(0) int arg0) {
		Static220.aClass210_11.method5612(this);
		this.aLong37 = arg0;
		this.aLong38 = arg0;
		this.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	public void method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1232 = arg0;
		this.anInt1235 = arg1;
		this.anInt1236 = arg3;
		this.anInt1234 = arg4;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	private void method980() {
		this.aBoolean74 = false;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()Lclient!mr;")
	public Class136 method981() {
		return this.aClass136_1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!uo;[Lclient!rf;Z)V")
	private void method982(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class174[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static65.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class10_Sub4 local16 = (Class10_Sub4) this.aClass210_4.method5608(); local16 != null; local16 = (Class10_Sub4) this.aClass210_4.method5615()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass174_1 == arg1[local21] || local16.aClass174_1 == arg1[local21].aClass174_2) {
						Static65.aBooleanArray6[local21] = true;
						local16.method3478();
						local16.aBoolean246 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt3868 == 0) {
				local16.method5452();
				this.anInt1231--;
			} else {
				local16.aBoolean246 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt1231 != 8; local21++) {
			if (!Static65.aBooleanArray6[local21]) {
				@Pc(101) Class10_Sub4 local101 = new Class10_Sub4(arg0, arg1[local21], this, this.aLong37);
				this.aClass210_4.method5612(local101);
				this.anInt1231++;
				Static65.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()V")
	public void method983() {
		this.aClass136_1.aClass104_1.method2130();
		for (@Pc(10) Class10_Sub4 local10 = (Class10_Sub4) this.aClass210_4.method5608(); local10 != null; local10 = (Class10_Sub4) this.aClass210_4.method5615()) {
			local10.method3476(this.aLong38);
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "()V")
	public void method985() {
		this.aBoolean75 = true;
		for (@Pc(8) Class11_Sub4_Sub20 local8 = (Class11_Sub4_Sub20) this.aClass16_12.method193(); local8 != null; local8 = (Class11_Sub4_Sub20) this.aClass16_12.method188()) {
			if (local8.aClass43_1.anInt894 == 1) {
				local8.method5580();
			}
		}
		this.aClass10_Sub3_Sub1_Sub1Array1 = new Class10_Sub3_Sub1_Sub1[8192];
		this.anInt1230 = 0;
		this.aClass210_4 = new Class210();
		this.anInt1231 = 0;
		this.aClass16_12 = new Class16();
		this.anInt1233 = 0;
		this.method5452();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([Lclient!wg;Z)V")
	private void method986(@OriginalArg(0) Class212[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static65.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class11_Sub4_Sub20 local16 = (Class11_Sub4_Sub20) this.aClass16_12.method193(); local16 != null; local16 = (Class11_Sub4_Sub20) this.aClass16_12.method188()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass212_1 == arg0[local21] || local16.aClass212_1 == arg0[local21].aClass212_2) {
						Static65.aBooleanArray7[local21] = true;
						local16.method5499();
						continue label68;
					}
				}
			}
			local16.method5701();
			this.anInt1233--;
			if (local16.method5577()) {
				local16.method5580();
				Static144.anInt2628--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt1233 != 8; local21++) {
			if (!Static65.aBooleanArray7[local21]) {
				@Pc(93) Class11_Sub4_Sub20 local93 = null;
				if (Static261.method4536(arg0[local21].anInt6645).anInt894 == 1 && Static144.anInt2628 < 32) {
					local93 = new Class11_Sub4_Sub20(arg0[local21], this);
					Static213.aClass201_1.method5381((long) arg0[local21].anInt6645, local93);
					Static144.anInt2628++;
				}
				if (local93 == null) {
					local93 = new Class11_Sub4_Sub20(arg0[local21], this);
				}
				this.aClass16_12.method190(local93);
				this.anInt1233++;
				Static65.aBooleanArray7[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!uo;J)Z")
	public boolean method987(@OriginalArg(0) Class129 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong37 == this.aLong38) {
			this.method980();
		} else {
			this.method989();
		}
		if (arg1 - this.aLong37 > 750L) {
			this.method985();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong38);
		@Pc(36) Class10_Sub4 local36;
		if (this.aBoolean76) {
			for (local36 = (Class10_Sub4) this.aClass210_4.method5608(); local36 != null; local36 = (Class10_Sub4) this.aClass210_4.method5615()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass190_1.anInt6000; local39++) {
					local36.method3473(arg1, 1, !this.aBoolean74, arg0);
				}
			}
			this.aBoolean76 = false;
		}
		for (local36 = (Class10_Sub4) this.aClass210_4.method5608(); local36 != null; local36 = (Class10_Sub4) this.aClass210_4.method5615()) {
			local36.method3473(arg1, local27, !this.aBoolean74, arg0);
		}
		this.aLong38 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "()V")
	public void method988() {
		this.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "()V")
	public void method989() {
		this.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!uo;J[Lclient!rf;[Lclient!wg;Z)V")
	public void method990(@OriginalArg(0) Class129 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class174[] arg2, @OriginalArg(3) Class212[] arg3) {
		if (!this.aBoolean75) {
			this.method982(arg0, arg2);
			this.method986(arg3);
			this.aLong37 = arg1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(J)V")
	public void method991(@OriginalArg(0) long arg0) {
		this.aLong37 = arg0;
	}
}
