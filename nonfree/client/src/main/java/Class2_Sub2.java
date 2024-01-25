import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
	public int anInt163;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "Z")
	private boolean aBoolean14 = false;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	public int anInt161 = 0;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Lclient!wo;")
	private Class375 aClass375_1 = new Class375();

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	private int anInt162 = 0;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "Lclient!qia;")
	public Class276 aClass276_1 = new Class276();

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
	private int anInt164 = 0;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Z")
	public boolean aBoolean16 = false;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "Lclient!cd;")
	public final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "[Lclient!ia;")
	public final Class2_Sub4_Sub1_Sub1[] aClass2_Sub4_Sub1_Sub1Array1 = new Class2_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IZ)V")
	public Class2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method229(arg0, arg1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()Lclient!cd;")
	public Class40 method222() {
		return this.aClass40_1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ha;J[Lclient!al;[Lclient!mi;Z)V")
	public void method223(@OriginalArg(0) Class33 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class18[] arg2, @OriginalArg(3) Class215[] arg3) {
		if (!this.aBoolean15) {
			this.method230(arg0, arg2);
			this.method235(arg3);
			this.aLong6 = arg1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
	public void method225() {
		this.aBoolean15 = true;
		for (@Pc(8) Class3_Sub1_Sub15 local8 = (Class3_Sub1_Sub15) this.aClass276_1.method6907(); local8 != null; local8 = (Class3_Sub1_Sub15) this.aClass276_1.method6912()) {
			if (local8.aClass37_1.anInt1080 == 1) {
				local8.method8621();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass2_Sub4_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass2_Sub4_Sub1_Sub1Array1[local27] != null) {
				this.aClass2_Sub4_Sub1_Sub1Array1[local27].method4335();
				this.aClass2_Sub4_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt161 = 0;
		this.aClass375_1 = new Class375();
		this.anInt162 = 0;
		this.aClass276_1 = new Class276();
		this.anInt164 = 0;
		this.method8558();
		Static425.aClass2_Sub2Array3[Static206.anInt6643] = this;
		Static206.anInt6643 = Static206.anInt6643 + 1 & Static394.anIntArray467[Static251.anInt5581];
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "()Lclient!cd;")
	public Class40 method227() {
		this.aClass40_1.aClass177_1.method4996();
		for (@Pc(6) int local6 = 0; local6 < this.aClass2_Sub4_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass2_Sub4_Sub1_Sub1Array1[local6] != null && this.aClass2_Sub4_Sub1_Sub1Array1[local6].aClass2_Sub9_1 != null) {
				this.aClass40_1.aClass177_1.method4994(this.aClass2_Sub4_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass40_1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(J)V")
	public void method228(@OriginalArg(0) long arg0) {
		this.aLong6 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(IZ)V")
	public void method229(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static477.aClass375_7.method8639(this);
		this.aLong6 = arg0;
		this.aLong7 = arg0;
		this.aBoolean17 = true;
		this.aBoolean16 = arg1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ha;[Lclient!al;Z)V")
	private void method230(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class18[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static15.aBooleanArray1[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class2_Sub9 local16 = (Class2_Sub9) this.aClass375_1.method8638(); local16 != null; local16 = (Class2_Sub9) this.aClass375_1.method8635()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass18_2 == arg1[local21] || local16.aClass18_2 == arg1[local21].aClass18_1) {
						Static15.aBooleanArray1[local21] = true;
						local16.method7545();
						local16.aBoolean768 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt9139 == 0) {
				local16.method8558();
				this.anInt162--;
			} else {
				local16.aBoolean768 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt162 != 32; local21++) {
			if (!Static15.aBooleanArray1[local21]) {
				@Pc(104) Class2_Sub9 local104 = new Class2_Sub9(arg0, arg1[local21], this, this.aLong6);
				this.aClass375_1.method8639(local104);
				this.anInt162++;
				Static15.aBooleanArray1[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ha;)V")
	public void method231(@OriginalArg(0) Class33 arg0) {
		this.aClass40_1.aClass177_1.method4996();
		for (@Pc(10) Class2_Sub9 local10 = (Class2_Sub9) this.aClass375_1.method8638(); local10 != null; local10 = (Class2_Sub9) this.aClass375_1.method8635()) {
			local10.method7541(arg0, this.aLong7);
		}
	}

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "()V")
	public void method232() {
		this.aBoolean14 = true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
	public void method233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt163 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "()V")
	public void method234() {
		this.aBoolean17 = true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([Lclient!mi;Z)V")
	private void method235(@OriginalArg(0) Class215[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static15.aBooleanArray2[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub1_Sub15 local16 = (Class3_Sub1_Sub15) this.aClass276_1.method6907(); local16 != null; local16 = (Class3_Sub1_Sub15) this.aClass276_1.method6912()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass215_2 == arg0[local21] || local16.aClass215_2 == arg0[local21].aClass215_1) {
						Static15.aBooleanArray2[local21] = true;
						local16.method5882();
						continue label71;
					}
				}
			}
			local16.method8671();
			this.anInt164--;
			if (local16.method8623()) {
				local16.method8621();
				Static123.anInt3131--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt164 != 8; local21++) {
			if (!Static15.aBooleanArray2[local21]) {
				@Pc(96) Class3_Sub1_Sub15 local96 = null;
				if (arg0[local21].method5690().anInt1080 == 1 && Static123.anInt3131 < 32) {
					local96 = new Class3_Sub1_Sub15(arg0[local21], this);
					Static55.aClass293_1.method7244(local96, (long) arg0[local21].anInt6803);
					Static123.anInt3131++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub1_Sub15(arg0[local21], this);
				}
				this.aClass276_1.method6906(local96);
				this.anInt164++;
				Static15.aBooleanArray2[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "()V")
	private void method236() {
		this.aBoolean14 = false;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method237(@OriginalArg(0) Class33 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong6 == this.aLong7) {
			this.method236();
		} else {
			this.method232();
		}
		if (arg1 - this.aLong6 > 750L) {
			this.method225();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong7);
		@Pc(36) Class2_Sub9 local36;
		if (this.aBoolean17) {
			for (local36 = (Class2_Sub9) this.aClass375_1.method8638(); local36 != null; local36 = (Class2_Sub9) this.aClass375_1.method8635()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass125_1.anInt4696; local39++) {
					local36.method7544(1, !this.aBoolean14, arg1, arg0);
				}
			}
			this.aBoolean17 = false;
		}
		for (local36 = (Class2_Sub9) this.aClass375_1.method8638(); local36 != null; local36 = (Class2_Sub9) this.aClass375_1.method8635()) {
			local36.method7544(local27, !this.aBoolean14, arg1, arg0);
		}
		this.aLong7 = arg1;
		return true;
	}
}
