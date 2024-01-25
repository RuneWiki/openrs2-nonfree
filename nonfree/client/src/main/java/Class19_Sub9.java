import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class19_Sub9 extends Class19 {

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "J")
	private long aLong265;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "J")
	private long aLong266;

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
	public int anInt8051;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
	public int anInt8048 = 0;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
	private boolean aBoolean614 = false;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Z")
	public boolean aBoolean615 = false;

	@OriginalMember(owner = "client!oi", name = "n", descriptor = "Lclient!dda;")
	private Class66 aClass66_8 = new Class66();

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	private int anInt8049 = 0;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "Lclient!tj;")
	public Class357 aClass357_46 = new Class357();

	@OriginalMember(owner = "client!oi", name = "o", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
	private int anInt8050 = 0;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Z")
	public boolean aBoolean617 = false;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!hu;")
	public final Class162 aClass162_1 = new Class162();

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "[Lclient!fv;")
	public final Class19_Sub4_Sub1_Sub1[] aClass19_Sub4_Sub1_Sub1Array1 = new Class19_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IZ)V")
	public Class19_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method6775(arg0, arg1);
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "()V")
	public void method6766() {
		this.aBoolean614 = true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([Lclient!sw;Z)V")
	private void method6767(@OriginalArg(0) Class348[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static457.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub4_Sub20 local16 = (Class3_Sub4_Sub20) this.aClass357_46.method8391(); local16 != null; local16 = (Class3_Sub4_Sub20) this.aClass357_46.method8392()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass348_1 == arg0[local21] || local16.aClass348_1 == arg0[local21].aClass348_2) {
						Static457.aBooleanArray21[local21] = true;
						local16.method7940();
						continue label71;
					}
				}
			}
			local16.method9446();
			this.anInt8050--;
			if (local16.method8847()) {
				local16.method8848();
				Static604.anInt9835--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt8050 != 8; local21++) {
			if (!Static457.aBooleanArray21[local21]) {
				@Pc(96) Class3_Sub4_Sub20 local96 = null;
				if (arg0[local21].method8245().anInt5474 == 1 && Static604.anInt9835 < 32) {
					local96 = new Class3_Sub4_Sub20(arg0[local21], this);
					Static670.aClass298_1.method7241(local96, (long) arg0[local21].anInt9772);
					Static604.anInt9835++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub4_Sub20(arg0[local21], this);
				}
				this.aClass357_46.method8401(local96);
				this.anInt8050++;
				Static457.aBooleanArray21[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V")
	public void method6768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt8051 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "()V")
	public void method6769() {
		this.aBoolean616 = true;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()Lclient!hu;")
	public Class162 method6770() {
		this.aClass162_1.aClass372_1.method8739();
		for (@Pc(6) int local6 = 0; local6 < this.aClass19_Sub4_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass19_Sub4_Sub1_Sub1Array1[local6] != null && this.aClass19_Sub4_Sub1_Sub1Array1[local6].aClass19_Sub5_1 != null) {
				this.aClass162_1.aClass372_1.method8742(this.aClass19_Sub4_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass162_1;
	}

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "()V")
	private void method6773() {
		this.aBoolean614 = false;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ha;J[Lclient!hl;[Lclient!sw;Z)V")
	public void method6774(@OriginalArg(0) Class67 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class156[] arg2, @OriginalArg(3) Class348[] arg3) {
		if (!this.aBoolean615) {
			this.method6776(arg0, arg2);
			this.method6767(arg3);
			this.aLong265 = arg1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
	public void method6775(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static296.aClass66_5.method1375(this);
		this.aLong265 = (long) arg0;
		this.aLong266 = (long) arg0;
		this.aBoolean616 = true;
		this.aBoolean617 = arg1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ha;[Lclient!hl;Z)V")
	private void method6776(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class156[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static457.aBooleanArray20[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class19_Sub5 local16 = (Class19_Sub5) this.aClass66_8.method1381(); local16 != null; local16 = (Class19_Sub5) this.aClass66_8.method1380()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass156_1 == arg1[local21] || local16.aClass156_1 == arg1[local21].aClass156_2) {
						Static457.aBooleanArray20[local21] = true;
						local16.method3104();
						local16.aBoolean293 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt3621 == 0) {
				local16.method9359();
				this.anInt8049--;
			} else {
				local16.aBoolean293 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt8049 != 32; local21++) {
			if (!Static457.aBooleanArray20[local21]) {
				@Pc(104) Class19_Sub5 local104 = new Class19_Sub5(arg0, arg1[local21], this, this.aLong265);
				this.aClass66_8.method1375(local104);
				this.anInt8049++;
				Static457.aBooleanArray20[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method6777(@OriginalArg(0) Class67 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong265 == this.aLong266) {
			this.method6773();
		} else {
			this.method6766();
		}
		if (arg1 - this.aLong265 > 750L) {
			this.method6778();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong266);
		@Pc(36) Class19_Sub5 local36;
		if (this.aBoolean616) {
			for (local36 = (Class19_Sub5) this.aClass66_8.method1381(); local36 != null; local36 = (Class19_Sub5) this.aClass66_8.method1380()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass173_1.anInt5080; local39++) {
					local36.method3103(1, arg0, arg1, !this.aBoolean614);
				}
			}
			this.aBoolean616 = false;
		}
		for (local36 = (Class19_Sub5) this.aClass66_8.method1381(); local36 != null; local36 = (Class19_Sub5) this.aClass66_8.method1380()) {
			local36.method3103(local27, arg0, arg1, !this.aBoolean614);
		}
		this.aLong266 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
	public void method6778() {
		this.aBoolean615 = true;
		for (@Pc(8) Class3_Sub4_Sub20 local8 = (Class3_Sub4_Sub20) this.aClass357_46.method8391(); local8 != null; local8 = (Class3_Sub4_Sub20) this.aClass357_46.method8392()) {
			if (local8.aClass187_1.anInt5474 == 1) {
				local8.method8848();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass19_Sub4_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass19_Sub4_Sub1_Sub1Array1[local27] != null) {
				this.aClass19_Sub4_Sub1_Sub1Array1[local27].method2955();
				this.aClass19_Sub4_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt8048 = 0;
		this.aClass66_8 = new Class66();
		this.anInt8049 = 0;
		this.aClass357_46 = new Class357();
		this.anInt8050 = 0;
		this.method9359();
		Static579.aClass19_Sub9Array2[Static330.anInt5785] = this;
		Static330.anInt5785 = Static330.anInt5785 + 1 & Static31.anIntArray431[Static284.anInt5151];
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "()Lclient!hu;")
	public Class162 method6779() {
		return this.aClass162_1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ha;)V")
	public void method6780(@OriginalArg(0) Class67 arg0) {
		this.aClass162_1.aClass372_1.method8739();
		for (@Pc(10) Class19_Sub5 local10 = (Class19_Sub5) this.aClass66_8.method1381(); local10 != null; local10 = (Class19_Sub5) this.aClass66_8.method1380()) {
			local10.method3105(this.aLong266, arg0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(J)V")
	public void method6781(@OriginalArg(0) long arg0) {
		this.aLong265 = arg0;
	}
}
