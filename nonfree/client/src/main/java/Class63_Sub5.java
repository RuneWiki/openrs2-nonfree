import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class63_Sub5 extends Class63 {

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
	public int anInt4703;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
	public int anInt4705;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
	public int anInt4707;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
	private boolean aBoolean342 = false;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "Z")
	public boolean aBoolean343 = false;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public int anInt4701 = 0;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "Lclient!bn;")
	private Class24 aClass24_4 = new Class24();

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
	private int anInt4702 = 0;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "Lclient!vn;")
	public Class211 aClass211_23 = new Class211();

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
	private int anInt4704 = 0;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "Z")
	private boolean aBoolean344 = false;

	@OriginalMember(owner = "client!pl", name = "A", descriptor = "Lclient!bg;")
	public final Class21 aClass21_2 = new Class21();

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "[Lclient!pr;")
	public Class63_Sub1_Sub1_Sub1[] aClass63_Sub1_Sub1_Sub1Array2 = new Class63_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
	public Class63_Sub5(@OriginalArg(0) int arg0) {
		Static337.aClass24_6.method620(this);
		this.aLong159 = arg0;
		this.aLong160 = arg0;
		this.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([Lclient!or;Z)V")
	private void method4115(@OriginalArg(0) Class151[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static242.aBooleanArray23[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class5_Sub9_Sub13 local16 = (Class5_Sub9_Sub13) this.aClass211_23.method5608(); local16 != null; local16 = (Class5_Sub9_Sub13) this.aClass211_23.method5603()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass151_1 == arg0[local21] || local16.aClass151_1 == arg0[local21].aClass151_2) {
						Static242.aBooleanArray23[local21] = true;
						local16.method2922();
						continue label68;
					}
				}
			}
			local16.method5803();
			this.anInt4704--;
			if (local16.method5495()) {
				local16.method5494();
				Static70.anInt1762--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4704 != 8; local21++) {
			if (!Static242.aBooleanArray23[local21]) {
				@Pc(93) Class5_Sub9_Sub13 local93 = null;
				if (Static316.method5377(arg0[local21].anInt4541).anInt4845 == 1 && Static70.anInt1762 < 32) {
					local93 = new Class5_Sub9_Sub13(arg0[local21], this);
					Static222.aClass164_1.method4411(local93, (long) arg0[local21].anInt4541);
					Static70.anInt1762++;
				}
				if (local93 == null) {
					local93 = new Class5_Sub9_Sub13(arg0[local21], this);
				}
				this.aClass211_23.method5609(local93);
				this.anInt4704++;
				Static242.aBooleanArray23[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIII)V")
	public void method4116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4707 = arg0;
		this.anInt4703 = arg1;
		this.anInt4706 = arg3;
		this.anInt4705 = arg4;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!en;[Lclient!nr;Z)V")
	private void method4117(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class140[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static242.aBooleanArray22[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class63_Sub8 local16 = (Class63_Sub8) this.aClass24_4.method619(); local16 != null; local16 = (Class63_Sub8) this.aClass24_4.method627()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass140_2 == arg1[local21] || local16.aClass140_2 == arg1[local21].aClass140_1) {
						Static242.aBooleanArray22[local21] = true;
						local16.method5695();
						local16.aBoolean476 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt6432 == 0) {
				local16.method5690();
				this.anInt4702--;
			} else {
				local16.aBoolean476 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4702 != 8; local21++) {
			if (!Static242.aBooleanArray22[local21]) {
				@Pc(101) Class63_Sub8 local101 = new Class63_Sub8(arg0, arg1[local21], this, this.aLong159);
				this.aClass24_4.method620(local101);
				this.anInt4702++;
				Static242.aBooleanArray22[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!en;J[Lclient!nr;[Lclient!or;Z)V")
	public void method4118(@OriginalArg(0) Class59 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class140[] arg2, @OriginalArg(3) Class151[] arg3) {
		if (!this.aBoolean343) {
			this.method4117(arg0, arg2);
			this.method4115(arg3);
			this.aLong159 = arg1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(J)V")
	public void method4119(@OriginalArg(0) long arg0) {
		this.aLong159 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "()V")
	public void method4120() {
		this.aClass21_2.aClass166_1.method4436();
		for (@Pc(10) Class63_Sub8 local10 = (Class63_Sub8) this.aClass24_4.method619(); local10 != null; local10 = (Class63_Sub8) this.aClass24_4.method627()) {
			local10.method5692(this.aLong160);
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "()V")
	public void method4121() {
		this.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "()V")
	public void method4122() {
		this.aBoolean343 = true;
		for (@Pc(8) Class5_Sub9_Sub13 local8 = (Class5_Sub9_Sub13) this.aClass211_23.method5608(); local8 != null; local8 = (Class5_Sub9_Sub13) this.aClass211_23.method5603()) {
			if (local8.aClass163_1.anInt4845 == 1) {
				local8.method5494();
			}
		}
		this.aClass63_Sub1_Sub1_Sub1Array2 = new Class63_Sub1_Sub1_Sub1[8192];
		this.anInt4701 = 0;
		this.aClass24_4 = new Class24();
		this.anInt4702 = 0;
		this.aClass211_23 = new Class211();
		this.anInt4704 = 0;
		this.method5690();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!en;J)Z")
	public boolean method4123(@OriginalArg(0) Class59 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong159 == this.aLong160) {
			this.method4126();
		} else {
			this.method4124();
		}
		if (arg1 - this.aLong159 > 750L) {
			this.method4122();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong160);
		@Pc(36) Class63_Sub8 local36;
		if (this.aBoolean344) {
			for (local36 = (Class63_Sub8) this.aClass24_4.method619(); local36 != null; local36 = (Class63_Sub8) this.aClass24_4.method627()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass168_1.anInt5105; local39++) {
					local36.method5693(arg1, arg0, 1, !this.aBoolean342);
				}
			}
			this.aBoolean344 = false;
		}
		for (local36 = (Class63_Sub8) this.aClass24_4.method619(); local36 != null; local36 = (Class63_Sub8) this.aClass24_4.method627()) {
			local36.method5693(arg1, arg0, local27, !this.aBoolean342);
		}
		this.aLong160 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "()V")
	public void method4124() {
		this.aBoolean342 = true;
	}

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "()Lclient!bg;")
	public Class21 method4125() {
		return this.aClass21_2;
	}

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "()V")
	private void method4126() {
		this.aBoolean342 = false;
	}
}
